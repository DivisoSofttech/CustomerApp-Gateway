package com.diviso.graeshoppe.client.product.model;

import java.util.Objects;
import com.diviso.graeshoppe.client.product.model.BarcodeType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Barcode
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-18T09:29:25.285+05:30[Asia/Kolkata]")

public class Barcode   {
  @JsonProperty("barcodeTypes")
  @Valid
  private List<BarcodeType> barcodeTypes = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  public Barcode barcodeTypes(List<BarcodeType> barcodeTypes) {
    this.barcodeTypes = barcodeTypes;
    return this;
  }

  public Barcode addBarcodeTypesItem(BarcodeType barcodeTypesItem) {
    if (this.barcodeTypes == null) {
      this.barcodeTypes = new ArrayList<BarcodeType>();
    }
    this.barcodeTypes.add(barcodeTypesItem);
    return this;
  }

  /**
   * Get barcodeTypes
   * @return barcodeTypes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<BarcodeType> getBarcodeTypes() {
    return barcodeTypes;
  }

  public void setBarcodeTypes(List<BarcodeType> barcodeTypes) {
    this.barcodeTypes = barcodeTypes;
  }

  public Barcode code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Barcode description(String description) {
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

  public Barcode id(Long id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Barcode barcode = (Barcode) o;
    return Objects.equals(this.barcodeTypes, barcode.barcodeTypes) &&
        Objects.equals(this.code, barcode.code) &&
        Objects.equals(this.description, barcode.description) &&
        Objects.equals(this.id, barcode.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcodeTypes, code, description, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Barcode {\n");
    
    sb.append("    barcodeTypes: ").append(toIndentedString(barcodeTypes)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

