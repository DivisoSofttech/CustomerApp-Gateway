package com.diviso.graeshoppe.customerappgateway.client.administration.model;



import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

/**
 * A CancellationRequest.
 */

public class CancellationRequest  {

 

  
    private Long id;

  
    private String status;

  
    private String orderId;

    private String paymentId;

    private Integer phoneCode;

 
    private String customerEmail;

 
    private Long customerPhone;


    private String storeEmail;

  
    private Long storePhone;

 
    private Instant date;

 
    private Double amount;


    private String reference;


    private RefundDetails refundDetails;

 
    private Set<CancelledOrderLine> cancelledOrderLines = new HashSet<>();


    private Set<CancelledAuxilaryOrderLine> cancelledAuxilaryOrderLines = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public CancellationRequest status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public CancellationRequest orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public CancellationRequest paymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getPhoneCode() {
        return phoneCode;
    }

    public CancellationRequest phoneCode(Integer phoneCode) {
        this.phoneCode = phoneCode;
        return this;
    }

    public void setPhoneCode(Integer phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public CancellationRequest customerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Long getCustomerPhone() {
        return customerPhone;
    }

    public CancellationRequest customerPhone(Long customerPhone) {
        this.customerPhone = customerPhone;
        return this;
    }

    public void setCustomerPhone(Long customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getStoreEmail() {
        return storeEmail;
    }

    public CancellationRequest storeEmail(String storeEmail) {
        this.storeEmail = storeEmail;
        return this;
    }

    public void setStoreEmail(String storeEmail) {
        this.storeEmail = storeEmail;
    }

    public Long getStorePhone() {
        return storePhone;
    }

    public CancellationRequest storePhone(Long storePhone) {
        this.storePhone = storePhone;
        return this;
    }

    public void setStorePhone(Long storePhone) {
        this.storePhone = storePhone;
    }

    public Instant getDate() {
        return date;
    }

    public CancellationRequest date(Instant date) {
        this.date = date;
        return this;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public CancellationRequest amount(Double amount) {
        this.amount = amount;
        return this;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getReference() {
        return reference;
    }

    public CancellationRequest reference(String reference) {
        this.reference = reference;
        return this;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public RefundDetails getRefundDetails() {
        return refundDetails;
    }

    public CancellationRequest refundDetails(RefundDetails refundDetails) {
        this.refundDetails = refundDetails;
        return this;
    }

    public void setRefundDetails(RefundDetails refundDetails) {
        this.refundDetails = refundDetails;
    }

    public Set<CancelledOrderLine> getCancelledOrderLines() {
        return cancelledOrderLines;
    }

    public CancellationRequest cancelledOrderLines(Set<CancelledOrderLine> cancelledOrderLines) {
        this.cancelledOrderLines = cancelledOrderLines;
        return this;
    }

    public CancellationRequest addCancelledOrderLines(CancelledOrderLine cancelledOrderLine) {
        this.cancelledOrderLines.add(cancelledOrderLine);
        cancelledOrderLine.setCancellationRequest(this);
        return this;
    }

    public CancellationRequest removeCancelledOrderLines(CancelledOrderLine cancelledOrderLine) {
        this.cancelledOrderLines.remove(cancelledOrderLine);
        cancelledOrderLine.setCancellationRequest(null);
        return this;
    }

    public void setCancelledOrderLines(Set<CancelledOrderLine> cancelledOrderLines) {
        this.cancelledOrderLines = cancelledOrderLines;
    }

    public Set<CancelledAuxilaryOrderLine> getCancelledAuxilaryOrderLines() {
        return cancelledAuxilaryOrderLines;
    }

    public CancellationRequest cancelledAuxilaryOrderLines(Set<CancelledAuxilaryOrderLine> cancelledAuxilaryOrderLines) {
        this.cancelledAuxilaryOrderLines = cancelledAuxilaryOrderLines;
        return this;
    }

    public CancellationRequest addCancelledAuxilaryOrderLine(CancelledAuxilaryOrderLine cancelledAuxilaryOrderLine) {
        this.cancelledAuxilaryOrderLines.add(cancelledAuxilaryOrderLine);
        cancelledAuxilaryOrderLine.setCancellationRequest(this);
        return this;
    }

    public CancellationRequest removeCancelledAuxilaryOrderLine(CancelledAuxilaryOrderLine cancelledAuxilaryOrderLine) {
        this.cancelledAuxilaryOrderLines.remove(cancelledAuxilaryOrderLine);
        cancelledAuxilaryOrderLine.setCancellationRequest(null);
        return this;
    }

    public void setCancelledAuxilaryOrderLines(Set<CancelledAuxilaryOrderLine> cancelledAuxilaryOrderLines) {
        this.cancelledAuxilaryOrderLines = cancelledAuxilaryOrderLines;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CancellationRequest)) {
            return false;
        }
        return id != null && id.equals(((CancellationRequest) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "CancellationRequest{" +
            "id=" + getId() +
            ", status='" + getStatus() + "'" +
            ", orderId='" + getOrderId() + "'" +
            ", paymentId='" + getPaymentId() + "'" +
            ", phoneCode=" + getPhoneCode() +
            ", customerEmail='" + getCustomerEmail() + "'" +
            ", customerPhone=" + getCustomerPhone() +
            ", storeEmail='" + getStoreEmail() + "'" +
            ", storePhone=" + getStorePhone() +
            ", date='" + getDate() + "'" +
            ", amount=" + getAmount() +
            ", reference='" + getReference() + "'" +
            "}";
    }
}
