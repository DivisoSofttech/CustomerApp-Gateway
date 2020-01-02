package com.diviso.graeshoppe.customerappgateway.service.impl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.customerappgateway.client.store.api.ReplyResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.store.api.UserRatingReviewResourceApi;

import com.diviso.graeshoppe.customerappgateway.client.store.model.ReplyDTO;
import com.diviso.graeshoppe.customerappgateway.client.store.model.UserRatingReviewDTO;
import com.diviso.graeshoppe.customerappgateway.service.StoreCommandService;
import com.diviso.graeshoppe.customerappgateway.service.StoreQueryService;
import com.diviso.graeshoppe.customerappgateway.web.rest.QueryResource;
@Service
public class StoreCommandServiceImpl  implements StoreCommandService {


	@Autowired
	private ReplyResourceApi replyResourceApi;


	@Autowired
	QueryResource queryResource;
	
	@Autowired
	StoreQueryService storeQueryService;
	@Autowired
	UserRatingReviewResourceApi userRatingReviewResourceApi;
	
	private final Logger log = LoggerFactory.getLogger(StoreCommandServiceImpl.class);
	
	public ResponseEntity<ReplyDTO> createReply( ReplyDTO replyDTO) {
		return this.replyResourceApi.createReplyUsingPOST(replyDTO);
	}

	
	public ResponseEntity<ReplyDTO> updateReply( ReplyDTO replyDTO) {
		return this.replyResourceApi.updateReplyUsingPUT(replyDTO);
	}


	public ResponseEntity<Void> deleteReply(Long id) {
		return this.replyResourceApi.deleteReplyUsingDELETE(id);
	}
	
	

	/*public ResponseEntity<UserRatingDTO> createUserRating( UserRatingDTO userRatingDTO) {
		return this.userRatingResourceApi.createUserRatingUsingPOST(userRatingDTO);
	}


	public ResponseEntity<UserRatingDTO> updateUserRating(UserRatingDTO userRatingDTO) {
		return this.userRatingResourceApi.updateUserRatingUsingPUT(userRatingDTO);
	}

	
	public ResponseEntity<Void> deleteUserRating( Long id) {
		return this.userRatingResourceApi.deleteUserRatingUsingDELETE(id);
	}*/
	
	
	/*public ResponseEntity<Page<RatingReview>> createRatingAndReview( RatingReview ratingReview,
			Pageable pageable) {

		UserRatingDTO userRatingDTO = ratingReview.getRating();
		log.info(">>>>>>>>>>>>>>>>>>>>>>>>ratingdto>>>>>>>>>>>>>>>>>>>>>>  " + userRatingDTO);
		ReviewDTO reviewDTO = ratingReview.getReview();
		log.info(">>>>>>>>>>>>>>>>>>>>>>>>reviewdto>>>>>>>>>>>>>>>>>>>>>>  " + reviewDTO);
		StoreDTO store = null;
		log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + userRatingDTO + ">>>>>>>>>>>>>>>>>>>>>" + reviewDTO
				+ "     condition...     " + (userRatingDTO.getRating() != null));
		if (userRatingDTO.getRating() != null) {

			store = storeResourceApi.getStoreUsingGET(userRatingDTO.getStoreId()).getBody();
			log.info(">>>>>>>>>>>>>>>>>>>>>>>>IF>>>>>>>>>>>>>>>>>>>>>>" + store.getRegNo() + "     "
					+ userRatingDTO.getUserName());
			UserRating alreadyRatedUser = storeQueryService.findRatingByStoreIdAndCustomerName(store.getRegNo(),
					userRatingDTO.getUserName());

			log.info(">>>>>>>>>>>>>>>>>>>>>>alreadyRatedUser: >>>>>>>>>>>>>>>>>>>>>>>>" + alreadyRatedUser);

			if (alreadyRatedUser == null) {
				log.info("............create................");

				ResponseEntity<ReviewDTO> review = reviewResourceApi.createReviewUsingPOST(reviewDTO);

				log.info("...........saved review............." + review.getBody());

				log.info("............check userrating................  " + userRatingDTO);

				ResponseEntity<UserRatingDTO> ratingDTO = userRatingResourceApi
						.createUserRatingUsingPOST(userRatingDTO);

				log.info("............saved rating.........." + ratingDTO.getBody());

				ratingReview.setRating(ratingDTO.getBody());
				ratingReview.setReview(review.getBody());
			} else {

				log.info("..............................ELSE>>>>>>>>>>>>>>>>>>>>>>>>>");
				if (alreadyRatedUser.getId() != null) {
					log.info("....................UPDATE..............");

					userRatingDTO.setId(alreadyRatedUser.getId());

					log.info("................username:............" + userRatingDTO.getUserName()
							+ "..........storeId..........." + store.getRegNo() + "...........");

					Review alreadyreviewed = storeQueryService.findReviewByStoreIdAndCustomerName(store.getRegNo(),
							userRatingDTO.getUserName());

					log.info("...................   " + alreadyreviewed + "     ...............");

					reviewDTO.setId(alreadyreviewed.getId());

					ResponseEntity<ReviewDTO> review = reviewResourceApi.updateReviewUsingPUT(reviewDTO);

					ResponseEntity<UserRatingDTO> ratingDTO = userRatingResourceApi
							.updateUserRatingUsingPUT(userRatingDTO);

					ratingReview.setRating(ratingDTO.getBody());

					ratingReview.setReview(review.getBody());
				}
			}

		}
		return queryResource.findRatingReviewByStoreidAndCustomerName(store.getRegNo(), pageable);
		
	}
	
	*/
	/*public ResponseEntity<ReviewDTO> createUserReview(ReviewDTO reviewDTO) {
		return this.reviewResourceApi.createReviewUsingPOST(reviewDTO);
	}

	
	public ResponseEntity<ReviewDTO> updateReview(ReviewDTO reviewDTO) {
		return this.reviewResourceApi.updateReviewUsingPUT(reviewDTO);
	}

	
	public ResponseEntity<Void> deleteReview(Long id) {
		return this.reviewResourceApi.deleteReviewUsingDELETE(id);
	}*/

//working	
public	ResponseEntity<UserRatingReviewDTO> createUserRatingReview(UserRatingReviewDTO userRatingReviewDTO){

	return	userRatingReviewResourceApi.createUserRatingReviewUsingPOST(userRatingReviewDTO);
}
	
	public ResponseEntity<Void> deleteUserRatingReview( Long id){
	return	userRatingReviewResourceApi.deleteUserRatingReviewUsingDELETE(id);
}
	
	
	
	
	public ResponseEntity<UserRatingReviewDTO> updateUserRatingReview(UserRatingReviewDTO userRatingReviewDTO){
		return	userRatingReviewResourceApi.updateUserRatingReviewUsingPUT(userRatingReviewDTO);
	}
	
	
	
	
	
	
	
	
}
