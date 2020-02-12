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
 * OfferTargetDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-12T12:18:57.994+05:30[Asia/Calcutta]")

public class OfferTargetDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("offerId")
  private Long offerId = null;

  @JsonProperty("targetId")
  private Long targetId = null;

  public OfferTargetDTO id(Long id) {
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

  public OfferTargetDTO offerId(Long offerId) {
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

  public OfferTargetDTO targetId(Long targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * Get targetId
   * @return targetId
  **/
  @ApiModelProperty(value = "")


  public Long getTargetId() {
    return targetId;
  }

  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferTargetDTO offerTargetDTO = (OfferTargetDTO) o;
    return Objects.equals(this.id, offerTargetDTO.id) &&
        Objects.equals(this.offerId, offerTargetDTO.offerId) &&
        Objects.equals(this.targetId, offerTargetDTO.targetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, offerId, targetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferTargetDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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

