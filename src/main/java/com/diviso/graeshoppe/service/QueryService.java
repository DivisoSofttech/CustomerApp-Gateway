package com.diviso.graeshoppe.service;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.client.customer.domain.Customer;
import com.diviso.graeshoppe.client.product.model.Category;
import com.diviso.graeshoppe.client.product.model.Product;
import com.diviso.graeshoppe.client.product.model.StockCurrent;
import com.diviso.graeshoppe.client.product.model.StockDiary;
import com.diviso.graeshoppe.client.product.model.StockLine;
import com.diviso.graeshoppe.client.sale.domain.Sale;
import com.diviso.graeshoppe.client.sale.domain.TicketLine;
import com.diviso.graeshoppe.client.store.domain.DeliveryInfo;
import com.diviso.graeshoppe.client.store.domain.Review;
import com.diviso.graeshoppe.client.store.domain.Store;
import com.diviso.graeshoppe.client.store.domain.Type;
import com.diviso.graeshoppe.client.store.domain.UserRating;
import com.diviso.graeshoppe.client.order.model.*;

import io.searchbox.core.search.aggregation.TermsAggregation.Entry;

public interface QueryService {
	public Page<Category> findAllCategories(Pageable pageable);

	public Page<Product> findProductByCategoryId(Long categoryId, String userId, Pageable pageable);

	public Page<Customer> findAllCustomersWithoutSearch(Pageable pageable);

	/**
	 * @param pageable
	 * @return
	 */
	public Page<Product> findAllProduct(Pageable pageable);

	public Page<StockLine> findAllStockLines(Pageable pageable);

	public Page<StockCurrent> findAllStockCurrents(Pageable pageable);

	public Page<Product> findAllProductBySearchTerm(String searchTerm, Pageable pageable);

	public Page<StockCurrent> findStockCurrentByProductId(Long productId, Pageable pageable);

	public Page<StockCurrent> findStockCurrentByProductName(String name, Pageable pageable);

	public Page<Product> findAllProducts(Pageable pageable);

	public Page<Review> findAllReviews(Pageable pageable);

	public Page<UserRating> findAllUserRatings(Pageable pageable);

	/**
	 * @param pageable
	 */
	public Page<Store> findAllStores(Pageable pageable);

	/**
	 * @param storeId
	 */
	// public Page<Category> findAllCategoriesByStoreId(Long storeId);
	/**
	 * @param storeId
	 */
	public Page<Product> findAllProductsByStoreId(String storeId);

	/**
	 * @param regNo
	 * @return
	 */
	public Store findStoreByRegNo(String regNo);

	/**
	 * @param storeId
	 */
	public Page<Review> findReviewByStoreId(String userName);

	/**
	 * @param storeId
	 */
	public Page<StockCurrent> findStockCurrentByStoreId(String storeId);

	/**
	 * @param regNo
	 * @return
	 */
	public Page<UserRating> findUserRatingByRegNo(String regNo);

	public List<Entry> findCategoryAndCount(Pageable pageable);

	public Customer findCustomerByReference(String reference);

	public Page<Category> findCategoryByUserId(String userId, Pageable pageable);

	/**
	 * @return
	 */
	public UserRating findRatingByStoreIdAndCustomerName(String storeId, String name);

	/**
	 * @param storeId
	 * @param name
	 * @return
	 */
	public Review findReviewByStoreIdAndCustomerName(String storeId, String name);

	/**
	 * @return
	 */
	public Page<Product> findAllProductByName(String name);

	/*
	 * public Page<Product> findAllProductByProductNameStoreId(String
	 * productName, String storeId);
	 */
	/**
	 * @param pageable
	 */
	public List<Entry> findRatingCount(Pageable pageable);

	public Page<StockCurrent> findAllStockCurrentByProductNameStoreId(String productName, String storeId);

	public Page<OrderAddress> findByCustomerId(String customerId, Pageable pageable);

	public Order findById(Long id);

	/**
	 * @param deliveryType
	 */
	public Page<Store> findStoreByType(String deliveryType);

	public Set<Category> findCategoryByStoreId(String userId, Pageable pageable);

	public Page<Product> findProductByStoreIdAndCategoryName(String userId, Long categoryId, Pageable pageable);

	public Page<Store> findStoreByTypeName(String name, Pageable pageable);

	/**
	 * @param userId
	 * @param categoryId
	 * @param pageable
	 * @return
	 */
	public List<StockCurrent> findStockCurrentByStoreIdAndCategoryId(String userId, Long categoryId, Pageable pageable);

	public Page<Order> findOrderByCustomerId(String customerId, Pageable pageable);

	public List<OrderLine> findOrderLinesByOrderId(Long orderId);

	public Page<Store> findStoreBySearchTerm(String searchTerm, Pageable pageable);

	public UserRating findRatingByStoreId(String storeId);

	/**
	 * @param name
	 * @return
	 */
	UserRating findRatingByName(String name);

	Order findOrderByOrderId(String orderId);

	public Page<Type> findAllDeliveryTypesByStoreId(Long storeId, Pageable pageable);

	/**
	 * @param id
	 * @return
	 */
	public OrderDeliveryInfo findDeliveryInfoById(Long id);

	/**
	 * @param rating
	 * @return
	 */
	public Page<Store> findStoreByRating();

	/**
	 * @param from
	 * @param to
	 */
	public Page<StockCurrent> findAndSortProductByPrice(Double from, Double to);

	/**
	 * @param storeId
	 * @return
	 */
	public Page<DeliveryInfo> findDeliveryInfoByStoreId(String storeId);

	public OrderMaster findOrderMasterByOrderId(String orderId);

	/**
	 * @param id
	 * @return
	 */
	Product findProductById(Long id);

	/**
	 * @param searchTerm
	 * @param pageable
	 * @return
	 */
	public Page<Store> headerSearch(String searchTerm, Pageable pageable);

	/**
	 * @param point
	 * @param distance
	 * @return
	 */
	List<Store> findByNearestLocation(Point point, Distance distance);

	

}
