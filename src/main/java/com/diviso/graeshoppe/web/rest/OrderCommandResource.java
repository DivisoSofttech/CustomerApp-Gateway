package com.diviso.graeshoppe.web.rest;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.order.api.AddressResourceApi;
import com.diviso.graeshoppe.client.order.api.DeliveryInfoCommandResourceApi;
import com.diviso.graeshoppe.client.order.api.OrderCommandResourceApi;
import com.diviso.graeshoppe.client.order.api.OrderLineResourceApi;
import com.diviso.graeshoppe.client.order.api.PaymentCommandResourceApi;
import com.diviso.graeshoppe.client.order.model.OrderDTO;
import com.diviso.graeshoppe.client.order.model.OrderLineDTO;
import com.diviso.graeshoppe.client.order.model.OrderPaymentDTO;
import com.diviso.graeshoppe.client.order.model.PaymentDTO;
import com.diviso.graeshoppe.service.QueryService;
import com.diviso.graeshoppe.client.order.model.OrderAddressDTO;
import com.diviso.graeshoppe.client.order.model.CommandResource;
import com.diviso.graeshoppe.client.order.model.OrderDeliveryInfo;
import com.diviso.graeshoppe.client.order.model.OrderDeliveryInfoDTO;
import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.client.order.model.OrderAddress;

@RestController
@RequestMapping("/api/command")
public class OrderCommandResource {
	@Autowired
	private OrderCommandResourceApi orderCommandResourceApi;
	@Autowired
	private OrderLineResourceApi orderLineResourceApi;

	@Autowired
	private DeliveryInfoCommandResourceApi deliveryInfoCommandApi;
	@Autowired
	private QueryService queryService;

	@Autowired
	private AddressResourceApi addressResourceApi;
	@Autowired
	private PaymentCommandResourceApi paymentCommandResourceApi;

	@PostMapping("/order/initiateOrder")
	public ResponseEntity<CommandResource> initiateOrder(@RequestBody Order order) {
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setCustomerId(order.getCustomerId());
		orderDTO.setStoreId(order.getStoreId());
		orderDTO.setGrandTotal(order.getGrandTotal());
		orderDTO.setDate(Instant.now());
		ResponseEntity<OrderDTO> orderDTOResponse = createOrder(orderDTO);
		order.getOrderLines().forEach(orderLine -> {
			OrderLineDTO orderLineDTO = new OrderLineDTO();
			orderLineDTO.setPricePerUnit(orderLine.getPricePerUnit());
			orderLineDTO.setProductId(orderLine.getProductId());
			orderLineDTO.setQuantity(orderLine.getQuantity());
			orderLineDTO.setTotal(orderLine.getTotal());
			orderLineDTO.setOrderId(orderDTOResponse.getBody().getId());
			createOrderLine(orderLineDTO);
		});

		ResponseEntity<CommandResource> result = orderCommandResourceApi
				.initiateOrderUsingPOST(orderDTOResponse.getBody().getOrderId());

		return result;
	}

	@GetMapping("/orders/addresses/{customerId}")
	public Page<OrderAddress> getAllSavedAddress(@PathVariable String customerId, Pageable pageable) {
		return queryService.findByCustomerId(customerId, pageable);
	}

	@PostMapping("/orders/addresses")
	public ResponseEntity<OrderAddressDTO> createAddress(OrderAddressDTO addressDTO) {
		ResponseEntity<OrderAddressDTO> result = addressResourceApi.createAddressUsingPOST(addressDTO);
		return result;
	}

	@PostMapping("/orders/collectDeliveryDetails/{taskId}/{orderId}")
	public ResponseEntity<CommandResource> collectDeliveryDetails(@RequestBody OrderDeliveryInfo deliveryInfo,
			@PathVariable String taskId, @PathVariable Long orderId) {
		OrderDeliveryInfoDTO deliveryInfoDTO = new OrderDeliveryInfoDTO();
		deliveryInfoDTO.setDeliveryCharge(deliveryInfo.getDeliveryCharge());
		deliveryInfoDTO.setDeliveryType(deliveryInfo.getDeliveryType());
		deliveryInfoDTO.setExpectedDelivery(Instant.now());
		deliveryInfoDTO.setDeliveryAddressId(deliveryInfo.getDeliveryAddress().getId());
		ResponseEntity<OrderDeliveryInfoDTO> deliveryInfoResult = createDeliveryInfo(deliveryInfoDTO);
		updateDeliveryInfo(deliveryInfoResult.getBody());
		long deliveryId = deliveryInfoResult.getBody().getId();
		OrderDTO orderResult = orderCommandResourceApi.getOrderUsingGET(orderId).getBody();
		orderResult.setDeliveryInfoId(deliveryId);
		updateOrder(orderResult);
		return deliveryInfoCommandApi.confirmDeliveryUsingPOST(deliveryInfo.getDeliveryAddress().getPhone(), taskId);

	}

	@PostMapping("/orders/makePayment/{taskId}/{orderId}")
	public ResponseEntity<CommandResource> createPayment(@RequestBody OrderPaymentDTO paymentDTO,
			@PathVariable String taskId, @PathVariable Long orderId) {
		ResponseEntity<PaymentDTO> payment = paymentCommandResourceApi.createPaymentUsingPOST(paymentDTO);
		OrderDTO orderResult = orderCommandResourceApi.getOrderUsingGET(orderId).getBody();
		orderResult.setPaymentId(payment.getBody().getId());
		updateOrder(orderResult);
		return paymentCommandResourceApi.makePaymentUsingPOST(paymentDTO.getStatus(), taskId);

	}

	/////////////////////////////////////////////////////////////////////////////

	public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderDTO orderDTO) {

		return orderCommandResourceApi.createOrderUsingPOST(orderDTO);

	}

	public ResponseEntity<OrderLineDTO> createOrderLine(@RequestBody OrderLineDTO orderLineDTO) {
		return orderLineResourceApi.createOrderLineUsingPOST(orderLineDTO);
	}

	public ResponseEntity<OrderDeliveryInfoDTO> createDeliveryInfo(@RequestBody OrderDeliveryInfoDTO deliveryInfoDTO) {
		return deliveryInfoCommandApi.createDeliveryInfoUsingPOST(deliveryInfoDTO);
	}

	public ResponseEntity<OrderDeliveryInfoDTO> updateDeliveryInfo(OrderDeliveryInfoDTO deliveryInfoDTO) {
		return deliveryInfoCommandApi.updateDeliveryInfoUsingPUT(deliveryInfoDTO);
	}

	public ResponseEntity<OrderDTO> updateOrder(OrderDTO orderDTO) {
		return orderCommandResourceApi.updateOrderUsingPUT(orderDTO);
	}

}
