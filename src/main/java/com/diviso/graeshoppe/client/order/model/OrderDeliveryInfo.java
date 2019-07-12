package com.diviso.graeshoppe.client.order.model;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A OrderDeliveryInfo.
 */

@Document(indexName = "orderdeliveryinfo",type="orderdeliveryinfo")
public class OrderDeliveryInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    
 
    private Long id;

    private String deliveryType;

    private Instant expectedDelivery;

    private Double deliveryCharge;

    private OrderAddress deliveryAddress;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public OrderDeliveryInfo deliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Instant getExpectedDelivery() {
        return expectedDelivery;
    }

    public OrderDeliveryInfo expectedDelivery(Instant expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
        return this;
    }

    public void setExpectedDelivery(Instant expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
    }

    public Double getDeliveryCharge() {
        return deliveryCharge;
    }

    public OrderDeliveryInfo deliveryCharge(Double deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
        return this;
    }

    public void setDeliveryCharge(Double deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public OrderAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public OrderDeliveryInfo deliveryAddress(OrderAddress address) {
        this.deliveryAddress = address;
        return this;
    }

    public void setDeliveryAddress(OrderAddress address) {
        this.deliveryAddress = address;
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
        OrderDeliveryInfo deliveryInfo = (OrderDeliveryInfo) o;
        if (deliveryInfo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), deliveryInfo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "OrderDeliveryInfo{" +
            "id=" + getId() +
            ", deliveryType='" + getDeliveryType() + "'" +
            ", expectedDelivery='" + getExpectedDelivery() + "'" +
            ", deliveryCharge=" + getDeliveryCharge() +
            "}";
    }
}
