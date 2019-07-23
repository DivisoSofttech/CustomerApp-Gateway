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
	

	private String soldBy;
	
	private String methodOfOrder;
	
	private String orderId;
	
	private Instant orderDate;
	
	private String customerName;

    private Double deliveryCharge;
    
    private Double grandTotal;
	
	//.......................

    private Long pincode;

    private String houseNoOrBuildingName;

    private String roadNameAreaOrStreet;

    private String city;

    private String state;

    private String landmark;

    private String name;

    private Long phone;

    private Long alternatePhone;

    private String addressType;
    
    private List<ProductLine> productLine;
    

	public List<ProductLine> getProductLine() {
		return productLine;
	}

	public void setProductLine(List<ProductLine> productLine) {
		this.productLine = productLine;
	}

	public String getSoldBy() {
		return soldBy;
	}

	public void setSoldBy(String soldBy) {
		this.soldBy = soldBy;
	}

	public String getMethodOfOrder() {
		return methodOfOrder;
	}

	public void setMethodOfOrder(String methodOfOrder) {
		this.methodOfOrder = methodOfOrder;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public Instant getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Instant orderDate) {
		this.orderDate = orderDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public String getHouseNoOrBuildingName() {
		return houseNoOrBuildingName;
	}

	public void setHouseNoOrBuildingName(String houseNoOrBuildingName) {
		this.houseNoOrBuildingName = houseNoOrBuildingName;
	}

	public String getRoadNameAreaOrStreet() {
		return roadNameAreaOrStreet;
	}

	public void setRoadNameAreaOrStreet(String roadNameAreaOrStreet) {
		this.roadNameAreaOrStreet = roadNameAreaOrStreet;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Long getAlternatePhone() {
		return alternatePhone;
	}

	public void setAlternatePhone(Long alternatePhone) {
		this.alternatePhone = alternatePhone;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	

	public Double getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(Double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	public Double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}

	@Override
	public String toString() {
		return "OrderMaster [soldBy=" + soldBy + ", methodOfOrder=" + methodOfOrder + ", orderId=" + orderId
				+ ", orderDate=" + orderDate + ", customerName=" + customerName + ", deliveryCharge=" + deliveryCharge
				+ ", grandTotal=" + grandTotal + ", pincode=" + pincode + ", houseNoOrBuildingName="
				+ houseNoOrBuildingName + ", roadNameAreaOrStreet=" + roadNameAreaOrStreet + ", city=" + city
				+ ", state=" + state + ", landmark=" + landmark + ", name=" + name + ", phone=" + phone
				+ ", alternatePhone=" + alternatePhone + ", addressType=" + addressType + ", productLine=" + productLine
				+ "]";
	}

	
    
    
    
    
    
    
}
