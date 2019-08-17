package com.diviso.graeshoppe.service;

import java.time.Instant;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;

import com.diviso.graeshoppe.client.customer.domain.Customer;
import com.diviso.graeshoppe.client.order.model.Address;
import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.client.order.model.OrderLine;
import com.diviso.graeshoppe.client.product.model.AuxilaryLineItem;
import com.diviso.graeshoppe.client.product.model.Category;
import com.diviso.graeshoppe.client.product.model.Product;
import com.diviso.graeshoppe.client.product.model.StockCurrent;
import com.diviso.graeshoppe.client.store.domain.DeliveryInfo;
import com.diviso.graeshoppe.client.store.domain.Review;
import com.diviso.graeshoppe.client.store.domain.Store;
import com.diviso.graeshoppe.client.store.domain.StoreAddress;
import com.diviso.graeshoppe.client.store.domain.StoreSettings;
import com.diviso.graeshoppe.client.store.domain.StoreType;
import com.diviso.graeshoppe.client.store.domain.Type;
import com.diviso.graeshoppe.client.store.domain.UserRating;

import io.searchbox.core.search.aggregation.TermsAggregation.Entry;

public interface QueryService {

	public Page<Product> findProductByCategoryId(Long categoryId, String userId, Pageable pageable);

	public Page<Customer> findAllCustomersWithoutSearch(Pageable pageable);

	public Page<Product> findAllProductBySearchTerm(String searchTerm, Pageable pageable);

	public Page<StockCurrent> findStockCurrentByProductId(Long productId, Pageable pageable);

	public Page<StockCurrent> findStockCurrentByProductName(String name, String storeId, Pageable pageable);

	public Page<Review> findAllReviews(Pageable pageable);

	public Page<UserRating> findAllUserRatings(Pageable pageable);

	public Page<Store> findAllStores(Pageable pageable);

	public Page<Product> findAllProductsByStoreId(String storeId);

	public Store findStoreByRegNo(String regNo);

	public Page<Review> findReviewByStoreId(String userName);

	public Page<StockCurrent> findStockCurrentByStoreId(String storeId);

	public Page<UserRating> findUserRatingByRegNo(String regNo);

	public List<Entry> findCategoryAndCount(Pageable pageable);

	public Customer findCustomerByReference(String reference);

	public Page<Category> findCategoryByIDPcode(String iDPcode, Pageable pageable);

	public UserRating findRatingByStoreIdAndCustomerName(String storeId, String name);

	public Review findReviewByStoreIdAndCustomerName(String storeId, String name);

	public Page<Product> findAllProductByName(String name);

	public List<Entry> findRatingCount(Pageable pageable);

	public Page<StockCurrent> findAllStockCurrentByProductNameStoreId(String productName, String storeId);

	public Page<Address> findByCustomerId(String customerId, Pageable pageable);

	public Order findById(Long id);

	public Page<Store> findStoreByDeliveryType(String deliveryType);

	public Page<Product> findProductByStoreIdAndCategoryName(String userId, String categoryName, Pageable pageable);

	public Page<Store> findStoreByTypeName(String name, Pageable pageable);

	public List<StockCurrent> findStockCurrentByStoreIdAndCategoryId(String userId, Long categoryId, Pageable pageable);

	public Page<Order> findOrderByCustomerId(String customerId, Pageable pageable);

	public List<OrderLine> findOrderLinesByOrderId(Long orderId);

	public Page<Store> findStoreBySearchTerm(String searchTerm, Pageable pageable);

	public UserRating findRatingByStoreId(String storeId);

	public UserRating findRatingByName(String name);

	public Order findOrderByOrderId(String orderId);

	public Page<Type> findAllDeliveryTypesByStoreId(Long storeId, Pageable pageable);

	public DeliveryInfo findDeliveryInfoById(Long id);

	public Page<Store> findStoreByRating();

	public Page<StockCurrent> findAndSortProductByPrice(Double from, Double to);

	public Page<DeliveryInfo> findDeliveryInfoByStoreId(String storeId);

	//public OrderMaster findOrderMasterByOrderId(String orderId);

	public Product findProductById(Long id);

	public Page<Store> headerSearch(String searchTerm, Pageable pageable);

	/*
	 * Page<Store> findByLocationNear(Point point, Distance distance, Pageable
	 * pageable);
	 */
	public Page<Store> findStoreByLocationName(String locationName);

	public Page<Store> findAndSortStoreByMinAount(Pageable pageable);

	public Page<Store> findStoreByType(String name, Pageable pageable);

	public List<Entry> findStoreTypeAndCount(Pageable pageable);

	/**
	 * @param storeId
	 * @param pageable
	 * @return
	 */
	public Page<StoreType> findStoreTypeByStoreId(String storeId, Pageable pageable);

	/**
	 * @param name
	 * @return
	 */
	public Page<Product> findProductsByCategoryName(String name);

	/**
	 * @return
	 */
	List<Product> findAllProducts();

	/**
	 * @param productId
	 */
	public Page<AuxilaryLineItem> findAllAuxilariesByProductId(Long productId);

	/**
	 * @param categoryName
	 */
	public Page<StockCurrent> findStockCurrentByCategoryNameAndStoreId(String categoryName,String storeId);

	/**
	 * @param storeId
	 * @param pageable
	 * @return
	 */
//	List<Entry> findAllDeliveryCountByStoreId(String storeId, Pageable pageable);

	/**
	 * @param point
	 * @param distance
	 * @return
	 */
	//public Page<Store> findByLocationNear(Point point, Distance distance,Pageable pageable);

	
	public StoreSettings getStoreSettings(String IDPCode);

	public StoreAddress getStoreAddress(String iDPCode);

	Long findOrderCountByCustomerId(String customerId );

	/**
	 * @param storeId 
	 * @param pageable
	 * @return
	 */
	public List<Entry> findCategoryAndCountByStoreId(String storeId, Pageable pageable);

	/**
	 * @param statusName
	 */
	public Page<Order> findOrderByStatusName(String statusName);

	/**
	 * @param from
	 * @param to
	 * @return
	 */
	public Page<Order> findOrderByDatebetweenAndStoreId(Instant from, Instant to,String storeId);

	

	/**
	 * @param iDPcode
	 * @param pageable
	 * @return
	 */
	//public Page<Product> findNotAuxilaryProducts(String iDPcode, Pageable pageable);

	/**
	 * @param categoryName
	 * @param storeId
	 * @return
	 */

}
