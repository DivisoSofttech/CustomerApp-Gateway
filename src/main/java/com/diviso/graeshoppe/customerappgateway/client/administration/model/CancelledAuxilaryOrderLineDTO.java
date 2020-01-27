package com.diviso.graeshoppe.customerappgateway.client.administration.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CancelledAuxilaryOrderLineDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-27T14:13:06.209+05:30[Asia/Kolkata]")

public class CancelledAuxilaryOrderLineDTO   {
  @JsonProperty("ammount")
  private Double ammount = null;

  @JsonProperty("cancellationRequestId")
  private Long cancellationRequestId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("itemName")
  private String itemName = null;

  @JsonProperty("orderLineId")
  private Long orderLineId = null;

  @JsonProperty("pricePerUnit")
  private Double pricePerUnit = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("quantity")
  private Long quantity = null;

  public CancelledAuxilaryOrderLineDTO ammount(Double ammount) {
    this.ammount = ammount;
    return this;
  }

  /**
   * Get ammount
   * @return ammount
  **/
  @ApiModelProperty(value = "")


  public Double getAmmount() {
    return ammount;
  }

  public void setAmmount(Double ammount) {
    this.ammount = ammount;
  }

  public CancelledAuxilaryOrderLineDTO cancellationRequestId(Long cancellationRequestId) {
    this.cancellationRequestId = cancellationRequestId;
    return this;
  }

  /**
   * Get cancellationRequestId
   * @return cancellationRequestId
  **/
  @ApiModelProperty(value = "")


  public Long getCancellationRequestId() {
    return cancellationRequestId;
  }

  public void setCancellationRequestId(Long cancellationRequestId) {
    this.cancellationRequestId = cancellationRequestId;
  }

  public CancelledAuxilaryOrderLineDTO id(Long id) {
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

  public CancelledAuxilaryOrderLineDTO itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

  /**
   * Get itemName
   * @return itemName
  **/
  @ApiModelProperty(value = "")


  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public CancelledAuxilaryOrderLineDTO orderLineId(Long orderLineId) {
    this.orderLineId = orderLineId;
    return this;
  }

  /**
   * Get orderLineId
   * @return orderLineId
  **/
  @ApiModelProperty(value = "")


  public Long getOrderLineId() {
    return orderLineId;
  }

  public void setOrderLineId(Long orderLineId) {
    this.orderLineId = orderLineId;
  }

  public CancelledAuxilaryOrderLineDTO pricePerUnit(Double pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
    return this;
  }

  /**
   * Get pricePerUnit
   * @return pricePerUnit
  **/
  @ApiModelProperty(value = "")


  public Double getPricePerUnit() {
    return pricePerUnit;
  }

  public void setPricePerUnit(Double pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
  }

  public CancelledAuxilaryOrderLineDTO productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(value = "")


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public CancelledAuxilaryOrderLineDTO quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")


  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelledAuxilaryOrderLineDTO cancelledAuxilaryOrderLineDTO = (CancelledAuxilaryOrderLineDTO) o;
    return Objects.equals(this.ammount, cancelledAuxilaryOrderLineDTO.ammount) &&
        Objects.equals(this.cancellationRequestId, cancelledAuxilaryOrderLineDTO.cancellationRequestId) &&
        Objects.equals(this.id, cancelledAuxilaryOrderLineDTO.id) &&
        Objects.equals(this.itemName, cancelledAuxilaryOrderLineDTO.itemName) &&
        Objects.equals(this.orderLineId, cancelledAuxilaryOrderLineDTO.orderLineId) &&
        Objects.equals(this.pricePerUnit, cancelledAuxilaryOrderLineDTO.pricePerUnit) &&
        Objects.equals(this.productId, cancelledAuxilaryOrderLineDTO.productId) &&
        Objects.equals(this.quantity, cancelledAuxilaryOrderLineDTO.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ammount, cancellationRequestId, id, itemName, orderLineId, pricePerUnit, productId, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelledAuxilaryOrderLineDTO {\n");
    
    sb.append("    ammount: ").append(toIndentedString(ammount)).append("\n");
    sb.append("    cancellationRequestId: ").append(toIndentedString(cancellationRequestId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
    sb.append("    pricePerUnit: ").append(toIndentedString(pricePerUnit)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

