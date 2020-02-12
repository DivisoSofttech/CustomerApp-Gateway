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
 * OfferTargetCategoryDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-12T12:18:57.994+05:30[Asia/Calcutta]")

public class OfferTargetCategoryDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("offerId")
  private Long offerId = null;

  @JsonProperty("targetCategoryId")
  private Long targetCategoryId = null;

  public OfferTargetCategoryDTO id(Long id) {
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

  public OfferTargetCategoryDTO offerId(Long offerId) {
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

  public OfferTargetCategoryDTO targetCategoryId(Long targetCategoryId) {
    this.targetCategoryId = targetCategoryId;
    return this;
  }

  /**
   * Get targetCategoryId
   * @return targetCategoryId
  **/
  @ApiModelProperty(value = "")


  public Long getTargetCategoryId() {
    return targetCategoryId;
  }

  public void setTargetCategoryId(Long targetCategoryId) {
    this.targetCategoryId = targetCategoryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferTargetCategoryDTO offerTargetCategoryDTO = (OfferTargetCategoryDTO) o;
    return Objects.equals(this.id, offerTargetCategoryDTO.id) &&
        Objects.equals(this.offerId, offerTargetCategoryDTO.offerId) &&
        Objects.equals(this.targetCategoryId, offerTargetCategoryDTO.targetCategoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, offerId, targetCategoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferTargetCategoryDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    targetCategoryId: ").append(toIndentedString(targetCategoryId)).append("\n");
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

