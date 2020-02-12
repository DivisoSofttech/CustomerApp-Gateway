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
 * CustomerSelectionDTO
 */
@Validated

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-12T12:18:57.994+05:30[Asia/Calcutta]")

public class CustomerSelectionDTO   {
  @JsonProperty("customerSelectionType")
  private String customerSelectionType = null;

  @JsonProperty("id")
  private Long id = null;

  public CustomerSelectionDTO customerSelectionType(String customerSelectionType) {
    this.customerSelectionType = customerSelectionType;
    return this;
  }

  /**
   * Get customerSelectionType
   * @return customerSelectionType
  **/
  @ApiModelProperty(value = "")


  public String getCustomerSelectionType() {
    return customerSelectionType;
  }

  public void setCustomerSelectionType(String customerSelectionType) {
    this.customerSelectionType = customerSelectionType;
  }

  public CustomerSelectionDTO id(Long id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerSelectionDTO customerSelectionDTO = (CustomerSelectionDTO) o;
    return Objects.equals(this.customerSelectionType, customerSelectionDTO.customerSelectionType) &&
        Objects.equals(this.id, customerSelectionDTO.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerSelectionType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerSelectionDTO {\n");
    
    sb.append("    customerSelectionType: ").append(toIndentedString(customerSelectionType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

