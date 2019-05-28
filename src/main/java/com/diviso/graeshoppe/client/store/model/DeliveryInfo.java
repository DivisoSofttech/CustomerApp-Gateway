package com.diviso.graeshoppe.client.store.model;

import java.util.Objects;
import com.diviso.graeshoppe.client.store.model.Type;
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
 * DeliveryInfo
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-25T13:22:25.711+05:30[Asia/Kolkata]")

public class DeliveryInfo   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("startingTime")
  private OffsetDateTime startingTime = null;

  @JsonProperty("types")
  @Valid
  private List<Type> types = null;

  public DeliveryInfo id(Long id) {
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

  public DeliveryInfo startingTime(OffsetDateTime startingTime) {
    this.startingTime = startingTime;
    return this;
  }

  /**
   * Get startingTime
   * @return startingTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartingTime() {
    return startingTime;
  }

  public void setStartingTime(OffsetDateTime startingTime) {
    this.startingTime = startingTime;
  }

  public DeliveryInfo types(List<Type> types) {
    this.types = types;
    return this;
  }

  public DeliveryInfo addTypesItem(Type typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<Type>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Type> getTypes() {
    return types;
  }

  public void setTypes(List<Type> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryInfo deliveryInfo = (DeliveryInfo) o;
    return Objects.equals(this.id, deliveryInfo.id) &&
        Objects.equals(this.startingTime, deliveryInfo.startingTime) &&
        Objects.equals(this.types, deliveryInfo.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startingTime, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startingTime: ").append(toIndentedString(startingTime)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

