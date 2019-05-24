package com.diviso.graeshoppe.client.order.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Order.
 */

@Document(indexName = "order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    private Long id;

    private String orderId;

    private String customerId;

    private String storeId;

    private Instant date;

    private Double grandTotal;

    private OrderDeliveryInfo deliveryInfo;

    private OrderPayment payment;

    private Set<OrderLine> orderLines = new HashSet<>();
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public Order orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Order customerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getStoreId() {
        return storeId;
    }

    public Order storeId(String storeId) {
        this.storeId = storeId;
        return this;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public Instant getDate() {
        return date;
    }

    public Order date(Instant date) {
        this.date = date;
        return this;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public Order grandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
        return this;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public OrderDeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }

    public Order deliveryInfo(OrderDeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
        return this;
    }

    public void setDeliveryInfo(OrderDeliveryInfo deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    public OrderPayment getPayment() {
        return payment;
    }

    public Order payment(OrderPayment payment) {
        this.payment = payment;
        return this;
    }

    public void setPayment(OrderPayment payment) {
        this.payment = payment;
    }

    public Set<OrderLine> getOrderLines() {
        return orderLines;
    }

    public Order orderLines(Set<OrderLine> orderLines) {
        this.orderLines = orderLines;
        return this;
    }

    public Order addOrderLines(OrderLine orderLine) {
        this.orderLines.add(orderLine);
        orderLine.setOrder(this);
        return this;
    }

    public Order removeOrderLines(OrderLine orderLine) {
        this.orderLines.remove(orderLine);
        orderLine.setOrder(null);
        return this;
    }

    public void setOrderLines(Set<OrderLine> orderLines) {
        this.orderLines = orderLines;
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
        Order order = (Order) o;
        if (order.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), order.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Order{" +
            "id=" + getId() +
            ", orderId='" + getOrderId() + "'" +
            ", customerId='" + getCustomerId() + "'" +
            ", storeId='" + getStoreId() + "'" +
            ", date='" + getDate() + "'" +
            ", grandTotal=" + getGrandTotal() +
            "}";
    }
}
