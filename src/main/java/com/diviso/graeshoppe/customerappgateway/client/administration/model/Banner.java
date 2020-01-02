package com.diviso.graeshoppe.customerappgateway.client.administration.model;


import javax.persistence.*;


import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;


public class Banner implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String storeId;

    private String imageLink;

    private Instant startDate;

    private Instant expiryDate;

    private Double cost;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStoreId() {
        return storeId;
    }

    public Banner storeId(String storeId) {
        this.storeId = storeId;
        return this;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getImageLink() {
        return imageLink;
    }

    public Banner imageLink(String imageLink) {
        this.imageLink = imageLink;
        return this;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public Instant getStartDate() {
        return startDate;
    }

    public Banner startDate(Instant startDate) {
        this.startDate = startDate;
        return this;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Instant getExpiryDate() {
        return expiryDate;
    }

    public Banner expiryDate(Instant expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    public void setExpiryDate(Instant expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Double getCost() {
        return cost;
    }

    public Banner cost(Double cost) {
        this.cost = cost;
        return this;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Banner banner = (Banner) o;
        if (banner.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), banner.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Banner{" +
            "id=" + getId() +
            ", storeId='" + getStoreId() + "'" +
            ", imageLink='" + getImageLink() + "'" +
            ", startDate='" + getStartDate() + "'" +
            ", expiryDate='" + getExpiryDate() + "'" +
            ", cost=" + getCost() +
            "}";
    }
}
