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
 * PaymentRuleDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-12T11:55:04.651184+05:30[Asia/Kolkata]")

public class PaymentRuleDTO   {
  @JsonProperty("authorizedProvider")
  private String authorizedProvider = null;

  @JsonProperty("cashBackType")
  private Long cashBackType = null;

  @JsonProperty("cashBackValue")
  private Long cashBackValue = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("numberOfTransactionLimit")
  private Long numberOfTransactionLimit = null;

  @JsonProperty("paymentMode")
  private String paymentMode = null;

  public PaymentRuleDTO authorizedProvider(String authorizedProvider) {
    this.authorizedProvider = authorizedProvider;
    return this;
  }

  /**
   * Get authorizedProvider
   * @return authorizedProvider
  **/
  @ApiModelProperty(value = "")


  public String getAuthorizedProvider() {
    return authorizedProvider;
  }

  public void setAuthorizedProvider(String authorizedProvider) {
    this.authorizedProvider = authorizedProvider;
  }

  public PaymentRuleDTO cashBackType(Long cashBackType) {
    this.cashBackType = cashBackType;
    return this;
  }

  /**
   * Get cashBackType
   * @return cashBackType
  **/
  @ApiModelProperty(value = "")


  public Long getCashBackType() {
    return cashBackType;
  }

  public void setCashBackType(Long cashBackType) {
    this.cashBackType = cashBackType;
  }

  public PaymentRuleDTO cashBackValue(Long cashBackValue) {
    this.cashBackValue = cashBackValue;
    return this;
  }

  /**
   * Get cashBackValue
   * @return cashBackValue
  **/
  @ApiModelProperty(value = "")


  public Long getCashBackValue() {
    return cashBackValue;
  }

  public void setCashBackValue(Long cashBackValue) {
    this.cashBackValue = cashBackValue;
  }

  public PaymentRuleDTO id(Long id) {
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

  public PaymentRuleDTO numberOfTransactionLimit(Long numberOfTransactionLimit) {
    this.numberOfTransactionLimit = numberOfTransactionLimit;
    return this;
  }

  /**
   * Get numberOfTransactionLimit
   * @return numberOfTransactionLimit
  **/
  @ApiModelProperty(value = "")


  public Long getNumberOfTransactionLimit() {
    return numberOfTransactionLimit;
  }

  public void setNumberOfTransactionLimit(Long numberOfTransactionLimit) {
    this.numberOfTransactionLimit = numberOfTransactionLimit;
  }

  public PaymentRuleDTO paymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
    return this;
  }

  /**
   * Get paymentMode
   * @return paymentMode
  **/
  @ApiModelProperty(value = "")


  public String getPaymentMode() {
    return paymentMode;
  }

  public void setPaymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRuleDTO paymentRuleDTO = (PaymentRuleDTO) o;
    return Objects.equals(this.authorizedProvider, paymentRuleDTO.authorizedProvider) &&
        Objects.equals(this.cashBackType, paymentRuleDTO.cashBackType) &&
        Objects.equals(this.cashBackValue, paymentRuleDTO.cashBackValue) &&
        Objects.equals(this.id, paymentRuleDTO.id) &&
        Objects.equals(this.numberOfTransactionLimit, paymentRuleDTO.numberOfTransactionLimit) &&
        Objects.equals(this.paymentMode, paymentRuleDTO.paymentMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizedProvider, cashBackType, cashBackValue, id, numberOfTransactionLimit, paymentMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRuleDTO {\n");
    
    sb.append("    authorizedProvider: ").append(toIndentedString(authorizedProvider)).append("\n");
    sb.append("    cashBackType: ").append(toIndentedString(cashBackType)).append("\n");
    sb.append("    cashBackValue: ").append(toIndentedString(cashBackValue)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numberOfTransactionLimit: ").append(toIndentedString(numberOfTransactionLimit)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
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

