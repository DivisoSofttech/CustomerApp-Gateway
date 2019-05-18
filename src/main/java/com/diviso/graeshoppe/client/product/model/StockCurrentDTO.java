package com.diviso.graeshoppe.client.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StockCurrentDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-17T14:38:38.757+05:30[Asia/Kolkata]")

public class StockCurrentDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("sellPrice")
  private Double sellPrice = null;

  @JsonProperty("units")
  private Double units = null;

  public StockCurrentDTO id(Long id) {
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

  public StockCurrentDTO productId(Long productId) {
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

  public StockCurrentDTO sellPrice(Double sellPrice) {
    this.sellPrice = sellPrice;
    return this;
  }

  /**
   * Get sellPrice
   * @return sellPrice
  **/
  @ApiModelProperty(value = "")


  public Double getSellPrice() {
    return sellPrice;
  }

  public void setSellPrice(Double sellPrice) {
    this.sellPrice = sellPrice;
  }

  public StockCurrentDTO units(Double units) {
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
    StockCurrentDTO stockCurrentDTO = (StockCurrentDTO) o;
    return Objects.equals(this.id, stockCurrentDTO.id) &&
        Objects.equals(this.productId, stockCurrentDTO.productId) &&
        Objects.equals(this.sellPrice, stockCurrentDTO.sellPrice) &&
        Objects.equals(this.units, stockCurrentDTO.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productId, sellPrice, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockCurrentDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    sellPrice: ").append(toIndentedString(sellPrice)).append("\n");
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

