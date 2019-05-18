package com.diviso.graeshoppe.client.store.domain;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.validation.annotation.Validated;

import io.swagger.annotations.ApiModelProperty;

/**
 * UserRating
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-17T15:08:38.225+05:30[Asia/Kolkata]")
@Document(indexName = "userrating")
public class UserRating   {

  private Long id = null;

  private Instant ratedOn = null;

  private Double rating = null;

  private Long storeId = null;

  private String userName = null;

  public UserRating id(Long id) {
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

  public UserRating ratedOn(Instant ratedOn) {
    this.ratedOn = ratedOn;
    return this;
  }

  /**
   * Get ratedOn
   * @return ratedOn
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Instant getRatedOn() {
    return ratedOn;
  }

  public void setRatedOn(Instant ratedOn) {
    this.ratedOn = ratedOn;
  }

  public UserRating rating(Double rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")


  public Double getRating() {
    return rating;
  }

  public void setRating(Double rating) {
    this.rating = rating;
  }

  public UserRating storeId(Long storeId) {
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

  public UserRating userName(String userName) {
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
    UserRating userRatingDTO = (UserRating) o;
    return Objects.equals(this.id, userRatingDTO.id) &&
        Objects.equals(this.ratedOn, userRatingDTO.ratedOn) &&
        Objects.equals(this.rating, userRatingDTO.rating) &&
        Objects.equals(this.storeId, userRatingDTO.storeId) &&
        Objects.equals(this.userName, userRatingDTO.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ratedOn, rating, storeId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRatingDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ratedOn: ").append(toIndentedString(ratedOn)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

