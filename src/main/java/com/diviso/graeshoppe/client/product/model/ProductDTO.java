package com.diviso.graeshoppe.client.product.model;

import java.util.Objects;
import com.diviso.graeshoppe.client.product.model.CategoryDTO;
import com.diviso.graeshoppe.client.product.model.LabelDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-18T09:29:25.285+05:30[Asia/Kolkata]")

public class ProductDTO   {
  @JsonProperty("barcodeId")
  private Long barcodeId = null;

  @JsonProperty("categories")
  @Valid
  private List<CategoryDTO> categories = null;

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
  private List<LabelDTO> labels = null;

  @JsonProperty("maximumStockLevel")
  private Double maximumStockLevel = null;

  @JsonProperty("mpn")
  private String mpn = null;

  @JsonProperty("name")
  private String name = null;

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

  @JsonProperty("statusId")
  private Long statusId = null;

  @JsonProperty("taxCategoryId")
  private Long taxCategoryId = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("visible")
  private Boolean visible = null;

  public ProductDTO barcodeId(Long barcodeId) {
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

  public ProductDTO categories(List<CategoryDTO> categories) {
    this.categories = categories;
    return this;
  }

  public ProductDTO addCategoriesItem(CategoryDTO categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<CategoryDTO>();
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

  public List<CategoryDTO> getCategories() {
    return categories;
  }

  public void setCategories(List<CategoryDTO> categories) {
    this.categories = categories;
  }

  public ProductDTO dateOfExpiry(LocalDate dateOfExpiry) {
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

  public ProductDTO dateOfMfd(LocalDate dateOfMfd) {
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

  public ProductDTO description(String description) {
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

  public ProductDTO id(Long id) {
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

  public ProductDTO image(byte[] image) {
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

  public ProductDTO imageContentType(String imageContentType) {
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

  public ProductDTO labels(List<LabelDTO> labels) {
    this.labels = labels;
    return this;
  }

  public ProductDTO addLabelsItem(LabelDTO labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<LabelDTO>();
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

  public List<LabelDTO> getLabels() {
    return labels;
  }

  public void setLabels(List<LabelDTO> labels) {
    this.labels = labels;
  }

  public ProductDTO maximumStockLevel(Double maximumStockLevel) {
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

  public ProductDTO mpn(String mpn) {
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

  public ProductDTO name(String name) {
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

  public ProductDTO outOfStock(Boolean outOfStock) {
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

  public ProductDTO reOrderLevel(Double reOrderLevel) {
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

  public ProductDTO reference(String reference) {
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

  public ProductDTO searchkey(String searchkey) {
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

  public ProductDTO sku(String sku) {
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

  public ProductDTO statusId(Long statusId) {
    this.statusId = statusId;
    return this;
  }

  /**
   * Get statusId
   * @return statusId
  **/
  @ApiModelProperty(value = "")


  public Long getStatusId() {
    return statusId;
  }

  public void setStatusId(Long statusId) {
    this.statusId = statusId;
  }

  public ProductDTO taxCategoryId(Long taxCategoryId) {
    this.taxCategoryId = taxCategoryId;
    return this;
  }

  /**
   * Get taxCategoryId
   * @return taxCategoryId
  **/
  @ApiModelProperty(value = "")


  public Long getTaxCategoryId() {
    return taxCategoryId;
  }

  public void setTaxCategoryId(Long taxCategoryId) {
    this.taxCategoryId = taxCategoryId;
  }

  public ProductDTO userId(String userId) {
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

  public ProductDTO visible(Boolean visible) {
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
    ProductDTO productDTO = (ProductDTO) o;
    return Objects.equals(this.barcodeId, productDTO.barcodeId) &&
        Objects.equals(this.categories, productDTO.categories) &&
        Objects.equals(this.dateOfExpiry, productDTO.dateOfExpiry) &&
        Objects.equals(this.dateOfMfd, productDTO.dateOfMfd) &&
        Objects.equals(this.description, productDTO.description) &&
        Objects.equals(this.id, productDTO.id) &&
        Objects.equals(this.image, productDTO.image) &&
        Objects.equals(this.imageContentType, productDTO.imageContentType) &&
        Objects.equals(this.labels, productDTO.labels) &&
        Objects.equals(this.maximumStockLevel, productDTO.maximumStockLevel) &&
        Objects.equals(this.mpn, productDTO.mpn) &&
        Objects.equals(this.name, productDTO.name) &&
        Objects.equals(this.outOfStock, productDTO.outOfStock) &&
        Objects.equals(this.reOrderLevel, productDTO.reOrderLevel) &&
        Objects.equals(this.reference, productDTO.reference) &&
        Objects.equals(this.searchkey, productDTO.searchkey) &&
        Objects.equals(this.sku, productDTO.sku) &&
        Objects.equals(this.statusId, productDTO.statusId) &&
        Objects.equals(this.taxCategoryId, productDTO.taxCategoryId) &&
        Objects.equals(this.userId, productDTO.userId) &&
        Objects.equals(this.visible, productDTO.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barcodeId, categories, dateOfExpiry, dateOfMfd, description, id, image, imageContentType, labels, maximumStockLevel, mpn, name, outOfStock, reOrderLevel, reference, searchkey, sku, statusId, taxCategoryId, userId, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDTO {\n");
    
    sb.append("    barcodeId: ").append(toIndentedString(barcodeId)).append("\n");
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
    sb.append("    outOfStock: ").append(toIndentedString(outOfStock)).append("\n");
    sb.append("    reOrderLevel: ").append(toIndentedString(reOrderLevel)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    searchkey: ").append(toIndentedString(searchkey)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    taxCategoryId: ").append(toIndentedString(taxCategoryId)).append("\n");
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

