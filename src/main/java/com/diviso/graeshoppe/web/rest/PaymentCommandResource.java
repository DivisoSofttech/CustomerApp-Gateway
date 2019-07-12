package com.diviso.graeshoppe.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.payment.api.RazorpayCommandResourceApi;
import com.diviso.graeshoppe.client.payment.model.OrderRequest;
import com.diviso.graeshoppe.client.payment.model.OrderResponse;

@RequestMapping("/api")
@RestController
public class PaymentCommandResource {

	
	@Autowired
	private RazorpayCommandResourceApi  razorpayCommandResourceApi;
	
	@PostMapping("/payments/razorpay/order")
	public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest orderRequest){
		return razorpayCommandResourceApi.createOrderUsingPOST(orderRequest);
	}
}
