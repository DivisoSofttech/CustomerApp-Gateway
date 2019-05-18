package com.diviso.graeshoppe.client.product.model;

import java.util.Objects;
import com.diviso.graeshoppe.client.product.model.StockLine;
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
 * Uom
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-18T09:29:25.285+05:30[Asia/Kolkata]")

public class Uom   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("stockLines")
  @Valid
  private List<StockLine> stockLines = null;

  public Uom description(String description) {
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

  public Uom id(Long id) {
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

  public Uom name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Uom stockLines(List<StockLine> stockLines) {
    this.stockLines = stockLines;
    return this;
  }

  public Uom addStockLinesItem(StockLine stockLinesItem) {
    if (this.stockLines == null) {
      this.stockLines = new ArrayList<StockLine>();
    }
    this.stockLines.add(stockLinesItem);
    return this;
  }

  /**
   * Get stockLines
   * @return stockLines
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<StockLine> getStockLines() {
    return stockLines;
  }

  public void setStockLines(List<StockLine> stockLines) {
    this.stockLines = stockLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Uom uom = (Uom) o;
    return Objects.equals(this.description, uom.description) &&
        Objects.equals(this.id, uom.id) &&
        Objects.equals(this.name, uom.name) &&
        Objects.equals(this.stockLines, uom.stockLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, stockLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Uom {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stockLines: ").append(toIndentedString(stockLines)).append("\n");
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

