package com.diviso.graeshoppe.client.product.model;

import java.util.Objects;
import com.diviso.graeshoppe.client.product.model.Barcode;
import com.diviso.graeshoppe.client.product.model.Category;
import com.diviso.graeshoppe.client.product.model.Label;
import com.diviso.graeshoppe.client.product.model.Note;
import com.diviso.graeshoppe.client.product.model.Status;
import com.diviso.graeshoppe.client.product.model.StockDiary;
import com.diviso.graeshoppe.client.product.model.StockLine;
import com.diviso.graeshoppe.client.product.model.TaxCategory;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-18T09:29:25.285+05:30[Asia/Kolkata]")
@Document(indexName="product")
public class Product   {
  @JsonProperty("barcode")
  private Barcode barcode = null;

  @JsonProperty("categories")
  @Valid
  private List<Category> categories = null;

  @JsonProperty("dateOfExpiry")
  private LocalDate dateOfExpiry = null;

  @JsonProperty("dateOfMfd")
  private LocalDate dateOfMfd = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("image")
  private byte[] image = null;

  @JsonProperty("imageContentType")
  private String imageContentType = null;

  @JsonProperty("labels")
  @Valid
  private List<Label> labels = null;

  @JsonProperty("maximumStockLevel")
  private Double maximumStockLevel = null;

  @JsonProperty("mpn")
  private String mpn = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("notes")
  @Valid
  private List<Note> notes = null;

  @JsonProperty("outOfStock")
  private Boolean outOfStock = null;

  @JsonProperty("reOrderLevel")
  private Double reOrderLevel = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("searchkey")
  private String searchkey = null;

  @JsonProperty("sku")
  private String sku = null;

  @JsonProperty("status")
  private Status status = null;

  @JsonProperty("stockDiaries")
  @Valid
  private List<StockDiary> stockDiaries = null;

  @JsonProperty("stockLines")
  @Valid
  private List<StockLine> stockLines = null;

  @JsonProperty("taxCategory")
  private TaxCategory taxCategory = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("visible")
  private Boolean visible = null;

  public Product barcode(Barcode barcode) {
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

  public Product categories(List<Category> categories) {
    this.categories = categories;
    return this;
  }

  public Product addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<Category>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Category> getCategories() {
    return categories;
  }

  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }

  public Product dateOfExpiry(LocalDate dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
    return this;
  }

  /**
   * Get dateOfExpiry
   * @return dateOfExpiry
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateOfExpiry() {
    return dateOfExpiry;
  }

  public void setDateOfExpiry(LocalDate dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
  }

  public Product dateOfMfd(LocalDate dateOfMfd) {
    this.dateOfMfd = dateOfMfd;
    return this;
  }

  /**
   * Get dateOfMfd
   * @return dateOfMfd
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDateOfMfd() {
    return dateOfMfd;
  }

  public void setDateOfMfd(LocalDate dateOfMfd) {
    this.dateOfMfd = dateOfMfd;
  }

  public Product description(String description) {
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

  public Product id(Long id) {
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

  public Product image(byte[] image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public Product imageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
    return this;
  }

  /**
   * Get imageContentType
   * @return imageContentType
  **/
  @ApiModelProperty(value = "")


  public String getImageContentType() {
    return imageContentType;
  }

