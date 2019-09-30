package com.diviso.graeshoppe.service;

import java.time.Instant;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.client.customer.model.Customer;
import com.diviso.graeshoppe.client.customer.model.FavouriteProduct;
import com.diviso.graeshoppe.client.customer.model.FavouriteStore;
import com.diviso.graeshoppe.client.order.model.Address;
import com.diviso.graeshoppe.client.order.model.Notification;
import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.client.order.model.OrderLine;

public interface QueryService {


	public Page<Customer> findAllCustomersWithoutSearch(Pageable pageable);
	
	public Customer findCustomerByReference(String reference);

	public Page<Address> findByCustomerId(String customerId, Pageable pageable);

	public Order findById(Long id);
	
	public Page<Order> findOrderByCustomerId(String customerId, Pageable pageable);

	public List<OrderLine> findOrderLinesByOrderId(Long orderId);
	
	public Order findOrderByOrderId(String orderId);
	
	Long findOrderCountByCustomerId(String customerId);

	public Page<Order> findOrderByStatusName(String statusName);

	public Page<Order> findOrderByDatebetweenAndStoreId(Instant from, Instant to, String storeId);

	Page<FavouriteProduct> findFavouriteProductsByCustomerReference(String reference, Pageable pageable);

	Page<FavouriteStore> findFavouriteStoresByCustomerReference(String reference, Pageable pageable);

	Page<Notification> findNotificationByReceiverId(String receiverId, Pageable pageable);
	
}
