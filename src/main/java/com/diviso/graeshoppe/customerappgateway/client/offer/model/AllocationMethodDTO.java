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
 * AllocationMethodDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-12T12:18:57.994+05:30[Asia/Calcutta]")

public class AllocationMethodDTO   {
  @JsonProperty("allocationMethod")
  private String allocationMethod = null;

  @JsonProperty("id")
  private Long id = null;

  public AllocationMethodDTO allocationMethod(String allocationMethod) {
    this.allocationMethod = allocationMethod;
    return this;
  }

  /**
   * Get allocationMethod
   * @return allocationMethod
  **/
  @ApiModelProperty(value = "")


  public String getAllocationMethod() {
    return allocationMethod;
  }

  public void setAllocationMethod(String allocationMethod) {
    this.allocationMethod = allocationMethod;
  }

  public AllocationMethodDTO id(Long id) {
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
    AllocationMethodDTO allocationMethodDTO = (AllocationMethodDTO) o;
    return Objects.equals(this.allocationMethod, allocationMethodDTO.allocationMethod) &&
        Objects.equals(this.id, allocationMethodDTO.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocationMethod, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocationMethodDTO {\n");
    
    sb.append("    allocationMethod: ").append(toIndentedString(allocationMethod)).append("\n");
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

