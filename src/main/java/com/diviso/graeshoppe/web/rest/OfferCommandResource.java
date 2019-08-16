package com.diviso.graeshoppe.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.offer.api.AggregateCommandResourceApi;
import com.diviso.graeshoppe.client.offer.model.OrderModel;

@RestController
@RequestMapping("/api")
public class OfferCommandResource {

	@Autowired
	private AggregateCommandResourceApi aggregateCommandResourceApi;
	
	@PostMapping("/claimOffer")
	public ResponseEntity<OrderModel> checkOfferEligibility(@RequestBody OrderModel orderModel) {
		ResponseEntity<OrderModel> result=aggregateCommandResourceApi.claimOfferUsingPOST(orderModel);
	
		return result;
	}
}
