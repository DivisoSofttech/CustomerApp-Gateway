package com.diviso.graeshoppe.customerappgateway.client.offer.model;

import java.util.Objects;
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
 * OfferModel
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-12T11:55:04.651184+05:30[Asia/Kolkata]")

public class OfferModel   {
  @JsonProperty("deductionValue")
  private Long deductionValue = null;

  @JsonProperty("deduction_value_type_id")
  private Long deductionValueTypeId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("offerDays")
  @Valid
  private List<String> offerDays = null;

  @JsonProperty("prerequisiteOrderAmount")
  private Long prerequisiteOrderAmount = null;

  @JsonProperty("prerequisiteOrderNumber")
  private Long prerequisiteOrderNumber = null;

  @JsonProperty("promoCode")
  private String promoCode = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("storeId")
  private String storeId = null;

  public OfferModel deductionValue(Long deductionValue) {
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

  public OfferModel deductionValueTypeId(Long deductionValueTypeId) {
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

  public OfferModel description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OfferModel endDate(OffsetDateTime endDate) {
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

  public OfferModel id(Long id) {
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

  public OfferModel offerDays(List<String> offerDays) {
    this.offerDays = offerDays;
    return this;
  }

  public OfferModel addOfferDaysItem(String offerDaysItem) {
    if (this.offerDays == null) {
      this.offerDays = new ArrayList<String>();
    }
    this.offerDays.add(offerDaysItem);
    return this;
  }

  /**
   * Get offerDays
   * @return offerDays
  **/
  @ApiModelProperty(value = "")


  public List<String> getOfferDays() {
    return offerDays;
  }

  public void setOfferDays(List<String> offerDays) {
    this.offerDays = offerDays;
  }

  public OfferModel prerequisiteOrderAmount(Long prerequisiteOrderAmount) {
    this.prerequisiteOrderAmount = prerequisiteOrderAmount;
    return this;
  }

  /**
   * Get prerequisiteOrderAmount
   * @return prerequisiteOrderAmount
  **/
  @ApiModelProperty(value = "")


  public Long getPrerequisiteOrderAmount() {
    return prerequisiteOrderAmount;
  }

  public void setPrerequisiteOrderAmount(Long prerequisiteOrderAmount) {
    this.prerequisiteOrderAmount = prerequisiteOrderAmount;
  }

  public OfferModel prerequisiteOrderNumber(Long prerequisiteOrderNumber) {
    this.prerequisiteOrderNumber = prerequisiteOrderNumber;
    return this;
  }

  /**
   * Get prerequisiteOrderNumber
   * @return prerequisiteOrderNumber
  **/
  @ApiModelProperty(value = "")


  public Long getPrerequisiteOrderNumber() {
    return prerequisiteOrderNumber;
  }

  public void setPrerequisiteOrderNumber(Long prerequisiteOrderNumber) {
    this.prerequisiteOrderNumber = prerequisiteOrderNumber;
  }

  public OfferModel promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

  /**
   * Get promoCode
   * @return promoCode
  **/
  @ApiModelProperty(value = "")


  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public OfferModel startDate(OffsetDateTime startDate) {
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

  public OfferModel storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * Get storeId
   * @return storeId
  **/
  @ApiModelProperty(value = "")


  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferModel offerModel = (OfferModel) o;
    return Objects.equals(this.deductionValue, offerModel.deductionValue) &&
        Objects.equals(this.deductionValueTypeId, offerModel.deductionValueTypeId) &&
        Objects.equals(this.description, offerModel.description) &&
        Objects.equals(this.endDate, offerModel.endDate) &&
        Objects.equals(this.id, offerModel.id) &&
        Objects.equals(this.offerDays, offerModel.offerDays) &&
        Objects.equals(this.prerequisiteOrderAmount, offerModel.prerequisiteOrderAmount) &&
        Objects.equals(this.prerequisiteOrderNumber, offerModel.prerequisiteOrderNumber) &&
        Objects.equals(this.promoCode, offerModel.promoCode) &&
        Objects.equals(this.startDate, offerModel.startDate) &&
        Objects.equals(this.storeId, offerModel.storeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deductionValue, deductionValueTypeId, description, endDate, id, offerDays, prerequisiteOrderAmount, prerequisiteOrderNumber, promoCode, startDate, storeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferModel {\n");
    
    sb.append("    deductionValue: ").append(toIndentedString(deductionValue)).append("\n");
    sb.append("    deductionValueTypeId: ").append(toIndentedString(deductionValueTypeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offerDays: ").append(toIndentedString(offerDays)).append("\n");
    sb.append("    prerequisiteOrderAmount: ").append(toIndentedString(prerequisiteOrderAmount)).append("\n");
    sb.append("    prerequisiteOrderNumber: ").append(toIndentedString(prerequisiteOrderNumber)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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

