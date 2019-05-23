package com.diviso.graeshoppe.client.order.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-22T15:41:54.172+05:30[Asia/Kolkata]")

public class PaymentDTO   {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("paymentType")
  private String paymentType = null;

  @JsonProperty("ref")
  private String ref = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("tax")
  private Double tax = null;

  @JsonProperty("total")
  private Double total = null;

  public PaymentDTO amount(Double amount) {
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

  public PaymentDTO id(Long id) {
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

  public PaymentDTO paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
  **/
  @ApiModelProperty(value = "")


  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public PaymentDTO ref(String ref) {
    this.ref = ref;
    return this;
  }

  /**
   * Get ref
   * @return ref
  **/
  @ApiModelProperty(value = "")


  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public PaymentDTO status(String status) {
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

  public PaymentDTO tax(Double tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")


  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public PaymentDTO total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")


  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDTO paymentDTO = (PaymentDTO) o;
    return Objects.equals(this.amount, paymentDTO.amount) &&
        Objects.equals(this.id, paymentDTO.id) &&
        Objects.equals(this.paymentType, paymentDTO.paymentType) &&
        Objects.equals(this.ref, paymentDTO.ref) &&
        Objects.equals(this.status, paymentDTO.status) &&
        Objects.equals(this.tax, paymentDTO.tax) &&
        Objects.equals(this.total, paymentDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, id, paymentType, ref, status, tax, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDTO {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

