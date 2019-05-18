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
 * StockLineDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-18T09:29:25.285+05:30[Asia/Kolkata]")

public class StockLineDTO   {
  @JsonProperty("buyPrice")
  private Double buyPrice = null;

  @JsonProperty("grossProfit")
  private Double grossProfit = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("infrastructureId")
  private Long infrastructureId = null;

  @JsonProperty("locationId")
  private String locationId = null;

  @JsonProperty("margin")
  private Double margin = null;

  @JsonProperty("productId")
  private Long productId = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("sellPriceExclusive")
  private Double sellPriceExclusive = null;

  @JsonProperty("sellPriceInclusive")
  private Double sellPriceInclusive = null;

  @JsonProperty("supplierRef")
  private Long supplierRef = null;

  @JsonProperty("units")
  private Double units = null;

  @JsonProperty("uomId")
  private Long uomId = null;

  public StockLineDTO buyPrice(Double buyPrice) {
    this.buyPrice = buyPrice;
    return this;
  }

  /**
   * Get buyPrice
   * @return buyPrice
  **/
  @ApiModelProperty(value = "")


  public Double getBuyPrice() {
    return buyPrice;
  }

  public void setBuyPrice(Double buyPrice) {
    this.buyPrice = buyPrice;
  }

  public StockLineDTO grossProfit(Double grossProfit) {
    this.grossProfit = grossProfit;
    return this;
  }

  /**
   * Get grossProfit
   * @return grossProfit
  **/
  @ApiModelProperty(value = "")


  public Double getGrossProfit() {
    return grossProfit;
  }

  public void setGrossProfit(Double grossProfit) {
    this.grossProfit = grossProfit;
  }

  public StockLineDTO id(Long id) {
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

  public StockLineDTO infrastructureId(Long infrastructureId) {
    this.infrastructureId = infrastructureId;
    return this;
  }

  /**
   * Get infrastructureId
   * @return infrastructureId
  **/
  @ApiModelProperty(value = "")


  public Long getInfrastructureId() {
    return infrastructureId;
  }

  public void setInfrastructureId(Long infrastructureId) {
    this.infrastructureId = infrastructureId;
  }

  public StockLineDTO locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   * @return locationId
  **/
  @ApiModelProperty(value = "")


  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public StockLineDTO margin(Double margin) {
    this.margin = margin;
    return this;
  }

  /**
   * Get margin
   * @return margin
  **/
  @ApiModelProperty(value = "")


  public Double getMargin() {
    return margin;
  }

  public void setMargin(Double margin) {
    this.margin = margin;
  }

  public StockLineDTO productId(Long productId) {
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

  public StockLineDTO reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public StockLineDTO sellPriceExclusive(Double sellPriceExclusive) {
    this.sellPriceExclusive = sellPriceExclusive;
    return this;
  }

  /**
   * Get sellPriceExclusive
   * @return sellPriceExclusive
  **/
  @ApiModelProperty(value = "")


  public Double getSellPriceExclusive() {
    return sellPriceExclusive;
  }

  public void setSellPriceExclusive(Double sellPriceExclusive) {
    this.sellPriceExclusive = sellPriceExclusive;
  }

  public StockLineDTO sellPriceInclusive(Double sellPriceInclusive) {
    this.sellPriceInclusive = sellPriceInclusive;
    return this;
  }

  /**
   * Get sellPriceInclusive
   * @return sellPriceInclusive
  **/
  @ApiModelProperty(value = "")


  public Double getSellPriceInclusive() {
    return sellPriceInclusive;
  }

  public void setSellPriceInclusive(Double sellPriceInclusive) {
    this.sellPriceInclusive = sellPriceInclusive;
  }

  public StockLineDTO supplierRef(Long supplierRef) {
    this.supplierRef = supplierRef;
    return this;
  }

  /**
   * Get supplierRef
   * @return supplierRef
  **/
  @ApiModelProperty(value = "")


  public Long getSupplierRef() {
    return supplierRef;
  }

  public void setSupplierRef(Long supplierRef) {
    this.supplierRef = supplierRef;
  }

  public StockLineDTO units(Double units) {
    this.units = units;
    return this;
  }

  /**
   * Get units
   * @return units
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Double getUnits() {
    return units;
  }

  public void setUnits(Double units) {
    this.units = units;
  }

  public StockLineDTO uomId(Long uomId) {
    this.uomId = uomId;
    return this;
  }

  /**
   * Get uomId
   * @return uomId
  **/
  @ApiModelProperty(value = "")


  public Long getUomId() {
    return uomId;
  }

  public void setUomId(Long uomId) {
    this.uomId = uomId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockLineDTO stockLineDTO = (StockLineDTO) o;
    return Objects.equals(this.buyPrice, stockLineDTO.buyPrice) &&
        Objects.equals(this.grossProfit, stockLineDTO.grossProfit) &&
        Objects.equals(this.id, stockLineDTO.id) &&
        Objects.equals(this.infrastructureId, stockLineDTO.infrastructureId) &&
        Objects.equals(this.locationId, stockLineDTO.locationId) &&
        Objects.equals(this.margin, stockLineDTO.margin) &&
        Objects.equals(this.productId, stockLineDTO.productId) &&
        Objects.equals(this.reference, stockLineDTO.reference) &&
        Objects.equals(this.sellPriceExclusive, stockLineDTO.sellPriceExclusive) &&
        Objects.equals(this.sellPriceInclusive, stockLineDTO.sellPriceInclusive) &&
        Objects.equals(this.supplierRef, stockLineDTO.supplierRef) &&
        Objects.equals(this.units, stockLineDTO.units) &&
        Objects.equals(this.uomId, stockLineDTO.uomId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyPrice, grossProfit, id, infrastructureId, locationId, margin, productId, reference, sellPriceExclusive, sellPriceInclusive, supplierRef, units, uomId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockLineDTO {\n");
    
    sb.append("    buyPrice: ").append(toIndentedString(buyPrice)).append("\n");
    sb.append("    grossProfit: ").append(toIndentedString(grossProfit)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    infrastructureId: ").append(toIndentedString(infrastructureId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    sellPriceExclusive: ").append(toIndentedString(sellPriceExclusive)).append("\n");
    sb.append("    sellPriceInclusive: ").append(toIndentedString(sellPriceInclusive)).append("\n");
    sb.append("    supplierRef: ").append(toIndentedString(supplierRef)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    uomId: ").append(toIndentedString(uomId)).append("\n");
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

