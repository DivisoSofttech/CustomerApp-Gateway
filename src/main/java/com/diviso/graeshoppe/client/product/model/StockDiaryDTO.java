package com.diviso.graeshoppe.client.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StockDiaryDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-18T09:29:25.285+05:30[Asia/Kolkata]")

public class StockDiaryDTO   {
  @JsonProperty("dateOfCreation")
  private LocalDate dateOfCreation = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("isBuy")
  private Boolean isBuy = null;

  @JsonProperty("price")
  private Double price = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("units")
  private Double units = null;

  public StockDiaryDTO dateOfCreation(LocalDate dateOfCreation) {
    this.dateOfCreation = dateOfCreation;
    return this;
  }

  /**
   * Get dateOfCreation
   * @return dateOfCreation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateOfCreation() {
    return dateOfCreation;
  }

  public void setDateOfCreation(LocalDate dateOfCreation) {
    this.dateOfCreation = dateOfCreation;
  }

  public StockDiaryDTO id(Long id) {
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

  public StockDiaryDTO isBuy(Boolean isBuy) {
    this.isBuy = isBuy;
    return this;
  }

  /**
   * Get isBuy
   * @return isBuy
  **/
  @ApiModelProperty(value = "")


  public Boolean isIsBuy() {
    return isBuy;
  }

  public void setIsBuy(Boolean isBuy) {
    this.isBuy = isBuy;
  }

  public StockDiaryDTO price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")


  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public StockDiaryDTO productId(Long productId) {
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

  public StockDiaryDTO units(Double units) {
    this.units = units;
    return this;
  }

  /**
   * Get units
   * @return units
  **/
  @ApiModelProperty(value = "")


  public Double getUnits() {
    return units;
  }

  public void setUnits(Double units) {
    this.units = units;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockDiaryDTO stockDiaryDTO = (StockDiaryDTO) o;
    return Objects.equals(this.dateOfCreation, stockDiaryDTO.dateOfCreation) &&
        Objects.equals(this.id, stockDiaryDTO.id) &&
        Objects.equals(this.isBuy, stockDiaryDTO.isBuy) &&
        Objects.equals(this.price, stockDiaryDTO.price) &&
        Objects.equals(this.productId, stockDiaryDTO.productId) &&
        Objects.equals(this.units, stockDiaryDTO.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfCreation, id, isBuy, price, productId, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockDiaryDTO {\n");
    
    sb.append("    dateOfCreation: ").append(toIndentedString(dateOfCreation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isBuy: ").append(toIndentedString(isBuy)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

