package com.diviso.graeshoppe.client.order.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-29T12:42:01.121660+05:30[Asia/Kolkata]")

public class OrderDTO   {
  @JsonProperty("allergyNote")
  private String allergyNote = null;

  @JsonProperty("approvalDetailsId")
  private Long approvalDetailsId = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("deliveryInfoId")
  private Long deliveryInfoId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("grandTotal")
  private Double grandTotal = null;

  /**
 * @return the subTotal
 */
public Double getSubTotal() {
	return subTotal;
}

/**
 * @param subTotal the subTotal to set
 */
public void setSubTotal(Double subTotal) {
	this.subTotal = subTotal;
}

@JsonProperty("subTotal")
  private Double subTotal = null;
  
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("paymentRef")
  private String paymentRef = null;

  @JsonProperty("preOrderDate")
  private OffsetDateTime preOrderDate = null;

  @JsonProperty("statusId")
  private Long statusId = null;

  @JsonProperty("storeId")
  private String storeId = null;

  public OrderDTO allergyNote(String allergyNote) {
    this.allergyNote = allergyNote;
    return this;
  }

  /**
   * Get allergyNote
   * @return allergyNote
  **/
  @ApiModelProperty(value = "")


  public String getAllergyNote() {
    return allergyNote;
  }

  public void setAllergyNote(String allergyNote) {
    this.allergyNote = allergyNote;
  }

  public OrderDTO approvalDetailsId(Long approvalDetailsId) {
    this.approvalDetailsId = approvalDetailsId;
    return this;
  }

  /**
   * Get approvalDetailsId
   * @return approvalDetailsId
  **/
  @ApiModelProperty(value = "")


  public Long getApprovalDetailsId() {
    return approvalDetailsId;
  }

  public void setApprovalDetailsId(Long approvalDetailsId) {
    this.approvalDetailsId = approvalDetailsId;
  }

  public OrderDTO customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public OrderDTO date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public OrderDTO deliveryInfoId(Long deliveryInfoId) {
    this.deliveryInfoId = deliveryInfoId;
    return this;
  }

  /**
   * Get deliveryInfoId
   * @return deliveryInfoId
  **/
  @ApiModelProperty(value = "")


  public Long getDeliveryInfoId() {
    return deliveryInfoId;
  }

  public void setDeliveryInfoId(Long deliveryInfoId) {
    this.deliveryInfoId = deliveryInfoId;
  }

  public OrderDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public OrderDTO grandTotal(Double grandTotal) {
    this.grandTotal = grandTotal;
    return this;
  }

  /**
   * Get grandTotal
   * @return grandTotal
  **/
  @ApiModelProperty(value = "")


  public Double getGrandTotal() {
    return grandTotal;
  }

  public void setGrandTotal(Double grandTotal) {
    this.grandTotal = grandTotal;
  }

  public OrderDTO id(Long id) {
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

  public OrderDTO orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public OrderDTO paymentRef(String paymentRef) {
    this.paymentRef = paymentRef;
    return this;
  }

  /**
   * Get paymentRef
   * @return paymentRef
  **/
  @ApiModelProperty(value = "")


  public String getPaymentRef() {
    return paymentRef;
  }

  public void setPaymentRef(String paymentRef) {
    this.paymentRef = paymentRef;
  }

  public OrderDTO preOrderDate(OffsetDateTime preOrderDate) {
    this.preOrderDate = preOrderDate;
    return this;
  }

  /**
   * Get preOrderDate
   * @return preOrderDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getPreOrderDate() {
    return preOrderDate;
  }

  public void setPreOrderDate(OffsetDateTime preOrderDate) {
    this.preOrderDate = preOrderDate;
  }

  public OrderDTO statusId(Long statusId) {
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

  public OrderDTO storeId(String storeId) {
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



  @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((allergyNote == null) ? 0 : allergyNote.hashCode());
	result = prime * result + ((approvalDetailsId == null) ? 0 : approvalDetailsId.hashCode());
	result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
	result = prime * result + ((date == null) ? 0 : date.hashCode());
	result = prime * result + ((deliveryInfoId == null) ? 0 : deliveryInfoId.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((grandTotal == null) ? 0 : grandTotal.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
	result = prime * result + ((paymentRef == null) ? 0 : paymentRef.hashCode());
	result = prime * result + ((preOrderDate == null) ? 0 : preOrderDate.hashCode());
	result = prime * result + ((statusId == null) ? 0 : statusId.hashCode());
	result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
	result = prime * result + ((subTotal == null) ? 0 : subTotal.hashCode());
	return result;
}

@Override
public String toString() {
	return String.format(
			"OrderDTO [allergyNote=%s,\n approvalDetailsId=%s,\n customerId=%s,\n date=%s,\n deliveryInfoId=%s,\n email=%s,\n grandTotal=%s,\n subTotal=%s,\n id=%s,\n orderId=%s,\n paymentRef=%s,\n preOrderDate=%s,\n statusId=%s,\n storeId=%s]",
			allergyNote, approvalDetailsId, customerId, date, deliveryInfoId, email, grandTotal, subTotal, id, orderId,
			paymentRef, preOrderDate, statusId, storeId);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (!(obj instanceof OrderDTO))
		return false;
	OrderDTO other = (OrderDTO) obj;
	if (allergyNote == null) {
		if (other.allergyNote != null)
			return false;
	} else if (!allergyNote.equals(other.allergyNote))
		return false;
	if (approvalDetailsId == null) {
		if (other.approvalDetailsId != null)
			return false;
	} else if (!approvalDetailsId.equals(other.approvalDetailsId))
		return false;
	if (customerId == null) {
		if (other.customerId != null)
			return false;
	} else if (!customerId.equals(other.customerId))
		return false;
	if (date == null) {
		if (other.date != null)
			return false;
	} else if (!date.equals(other.date))
		return false;
	if (deliveryInfoId == null) {
		if (other.deliveryInfoId != null)
			return false;
	} else if (!deliveryInfoId.equals(other.deliveryInfoId))
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (grandTotal == null) {
		if (other.grandTotal != null)
			return false;
	} else if (!grandTotal.equals(other.grandTotal))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (orderId == null) {
		if (other.orderId != null)
			return false;
	} else if (!orderId.equals(other.orderId))
		return false;
	if (paymentRef == null) {
		if (other.paymentRef != null)
			return false;
	} else if (!paymentRef.equals(other.paymentRef))
		return false;
	if (preOrderDate == null) {
		if (other.preOrderDate != null)
			return false;
	} else if (!preOrderDate.equals(other.preOrderDate))
		return false;
	if (statusId == null) {
		if (other.statusId != null)
			return false;
	} else if (!statusId.equals(other.statusId))
		return false;
	if (storeId == null) {
		if (other.storeId != null)
			return false;
	} else if (!storeId.equals(other.storeId))
		return false;
	if (subTotal == null) {
		if (other.subTotal != null)
			return false;
	} else if (!subTotal.equals(other.subTotal))
		return false;
	return true;
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

