package com.diviso.graeshoppe.client.store.domain;


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
 * A DeliveryInfo.
 */

@Document(indexName = "deliveryinfo")
public class DeliveryInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Instant startingTime;

    private Set<Type> types = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getStartingTime() {
        return startingTime;
    }

    public DeliveryInfo startingTime(Instant startingTime) {
        this.startingTime = startingTime;
        return this;
    }

    public void setStartingTime(Instant startingTime) {
        this.startingTime = startingTime;
    }

    public Set<Type> getTypes() {
        return types;
    }

    public DeliveryInfo types(Set<Type> types) {
        this.types = types;
        return this;
    }

    public DeliveryInfo addType(Type type) {
        this.types.add(type);
        type.setDeliveryInfo(this);
        return this;
    }

    public DeliveryInfo removeType(Type type) {
        this.types.remove(type);
        type.setDeliveryInfo(null);
        return this;
    }

    public void setTypes(Set<Type> types) {
        this.types = types;
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
        DeliveryInfo deliveryInfo = (DeliveryInfo) o;
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
        return "DeliveryInfo{" +
            "id=" + getId() +
            ", startingTime='" + getStartingTime() + "'" +
            "}";
    }
}
