package com.diviso.graeshoppe.client.store.domain;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.validation.annotation.Validated;

import io.swagger.annotations.ApiModelProperty;

/**
 * Store
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-17T15:08:38.225+05:30[Asia/Kolkata]")
@Document(indexName = "store")
public class Store   {
 
  private Instant closingTime = null;

  private Long contactNo = null;

  private String email = null;

  private Long id = null;

  private byte[] image = null;

  private String imageContentType = null;

  private String location = null;

  private String name = null;

  private Instant openingTime = null;

  private Long propreitorId = null;

  private String regNo = null;

  private Double totalRating = null;

  public Store closingTime(Instant closingTime) {
    this.closingTime = closingTime;
    return this;
  }

  /**
   * Get closingTime
   * @return closingTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Instant getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(Instant closingTime) {
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

  public Store openingTime(Instant openingTime) {
    this.openingTime = openingTime;
    return this;
  }

  /**
   * Get openingTime
   * @return openingTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Instant getOpeningTime() {
    return openingTime;
  }

  public void setOpeningTime(Instant openingTime) {
    this.openingTime = openingTime;
  }

  public Store propreitorId(Long propreitorId) {
    this.propreitorId = propreitorId;
    return this;
  }

  /**
   * Get propreitorId
   * @return propreitorId
  **/
  @ApiModelProperty(value = "")


  public Long getPropreitorId() {
    return propreitorId;
  }

  public void setPropreitorId(Long propreitorId) {
    this.propreitorId = propreitorId;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Store storeDTO = (Store) o;
    return Objects.equals(this.closingTime, storeDTO.closingTime) &&
        Objects.equals(this.contactNo, storeDTO.contactNo) &&
        Objects.equals(this.email, storeDTO.email) &&
        Objects.equals(this.id, storeDTO.id) &&
        Objects.equals(this.image, storeDTO.image) &&
        Objects.equals(this.imageContentType, storeDTO.imageContentType) &&
        Objects.equals(this.location, storeDTO.location) &&
        Objects.equals(this.name, storeDTO.name) &&
        Objects.equals(this.openingTime, storeDTO.openingTime) &&
        Objects.equals(this.propreitorId, storeDTO.propreitorId) &&
        Objects.equals(this.regNo, storeDTO.regNo) &&
        Objects.equals(this.totalRating, storeDTO.totalRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closingTime, contactNo, email, id, image, imageContentType, location, name, openingTime, propreitorId, regNo, totalRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreDTO {\n");
    
    sb.append("    closingTime: ").append(toIndentedString(closingTime)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageContentType: ").append(toIndentedString(imageContentType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openingTime: ").append(toIndentedString(openingTime)).append("\n");
    sb.append("    propreitorId: ").append(toIndentedString(propreitorId)).append("\n");
    sb.append("    regNo: ").append(toIndentedString(regNo)).append("\n");
    sb.append("    totalRating: ").append(toIndentedString(totalRating)).append("\n");
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

