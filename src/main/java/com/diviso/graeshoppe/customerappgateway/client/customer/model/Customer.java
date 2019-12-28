package com.diviso.graeshoppe.customerappgateway.client.customer.model;

import java.util.Objects;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.Contact;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.FavouriteProduct;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.FavouriteStore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;


public class Customer   {

  private Contact contact = null;


  private String customerUniqueId = null;

  private List<FavouriteProduct> favouriteproducts = null;

  private List<FavouriteStore> favouritestores = null;

  private Long id = null;

  private String idpCode = null;

  private String idpSub = null;


  private byte[] image = null;


  private String imageContentType = null;

  private String imageLink = null;

  private String name = null;
  
  private Long loyaltyPoint;

public Contact getContact() {
	return contact;
}

public void setContact(Contact contact) {
	this.contact = contact;
}

public String getCustomerUniqueId() {
	return customerUniqueId;
}

public void setCustomerUniqueId(String customerUniqueId) {
	this.customerUniqueId = customerUniqueId;
}

public List<FavouriteProduct> getFavouriteproducts() {
	return favouriteproducts;
}

public void setFavouriteproducts(List<FavouriteProduct> favouriteproducts) {
	this.favouriteproducts = favouriteproducts;
}

public List<FavouriteStore> getFavouritestores() {
	return favouritestores;
}

public void setFavouritestores(List<FavouriteStore> favouritestores) {
	this.favouritestores = favouritestores;
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
	result = prime * result + ((contact == null) ? 0 : contact.hashCode());
	result = prime * result + ((customerUniqueId == null) ? 0 : customerUniqueId.hashCode());
	result = prime * result + ((favouriteproducts == null) ? 0 : favouriteproducts.hashCode());
	result = prime * result + ((favouritestores == null) ? 0 : favouritestores.hashCode());
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
	Customer other = (Customer) obj;
	if (contact == null) {
		if (other.contact != null)
			return false;
	} else if (!contact.equals(other.contact))
		return false;
	if (customerUniqueId == null) {
		if (other.customerUniqueId != null)
			return false;
	} else if (!customerUniqueId.equals(other.customerUniqueId))
		return false;
	if (favouriteproducts == null) {
		if (other.favouriteproducts != null)
			return false;
	} else if (!favouriteproducts.equals(other.favouriteproducts))
		return false;
	if (favouritestores == null) {
		if (other.favouritestores != null)
			return false;
	} else if (!favouritestores.equals(other.favouritestores))
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
	return "Customer [contact=" + contact + ", customerUniqueId=" + customerUniqueId + ", favouriteproducts="
			+ favouriteproducts + ", favouritestores=" + favouritestores + ", id=" + id + ", idpCode=" + idpCode
			+ ", idpSub=" + idpSub + ", image=" + Arrays.toString(image) + ", imageContentType=" + imageContentType
			+ ", imageLink=" + imageLink + ", name=" + name + ", loyaltyPoint=" + loyaltyPoint + "]";
}

  
  
  
  
}