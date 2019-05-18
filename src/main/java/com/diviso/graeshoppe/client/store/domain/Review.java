package com.diviso.graeshoppe.client.store.domain;

import java.time.OffsetDateTime;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.validation.annotation.Validated;

import io.swagger.annotations.ApiModelProperty;

/**
 * Review
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-17T15:08:38.225+05:30[Asia/Kolkata]")
@Document(indexName = "review")
public class Review   {
  
  private Long id = null;

  private String review = null;

  private OffsetDateTime reviewedDate = null;

  private Long storeId = null;

  private String userName = null;

  public Review id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Review review(String review) {
    this.review = review;
    return this;
  }

  /**
   * Get review
   * @return review
  **/
  @ApiModelProperty(value = "")


  public String getReview() {
    return review;
  }

  public void setReview(String review) {
    this.review = review;
  }

  public Review reviewedDate(OffsetDateTime reviewedDate) {
    this.reviewedDate = reviewedDate;
    return this;
  }

  /**
   * Get reviewedDate
   * @return reviewedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getReviewedDate() {
    return reviewedDate;
  }

  public void setReviewedDate(OffsetDateTime reviewedDate) {
    this.reviewedDate = reviewedDate;
  }

  public Review storeId(Long storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * Get storeId
   * @return storeId
  **/
  @ApiModelProperty(value = "")


  public Long getStoreId() {
    return storeId;
  }

  public void setStoreId(Long storeId) {
    this.storeId = storeId;
  }

  public Review userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Review reviewDTO = (Review) o;
    return Objects.equals(this.id, reviewDTO.id) &&
        Objects.equals(this.review, reviewDTO.review) &&
        Objects.equals(this.reviewedDate, reviewDTO.reviewedDate) &&
        Objects.equals(this.storeId, reviewDTO.storeId) &&
        Objects.equals(this.userName, reviewDTO.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, review, reviewedDate, storeId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    review: ").append(toIndentedString(review)).append("\n");
    sb.append("    reviewedDate: ").append(toIndentedString(reviewedDate)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

