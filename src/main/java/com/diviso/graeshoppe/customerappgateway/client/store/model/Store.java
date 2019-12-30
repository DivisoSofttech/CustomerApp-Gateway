package com.diviso.graeshoppe.customerappgateway.client.store.model;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.validation.annotation.Validated;

/**
 * StoreDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-30T14:09:05.929+05:30[Asia/Kolkata]")

public class Store   {
    private Long id;

    private String regNo;


    private String name;


    private Double totalRating;

    private String location;

    private String locationName;

    private Long contactNo;

    private OffsetDateTime openingTime;

    private String email;

    private OffsetDateTime closingTime;

    private String info;

    private Double minAmount;

    private OffsetDateTime maxDeliveryTime;

    private String storeUniqueId;

    private String imageLink;


    private StoreAddress storeAddress;


    private StoreSettings storeSettings;


    private PreOrderSettings preOrderSettings;

    private Set<StoreType> storeTypes = new HashSet<>();

    private Set<Banner> banners = new HashSet<>();

    private Set<DeliveryInfo> deliveryInfos = new HashSet<>();

  
    private Set<UserRatingReview> userRatingReviews = new HashSet<>();


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRegNo() {
		return regNo;
	}


	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getTotalRating() {
		return totalRating;
	}


	public void setTotalRating(Double totalRating) {
		this.totalRating = totalRating;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getLocationName() {
		return locationName;
	}


	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}


	public Long getContactNo() {
		return contactNo;
	}


	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}


	public OffsetDateTime getOpeningTime() {
		return openingTime;
	}


	public void setOpeningTime(OffsetDateTime openingTime) {
		this.openingTime = openingTime;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public OffsetDateTime getClosingTime() {
		return closingTime;
	}


	public void setClosingTime(OffsetDateTime closingTime) {
		this.closingTime = closingTime;
	}


	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}


	public Double getMinAmount() {
		return minAmount;
	}


	public void setMinAmount(Double minAmount) {
		this.minAmount = minAmount;
	}


	public OffsetDateTime getMaxDeliveryTime() {
		return maxDeliveryTime;
	}


	public void setMaxDeliveryTime(OffsetDateTime maxDeliveryTime) {
		this.maxDeliveryTime = maxDeliveryTime;
	}


	public String getStoreUniqueId() {
		return storeUniqueId;
	}


	public void setStoreUniqueId(String storeUniqueId) {
		this.storeUniqueId = storeUniqueId;
	}


	public String getImageLink() {
		return imageLink;
	}


	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}


	public StoreAddress getStoreAddress() {
		return storeAddress;
	}


	public void setStoreAddress(StoreAddress storeAddress) {
		this.storeAddress = storeAddress;
	}


	public StoreSettings getStoreSettings() {
		return storeSettings;
	}


	public void setStoreSettings(StoreSettings storeSettings) {
		this.storeSettings = storeSettings;
	}


	public PreOrderSettings getPreOrderSettings() {
		return preOrderSettings;
	}


	public void setPreOrderSettings(PreOrderSettings preOrderSettings) {
		this.preOrderSettings = preOrderSettings;
	}


	public Set<StoreType> getStoreTypes() {
		return storeTypes;
	}


	public void setStoreTypes(Set<StoreType> storeTypes) {
		this.storeTypes = storeTypes;
	}


	public Set<Banner> getBanners() {
		return banners;
	}


	public void setBanners(Set<Banner> banners) {
		this.banners = banners;
	}


	public Set<DeliveryInfo> getDeliveryInfos() {
		return deliveryInfos;
	}


	public void setDeliveryInfos(Set<DeliveryInfo> deliveryInfos) {
		this.deliveryInfos = deliveryInfos;
	}


	public Set<UserRatingReview> getUserRatingReviews() {
		return userRatingReviews;
	}


	public void setUserRatingReviews(Set<UserRatingReview> userRatingReviews) {
		this.userRatingReviews = userRatingReviews;
	}


	@Override
	public String toString() {
		return "Store [id=" + id + ", regNo=" + regNo + ", name=" + name + ", totalRating=" + totalRating
				+ ", location=" + location + ", locationName=" + locationName + ", contactNo=" + contactNo
				+ ", openingTime=" + openingTime + ", email=" + email + ", closingTime=" + closingTime + ", info="
				+ info + ", minAmount=" + minAmount + ", maxDeliveryTime=" + maxDeliveryTime + ", storeUniqueId="
				+ storeUniqueId + ", imageLink=" + imageLink + ", storeAddress=" + storeAddress + ", preOrderSettings="
				+ preOrderSettings + ", banners=" + banners + ", deliveryInfos=" + deliveryInfos + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((banners == null) ? 0 : banners.hashCode());
		result = prime * result + ((closingTime == null) ? 0 : closingTime.hashCode());
		result = prime * result + ((contactNo == null) ? 0 : contactNo.hashCode());
		result = prime * result + ((deliveryInfos == null) ? 0 : deliveryInfos.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imageLink == null) ? 0 : imageLink.hashCode());
		result = prime * result + ((info == null) ? 0 : info.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((locationName == null) ? 0 : locationName.hashCode());
		result = prime * result + ((maxDeliveryTime == null) ? 0 : maxDeliveryTime.hashCode());
		result = prime * result + ((minAmount == null) ? 0 : minAmount.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((openingTime == null) ? 0 : openingTime.hashCode());
		result = prime * result + ((preOrderSettings == null) ? 0 : preOrderSettings.hashCode());
		result = prime * result + ((regNo == null) ? 0 : regNo.hashCode());
		result = prime * result + ((storeAddress == null) ? 0 : storeAddress.hashCode());
		result = prime * result + ((storeUniqueId == null) ? 0 : storeUniqueId.hashCode());
		result = prime * result + ((totalRating == null) ? 0 : totalRating.hashCode());
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
		Store other = (Store) obj;
		if (banners == null) {
			if (other.banners != null)
				return false;
		} else if (!banners.equals(other.banners))
			return false;
		if (closingTime == null) {
			if (other.closingTime != null)
				return false;
		} else if (!closingTime.equals(other.closingTime))
			return false;
		if (contactNo == null) {
			if (other.contactNo != null)
				return false;
		} else if (!contactNo.equals(other.contactNo))
			return false;
		if (deliveryInfos == null) {
			if (other.deliveryInfos != null)
				return false;
		} else if (!deliveryInfos.equals(other.deliveryInfos))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imageLink == null) {
			if (other.imageLink != null)
				return false;
		} else if (!imageLink.equals(other.imageLink))
			return false;
		if (info == null) {
			if (other.info != null)
				return false;
		} else if (!info.equals(other.info))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (locationName == null) {
			if (other.locationName != null)
				return false;
		} else if (!locationName.equals(other.locationName))
			return false;
		if (maxDeliveryTime == null) {
			if (other.maxDeliveryTime != null)
				return false;
		} else if (!maxDeliveryTime.equals(other.maxDeliveryTime))
			return false;
		if (minAmount == null) {
			if (other.minAmount != null)
				return false;
		} else if (!minAmount.equals(other.minAmount))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (openingTime == null) {
			if (other.openingTime != null)
				return false;
		} else if (!openingTime.equals(other.openingTime))
			return false;
		if (preOrderSettings == null) {
			if (other.preOrderSettings != null)
				return false;
		} else if (!preOrderSettings.equals(other.preOrderSettings))
			return false;
		if (regNo == null) {
			if (other.regNo != null)
				return false;
		} else if (!regNo.equals(other.regNo))
			return false;
		if (storeAddress == null) {
			if (other.storeAddress != null)
				return false;
		} else if (!storeAddress.equals(other.storeAddress))
			return false;
		if (storeUniqueId == null) {
			if (other.storeUniqueId != null)
				return false;
		} else if (!storeUniqueId.equals(other.storeUniqueId))
			return false;
		if (totalRating == null) {
			if (other.totalRating != null)
				return false;
		} else if (!totalRating.equals(other.totalRating))
			return false;
		return true;
	}
    
    
    
    
}