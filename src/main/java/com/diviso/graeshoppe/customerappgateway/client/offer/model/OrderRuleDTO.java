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
 * OrderRuleDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-12T11:55:04.651184+05:30[Asia/Kolkata]")

public class OrderRuleDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("prerequisiteOrderNumber")
  private Long prerequisiteOrderNumber = null;

  public OrderRuleDTO id(Long id) {
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

  public OrderRuleDTO prerequisiteOrderNumber(Long prerequisiteOrderNumber) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderRuleDTO orderRuleDTO = (OrderRuleDTO) o;
    return Objects.equals(this.id, orderRuleDTO.id) &&
        Objects.equals(this.prerequisiteOrderNumber, orderRuleDTO.prerequisiteOrderNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, prerequisiteOrderNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRuleDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    prerequisiteOrderNumber: ").append(toIndentedString(prerequisiteOrderNumber)).append("\n");
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

