package com.diviso.graeshoppe.customerappgateway.client.store.model;

import org.springframework.validation.annotation.Validated;

/**
 * StoreAddressDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-30T14:09:05.929+05:30[Asia/Kolkata]")

public class StoreAddress   {
    private Long id;

    private String pincode;

    private String houseNoOrBuildingName;

    private String roadNameAreaOrStreet;

    private String city;


    private String state;

    private String landmark;

    private String addressType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getHouseNoOrBuildingName() {
		return houseNoOrBuildingName;
	}

	public void setHouseNoOrBuildingName(String houseNoOrBuildingName) {
		this.houseNoOrBuildingName = houseNoOrBuildingName;
	}

	public String getRoadNameAreaOrStreet() {
		return roadNameAreaOrStreet;
	}

	public void setRoadNameAreaOrStreet(String roadNameAreaOrStreet) {
		this.roadNameAreaOrStreet = roadNameAreaOrStreet;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	@Override
	public String toString() {
		return "StoreAddress [id=" + id + ", pincode=" + pincode + ", houseNoOrBuildingName=" + houseNoOrBuildingName
				+ ", roadNameAreaOrStreet=" + roadNameAreaOrStreet + ", city=" + city + ", state=" + state
				+ ", landmark=" + landmark + ", addressType=" + addressType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressType == null) ? 0 : addressType.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((houseNoOrBuildingName == null) ? 0 : houseNoOrBuildingName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((landmark == null) ? 0 : landmark.hashCode());
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
		result = prime * result + ((roadNameAreaOrStreet == null) ? 0 : roadNameAreaOrStreet.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
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
		StoreAddress other = (StoreAddress) obj;
		if (addressType == null) {
			if (other.addressType != null)
				return false;
		} else if (!addressType.equals(other.addressType))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (houseNoOrBuildingName == null) {
			if (other.houseNoOrBuildingName != null)
				return false;
		} else if (!houseNoOrBuildingName.equals(other.houseNoOrBuildingName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (landmark == null) {
			if (other.landmark != null)
				return false;
		} else if (!landmark.equals(other.landmark))
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		if (roadNameAreaOrStreet == null) {
			if (other.roadNameAreaOrStreet != null)
				return false;
		} else if (!roadNameAreaOrStreet.equals(other.roadNameAreaOrStreet))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}
    
    

}

