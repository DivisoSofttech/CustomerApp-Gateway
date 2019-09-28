package com.diviso.graeshoppe.web.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.offer.api.AggregateCommandResourceApi;
import com.diviso.graeshoppe.client.offer.model.OrderModel;
import com.diviso.graeshoppe.client.order.api.OrderQueryResourceApi;

@RestController
@RequestMapping("/api")
public class OfferCommandResource {

	@Autowired
	private AggregateCommandResourceApi aggregateCommandResourceApi;

	
	@Autowired
	private OrderQueryResourceApi orderQueryResourceApi;
	
	@PostMapping("/claimOffer/{customerId}")
	public ResponseEntity<OrderModel> checkOfferEligibility(@RequestBody OrderModel orderModel,@PathVariable String customerId) {
		Long count=orderQueryResourceApi.countByCustomerIdAndStatusNameUsingGET(customerId, "delivered").getBody();
				orderModel.setOrderNumber(count+1);
		orderModel.setPromoCode("SUPER20");
		
		ResponseEntity<OrderModel> result=aggregateCommandResourceApi.claimOfferUsingPOST(orderModel);
		return result;
	}
}
