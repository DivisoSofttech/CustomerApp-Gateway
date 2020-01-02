package com.diviso.graeshoppe.customerappgateway.client.store.model;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import org.springframework.validation.annotation.Validated;

/**
 * PreOrderSettingsDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-30T14:09:05.929+05:30[Asia/Kolkata]")

public class PreOrderSettings   {
    private Long id;

    private Boolean isPreOrderAvailable;

    private OffsetDateTime fromTime;

    private OffsetDateTime toTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIsPreOrderAvailable() {
		return isPreOrderAvailable;
	}

	public void setIsPreOrderAvailable(Boolean isPreOrderAvailable) {
		this.isPreOrderAvailable = isPreOrderAvailable;
	}

	public OffsetDateTime getFromTime() {
		return fromTime;
	}

	public void setFromTime(OffsetDateTime fromTime) {
		this.fromTime = fromTime;
	}

	public OffsetDateTime getToTime() {
		return toTime;
	}

	public void setToTime(OffsetDateTime toTime) {
		this.toTime = toTime;
	}

	@Override
	public String toString() {
		return "PreOrderSettings [id=" + id + ", isPreOrderAvailable=" + isPreOrderAvailable + ", fromTime=" + fromTime
				+ ", toTime=" + toTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fromTime == null) ? 0 : fromTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isPreOrderAvailable == null) ? 0 : isPreOrderAvailable.hashCode());
		result = prime * result + ((toTime == null) ? 0 : toTime.hashCode());
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
		PreOrderSettings other = (PreOrderSettings) obj;
		if (fromTime == null) {
			if (other.fromTime != null)
				return false;
		} else if (!fromTime.equals(other.fromTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isPreOrderAvailable == null) {
			if (other.isPreOrderAvailable != null)
				return false;
		} else if (!isPreOrderAvailable.equals(other.isPreOrderAvailable))
			return false;
		if (toTime == null) {
			if (other.toTime != null)
				return false;
		} else if (!toTime.equals(other.toTime))
			return false;
		return true;
	}
    
    
}

