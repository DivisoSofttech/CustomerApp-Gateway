package com.diviso.graeshoppe.customerappgateway.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.customerappgateway.client.administration.api.FeedbackResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.administration.model.FeedbackDTO;
import com.diviso.graeshoppe.customerappgateway.config.elasticsearch.ServiceUtility;
import com.diviso.graeshoppe.customerappgateway.service.AdministrationCommandService;

@Service
public class AdministrationCommandServiceImpl implements AdministrationCommandService{

	@Autowired
	ServiceUtility serviceUtility;
	
	@Autowired
	FeedbackResourceApi feedbackResourceApi;

	@Override
	public ResponseEntity<FeedbackDTO> createFeedback(FeedbackDTO feedbackDTO) {
		// TODO Auto-generated method stub
		return feedbackResourceApi.createFeedbackUsingPOST(feedbackDTO);
	}
}
