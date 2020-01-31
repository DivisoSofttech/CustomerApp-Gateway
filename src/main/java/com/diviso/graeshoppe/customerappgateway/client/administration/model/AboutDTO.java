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
 * AboutDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-27T14:13:06.209+05:30[Asia/Kolkata]")

public class AboutDTO   {
  @JsonProperty("addOn1")
  private String addOn1 = null;

  @JsonProperty("addOn2")
  private String addOn2 = null;

  @JsonProperty("addOn3")
  private String addOn3 = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("supportMail")
  private String supportMail = null;

  @JsonProperty("supportPhone")
  private Long supportPhone = null;

  public AboutDTO addOn1(String addOn1) {
    this.addOn1 = addOn1;
    return this;
  }

  /**
   * Get addOn1
   * @return addOn1
  **/
  @ApiModelProperty(value = "")


  public String getAddOn1() {
    return addOn1;
  }

  public void setAddOn1(String addOn1) {
    this.addOn1 = addOn1;
  }

  public AboutDTO addOn2(String addOn2) {
    this.addOn2 = addOn2;
    return this;
  }

  /**
   * Get addOn2
   * @return addOn2
  **/
  @ApiModelProperty(value = "")


  public String getAddOn2() {
    return addOn2;
  }

  public void setAddOn2(String addOn2) {
    this.addOn2 = addOn2;
  }

  public AboutDTO addOn3(String addOn3) {
    this.addOn3 = addOn3;
    return this;
  }

  /**
   * Get addOn3
   * @return addOn3
  **/
  @ApiModelProperty(value = "")


  public String getAddOn3() {
    return addOn3;
  }

  public void setAddOn3(String addOn3) {
    this.addOn3 = addOn3;
  }

  public AboutDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AboutDTO id(Long id) {
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

  public AboutDTO supportMail(String supportMail) {
    this.supportMail = supportMail;
    return this;
  }

  /**
   * Get supportMail
   * @return supportMail
  **/
  @ApiModelProperty(value = "")


  public String getSupportMail() {
    return supportMail;
  }

  public void setSupportMail(String supportMail) {
    this.supportMail = supportMail;
  }

  public AboutDTO supportPhone(Long supportPhone) {
    this.supportPhone = supportPhone;
    return this;
  }

  /**
   * Get supportPhone
   * @return supportPhone
  **/
  @ApiModelProperty(value = "")


  public Long getSupportPhone() {
    return supportPhone;
  }

  public void setSupportPhone(Long supportPhone) {
    this.supportPhone = supportPhone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AboutDTO aboutDTO = (AboutDTO) o;
    return Objects.equals(this.addOn1, aboutDTO.addOn1) &&
        Objects.equals(this.addOn2, aboutDTO.addOn2) &&
        Objects.equals(this.addOn3, aboutDTO.addOn3) &&
        Objects.equals(this.description, aboutDTO.description) &&
        Objects.equals(this.id, aboutDTO.id) &&
        Objects.equals(this.supportMail, aboutDTO.supportMail) &&
        Objects.equals(this.supportPhone, aboutDTO.supportPhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addOn1, addOn2, addOn3, description, id, supportMail, supportPhone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AboutDTO {\n");
    
    sb.append("    addOn1: ").append(toIndentedString(addOn1)).append("\n");
    sb.append("    addOn2: ").append(toIndentedString(addOn2)).append("\n");
    sb.append("    addOn3: ").append(toIndentedString(addOn3)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    supportMail: ").append(toIndentedString(supportMail)).append("\n");
    sb.append("    supportPhone: ").append(toIndentedString(supportPhone)).append("\n");
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

