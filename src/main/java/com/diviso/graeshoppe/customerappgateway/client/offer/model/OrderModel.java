package com.diviso.graeshoppe.customerappgateway.client.offer.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.offer.model.ClaimedOfferModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderModel
 */
@Validated

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-12T12:18:57.994+05:30[Asia/Calcutta]")

public class OrderModel   {
  @JsonProperty("appliedOffers")
  @Valid
  private List<ClaimedOfferModel> appliedOffers = null;

  @JsonProperty("claimedDate")
  private OffsetDateTime claimedDate = null;

  @JsonProperty("orderDiscountTotal")
  private Double orderDiscountTotal = null;

  @JsonProperty("orderNumber")
  private Long orderNumber = null;

  @JsonProperty("orderTotal")
  private Double orderTotal = null;

  @JsonProperty("promoCode")
  private String promoCode = null;

  @JsonProperty("ruleDiscountAmount")
  private Double ruleDiscountAmount = null;

  @JsonProperty("storeId")
  private String storeId = null;

  @JsonProperty("totalDiscount")
  private Double totalDiscount = null;

  public OrderModel appliedOffers(List<ClaimedOfferModel> appliedOffers) {
    this.appliedOffers = appliedOffers;
    return this;
  }

  public OrderModel addAppliedOffersItem(ClaimedOfferModel appliedOffersItem) {
    if (this.appliedOffers == null) {
      this.appliedOffers = new ArrayList<ClaimedOfferModel>();
    }
    this.appliedOffers.add(appliedOffersItem);
    return this;
  }

  /**
   * Get appliedOffers
   * @return appliedOffers
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ClaimedOfferModel> getAppliedOffers() {
    return appliedOffers;
  }

  public void setAppliedOffers(List<ClaimedOfferModel> appliedOffers) {
    this.appliedOffers = appliedOffers;
  }

  public OrderModel claimedDate(OffsetDateTime claimedDate) {
    this.claimedDate = claimedDate;
    return this;
  }

  /**
   * Get claimedDate
   * @return claimedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getClaimedDate() {
    return claimedDate;
  }

  public void setClaimedDate(OffsetDateTime claimedDate) {
    this.claimedDate = claimedDate;
  }

  public OrderModel orderDiscountTotal(Double orderDiscountTotal) {
    this.orderDiscountTotal = orderDiscountTotal;
    return this;
  }

  /**
   * Get orderDiscountTotal
   * @return orderDiscountTotal
  **/
  @ApiModelProperty(value = "")


  public Double getOrderDiscountTotal() {
    return orderDiscountTotal;
  }

  public void setOrderDiscountTotal(Double orderDiscountTotal) {
    this.orderDiscountTotal = orderDiscountTotal;
  }

  public OrderModel orderNumber(Long orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

  /**
   * Get orderNumber
   * @return orderNumber
  **/
  @ApiModelProperty(value = "")


  public Long getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(Long orderNumber) {
    this.orderNumber = orderNumber;
  }

  public OrderModel orderTotal(Double orderTotal) {
    this.orderTotal = orderTotal;
    return this;
  }

  /**
   * Get orderTotal
   * @return orderTotal
  **/
  @ApiModelProperty(value = "")


  public Double getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal(Double orderTotal) {
    this.orderTotal = orderTotal;
  }

  public OrderModel promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

  /**
   * Get promoCode
   * @return promoCode
  **/
  @ApiModelProperty(value = "")


  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }

  public OrderModel ruleDiscountAmount(Double ruleDiscountAmount) {
    this.ruleDiscountAmount = ruleDiscountAmount;
    return this;
  }

  /**
   * Get ruleDiscountAmount
   * @return ruleDiscountAmount
  **/
  @ApiModelProperty(value = "")


  public Double getRuleDiscountAmount() {
    return ruleDiscountAmount;
  }

  public void setRuleDiscountAmount(Double ruleDiscountAmount) {
    this.ruleDiscountAmount = ruleDiscountAmount;
  }

  public OrderModel storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * Get storeId
   * @return storeId
  **/
  @ApiModelProperty(value = "")


  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public OrderModel totalDiscount(Double totalDiscount) {
    this.totalDiscount = totalDiscount;
    return this;
  }

  /**
   * Get totalDiscount
   * @return totalDiscount
  **/
  @ApiModelProperty(value = "")


  public Double getTotalDiscount() {
    return totalDiscount;
  }

  public void setTotalDiscount(Double totalDiscount) {
    this.totalDiscount = totalDiscount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderModel orderModel = (OrderModel) o;
    return Objects.equals(this.appliedOffers, orderModel.appliedOffers) &&
        Objects.equals(this.claimedDate, orderModel.claimedDate) &&
        Objects.equals(this.orderDiscountTotal, orderModel.orderDiscountTotal) &&
        Objects.equals(this.orderNumber, orderModel.orderNumber) &&
        Objects.equals(this.orderTotal, orderModel.orderTotal) &&
        Objects.equals(this.promoCode, orderModel.promoCode) &&
        Objects.equals(this.ruleDiscountAmount, orderModel.ruleDiscountAmount) &&
        Objects.equals(this.storeId, orderModel.storeId) &&
        Objects.equals(this.totalDiscount, orderModel.totalDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedOffers, claimedDate, orderDiscountTotal, orderNumber, orderTotal, promoCode, ruleDiscountAmount, storeId, totalDiscount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderModel {\n");
    
    sb.append("    appliedOffers: ").append(toIndentedString(appliedOffers)).append("\n");
    sb.append("    claimedDate: ").append(toIndentedString(claimedDate)).append("\n");
    sb.append("    orderDiscountTotal: ").append(toIndentedString(orderDiscountTotal)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    ruleDiscountAmount: ").append(toIndentedString(ruleDiscountAmount)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    totalDiscount: ").append(toIndentedString(totalDiscount)).append("\n");
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

