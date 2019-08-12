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
import com.diviso.graeshoppe.client.order.api.DeliveryInfoResourceApi;
import com.diviso.graeshoppe.client.order.api.OrderCommandResourceApi;
import com.diviso.graeshoppe.client.order.api.OrderLineResourceApi;
import com.diviso.graeshoppe.client.order.model.CommandResource;
import com.diviso.graeshoppe.client.order.model.OrderDTO;
import com.diviso.graeshoppe.client.order.model.OrderLineDTO;
import com.diviso.graeshoppe.client.order.model.ProcessPaymentRequest;
import com.diviso.graeshoppe.service.QueryService;
import com.diviso.graeshoppe.client.order.model.AcceptOrderRequest;
import com.diviso.graeshoppe.client.order.model.Address;
import com.diviso.graeshoppe.client.order.model.AddressDTO;
import com.diviso.graeshoppe.client.order.model.DeliveryInfo;
import com.diviso.graeshoppe.client.order.model.DeliveryInfoDTO;
import com.diviso.graeshoppe.client.order.model.Order;

@RestController
@RequestMapping("/api/command")
public class OrderCommandResource {
	@Autowired
	private OrderCommandResourceApi orderCommandResourceApi;
	@Autowired
	private OrderLineResourceApi orderLineResourceApi;

	@Autowired
	private DeliveryInfoResourceApi deliveryInfoCommandApi;
	@Autowired
	private QueryService queryService;

	@Autowired
	private AddressResourceApi addressResourceApi;


	@PostMapping("/order/initiateOrder")
	public ResponseEntity<CommandResource> initiateOrder(@RequestBody Order order) {
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setCustomerId(order.getCustomerId());
		orderDTO.setStoreId(order.getStoreId());
		orderDTO.setGrandTotal(order.getGrandTotal());
		orderDTO.setDate(Instant.now());
		ResponseEntity<com.diviso.graeshoppe.client.order.model.CommandResource> orderDTOResponse = createOrder(orderDTO);
		order.getOrderLines().forEach(orderLine -> {
			OrderLineDTO orderLineDTO = new OrderLineDTO();
			orderLineDTO.setPricePerUnit(orderLine.getPricePerUnit());
			orderLineDTO.setProductId(orderLine.getProductId());
			orderLineDTO.setQuantity(orderLine.getQuantity());
			orderLineDTO.setTotal(orderLine.getTotal());
			orderLineDTO.setOrderId(orderDTOResponse.getBody().getSelfId());
			createOrderLine(orderLineDTO);
		});


		return orderDTOResponse;
	}

	@GetMapping("/orders/addresses/{customerId}")
	public Page<Address> getAllSavedAddress(@PathVariable String customerId, Pageable pageable) {
		return queryService.findByCustomerId(customerId, pageable);
	}

	@PostMapping("/orders/addresses")
	public ResponseEntity<AddressDTO> createAddress(AddressDTO addressDTO) {
		ResponseEntity<AddressDTO> result = addressResourceApi.createAddressUsingPOST(addressDTO);
		return result;
	}

	@PostMapping("/orders/collectDeliveryDetails/{taskId}/{orderId}")
	public ResponseEntity<CommandResource> collectDeliveryDetails(@RequestBody DeliveryInfo deliveryInfo,
			@PathVariable String taskId, @PathVariable Long orderId) {
		DeliveryInfoDTO deliveryInfoDTO = new DeliveryInfoDTO();
		deliveryInfoDTO.setDeliveryCharge(deliveryInfo.getDeliveryCharge());
		deliveryInfoDTO.setDeliveryType(deliveryInfo.getDeliveryType());
		deliveryInfoDTO.setExpectedDelivery(Instant.now());
		deliveryInfoDTO.setDeliveryAddressId(deliveryInfo.getDeliveryAddress().getId());
		ResponseEntity<CommandResource> deliveryInfoResult = createDeliveryInfo(taskId, deliveryInfoDTO);
		//updateDeliveryInfo(deliveryInfoResult.getBody());
		long deliveryId = deliveryInfoResult.getBody().getSelfId();
		OrderDTO orderResult = orderCommandResourceApi.getOrderUsingGET(orderId).getBody();
		orderResult.setDeliveryInfoId(deliveryId);
		updateOrder(orderResult);
		return deliveryInfoResult;

	}
	
	@PostMapping("/acceptOrder")
	public ResponseEntity<CommandResource> acceptOrder(@RequestBody AcceptOrderRequest acceptOrderRequest){
		return orderCommandResourceApi.acceptOrderUsingPOST(acceptOrderRequest);
	}

	
	@PostMapping("/process-payment")
	public ResponseEntity<CommandResource> getProcessPayment( @RequestBody ProcessPaymentRequest processPaymentRequest){
		return orderCommandResourceApi.processPaymentUsingPOST(processPaymentRequest);
	}
	
	
	/*@PostMapping("/orders/makePayment/{taskId}/{orderId}")
	public ResponseEntity<CommandResource> createPayment(@RequestBody OrderPaymentDTO paymentDTO,
			@PathVariable String taskId, @PathVariable Long orderId) {
		ResponseEntity<PaymentDTO> payment = paymentCommandResourceApi.createPaymentUsingPOST(paymentDTO);
		OrderDTO orderResult = orderCommandResourceApi.getOrderUsingGET(orderId).getBody();
		orderResult.setPaymentId(payment.getBody().getId());
		updateOrder(orderResult);
		return paymentCommandResourceApi.makePaymentUsingPOST(paymentDTO.getStatus(), taskId);

	}*/

	/////////////////////////////////////////////////////////////////////////////

	public ResponseEntity<CommandResource> createOrder(@RequestBody OrderDTO orderDTO) {

		return orderCommandResourceApi.createOrderUsingPOST(orderDTO);

	}

	public ResponseEntity<OrderLineDTO> createOrderLine(@RequestBody OrderLineDTO orderLineDTO) {
		return orderLineResourceApi.createOrderLineUsingPOST(orderLineDTO);
	}

	public ResponseEntity<CommandResource> createDeliveryInfo(@PathVariable String taskId,@RequestBody DeliveryInfoDTO deliveryInfoDTO) {
		return deliveryInfoCommandApi.createDeliveryInfoUsingPOST(taskId,deliveryInfoDTO);
	}

	public ResponseEntity<DeliveryInfoDTO> updateDeliveryInfo(DeliveryInfoDTO deliveryInfoDTO) {
		return deliveryInfoCommandApi.updateDeliveryInfoUsingPUT(deliveryInfoDTO);
	}

	public ResponseEntity<CommandResource> updateOrder(OrderDTO orderDTO) {
		return orderCommandResourceApi.updateOrderUsingPUT(orderDTO);
	}

	
	
}
