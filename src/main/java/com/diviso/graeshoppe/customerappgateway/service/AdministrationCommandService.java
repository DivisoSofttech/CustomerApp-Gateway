package com.diviso.graeshoppe.customerappgateway.service;

import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.customerappgateway.client.administration.model.FeedbackDTO;

public interface AdministrationCommandService {

	public ResponseEntity<FeedbackDTO> createFeedback(FeedbackDTO feedbackDTO);

}
