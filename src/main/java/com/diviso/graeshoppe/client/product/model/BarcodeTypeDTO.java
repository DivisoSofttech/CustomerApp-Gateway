package com.diviso.graeshoppe.client.product.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BarcodeTypeDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-18T09:29:25.285+05:30[Asia/Kolkata]")

public class BarcodeTypeDTO   {
  @JsonProperty("barcodeId")
  private Long barcodeId = null;

  @JsonProperty("barcodeType")
  private String barcodeType = null;

  @JsonProperty("id")
  private Long id = null;

  public BarcodeTypeDTO barcodeId(Long barcodeId) {
    this.barcodeId = barcodeId;
    return this;
  }

  /**
   * Get barcodeId
   * @return barcodeId
  **/
  @ApiModelProperty(value = "")


  public Long getBarcodeId() {
    return barcodeId;
  }

  public void setBarcodeId(Long barcodeId) {
    this.barcodeId = barcodeId;
  }

  public BarcodeTypeDTO barcodeType(String barcodeType) {
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

  public BarcodeTypeDTO id(Long id) {
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
    BarcodeTypeDTO barcodeTypeDTO = (BarcodeTypeDTO) o;
    return Objects.equals(this.barcodeId, barcodeTypeDTO.barcodeId) &&
        Objects.equals(this.barcodeType, barcodeTypeDTO.barcodeType) &&
        Objects.equals(this.id, barcodeTypeDTO.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcodeId, barcodeType, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarcodeTypeDTO {\n");
    
    sb.append("    barcodeId: ").append(toIndentedString(barcodeId)).append("\n");
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

