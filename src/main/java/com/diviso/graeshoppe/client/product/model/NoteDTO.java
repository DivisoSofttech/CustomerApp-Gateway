package com.diviso.graeshoppe.client.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NoteDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-18T09:29:25.285+05:30[Asia/Kolkata]")

public class NoteDTO   {
  @JsonProperty("dateOfCreation")
  private LocalDate dateOfCreation = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("matter")
  private String matter = null;

  @JsonProperty("productId")
  private Long productId = null;

  public NoteDTO dateOfCreation(LocalDate dateOfCreation) {
    this.dateOfCreation = dateOfCreation;
    return this;
  }

  /**
   * Get dateOfCreation
   * @return dateOfCreation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateOfCreation() {
    return dateOfCreation;
  }

  public void setDateOfCreation(LocalDate dateOfCreation) {
    this.dateOfCreation = dateOfCreation;
  }

  public NoteDTO id(Long id) {
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

  public NoteDTO matter(String matter) {
    this.matter = matter;
    return this;
  }

  /**
   * Get matter
   * @return matter
  **/
  @ApiModelProperty(value = "")


  public String getMatter() {
    return matter;
  }

  public void setMatter(String matter) {
    this.matter = matter;
  }

  public NoteDTO productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(value = "")


  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoteDTO noteDTO = (NoteDTO) o;
    return Objects.equals(this.dateOfCreation, noteDTO.dateOfCreation) &&
        Objects.equals(this.id, noteDTO.id) &&
        Objects.equals(this.matter, noteDTO.matter) &&
        Objects.equals(this.productId, noteDTO.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfCreation, id, matter, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteDTO {\n");
    
    sb.append("    dateOfCreation: ").append(toIndentedString(dateOfCreation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    matter: ").append(toIndentedString(matter)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

