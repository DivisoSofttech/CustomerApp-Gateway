package com.diviso.graeshoppe.client.store.model;

import java.util.Objects;
import com.diviso.graeshoppe.client.store.model.DeliveryInfo;
import com.diviso.graeshoppe.client.store.model.Propreitor;
import com.diviso.graeshoppe.client.store.model.Review;
import com.diviso.graeshoppe.client.store.model.UserRating;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Store
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-23T15:07:25.498+05:30[Asia/Kolkata]")

public class Store   {
  @JsonProperty("closingTime")
  private OffsetDateTime closingTime = null;

  @JsonProperty("contactNo")
  private Long contactNo = null;

  @JsonProperty("deliveryInfo")
  private DeliveryInfo deliveryInfo = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("image")
  private byte[] image = null;

  @JsonProperty("imageContentType")
  private String imageContentType = null;

  @JsonProperty("info")
  private String info = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("openingTime")
  private OffsetDateTime openingTime = null;

  @JsonProperty("propreitor")
  private Propreitor propreitor = null;

  @JsonProperty("regNo")
  private String regNo = null;

  @JsonProperty("reviews")
  @Valid
  private List<Review> reviews = null;

  @JsonProperty("totalRating")
  private Double totalRating = null;

  @JsonProperty("userRatings")
  @Valid
  private List<UserRating> userRatings = null;

  public Store closingTime(OffsetDateTime closingTime) {
    this.closingTime = closingTime;
    return this;
  }

  /**
   * Get closingTime
   * @return closingTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(OffsetDateTime closingTime) {
    this.closingTime = closingTime;
  }

  public Store contactNo(Long contactNo) {
    this.contactNo = contactNo;
    return this;
  }

  /**
   * Get contactNo
   * @return contactNo
  **/
  @ApiModelProperty(value = "")


  public Long getContactNo() {
    return contactNo;
  }

  public void setContactNo(Long contactNo) {
    this.contactNo = contactNo;
  }

  public Store deliveryInfo(DeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
    return this;
  }

  /**
   * Get deliveryInfo
   * @return deliveryInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DeliveryInfo getDeliveryInfo() {
    return deliveryInfo;
  }

  public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
  }

  public Store email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Store id(Long id) {
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

  public Store image(byte[] image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public Store imageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
    return this;
  }

  /**
   * Get imageContentType
   * @return imageContentType
  **/
  @ApiModelProperty(value = "")


  public String getImageContentType() {
    return imageContentType;
  }

  public void setImageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
  }

  public Store info(String info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(value = "")


  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public Store location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Store name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Store openingTime(OffsetDateTime openingTime) {
    this.openingTime = openingTime;
    return this;
  }

  /**
   * Get openingTime
   * @return openingTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getOpeningTime() {
    return openingTime;
  }

  public void setOpeningTime(OffsetDateTime openingTime) {
    this.openingTime = openingTime;
  }

  public Store propreitor(Propreitor propreitor) {
    this.propreitor = propreitor;
    return this;
  }

  /**
   * Get propreitor
   * @return propreitor
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Propreitor getPropreitor() {
    return propreitor;
  }

  public void setPropreitor(Propreitor propreitor) {
    this.propreitor = propreitor;
  }

  public Store regNo(String regNo) {
    this.regNo = regNo;
    return this;
  }

  /**
   * Get regNo
   * @return regNo
  **/
  @ApiModelProperty(value = "")


  public String getRegNo() {
    return regNo;
  }

  public void setRegNo(String regNo) {
    this.regNo = regNo;
  }

  public Store reviews(List<Review> reviews) {
    this.reviews = reviews;
    return this;
  }

  public Store addReviewsItem(Review reviewsItem) {
    if (this.reviews == null) {
      this.reviews = new ArrayList<Review>();
    }
    this.reviews.add(reviewsItem);
    return this;
  }

  /**
   * Get reviews
   * @return reviews
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Review> getReviews() {
    return reviews;
  }

  public void setReviews(List<Review> reviews) {
    this.reviews = reviews;
  }

  public Store totalRating(Double totalRating) {
    this.totalRating = totalRating;
    return this;
  }

  /**
   * Get totalRating
   * @return totalRating
  **/
  @ApiModelProperty(value = "")


  public Double getTotalRating() {
    return totalRating;
  }

  public void setTotalRating(Double totalRating) {
    this.totalRating = totalRating;
  }

  public Store userRatings(List<UserRating> userRatings) {
    this.userRatings = userRatings;
    return this;
  }

  public Store addUserRatingsItem(UserRating userRatingsItem) {
    if (this.userRatings == null) {
      this.userRatings = new ArrayList<UserRating>();
    }
    this.userRatings.add(userRatingsItem);
    return this;
  }

  /**
   * Get userRatings
   * @return userRatings
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<UserRating> getUserRatings() {
    return userRatings;
  }

  public void setUserRatings(List<UserRating> userRatings) {
    this.userRatings = userRatings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Store store = (Store) o;
    return Objects.equals(this.closingTime, store.closingTime) &&
        Objects.equals(this.contactNo, store.contactNo) &&
        Objects.equals(this.deliveryInfo, store.deliveryInfo) &&
        Objects.equals(this.email, store.email) &&
        Objects.equals(this.id, store.id) &&
        Objects.equals(this.image, store.image) &&
        Objects.equals(this.imageContentType, store.imageContentType) &&
        Objects.equals(this.info, store.info) &&
        Objects.equals(this.location, store.location) &&
        Objects.equals(this.name, store.name) &&
        Objects.equals(this.openingTime, store.openingTime) &&
        Objects.equals(this.propreitor, store.propreitor) &&
        Objects.equals(this.regNo, store.regNo) &&
        Objects.equals(this.reviews, store.reviews) &&
        Objects.equals(this.totalRating, store.totalRating) &&
        Objects.equals(this.userRatings, store.userRatings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closingTime, contactNo, deliveryInfo, email, id, image, imageContentType, info, location, name, openingTime, propreitor, regNo, reviews, totalRating, userRatings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Store {\n");
    
    sb.append("    closingTime: ").append(toIndentedString(closingTime)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    deliveryInfo: ").append(toIndentedString(deliveryInfo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageContentType: ").append(toIndentedString(imageContentType)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openingTime: ").append(toIndentedString(openingTime)).append("\n");
    sb.append("    propreitor: ").append(toIndentedString(propreitor)).append("\n");
    sb.append("    regNo: ").append(toIndentedString(regNo)).append("\n");
    sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
    sb.append("    totalRating: ").append(toIndentedString(totalRating)).append("\n");
    sb.append("    userRatings: ").append(toIndentedString(userRatings)).append("\n");
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

