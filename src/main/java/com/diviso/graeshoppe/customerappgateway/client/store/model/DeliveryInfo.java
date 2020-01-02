package com.diviso.graeshoppe.customerappgateway.client.store.model;

import java.time.OffsetDateTime;


public class DeliveryInfo   {
    private Long id;

    private OffsetDateTime startingTime;

    private OffsetDateTime endTime;

    private Type type;

    private Store store;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public OffsetDateTime getStartingTime() {
		return startingTime;
	}

	public void setStartingTime(OffsetDateTime startingTime) {
		this.startingTime = startingTime;
	}

	public OffsetDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(OffsetDateTime endTime) {
		this.endTime = endTime;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((startingTime == null) ? 0 : startingTime.hashCode());
		result = prime * result + ((store == null) ? 0 : store.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		DeliveryInfo other = (DeliveryInfo) obj;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (startingTime == null) {
			if (other.startingTime != null)
				return false;
		} else if (!startingTime.equals(other.startingTime))
			return false;
		if (store == null) {
			if (other.store != null)
				return false;
		} else if (!store.equals(other.store))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DeliveryInfo [id=" + id + ", startingTime=" + startingTime + ", endTime=" + endTime + ", type=" + type
				+ ", store=" + store + "]";
	}
    
}

