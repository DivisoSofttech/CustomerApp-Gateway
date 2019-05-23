package com.diviso.graeshoppe.client.store.model;

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
 * DeliveryInfoDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-23T15:17:15.734+05:30[Asia/Kolkata]")

public class DeliveryInfoDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("startingTime")
  private OffsetDateTime startingTime = null;

  public DeliveryInfoDTO id(Long id) {
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

  public DeliveryInfoDTO startingTime(OffsetDateTime startingTime) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryInfoDTO deliveryInfoDTO = (DeliveryInfoDTO) o;
    return Objects.equals(this.id, deliveryInfoDTO.id) &&
        Objects.equals(this.startingTime, deliveryInfoDTO.startingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryInfoDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startingTime: ").append(toIndentedString(startingTime)).append("\n");
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

