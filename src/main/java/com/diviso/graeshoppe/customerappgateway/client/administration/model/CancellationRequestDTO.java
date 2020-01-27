package com.diviso.graeshoppe.customerappgateway.client.administration.model;

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
 * CancellationRequestDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-27T14:13:06.209+05:30[Asia/Kolkata]")

public class CancellationRequestDTO   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("customerEmail")
  private String customerEmail = null;

  @JsonProperty("customerPhone")
  private Long customerPhone = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("paymentId")
  private String paymentId = null;

  @JsonProperty("phoneCode")
  private Integer phoneCode = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("refundDetailsId")
  private Long refundDetailsId = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("storeEmail")
  private String storeEmail = null;

  @JsonProperty("storePhone")
  private Long storePhone = null;

  public CancellationRequestDTO amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public CancellationRequestDTO customerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
    return this;
  }

  /**
   * Get customerEmail
   * @return customerEmail
  **/
  @ApiModelProperty(value = "")


  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public CancellationRequestDTO customerPhone(Long customerPhone) {
    this.customerPhone = customerPhone;
    return this;
  }

  /**
   * Get customerPhone
   * @return customerPhone
  **/
  @ApiModelProperty(value = "")


  public Long getCustomerPhone() {
    return customerPhone;
  }

  public void setCustomerPhone(Long customerPhone) {
    this.customerPhone = customerPhone;
  }

  public CancellationRequestDTO date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public CancellationRequestDTO id(Long id) {
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

  public CancellationRequestDTO orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public CancellationRequestDTO paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Get paymentId
   * @return paymentId
  **/
  @ApiModelProperty(value = "")


  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public CancellationRequestDTO phoneCode(Integer phoneCode) {
    this.phoneCode = phoneCode;
    return this;
  }

  /**
   * Get phoneCode
   * @return phoneCode
  **/
  @ApiModelProperty(value = "")


  public Integer getPhoneCode() {
    return phoneCode;
  }

  public void setPhoneCode(Integer phoneCode) {
    this.phoneCode = phoneCode;
  }

  public CancellationRequestDTO reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(value = "")


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public CancellationRequestDTO refundDetailsId(Long refundDetailsId) {
    this.refundDetailsId = refundDetailsId;
    return this;
  }

  /**
   * Get refundDetailsId
   * @return refundDetailsId
  **/
  @ApiModelProperty(value = "")


  public Long getRefundDetailsId() {
    return refundDetailsId;
  }

  public void setRefundDetailsId(Long refundDetailsId) {
    this.refundDetailsId = refundDetailsId;
  }

  public CancellationRequestDTO status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CancellationRequestDTO storeEmail(String storeEmail) {
    this.storeEmail = storeEmail;
    return this;
  }

  /**
   * Get storeEmail
   * @return storeEmail
  **/
  @ApiModelProperty(value = "")


  public String getStoreEmail() {
    return storeEmail;
  }

  public void setStoreEmail(String storeEmail) {
    this.storeEmail = storeEmail;
  }

  public CancellationRequestDTO storePhone(Long storePhone) {
    this.storePhone = storePhone;
    return this;
  }

  /**
   * Get storePhone
   * @return storePhone
  **/
  @ApiModelProperty(value = "")


  public Long getStorePhone() {
    return storePhone;
  }

  public void setStorePhone(Long storePhone) {
    this.storePhone = storePhone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancellationRequestDTO cancellationRequestDTO = (CancellationRequestDTO) o;
    return Objects.equals(this.amount, cancellationRequestDTO.amount) &&
        Objects.equals(this.customerEmail, cancellationRequestDTO.customerEmail) &&
        Objects.equals(this.customerPhone, cancellationRequestDTO.customerPhone) &&
        Objects.equals(this.date, cancellationRequestDTO.date) &&
        Objects.equals(this.id, cancellationRequestDTO.id) &&
        Objects.equals(this.orderId, cancellationRequestDTO.orderId) &&
        Objects.equals(this.paymentId, cancellationRequestDTO.paymentId) &&
        Objects.equals(this.phoneCode, cancellationRequestDTO.phoneCode) &&
        Objects.equals(this.reference, cancellationRequestDTO.reference) &&
        Objects.equals(this.refundDetailsId, cancellationRequestDTO.refundDetailsId) &&
        Objects.equals(this.status, cancellationRequestDTO.status) &&
        Objects.equals(this.storeEmail, cancellationRequestDTO.storeEmail) &&
        Objects.equals(this.storePhone, cancellationRequestDTO.storePhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, customerEmail, customerPhone, date, id, orderId, paymentId, phoneCode, reference, refundDetailsId, status, storeEmail, storePhone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancellationRequestDTO {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
    sb.append("    customerPhone: ").append(toIndentedString(customerPhone)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    phoneCode: ").append(toIndentedString(phoneCode)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    refundDetailsId: ").append(toIndentedString(refundDetailsId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    storeEmail: ").append(toIndentedString(storeEmail)).append("\n");
    sb.append("    storePhone: ").append(toIndentedString(storePhone)).append("\n");
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

