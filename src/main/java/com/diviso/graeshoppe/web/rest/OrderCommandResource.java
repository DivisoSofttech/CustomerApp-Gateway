package com.diviso.graeshoppe.web.rest;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.customer.api.AddressResourceApi;
import com.diviso.graeshoppe.client.order.api.DeliveryInfoResourceApi;
import com.diviso.graeshoppe.client.order.api.OrderCommandResourceApi;
import com.diviso.graeshoppe.client.order.api.OrderLineResourceApi;
import com.diviso.graeshoppe.client.order.api.OrderResourceApi;
import com.diviso.graeshoppe.client.order.api.PaymentCommandResourceApi;
import com.diviso.graeshoppe.client.order.model.OrderDTO;
import com.diviso.graeshoppe.client.order.model.OrderLineDTO;
import com.diviso.graeshoppe.client.order.model.PaymentDTO;
import com.diviso.graeshoppe.client.order.model.AddressDTO;
import com.diviso.graeshoppe.client.order.model.CommandResource;
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
	private OrderResourceApi orderResourceApi;
	@Autowired
	private DeliveryInfoResourceApi deliveryInfoResourceApi;
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
		ResponseEntity<CommandResource> result = createOrder(orderDTO);
		order.getOrderLines().forEach(orderLine -> {
			OrderLineDTO orderLineDTO = new OrderLineDTO();
			orderLineDTO.setPricePerUnit(orderLine.getPricePerUnit());
			orderLineDTO.setProductId(orderLine.getProductId());
			orderLineDTO.setQuantity(orderLine.getQuantity());
			orderLineDTO.setTotal(orderLine.getTotal());
			createOrderLine(orderLineDTO);
		});

		return result;
	}

	@GetMapping("/orders/addresses/{customerId}")
	public ResponseEntity<List<AddressDTO>> getAllSavedAddress(@PathVariable String cutomerId) {
		return addressResourceApi.getAllAddressesUsingGET(1, 10, new ArrayList<>());
	}

	@PostMapping("/orders/addresses")
	public ResponseEntity<AddressDTO> createAddress(AddressDTO addressDTO) {
		ResponseEntity<AddressDTO> result = addressResourceApi.createAddressUsingPOST(addressDTO);
		return result;
	}

	@PostMapping("/orders/collectDeliveryDetails/{orderId}")
	public void collectDeliveryDetails(@RequestBody DeliveryInfo deliveryInfo,@PathVariable Long orderId) {
		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setAddressType(deliveryInfo.getDeliveryAddress().getAddressType());
		addressDTO.setAlternatePhone(deliveryInfo.getDeliveryAddress().getAlternatePhone());
		addressDTO.setCity(deliveryInfo.getDeliveryAddress().getCity());
		addressDTO.setCustomerId(deliveryInfo.getDeliveryAddress().getCustomerId());
		addressDTO.setHouseNoOrBuildingName(deliveryInfo.getDeliveryAddress().getHouseNoOrBuildingName());
		addressDTO.setLandmark(deliveryInfo.getDeliveryAddress().getLandmark());
		addressDTO.setName(deliveryInfo.getDeliveryAddress().getName());
		addressDTO.setPhone(deliveryInfo.getDeliveryAddress().getPhone());
		addressDTO.setPincode(deliveryInfo.getDeliveryAddress().getPincode());
		addressDTO.setRoadNameAreaOrStreet(deliveryInfo.getDeliveryAddress().getRoadNameAreaOrStreet());
		addressDTO.setState(deliveryInfo.getDeliveryAddress().getState());
		Long addressId = createAddress(addressDTO).getBody().getId();

		DeliveryInfoDTO deliveryInfoDTO = new DeliveryInfoDTO();
		deliveryInfoDTO.setDeliveryCharge(deliveryInfo.getDeliveryCharge());
		deliveryInfoDTO.setDeliveryType(deliveryInfo.getDeliveryType());
		deliveryInfoDTO.setExpectedDelivery(Instant.now());
		deliveryInfoDTO.setDeliveryAddressId(deliveryInfo.getDeliveryAddress().getId());
		ResponseEntity<DeliveryInfoDTO> deliveryInfoResult=createDeliveryInfo(deliveryInfoDTO);
		deliveryInfoDTO.setDeliveryAddressId(addressId);
		long deliveryId=deliveryInfoResult.getBody().getId();
		OrderDTO orderResult=orderResourceApi.getOrderUsingGET(orderId).getBody();
		orderResult.setDeliveryInfoId(deliveryId);
		updateOrder(orderResult);
	}

	@PostMapping("/orders/confirmDelivery/{phone}/{taskId}")
	public ResponseEntity<CommandResource> confirmDelivery(@PathVariable Long phone, @PathVariable String taskId) {
		return orderCommandResourceApi.confirmDeliveryUsingPOST(phone, taskId);
	}

	@PostMapping("/orders/makePayment/{taskId}")
	public ResponseEntity<CommandResource> createPayment(@RequestBody PaymentDTO paymentDTO,
			@PathVariable String taskId) {
		paymentCommandResourceApi.createPaymentUsingPOST(paymentDTO);
		return paymentCommandResourceApi.makePaymentUsingPOST(paymentDTO.getStatus(), taskId);

	}

	/////////////////////////////////////////////////////////////////////////////

	public ResponseEntity<CommandResource> createOrder(@RequestBody OrderDTO orderDTO) {

		return orderCommandResourceApi.createOrderUsingPOST(orderDTO);

	}

	public ResponseEntity<OrderLineDTO> createOrderLine(@RequestBody OrderLineDTO orderLineDTO) {
		return orderLineResourceApi.createOrderLineUsingPOST(orderLineDTO);
	}

	public ResponseEntity<DeliveryInfoDTO> createDeliveryInfo(@RequestBody DeliveryInfoDTO deliveryInfoDTO) {
		return deliveryInfoResourceApi.createDeliveryInfoUsingPOST(deliveryInfoDTO);
	}

	public ResponseEntity<DeliveryInfoDTO> updateDeliveryInfo(DeliveryInfoDTO deliveryInfoDTO) {
		return deliveryInfoResourceApi.updateDeliveryInfoUsingPUT(deliveryInfoDTO);
	}

	public ResponseEntity<OrderDTO> updateOrder(OrderDTO orderDTO) {
		return orderCommandResourceApi.updateOrderUsingPUT(orderDTO);
	}

}
