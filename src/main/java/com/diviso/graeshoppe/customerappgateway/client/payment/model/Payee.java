package com.diviso.graeshoppe.customerappgateway.client.payment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payee
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-12T12:18:51.390+05:30[Asia/Calcutta]")

public class Payee   {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("merchant_id")
  private String merchantId = null;

  public Payee email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Payee merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * Get merchantId
   * @return merchantId
  **/
  @ApiModelProperty(value = "")


  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payee payee = (Payee) o;
    return Objects.equals(this.email, payee.email) &&
        Objects.equals(this.merchantId, payee.merchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, merchantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payee {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
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

