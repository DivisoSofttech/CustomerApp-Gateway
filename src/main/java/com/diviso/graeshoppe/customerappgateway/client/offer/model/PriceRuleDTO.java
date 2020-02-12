package com.diviso.graeshoppe.customerappgateway.client.offer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PriceRuleDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-12T12:18:57.994+05:30[Asia/Calcutta]")

public class PriceRuleDTO   {
  @JsonProperty("allocationLimit")
  private Long allocationLimit = null;

  @JsonProperty("allocationMethodId")
  private Long allocationMethodId = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("customerSelectionId")
  private Long customerSelectionId = null;

  @JsonProperty("deductionValue")
  private Long deductionValue = null;

  @JsonProperty("deductionValueTypeId")
  private Long deductionValueTypeId = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("oncePerCustomer")
  private Boolean oncePerCustomer = null;

  @JsonProperty("prerequisiteQuantityRange")
  private Double prerequisiteQuantityRange = null;

  @JsonProperty("prerequisiteShippingPriceRange")
  private Double prerequisiteShippingPriceRange = null;

  @JsonProperty("prerequisiteSubtotalRange")
  private Double prerequisiteSubtotalRange = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("targetTypeId")
  private Long targetTypeId = null;

  @JsonProperty("updatedDate")
  private OffsetDateTime updatedDate = null;

  @JsonProperty("usageLimit")
  private Long usageLimit = null;

  public PriceRuleDTO allocationLimit(Long allocationLimit) {
    this.allocationLimit = allocationLimit;
    return this;
  }

  /**
   * Get allocationLimit
   * @return allocationLimit
  **/
  @ApiModelProperty(value = "")


  public Long getAllocationLimit() {
    return allocationLimit;
  }

  public void setAllocationLimit(Long allocationLimit) {
    this.allocationLimit = allocationLimit;
  }

  public PriceRuleDTO allocationMethodId(Long allocationMethodId) {
    this.allocationMethodId = allocationMethodId;
    return this;
  }

  /**
   * Get allocationMethodId
   * @return allocationMethodId
  **/
  @ApiModelProperty(value = "")


  public Long getAllocationMethodId() {
    return allocationMethodId;
  }

  public void setAllocationMethodId(Long allocationMethodId) {
    this.allocationMethodId = allocationMethodId;
  }

  public PriceRuleDTO createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public PriceRuleDTO customerSelectionId(Long customerSelectionId) {
    this.customerSelectionId = customerSelectionId;
    return this;
  }

  /**
   * Get customerSelectionId
   * @return customerSelectionId
  **/
  @ApiModelProperty(value = "")


  public Long getCustomerSelectionId() {
    return customerSelectionId;
  }

  public void setCustomerSelectionId(Long customerSelectionId) {
    this.customerSelectionId = customerSelectionId;
  }

  public PriceRuleDTO deductionValue(Long deductionValue) {
    this.deductionValue = deductionValue;
    return this;
  }

  /**
   * Get deductionValue
   * @return deductionValue
  **/
  @ApiModelProperty(value = "")


  public Long getDeductionValue() {
    return deductionValue;
  }

  public void setDeductionValue(Long deductionValue) {
    this.deductionValue = deductionValue;
  }

  public PriceRuleDTO deductionValueTypeId(Long deductionValueTypeId) {
    this.deductionValueTypeId = deductionValueTypeId;
    return this;
  }

  /**
   * Get deductionValueTypeId
   * @return deductionValueTypeId
  **/
  @ApiModelProperty(value = "")


  public Long getDeductionValueTypeId() {
    return deductionValueTypeId;
  }

  public void setDeductionValueTypeId(Long deductionValueTypeId) {
    this.deductionValueTypeId = deductionValueTypeId;
  }

