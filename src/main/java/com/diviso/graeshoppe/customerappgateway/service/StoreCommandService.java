package com.diviso.graeshoppe.customerappgateway.service;

import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.customerappgateway.client.store.model.ReplyDTO;
import com.diviso.graeshoppe.customerappgateway.client.store.model.UserRatingReviewDTO;

public interface StoreCommandService {
	public ResponseEntity<ReplyDTO> createReply( ReplyDTO replyDTO);
	public ResponseEntity<ReplyDTO> updateReply( ReplyDTO replyDTO);
	public ResponseEntity<Void> deleteReply(Long id);
	public	ResponseEntity<UserRatingReviewDTO> createUserRatingReview(UserRatingReviewDTO userRatingReviewDTO);
	public ResponseEntity<Void> deleteUserRatingReview( Long id);
	public ResponseEntity<UserRatingReviewDTO> updateUserRatingReview(UserRatingReviewDTO userRatingReviewDTO);
}
