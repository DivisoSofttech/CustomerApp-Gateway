package com.diviso.graeshoppe.client.product.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Note
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-17T14:38:38.757+05:30[Asia/Kolkata]")
@Document(indexName = "note")
public class Note   {
  @JsonProperty("dateOfCreation")
  private LocalDate dateOfCreation = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("matter")
  private String matter = null;

  @JsonProperty("product")
  private Product product = null;

  public Note dateOfCreation(LocalDate dateOfCreation) {
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

  public Note id(Long id) {
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

  public Note matter(String matter) {
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

  public Note product(Product product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Note note = (Note) o;
    return Objects.equals(this.dateOfCreation, note.dateOfCreation) &&
        Objects.equals(this.id, note.id) &&
        Objects.equals(this.matter, note.matter) &&
        Objects.equals(this.product, note.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfCreation, id, matter, product);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Note {\n");
    
    sb.append("    dateOfCreation: ").append(toIndentedString(dateOfCreation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    matter: ").append(toIndentedString(matter)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

