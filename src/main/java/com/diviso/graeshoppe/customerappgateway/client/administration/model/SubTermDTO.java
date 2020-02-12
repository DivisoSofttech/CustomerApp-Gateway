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
 * SubTermDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-12T10:22:12.708+05:30[Asia/Calcutta]")

public class SubTermDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("subTermId")
  private Long subTermId = null;

  @JsonProperty("termDescription")
  private String termDescription = null;

  @JsonProperty("termId")
  private Long termId = null;

  public SubTermDTO id(Long id) {
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

  public SubTermDTO subTermId(Long subTermId) {
    this.subTermId = subTermId;
    return this;
  }

  /**
   * Get subTermId
   * @return subTermId
  **/
  @ApiModelProperty(value = "")


  public Long getSubTermId() {
    return subTermId;
  }

  public void setSubTermId(Long subTermId) {
    this.subTermId = subTermId;
  }

  public SubTermDTO termDescription(String termDescription) {
    this.termDescription = termDescription;
    return this;
  }

  /**
   * Get termDescription
   * @return termDescription
  **/
  @ApiModelProperty(value = "")


  public String getTermDescription() {
    return termDescription;
  }

  public void setTermDescription(String termDescription) {
    this.termDescription = termDescription;
  }

  public SubTermDTO termId(Long termId) {
    this.termId = termId;
    return this;
  }

  /**
   * Get termId
   * @return termId
  **/
  @ApiModelProperty(value = "")


  public Long getTermId() {
    return termId;
  }

  public void setTermId(Long termId) {
    this.termId = termId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubTermDTO subTermDTO = (SubTermDTO) o;
    return Objects.equals(this.id, subTermDTO.id) &&
        Objects.equals(this.subTermId, subTermDTO.subTermId) &&
        Objects.equals(this.termDescription, subTermDTO.termDescription) &&
        Objects.equals(this.termId, subTermDTO.termId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, subTermId, termDescription, termId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubTermDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subTermId: ").append(toIndentedString(subTermId)).append("\n");
    sb.append("    termDescription: ").append(toIndentedString(termDescription)).append("\n");
    sb.append("    termId: ").append(toIndentedString(termId)).append("\n");
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

