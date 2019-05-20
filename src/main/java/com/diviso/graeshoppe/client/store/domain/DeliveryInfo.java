package com.diviso.graeshoppe.client.store.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.Instant;
import java.time.OffsetDateTime;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeliveryInfo
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-20T12:06:06.200+05:30[Asia/Calcutta]")
@Document(indexName = "deliveryinfo")
public class DeliveryInfo  {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("startingTime")
  private Instant startingTime = null;

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

  public DeliveryInfo startingTime(Instant startingTime) {
    this.startingTime = startingTime;
    return this;
  }

  /**
   * Get startingTime
   * @return startingTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Instant getStartingTime() {
    return startingTime;
  }

  public void setStartingTime(Instant startingTime) {
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
    DeliveryInfo deliveryInfo = (DeliveryInfo) o;
    return Objects.equals(this.id, deliveryInfo.id) &&
        Objects.equals(this.startingTime, deliveryInfo.startingTime);
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

