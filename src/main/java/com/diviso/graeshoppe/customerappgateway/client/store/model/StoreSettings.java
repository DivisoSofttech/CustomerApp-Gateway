package com.diviso.graeshoppe.customerappgateway.client.store.model;

public class StoreSettings   {

  private Double deliveryCharge = null;

  private Long id = null;

  private Boolean isActive = null;

  private Boolean isInventoryRequired = null;

  private String orderAcceptType = null;

  private Double serviceCharge = null;

public Double getDeliveryCharge() {
	return deliveryCharge;
}

public void setDeliveryCharge(Double deliveryCharge) {
	this.deliveryCharge = deliveryCharge;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Boolean getIsActive() {
	return isActive;
}

public void setIsActive(Boolean isActive) {
	this.isActive = isActive;
}

public Boolean getIsInventoryRequired() {
	return isInventoryRequired;
}

public void setIsInventoryRequired(Boolean isInventoryRequired) {
	this.isInventoryRequired = isInventoryRequired;
}

public String getOrderAcceptType() {
	return orderAcceptType;
}

public void setOrderAcceptType(String orderAcceptType) {
	this.orderAcceptType = orderAcceptType;
}

public Double getServiceCharge() {
	return serviceCharge;
}

public void setServiceCharge(Double serviceCharge) {
	this.serviceCharge = serviceCharge;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((deliveryCharge == null) ? 0 : deliveryCharge.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
	result = prime * result + ((isInventoryRequired == null) ? 0 : isInventoryRequired.hashCode());
	result = prime * result + ((orderAcceptType == null) ? 0 : orderAcceptType.hashCode());
	result = prime * result + ((serviceCharge == null) ? 0 : serviceCharge.hashCode());
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
	StoreSettings other = (StoreSettings) obj;
	if (deliveryCharge == null) {
		if (other.deliveryCharge != null)
			return false;
	} else if (!deliveryCharge.equals(other.deliveryCharge))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (isActive == null) {
		if (other.isActive != null)
			return false;
	} else if (!isActive.equals(other.isActive))
		return false;
	if (isInventoryRequired == null) {
		if (other.isInventoryRequired != null)
			return false;
	} else if (!isInventoryRequired.equals(other.isInventoryRequired))
		return false;
	if (orderAcceptType == null) {
		if (other.orderAcceptType != null)
			return false;
	} else if (!orderAcceptType.equals(other.orderAcceptType))
		return false;
	if (serviceCharge == null) {
		if (other.serviceCharge != null)
			return false;
	} else if (!serviceCharge.equals(other.serviceCharge))
		return false;
	return true;
}

@Override
public String toString() {
	return "StoreSettings [deliveryCharge=" + deliveryCharge + ", id=" + id + ", isActive=" + isActive
			+ ", isInventoryRequired=" + isInventoryRequired + ", orderAcceptType=" + orderAcceptType
			+ ", serviceCharge=" + serviceCharge + "]";
}

}