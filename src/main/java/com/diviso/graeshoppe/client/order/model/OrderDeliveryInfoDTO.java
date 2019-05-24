package com.diviso.graeshoppe.client.order.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.Instant;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderDeliveryInfoDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-23T15:17:21.066+05:30[Asia/Kolkata]")

public class OrderDeliveryInfoDTO   {
  @JsonProperty("deliveryAddressId")
  private Long deliveryAddressId = null;

  @JsonProperty("deliveryCharge")
  private Double deliveryCharge = null;

  @JsonProperty("deliveryType")
  private String deliveryType = null;

  @JsonProperty("expectedDelivery")
  private Instant expectedDelivery = null;

  @JsonProperty("id")
  private Long id = null;

  public OrderDeliveryInfoDTO deliveryAddressId(Long deliveryAddressId) {
    this.deliveryAddressId = deliveryAddressId;
    return this;
  }

  /**
   * Get deliveryAddressId
   * @return deliveryAddressId
  **/
  @ApiModelProperty(value = "")


  public Long getDeliveryAddressId() {
    return deliveryAddressId;
  }

  public void setDeliveryAddressId(Long deliveryAddressId) {
    this.deliveryAddressId = deliveryAddressId;
  }

  public OrderDeliveryInfoDTO deliveryCharge(Double deliveryCharge) {
    this.deliveryCharge = deliveryCharge;
    return this;
  }

  /**
   * Get deliveryCharge
   * @return deliveryCharge
  **/
  @ApiModelProperty(value = "")


  public Double getDeliveryCharge() {
    return deliveryCharge;
  }

  public void setDeliveryCharge(Double deliveryCharge) {
    this.deliveryCharge = deliveryCharge;
  }

  public OrderDeliveryInfoDTO deliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

  /**
   * Get deliveryType
   * @return deliveryType
  **/
  @ApiModelProperty(value = "")


  public String getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(String deliveryType) {
    this.deliveryType = deliveryType;
  }

  public OrderDeliveryInfoDTO expectedDelivery(Instant expectedDelivery) {
    this.expectedDelivery = expectedDelivery;
    return this;
  }

  /**
   * Get expectedDelivery
   * @return expectedDelivery
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Instant getExpectedDelivery() {
    return expectedDelivery;
  }

  public void setExpectedDelivery(Instant expectedDelivery) {
    this.expectedDelivery = expectedDelivery;
  }

  public OrderDeliveryInfoDTO id(Long id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDeliveryInfoDTO deliveryInfoDTO = (OrderDeliveryInfoDTO) o;
    return Objects.equals(this.deliveryAddressId, deliveryInfoDTO.deliveryAddressId) &&
        Objects.equals(this.deliveryCharge, deliveryInfoDTO.deliveryCharge) &&
        Objects.equals(this.deliveryType, deliveryInfoDTO.deliveryType) &&
        Objects.equals(this.expectedDelivery, deliveryInfoDTO.expectedDelivery) &&
        Objects.equals(this.id, deliveryInfoDTO.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryAddressId, deliveryCharge, deliveryType, expectedDelivery, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDeliveryInfoDTO {\n");
    
    sb.append("    deliveryAddressId: ").append(toIndentedString(deliveryAddressId)).append("\n");
    sb.append("    deliveryCharge: ").append(toIndentedString(deliveryCharge)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    expectedDelivery: ").append(toIndentedString(expectedDelivery)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
