package com.diviso.graeshoppe.client.product.model;

import java.util.Objects;
import com.diviso.graeshoppe.client.product.model.Product;
import com.diviso.graeshoppe.client.product.model.Uom;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StockLine
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-18T09:29:25.285+05:30[Asia/Kolkata]")

public class StockLine   {
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

  @JsonProperty("product")
  private Product product = null;

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

  @JsonProperty("uom")
  private Uom uom = null;

  public StockLine buyPrice(Double buyPrice) {
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

  public StockLine grossProfit(Double grossProfit) {
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

  public StockLine id(Long id) {
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

  public StockLine infrastructureId(Long infrastructureId) {
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

  public StockLine locationId(String locationId) {
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

  public StockLine margin(Double margin) {
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

  public StockLine product(Product product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public StockLine reference(String reference) {
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

  public StockLine sellPriceExclusive(Double sellPriceExclusive) {
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

  public StockLine sellPriceInclusive(Double sellPriceInclusive) {
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

  public StockLine supplierRef(Long supplierRef) {
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

  public StockLine units(Double units) {
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

  public StockLine uom(Uom uom) {
    this.uom = uom;
    return this;
  }

  /**
   * Get uom
   * @return uom
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Uom getUom() {
    return uom;
  }

  public void setUom(Uom uom) {
    this.uom = uom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockLine stockLine = (StockLine) o;
    return Objects.equals(this.buyPrice, stockLine.buyPrice) &&
        Objects.equals(this.grossProfit, stockLine.grossProfit) &&
        Objects.equals(this.id, stockLine.id) &&
        Objects.equals(this.infrastructureId, stockLine.infrastructureId) &&
        Objects.equals(this.locationId, stockLine.locationId) &&
        Objects.equals(this.margin, stockLine.margin) &&
        Objects.equals(this.product, stockLine.product) &&
        Objects.equals(this.reference, stockLine.reference) &&
        Objects.equals(this.sellPriceExclusive, stockLine.sellPriceExclusive) &&
        Objects.equals(this.sellPriceInclusive, stockLine.sellPriceInclusive) &&
        Objects.equals(this.supplierRef, stockLine.supplierRef) &&
        Objects.equals(this.units, stockLine.units) &&
        Objects.equals(this.uom, stockLine.uom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyPrice, grossProfit, id, infrastructureId, locationId, margin, product, reference, sellPriceExclusive, sellPriceInclusive, supplierRef, units, uom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockLine {\n");
    
    sb.append("    buyPrice: ").append(toIndentedString(buyPrice)).append("\n");
    sb.append("    grossProfit: ").append(toIndentedString(grossProfit)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    infrastructureId: ").append(toIndentedString(infrastructureId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    sellPriceExclusive: ").append(toIndentedString(sellPriceExclusive)).append("\n");
    sb.append("    sellPriceInclusive: ").append(toIndentedString(sellPriceInclusive)).append("\n");
    sb.append("    supplierRef: ").append(toIndentedString(supplierRef)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    uom: ").append(toIndentedString(uom)).append("\n");
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

