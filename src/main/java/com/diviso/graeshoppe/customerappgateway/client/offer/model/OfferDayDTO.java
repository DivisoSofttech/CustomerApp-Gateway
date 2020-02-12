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
 * OfferDayDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-12T12:18:57.994+05:30[Asia/Calcutta]")

public class OfferDayDTO   {
  @JsonProperty("day")
  private String day = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("offerId")
  private Long offerId = null;

  public OfferDayDTO day(String day) {
    this.day = day;
    return this;
  }

  /**
   * Get day
   * @return day
  **/
  @ApiModelProperty(value = "")


  public String getDay() {
    return day;
  }

  public void setDay(String day) {
    this.day = day;
  }

  public OfferDayDTO id(Long id) {
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

  public OfferDayDTO offerId(Long offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Get offerId
   * @return offerId
  **/
  @ApiModelProperty(value = "")


  public Long getOfferId() {
    return offerId;
  }

  public void setOfferId(Long offerId) {
    this.offerId = offerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferDayDTO offerDayDTO = (OfferDayDTO) o;
    return Objects.equals(this.day, offerDayDTO.day) &&
        Objects.equals(this.id, offerDayDTO.id) &&
        Objects.equals(this.offerId, offerDayDTO.offerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, id, offerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferDayDTO {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
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

