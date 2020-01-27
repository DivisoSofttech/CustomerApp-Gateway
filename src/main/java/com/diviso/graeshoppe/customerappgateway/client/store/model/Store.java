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

/*
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
    
*/    //
/*	 public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getRegNo() {
	        return regNo;
	    }

	    public Store regNo(String regNo) {
	        this.regNo = regNo;
	        return this;
	    }

	    public void setRegNo(String regNo) {
	        this.regNo = regNo;
	    }

	    public String getName() {
	        return name;
	    }

	    public Store name(String name) {
	        this.name = name;
	        return this;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Double getTotalRating() {
	        return totalRating;
	    }

	    public Store totalRating(Double totalRating) {
	        this.totalRating = totalRating;
	        return this;
	    }

	    public void setTotalRating(Double totalRating) {
	        this.totalRating = totalRating;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public Store location(String location) {
	        this.location = location;
	        return this;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	    public String getLocationName() {
	        return locationName;
	    }

	    public Store locationName(String locationName) {
	        this.locationName = locationName;
	        return this;
	    }

	    public void setLocationName(String locationName) {
	        this.locationName = locationName;
	    }

	    public Long getContactNo() {
	        return contactNo;
	    }

	    public Store contactNo(Long contactNo) {
	        this.contactNo = contactNo;
	        return this;
	    }

	    public void setContactNo(Long contactNo) {
	        this.contactNo = contactNo;
	    }

	    public Instant getOpeningTime() {
	        return openingTime;
	    }

	    public Store openingTime(Instant openingTime) {
	        this.openingTime = openingTime;
	        return this;
	    }

	    public void setOpeningTime(Instant openingTime) {
	        this.openingTime = openingTime;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public Store email(String email) {
	        this.email = email;
	        return this;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public Instant getClosingTime() {
	        return closingTime;
	    }

	    public Store closingTime(Instant closingTime) {
	        this.closingTime = closingTime;
	        return this;
	    }

	    public void setClosingTime(Instant closingTime) {
	        this.closingTime = closingTime;
	    }

	    public String getInfo() {
	        return info;
	    }

	    public Store info(String info) {
	        this.info = info;
	        return this;
	    }

	    public void setInfo(String info) {
	        this.info = info;
	    }

	    public Double getMinAmount() {
	        return minAmount;
	    }

	    public Store minAmount(Double minAmount) {
	        this.minAmount = minAmount;
	        return this;
	    }

	    public void setMinAmount(Double minAmount) {
	        this.minAmount = minAmount;
	    }

	    public Instant getMaxDeliveryTime() {
	        return maxDeliveryTime;
	    }

	    public Store maxDeliveryTime(Instant maxDeliveryTime) {
	        this.maxDeliveryTime = maxDeliveryTime;
	        return this;
	    }

	    public void setMaxDeliveryTime(Instant maxDeliveryTime) {
	        this.maxDeliveryTime = maxDeliveryTime;
	    }

	    public String getStoreUniqueId() {
	        return storeUniqueId;
	    }

	    public Store storeUniqueId(String storeUniqueId) {
	        this.storeUniqueId = storeUniqueId;
	        return this;
	    }

	    public void setStoreUniqueId(String storeUniqueId) {
	        this.storeUniqueId = storeUniqueId;
	    }

	    public String getImageLink() {
	        return imageLink;
	    }

	    public Store imageLink(String imageLink) {
	        this.imageLink = imageLink;
	        return this;
	    }

	    public void setImageLink(String imageLink) {
	        this.imageLink = imageLink;
	    }

	    public StoreAddress getStoreAddress() {
	        return storeAddress;
	    }

	    public Store storeAddress(StoreAddress storeAddress) {
	        this.storeAddress = storeAddress;
	        return this;
	    }

	    public void setStoreAddress(StoreAddress storeAddress) {
	        this.storeAddress = storeAddress;
	    }

	    public StoreSettings getStoreSettings() {
	        return storeSettings;
	    }

	    public Store storeSettings(StoreSettings storeSettings) {
	        this.storeSettings = storeSettings;
	        return this;
	    }

	    public void setStoreSettings(StoreSettings storeSettings) {
	        this.storeSettings = storeSettings;
	    }

	    public PreOrderSettings getPreOrderSettings() {
	        return preOrderSettings;
	    }

	    public Store preOrderSettings(PreOrderSettings preOrderSettings) {
	        this.preOrderSettings = preOrderSettings;
	        return this;
	    }

	    public void setPreOrderSettings(PreOrderSettings preOrderSettings) {
	        this.preOrderSettings = preOrderSettings;
	    }

	    public Set<StoreType> getStoreTypes() {
	        return storeTypes;
	    }

	    public Store storeTypes(Set<StoreType> storeTypes) {
	        this.storeTypes = storeTypes;
	        return this;
	    }

	    public Store addStoreType(StoreType storeType) {
	        this.storeTypes.add(storeType);
	        storeType.setStore(this);
	        return this;
	    }

	    public Store removeStoreType(StoreType storeType) {
	        this.storeTypes.remove(storeType);
	        storeType.setStore(null);
	        return this;
	    }

	    public void setStoreTypes(Set<StoreType> storeTypes) {
	        this.storeTypes = storeTypes;
	    }

	    public Set<Banner> getBanners() {
	        return banners;
	    }

	    public Store banners(Set<Banner> banners) {
	        this.banners = banners;
	        return this;
	    }

	    public Store addBanner(Banner banner) {
	        this.banners.add(banner);
	        banner.setStore(this);
	        return this;
	    }

	    public Store removeBanner(Banner banner) {
	        this.banners.remove(banner);
	        banner.setStore(null);
	        return this;
	    }

	    public void setBanners(Set<Banner> banners) {
	        this.banners = banners;
	    }

	    public Set<DeliveryInfo> getDeliveryInfos() {
	        return deliveryInfos;
	    }

	    public Store deliveryInfos(Set<DeliveryInfo> deliveryInfos) {
	        this.deliveryInfos = deliveryInfos;
	        return this;
	    }

	    public Store addDeliveryInfo(DeliveryInfo deliveryInfo) {
	        this.deliveryInfos.add(deliveryInfo);
	        deliveryInfo.setStore(this);
	        return this;
	    }

	    public Store removeDeliveryInfo(DeliveryInfo deliveryInfo) {
	        this.deliveryInfos.remove(deliveryInfo);
	        deliveryInfo.setStore(null);
	        return this;
	    }

	    public void setDeliveryInfos(Set<DeliveryInfo> deliveryInfos) {
	        this.deliveryInfos = deliveryInfos;
	    }

	    public Set<UserRatingReview> getUserRatingReviews() {
	        return userRatingReviews;
	    }

	    public Store userRatingReviews(Set<UserRatingReview> userRatingReviews) {
	        this.userRatingReviews = userRatingReviews;
	        return this;
	    }

	    public Store addUserRatingReview(UserRatingReview userRatingReview) {
	        this.userRatingReviews.add(userRatingReview);
	        userRatingReview.setStore(this);
	        return this;
	    }

	    public Store removeUserRatingReview(UserRatingReview userRatingReview) {
	        this.userRatingReviews.remove(userRatingReview);
	        userRatingReview.setStore(null);
	        return this;
	    }

	    public void setUserRatingReviews(Set<UserRatingReview> userRatingReviews) {
	        this.userRatingReviews = userRatingReviews;
	    }
	    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) {
	            return true;
	        }
	        if (!(o instanceof Store)) {
	            return false;
	        }
	        return id != null && id.equals(((Store) o).id);
	    }

*/	    @Override
	    public int hashCode() {
	        return 31;
	    }

	    @Override
	    public String toString() {
	        return "Store{" +
	            "id=" + getId() +
	            ", regNo='" + getRegNo() + "'" +
	            ", name='" + getName() + "'" +
	            ", totalRating=" + getTotalRating() +
	            ", location='" + getLocation() + "'" +
	            ", locationName='" + getLocationName() + "'" +
	            ", contactNo=" + getContactNo() +
	            ", openingTime='" + getOpeningTime() + "'" +
	            ", email='" + getEmail() + "'" +
	            ", closingTime='" + getClosingTime() + "'" +
	            ", info='" + getInfo() + "'" +
	            ", minAmount=" + getMinAmount() +
	            ", maxDeliveryTime='" + getMaxDeliveryTime() + "'" +
	            ", storeUniqueId='" + getStoreUniqueId() + "'" +
	            ", imageLink='" + getImageLink() + "'" +
	            "}";
	    }
	}
    
    
