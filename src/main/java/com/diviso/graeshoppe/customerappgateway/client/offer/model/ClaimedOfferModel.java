package com.diviso.graeshoppe.customerappgateway.client.offer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClaimedOfferModel
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-12T11:55:04.651184+05:30[Asia/Kolkata]")

public class ClaimedOfferModel   {
  @JsonProperty("deductionValue")
  private Long deductionValue = null;

  @JsonProperty("deduction_value_type_id")
  private Long deductionValueTypeId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("offerDiscountAmount")
  private Double offerDiscountAmount = null;

  @JsonProperty("offerProvider")
  private String offerProvider = null;

  @JsonProperty("promoCode")
  private String promoCode = null;

  public ClaimedOfferModel deductionValue(Long deductionValue) {
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

  public ClaimedOfferModel deductionValueTypeId(Long deductionValueTypeId) {
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

  public ClaimedOfferModel description(String description) {
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

  public ClaimedOfferModel offerDiscountAmount(Double offerDiscountAmount) {
    this.offerDiscountAmount = offerDiscountAmount;
    return this;
  }

  /**
   * Get offerDiscountAmount
   * @return offerDiscountAmount
  **/
  @ApiModelProperty(value = "")


  public Double getOfferDiscountAmount() {
    return offerDiscountAmount;
  }

  public void setOfferDiscountAmount(Double offerDiscountAmount) {
    this.offerDiscountAmount = offerDiscountAmount;
  }

  public ClaimedOfferModel offerProvider(String offerProvider) {
    this.offerProvider = offerProvider;
    return this;
  }

  /**
   * Get offerProvider
   * @return offerProvider
  **/
  @ApiModelProperty(value = "")


  public String getOfferProvider() {
    return offerProvider;
  }

  public void setOfferProvider(String offerProvider) {
    this.offerProvider = offerProvider;
  }

  public ClaimedOfferModel promoCode(String promoCode) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaimedOfferModel claimedOfferModel = (ClaimedOfferModel) o;
    return Objects.equals(this.deductionValue, claimedOfferModel.deductionValue) &&
        Objects.equals(this.deductionValueTypeId, claimedOfferModel.deductionValueTypeId) &&
        Objects.equals(this.description, claimedOfferModel.description) &&
        Objects.equals(this.offerDiscountAmount, claimedOfferModel.offerDiscountAmount) &&
        Objects.equals(this.offerProvider, claimedOfferModel.offerProvider) &&
        Objects.equals(this.promoCode, claimedOfferModel.promoCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deductionValue, deductionValueTypeId, description, offerDiscountAmount, offerProvider, promoCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClaimedOfferModel {\n");
    
    sb.append("    deductionValue: ").append(toIndentedString(deductionValue)).append("\n");
    sb.append("    deductionValueTypeId: ").append(toIndentedString(deductionValueTypeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    offerDiscountAmount: ").append(toIndentedString(offerDiscountAmount)).append("\n");
    sb.append("    offerProvider: ").append(toIndentedString(offerProvider)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
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