  public PriceRuleDTO endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public PriceRuleDTO id(Long id) {
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

  public PriceRuleDTO oncePerCustomer(Boolean oncePerCustomer) {
    this.oncePerCustomer = oncePerCustomer;
    return this;
  }

  /**
   * Get oncePerCustomer
   * @return oncePerCustomer
  **/
  @ApiModelProperty(value = "")


  public Boolean isOncePerCustomer() {
    return oncePerCustomer;
  }

  public void setOncePerCustomer(Boolean oncePerCustomer) {
    this.oncePerCustomer = oncePerCustomer;
  }

  public PriceRuleDTO prerequisiteQuantityRange(Double prerequisiteQuantityRange) {
    this.prerequisiteQuantityRange = prerequisiteQuantityRange;
    return this;
  }

  /**
   * Get prerequisiteQuantityRange
   * @return prerequisiteQuantityRange
  **/
  @ApiModelProperty(value = "")


  public Double getPrerequisiteQuantityRange() {
    return prerequisiteQuantityRange;
  }

  public void setPrerequisiteQuantityRange(Double prerequisiteQuantityRange) {
    this.prerequisiteQuantityRange = prerequisiteQuantityRange;
  }

  public PriceRuleDTO prerequisiteShippingPriceRange(Double prerequisiteShippingPriceRange) {
    this.prerequisiteShippingPriceRange = prerequisiteShippingPriceRange;
    return this;
  }

  /**
   * Get prerequisiteShippingPriceRange
   * @return prerequisiteShippingPriceRange
  **/
  @ApiModelProperty(value = "")


  public Double getPrerequisiteShippingPriceRange() {
    return prerequisiteShippingPriceRange;
  }

  public void setPrerequisiteShippingPriceRange(Double prerequisiteShippingPriceRange) {
    this.prerequisiteShippingPriceRange = prerequisiteShippingPriceRange;
  }

  public PriceRuleDTO prerequisiteSubtotalRange(Double prerequisiteSubtotalRange) {
    this.prerequisiteSubtotalRange = prerequisiteSubtotalRange;
    return this;
  }

  /**
   * Get prerequisiteSubtotalRange
   * @return prerequisiteSubtotalRange
  **/
  @ApiModelProperty(value = "")


  public Double getPrerequisiteSubtotalRange() {
    return prerequisiteSubtotalRange;
  }

  public void setPrerequisiteSubtotalRange(Double prerequisiteSubtotalRange) {
    this.prerequisiteSubtotalRange = prerequisiteSubtotalRange;
  }

  public PriceRuleDTO startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public PriceRuleDTO targetTypeId(Long targetTypeId) {
    this.targetTypeId = targetTypeId;
    return this;
  }

  /**
   * Get targetTypeId
   * @return targetTypeId
  **/
  @ApiModelProperty(value = "")


  public Long getTargetTypeId() {
    return targetTypeId;
  }

  public void setTargetTypeId(Long targetTypeId) {
    this.targetTypeId = targetTypeId;
  }

  public PriceRuleDTO updatedDate(OffsetDateTime updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate
   * @return updatedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(OffsetDateTime updatedDate) {
    this.updatedDate = updatedDate;
  }

  public PriceRuleDTO usageLimit(Long usageLimit) {
    this.usageLimit = usageLimit;
    return this;
  }

  /**
   * Get usageLimit
   * @return usageLimit
  **/
  @ApiModelProperty(value = "")


  public Long getUsageLimit() {
    return usageLimit;
  }

  public void setUsageLimit(Long usageLimit) {
    this.usageLimit = usageLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceRuleDTO priceRuleDTO = (PriceRuleDTO) o;
    return Objects.equals(this.allocationLimit, priceRuleDTO.allocationLimit) &&
        Objects.equals(this.allocationMethodId, priceRuleDTO.allocationMethodId) &&
        Objects.equals(this.createdDate, priceRuleDTO.createdDate) &&
        Objects.equals(this.customerSelectionId, priceRuleDTO.customerSelectionId) &&
        Objects.equals(this.deductionValue, priceRuleDTO.deductionValue) &&
        Objects.equals(this.deductionValueTypeId, priceRuleDTO.deductionValueTypeId) &&
        Objects.equals(this.endDate, priceRuleDTO.endDate) &&
        Objects.equals(this.id, priceRuleDTO.id) &&
        Objects.equals(this.oncePerCustomer, priceRuleDTO.oncePerCustomer) &&
        Objects.equals(this.prerequisiteQuantityRange, priceRuleDTO.prerequisiteQuantityRange) &&
        Objects.equals(this.prerequisiteShippingPriceRange, priceRuleDTO.prerequisiteShippingPriceRange) &&
        Objects.equals(this.prerequisiteSubtotalRange, priceRuleDTO.prerequisiteSubtotalRange) &&
        Objects.equals(this.startDate, priceRuleDTO.startDate) &&
        Objects.equals(this.targetTypeId, priceRuleDTO.targetTypeId) &&
        Objects.equals(this.updatedDate, priceRuleDTO.updatedDate) &&
        Objects.equals(this.usageLimit, priceRuleDTO.usageLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationLimit, allocationMethodId, createdDate, customerSelectionId, deductionValue, deductionValueTypeId, endDate, id, oncePerCustomer, prerequisiteQuantityRange, prerequisiteShippingPriceRange, prerequisiteSubtotalRange, startDate, targetTypeId, updatedDate, usageLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceRuleDTO {\n");
    
    sb.append("    allocationLimit: ").append(toIndentedString(allocationLimit)).append("\n");
    sb.append("    allocationMethodId: ").append(toIndentedString(allocationMethodId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    customerSelectionId: ").append(toIndentedString(customerSelectionId)).append("\n");
    sb.append("    deductionValue: ").append(toIndentedString(deductionValue)).append("\n");
    sb.append("    deductionValueTypeId: ").append(toIndentedString(deductionValueTypeId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    oncePerCustomer: ").append(toIndentedString(oncePerCustomer)).append("\n");
    sb.append("    prerequisiteQuantityRange: ").append(toIndentedString(prerequisiteQuantityRange)).append("\n");
    sb.append("    prerequisiteShippingPriceRange: ").append(toIndentedString(prerequisiteShippingPriceRange)).append("\n");
    sb.append("    prerequisiteSubtotalRange: ").append(toIndentedString(prerequisiteSubtotalRange)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    targetTypeId: ").append(toIndentedString(targetTypeId)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    usageLimit: ").append(toIndentedString(usageLimit)).append("\n");
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

