package com.diviso.graeshoppe.customerappgateway.client.customer.model;

import java.util.Arrays;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-11-27T10:26:27.966+05:30[Asia/Kolkata]")

public class CustomerDTO   {
  @JsonProperty("contactId")
  private Long contactId = null;

  @JsonProperty("customerUniqueId")
  private String customerUniqueId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("idpCode")
  private String idpCode = null;

  @JsonProperty("idpSub")
  private String idpSub = null;

  @JsonProperty("image")
  private byte[] image = null;

  @JsonProperty("imageContentType")
  private String imageContentType = null;

  @JsonProperty("imageLink")
  private String imageLink = null;

  @JsonProperty("name")
  private String name = null;
  
  @JsonProperty("loyaltyPoint")
  private Long loyaltyPoint = null;

public Long getContactId() {
	return contactId;
}

public void setContactId(Long contactId) {
	this.contactId = contactId;
}

public String getCustomerUniqueId() {
	return customerUniqueId;
}

public void setCustomerUniqueId(String customerUniqueId) {
	this.customerUniqueId = customerUniqueId;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getIdpCode() {
	return idpCode;
}

public void setIdpCode(String idpCode) {
	this.idpCode = idpCode;
}

public String getIdpSub() {
	return idpSub;
}

public void setIdpSub(String idpSub) {
	this.idpSub = idpSub;
}

public byte[] getImage() {
	return image;
}

public void setImage(byte[] image) {
	this.image = image;
}

public String getImageContentType() {
	return imageContentType;
}

public void setImageContentType(String imageContentType) {
	this.imageContentType = imageContentType;
}

public String getImageLink() {
	return imageLink;
}

public void setImageLink(String imageLink) {
	this.imageLink = imageLink;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Long getLoyaltyPoint() {
	return loyaltyPoint;
}

public void setLoyaltyPoint(Long loyaltyPoint) {
	this.loyaltyPoint = loyaltyPoint;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((contactId == null) ? 0 : contactId.hashCode());
	result = prime * result + ((customerUniqueId == null) ? 0 : customerUniqueId.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((idpCode == null) ? 0 : idpCode.hashCode());
	result = prime * result + ((idpSub == null) ? 0 : idpSub.hashCode());
	result = prime * result + Arrays.hashCode(image);
	result = prime * result + ((imageContentType == null) ? 0 : imageContentType.hashCode());
	result = prime * result + ((imageLink == null) ? 0 : imageLink.hashCode());
	result = prime * result + ((loyaltyPoint == null) ? 0 : loyaltyPoint.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CustomerDTO other = (CustomerDTO) obj;
	if (contactId == null) {
		if (other.contactId != null)
			return false;
	} else if (!contactId.equals(other.contactId))
		return false;
	if (customerUniqueId == null) {
		if (other.customerUniqueId != null)
			return false;
	} else if (!customerUniqueId.equals(other.customerUniqueId))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (idpCode == null) {
		if (other.idpCode != null)
			return false;
	} else if (!idpCode.equals(other.idpCode))
		return false;
	if (idpSub == null) {
		if (other.idpSub != null)
			return false;
	} else if (!idpSub.equals(other.idpSub))
		return false;
	if (!Arrays.equals(image, other.image))
		return false;
	if (imageContentType == null) {
		if (other.imageContentType != null)
			return false;
	} else if (!imageContentType.equals(other.imageContentType))
		return false;
	if (imageLink == null) {
		if (other.imageLink != null)
			return false;
	} else if (!imageLink.equals(other.imageLink))
		return false;
	if (loyaltyPoint == null) {
		if (other.loyaltyPoint != null)
			return false;
	} else if (!loyaltyPoint.equals(other.loyaltyPoint))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

@Override
public String toString() {
	return "CustomerDTO [contactId=" + contactId + ", customerUniqueId=" + customerUniqueId + ", id=" + id
			+ ", idpCode=" + idpCode + ", idpSub=" + idpSub + ", image=" + Arrays.toString(image)
			+ ", imageContentType=" + imageContentType + ", imageLink=" + imageLink + ", name=" + name
			+ ", loyaltyPoint=" + loyaltyPoint + "]";
}

  
}

