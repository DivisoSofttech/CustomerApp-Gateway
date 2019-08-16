package com.diviso.graeshoppe.web.rest;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.payment.model.ProcessPaymentRequest;
import com.diviso.graeshoppe.service.QueryService;
import com.diviso.graeshoppe.client.order.api.OrderCommandResourceApi;
import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.client.order.model.OrderDTO;
import com.diviso.graeshoppe.client.payment.api.PaymentResourceApi;
import com.diviso.graeshoppe.client.payment.api.PaypalCommandResourceApi;
import com.diviso.graeshoppe.client.payment.api.RazorpayCommandResourceApi;
import com.diviso.graeshoppe.client.payment.model.CommandResource;
import com.diviso.graeshoppe.client.payment.model.OrderRequest;
import com.diviso.graeshoppe.client.payment.model.OrderResponse;
import com.diviso.graeshoppe.client.payment.model.PaymentDTO;
import com.diviso.graeshoppe.client.payment.model.PaymentExecutionRequest;
import com.diviso.graeshoppe.client.payment.model.PaymentInitiateRequest;
import com.diviso.graeshoppe.client.payment.model.PaymentInitiateResponse;

@RequestMapping("/api/command")
@RestController
public class PaymentCommandResource {

	@Autowired
	private PaymentResourceApi paymentResourceApi;
	@Autowired
	private RazorpayCommandResourceApi  razorpayCommandResourceApi;
	
	@Autowired
	private OrderCommandResourceApi orderCommadnREsourceApi;
	
	@Autowired
	private QueryService queryService;
	
	@Autowired
	private PaypalCommandResourceApi paypalCommandResourceApi;
	
	@PostMapping("/razorpay/order")
	public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest orderRequest){
		return razorpayCommandResourceApi.createOrderUsingPOST(orderRequest);
	}
	
	@PostMapping("/payments")
	public ResponseEntity<PaymentDTO> createPayment(@RequestBody PaymentDTO paymentDTO) {
		paymentDTO.setDateAndTime(OffsetDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
		ResponseEntity<PaymentDTO> dto=paymentResourceApi.createPaymentUsingPOST(paymentDTO);
		Order order=queryService.findOrderByOrderId(paymentDTO.getTargetId());
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setId(order.getId());
		orderDTO.setDate(OffsetDateTime.ofInstant(order.getDate(), ZoneId.systemDefault()));
		orderDTO.setOrderId(order.getOrderId());
		orderDTO.setCustomerId(order.getCustomerId());
		orderDTO.setStoreId(order.getStoreId());
		orderDTO.setGrandTotal(order.getGrandTotal());
		orderDTO.setEmail(order.getEmail());
		orderDTO.setDeliveryInfoId(order.getDeliveryInfo().getId());
		orderDTO.setApprovalDetailsId(order.getApprovalDetails().getId());
		orderDTO.setPaymentRef(dto.getBody().getId()+"");
		orderDTO.setStatusId(5l);
		orderCommadnREsourceApi.updateOrderUsingPUT(orderDTO);
		return dto;
	}
	
	@PostMapping("/processPayment")
	public ResponseEntity<CommandResource> processPayment(@RequestBody ProcessPaymentRequest processPaymentRequest) {
		
		
		return paymentResourceApi.processPaymentUsingPOST(processPaymentRequest);
	}
	
	@PostMapping("/paypal/initiate")
	public ResponseEntity<PaymentInitiateResponse> initiatePayment(@RequestBody PaymentInitiateRequest paymentInitiateRequest) {
		return paypalCommandResourceApi.initiatePaymentUsingPOST(paymentInitiateRequest);
	}
	
	
	@PostMapping("/paypal/execute/{paymentId}")
	public ResponseEntity<Void> executePayment(@RequestBody PaymentExecutionRequest paymentExecutionRequest,@PathVariable String paymentId) {
		return paypalCommandResourceApi.executePaymentUsingPOST(paymentId, paymentExecutionRequest);
	}
}
