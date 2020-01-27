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
	}
    
    
