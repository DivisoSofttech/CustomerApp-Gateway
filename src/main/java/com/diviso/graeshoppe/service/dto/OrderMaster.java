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
package com.diviso.graeshoppe.service.dto;

import java.util.List;

import com.diviso.graeshoppe.client.order.model.DeliveryInfoDTO;
import com.diviso.graeshoppe.client.order.model.OrderDTO;
import com.diviso.graeshoppe.client.order.model.OrderLineDTO;
import com.diviso.graeshoppe.client.order.model.StatusDTO;

/**
 * TODO Provide a detailed description here 
 * @author MayaSanjeev
 * mayabytatech, maya.k.k@lxisoft.com
 */
public class OrderMaster {

	private OrderDTO orderDTO;
	
	private List<OrderLineDTO> orderLineList;
	
	private DeliveryInfoDTO deliveryInfoDTO;
	
	private StatusDTO status;

	//address
	
	public OrderDTO getOrderDTO() {
		return orderDTO;
	}

	public void setOrderDTO(OrderDTO orderDTO) {
		this.orderDTO = orderDTO;
	}

	public List<OrderLineDTO> getOrderLineList() {
		return orderLineList;
	}

	public void setOrderLineList(List<OrderLineDTO> orderLineList) {
		this.orderLineList = orderLineList;
	}

	public DeliveryInfoDTO getDeliveryInfoDTO() {
		return deliveryInfoDTO;
	}

	public void setDeliveryInfoDTO(DeliveryInfoDTO deliveryInfoDTO) {
		this.deliveryInfoDTO = deliveryInfoDTO;
	}

	public StatusDTO getStatus() {
		return status;
	}

	public void setStatus(StatusDTO status) {
		this.status = status;
	}
	

	

	
}
