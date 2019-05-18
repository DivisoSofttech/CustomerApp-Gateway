package com.diviso.graeshoppe.client.product.model;

import java.util.Objects;
import com.diviso.graeshoppe.client.product.model.Barcode;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BarcodeType
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-17T14:38:38.757+05:30[Asia/Kolkata]")
@Document(indexName = "barcodetype")
public class BarcodeType   {
  @JsonProperty("barcode")
  private Barcode barcode = null;

  @JsonProperty("barcodeType")
  private String barcodeType = null;

  @JsonProperty("id")
  private Long id = null;

  public BarcodeType barcode(Barcode barcode) {
    this.barcode = barcode;
    return this;
  }

  /**
   * Get barcode
   * @return barcode
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Barcode getBarcode() {
    return barcode;
  }

  public void setBarcode(Barcode barcode) {
    this.barcode = barcode;
  }

  public BarcodeType barcodeType(String barcodeType) {
    this.barcodeType = barcodeType;
    return this;
  }

  /**
   * Get barcodeType
   * @return barcodeType
  **/
  @ApiModelProperty(value = "")


  public String getBarcodeType() {
    return barcodeType;
  }

  public void setBarcodeType(String barcodeType) {
    this.barcodeType = barcodeType;
  }

  public BarcodeType id(Long id) {
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
    BarcodeType barcodeType = (BarcodeType) o;
    return Objects.equals(this.barcode, barcodeType.barcode) &&
        Objects.equals(this.barcodeType, barcodeType.barcodeType) &&
        Objects.equals(this.id, barcodeType.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcode, barcodeType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarcodeType {\n");
    
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    barcodeType: ").append(toIndentedString(barcodeType)).append("\n");
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

