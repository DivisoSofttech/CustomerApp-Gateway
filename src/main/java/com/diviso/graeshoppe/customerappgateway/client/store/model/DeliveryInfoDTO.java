package com.diviso.graeshoppe.customerappgateway.client.store.model;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;


public class DeliveryInfoDTO   {
	
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("startingTime")
    private OffsetDateTime startingTime;

	@JsonProperty("endTime")
    private OffsetDateTime endTime;

	@JsonProperty("typeId")
    private Long typeId;

	@JsonProperty("storeId")
    private Long storeId;

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

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DeliveryInfoDTO deliveryInfoDTO = (DeliveryInfoDTO) o;
        if (deliveryInfoDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), deliveryInfoDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "DeliveryInfoDTO{" +
            "id=" + getId() +
            ", startingTime='" + getStartingTime() + "'" +
            ", endTime='" + getEndTime() + "'" +
            ", typeId=" + getTypeId() +
            ", storeId=" + getStoreId() +
            "}";
    }
}

