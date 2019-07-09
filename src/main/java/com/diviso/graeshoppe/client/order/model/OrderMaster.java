 /*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.diviso.graeshoppe.client.order.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * TODO Provide a detailed description here 
 * @author MayaSanjeev
 * mayabytatech, maya.k.k@lxisoft.com
 */

@Document(indexName = "ordermaster")
public class OrderMaster {
	
//..................orderline......................
	
	   private Long id;

	    private Long productId;

	    private Integer quantity;

	    private Double pricePerUnit;

	    private Double total;
	    
//................order....................
	    
	    private String orderId;

	    private String customerId;

	    private String storeId;

	    private Instant date;

	    private Double grandTotal;
	    
//.................deliveryInfo............................
	    


	    private String deliveryType;

	    private Instant expectedDelivery;

	    private Double deliveryCharge;
	    
	  //  private OrderAddress deliveryAddress;

//.....................deliveryAddress........................
	    
	    
/*
	    private String customerId;

	    private Long pincode;

	    private String houseNoOrBuildingName;

	    private String roadNameAreaOrStreet;

	    private String city;

	    private String state;

	    private String landmark;

	    private String name;

	    private Long phone;

	    private Long alternatePhone;

	    private String addressType;*/
	    
//....................payment..................................
	    

	    private String ref;

	    private String paymentType;

	    private Double amount;

	    private Double tax;

	    private Double paymentTotal;

	    private String status;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getProductId() {
			return productId;
		}

		public void setProductId(Long productId) {
			this.productId = productId;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public Double getPricePerUnit() {
			return pricePerUnit;
		}

		public void setPricePerUnit(Double pricePerUnit) {
			this.pricePerUnit = pricePerUnit;
		}

		public Double getTotal() {
			return total;
		}

		public void setTotal(Double total) {
			this.total = total;
		}

		public String getOrderId() {
			return orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getCustomerId() {
			return customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		public String getStoreId() {
			return storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public Instant getDate() {
			return date;
		}

		public void setDate(Instant date) {
			this.date = date;
		}

		public Double getGrandTotal() {
			return grandTotal;
		}

		public void setGrandTotal(Double grandTotal) {
			this.grandTotal = grandTotal;
		}

		public String getDeliveryType() {
			return deliveryType;
		}

		public void setDeliveryType(String deliveryType) {
			this.deliveryType = deliveryType;
		}

		public Instant getExpectedDelivery() {
			return expectedDelivery;
		}

		public void setExpectedDelivery(Instant expectedDelivery) {
			this.expectedDelivery = expectedDelivery;
		}

		public Double getDeliveryCharge() {
			return deliveryCharge;
		}

		public void setDeliveryCharge(Double deliveryCharge) {
			this.deliveryCharge = deliveryCharge;
		}

		public String getRef() {
			return ref;
		}

		public void setRef(String ref) {
			this.ref = ref;
		}

		public String getPaymentType() {
			return paymentType;
		}

		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}

		public Double getAmount() {
			return amount;
		}

		public void setAmount(Double amount) {
			this.amount = amount;
		}

		public Double getTax() {
			return tax;
		}

		public void setTax(Double tax) {
			this.tax = tax;
		}

		public Double getPaymentTotal() {
			return paymentTotal;
		}

		public void setPaymentTotal(Double paymentTotal) {
			this.paymentTotal = paymentTotal;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "OrderMaster [id=" + id + ", productId=" + productId + ", quantity=" + quantity + ", pricePerUnit="
					+ pricePerUnit + ", total=" + total + ", orderId=" + orderId + ", customerId=" + customerId
					+ ", storeId=" + storeId + ", date=" + date + ", grandTotal=" + grandTotal + ", deliveryType="
					+ deliveryType + ", expectedDelivery=" + expectedDelivery + ", deliveryCharge=" + deliveryCharge
					+ ", ref=" + ref + ", paymentType=" + paymentType + ", amount=" + amount + ", tax=" + tax
					+ ", paymentTotal=" + paymentTotal + ", status=" + status + "]";
		}
	
	    
	    
	
}
