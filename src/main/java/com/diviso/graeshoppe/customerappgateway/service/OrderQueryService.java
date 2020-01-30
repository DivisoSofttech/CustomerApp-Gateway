package com.diviso.graeshoppe.customerappgateway.service;

import java.time.*;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Address;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.AuxilaryOrderLine;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Notification;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Order;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.OrderLine;

public interface OrderQueryService {
	Order findById(Long id);

	List<OrderLine> findOrderLinesByOrderId(Long orderId);

	Order findOrderByOrderId(String orderId);

	Page<Order> findOrderByStatusName(String statusName, Pageable pageable);

	Page<Order> findOrderByDatebetweenAndStoreId(Instant from, Instant to, String storeId, Pageable pageable);

	Page<OrderLine> findAllOrderLinesByOrderId(Long orderId, Pageable pageable);

	Long findNotificationCountByReceiverIdAndStatusName(String receiverId, String status);

	Page<AuxilaryOrderLine> findAuxilaryOrderLineByOrderLineId(Long orderLineId, Pageable pageable);

	Page<Address> findAllSavedAddresses(String customerId, Pageable pageable);

	Page<Notification> findNotificationByCustomerId(String receiverId, LocalDate date, Pageable pageable);

	Page<Order> findOrdersByCustomerId(String customerId, LocalDate date, Pageable pageable);

	
	
}
