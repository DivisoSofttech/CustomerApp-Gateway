package com.diviso.graeshoppe.customerappgateway.client.administration.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RefundDetailsDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-27T14:13:06.209+05:30[Asia/Kolkata]")

public class RefundDetailsDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("refundId")
  private String refundId = null;

  @JsonProperty("status")
  private String status = null;

  public RefundDetailsDTO id(Long id) {
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

  public RefundDetailsDTO refundId(String refundId) {
    this.refundId = refundId;
    return this;
  }

  /**
   * Get refundId
   * @return refundId
  **/
  @ApiModelProperty(value = "")


  public String getRefundId() {
    return refundId;
  }

  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }

  public RefundDetailsDTO status(String status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundDetailsDTO refundDetailsDTO = (RefundDetailsDTO) o;
    return Objects.equals(this.id, refundDetailsDTO.id) &&
        Objects.equals(this.refundId, refundDetailsDTO.refundId) &&
        Objects.equals(this.status, refundDetailsDTO.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, refundId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundDetailsDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

