package com.diviso.graeshoppe.customerappgateway.client.administration.model;



/**
 * A RefundDetails.
 */

public class RefundDetails{


    private Long id;


    private String refundId;


    private String status;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRefundId() {
        return refundId;
    }

    public RefundDetails refundId(String refundId) {
        this.refundId = refundId;
        return this;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getStatus() {
        return status;
    }

    public RefundDetails status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RefundDetails)) {
            return false;
        }
        return id != null && id.equals(((RefundDetails) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "RefundDetails{" +
            "id=" + getId() +
            ", refundId='" + getRefundId() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
}