  public void setImageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
  }

  public Product labels(List<Label> labels) {
    this.labels = labels;
    return this;
  }

  public Product addLabelsItem(Label labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<Label>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Label> getLabels() {
    return labels;
  }

  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }

  public Product maximumStockLevel(Double maximumStockLevel) {
    this.maximumStockLevel = maximumStockLevel;
    return this;
  }

  /**
   * Get maximumStockLevel
   * @return maximumStockLevel
  **/
  @ApiModelProperty(value = "")


  public Double getMaximumStockLevel() {
    return maximumStockLevel;
  }

  public void setMaximumStockLevel(Double maximumStockLevel) {
    this.maximumStockLevel = maximumStockLevel;
  }

  public Product mpn(String mpn) {
    this.mpn = mpn;
    return this;
  }

  /**
   * Get mpn
   * @return mpn
  **/
  @ApiModelProperty(value = "")


  public String getMpn() {
    return mpn;
  }

  public void setMpn(String mpn) {
    this.mpn = mpn;
  }

  public Product name(String name) {
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

  public Product notes(List<Note> notes) {
    this.notes = notes;
    return this;
  }

  public Product addNotesItem(Note notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<Note>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Note> getNotes() {
    return notes;
  }

  public void setNotes(List<Note> notes) {
    this.notes = notes;
  }

  public Product outOfStock(Boolean outOfStock) {
    this.outOfStock = outOfStock;
    return this;
  }

  /**
   * Get outOfStock
   * @return outOfStock
  **/
  @ApiModelProperty(value = "")


  public Boolean isOutOfStock() {
    return outOfStock;
  }

  public void setOutOfStock(Boolean outOfStock) {
    this.outOfStock = outOfStock;
  }

  public Product reOrderLevel(Double reOrderLevel) {
    this.reOrderLevel = reOrderLevel;
    return this;
  }

  /**
   * Get reOrderLevel
   * @return reOrderLevel
  **/
  @ApiModelProperty(value = "")


  public Double getReOrderLevel() {
    return reOrderLevel;
  }

  public void setReOrderLevel(Double reOrderLevel) {
    this.reOrderLevel = reOrderLevel;
  }

  public Product reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Product searchkey(String searchkey) {
    this.searchkey = searchkey;
    return this;
  }

  /**
   * Get searchkey
   * @return searchkey
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSearchkey() {
    return searchkey;
  }

  public void setSearchkey(String searchkey) {
    this.searchkey = searchkey;
  }

  public Product sku(String sku) {
    this.sku = sku;
    return this;
  }

  /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(value = "")


  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public Product status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Product stockDiaries(List<StockDiary> stockDiaries) {
    this.stockDiaries = stockDiaries;
    return this;
  }

  public Product addStockDiariesItem(StockDiary stockDiariesItem) {
    if (this.stockDiaries == null) {
      this.stockDiaries = new ArrayList<StockDiary>();
    }
    this.stockDiaries.add(stockDiariesItem);
    return this;
  }

  /**
   * Get stockDiaries
   * @return stockDiaries
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<StockDiary> getStockDiaries() {
    return stockDiaries;
  }

  public void setStockDiaries(List<StockDiary> stockDiaries) {
    this.stockDiaries = stockDiaries;
  }

  public Product stockLines(List<StockLine> stockLines) {
    this.stockLines = stockLines;
    return this;
  }

  public Product addStockLinesItem(StockLine stockLinesItem) {
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

  public Product taxCategory(TaxCategory taxCategory) {
    this.taxCategory = taxCategory;
    return this;
  }

  /**
   * Get taxCategory
   * @return taxCategory
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TaxCategory getTaxCategory() {
    return taxCategory;
  }

  public void setTaxCategory(TaxCategory taxCategory) {
    this.taxCategory = taxCategory;
  }

  public Product userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Product visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

  /**
   * Get visible
   * @return visible
  **/
  @ApiModelProperty(value = "")


  public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.barcode, product.barcode) &&
        Objects.equals(this.categories, product.categories) &&
        Objects.equals(this.dateOfExpiry, product.dateOfExpiry) &&
        Objects.equals(this.dateOfMfd, product.dateOfMfd) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.id, product.id) &&
        Objects.equals(this.image, product.image) &&
        Objects.equals(this.imageContentType, product.imageContentType) &&
        Objects.equals(this.labels, product.labels) &&
        Objects.equals(this.maximumStockLevel, product.maximumStockLevel) &&
        Objects.equals(this.mpn, product.mpn) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.notes, product.notes) &&
        Objects.equals(this.outOfStock, product.outOfStock) &&
        Objects.equals(this.reOrderLevel, product.reOrderLevel) &&
        Objects.equals(this.reference, product.reference) &&
        Objects.equals(this.searchkey, product.searchkey) &&
        Objects.equals(this.sku, product.sku) &&
        Objects.equals(this.status, product.status) &&
        Objects.equals(this.stockDiaries, product.stockDiaries) &&
        Objects.equals(this.stockLines, product.stockLines) &&
        Objects.equals(this.taxCategory, product.taxCategory) &&
        Objects.equals(this.userId, product.userId) &&
        Objects.equals(this.visible, product.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcode, categories, dateOfExpiry, dateOfMfd, description, id, image, imageContentType, labels, maximumStockLevel, mpn, name, notes, outOfStock, reOrderLevel, reference, searchkey, sku, status, stockDiaries, stockLines, taxCategory, userId, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    barcode: ").append(toIndentedString(barcode)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    dateOfExpiry: ").append(toIndentedString(dateOfExpiry)).append("\n");
    sb.append("    dateOfMfd: ").append(toIndentedString(dateOfMfd)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageContentType: ").append(toIndentedString(imageContentType)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    maximumStockLevel: ").append(toIndentedString(maximumStockLevel)).append("\n");
    sb.append("    mpn: ").append(toIndentedString(mpn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    outOfStock: ").append(toIndentedString(outOfStock)).append("\n");
    sb.append("    reOrderLevel: ").append(toIndentedString(reOrderLevel)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    searchkey: ").append(toIndentedString(searchkey)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stockDiaries: ").append(toIndentedString(stockDiaries)).append("\n");
    sb.append("    stockLines: ").append(toIndentedString(stockLines)).append("\n");
    sb.append("    taxCategory: ").append(toIndentedString(taxCategory)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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

