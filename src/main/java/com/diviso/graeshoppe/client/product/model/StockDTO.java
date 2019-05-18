package com.diviso.graeshoppe.client.product.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * StockDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-17T14:38:38.757+05:30[Asia/Kolkata]")

public class StockDTO   {
  @JsonProperty("dateOfStockUpdated")
  private LocalDate dateOfStockUpdated = null;

  @JsonProperty("deliveryNoteRef")
  private Long deliveryNoteRef = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("statusId")
  private Long statusId = null;

  @JsonProperty("stockLines")
  @Valid
  private List<StockLineDTO> stockLines = null;

  @JsonProperty("storageCost")
  private Double storageCost = null;

  public StockDTO dateOfStockUpdated(LocalDate dateOfStockUpdated) {
    this.dateOfStockUpdated = dateOfStockUpdated;
    return this;
  }

  /**
   * Get dateOfStockUpdated
   * @return dateOfStockUpdated
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateOfStockUpdated() {
    return dateOfStockUpdated;
  }

  public void setDateOfStockUpdated(LocalDate dateOfStockUpdated) {
    this.dateOfStockUpdated = dateOfStockUpdated;
  }

  public StockDTO deliveryNoteRef(Long deliveryNoteRef) {
    this.deliveryNoteRef = deliveryNoteRef;
    return this;
  }

  /**
   * Get deliveryNoteRef
   * @return deliveryNoteRef
  **/
  @ApiModelProperty(value = "")


  public Long getDeliveryNoteRef() {
    return deliveryNoteRef;
  }

  public void setDeliveryNoteRef(Long deliveryNoteRef) {
    this.deliveryNoteRef = deliveryNoteRef;
  }

  public StockDTO id(Long id) {
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

  public StockDTO reference(String reference) {
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

  public StockDTO statusId(Long statusId) {
    this.statusId = statusId;
    return this;
  }

  /**
   * Get statusId
   * @return statusId
  **/
  @ApiModelProperty(value = "")


  public Long getStatusId() {
    return statusId;
  }

  public void setStatusId(Long statusId) {
    this.statusId = statusId;
  }

  public StockDTO stockLines(List<StockLineDTO> stockLines) {
    this.stockLines = stockLines;
    return this;
  }

  public StockDTO addStockLinesItem(StockLineDTO stockLinesItem) {
    if (this.stockLines == null) {
      this.stockLines = new ArrayList<StockLineDTO>();
    }
    this.stockLines.add(stockLinesItem);
    return this;
  }

  /**
   * Get stockLines
   * @return stockLines
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<StockLineDTO> getStockLines() {
    return stockLines;
  }

  public void setStockLines(List<StockLineDTO> stockLines) {
    this.stockLines = stockLines;
  }

  public StockDTO storageCost(Double storageCost) {
    this.storageCost = storageCost;
    return this;
  }

  /**
   * Get storageCost
   * @return storageCost
  **/
  @ApiModelProperty(value = "")


  public Double getStorageCost() {
    return storageCost;
  }

  public void setStorageCost(Double storageCost) {
    this.storageCost = storageCost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockDTO stockDTO = (StockDTO) o;
    return Objects.equals(this.dateOfStockUpdated, stockDTO.dateOfStockUpdated) &&
        Objects.equals(this.deliveryNoteRef, stockDTO.deliveryNoteRef) &&
        Objects.equals(this.id, stockDTO.id) &&
        Objects.equals(this.reference, stockDTO.reference) &&
        Objects.equals(this.statusId, stockDTO.statusId) &&
        Objects.equals(this.stockLines, stockDTO.stockLines) &&
        Objects.equals(this.storageCost, stockDTO.storageCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfStockUpdated, deliveryNoteRef, id, reference, statusId, stockLines, storageCost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockDTO {\n");
    
    sb.append("    dateOfStockUpdated: ").append(toIndentedString(dateOfStockUpdated)).append("\n");
    sb.append("    deliveryNoteRef: ").append(toIndentedString(deliveryNoteRef)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    stockLines: ").append(toIndentedString(stockLines)).append("\n");
    sb.append("    storageCost: ").append(toIndentedString(storageCost)).append("\n");
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

