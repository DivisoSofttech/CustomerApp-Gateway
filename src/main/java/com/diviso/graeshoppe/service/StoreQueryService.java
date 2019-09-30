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
import com.diviso.graeshoppe.client.product.model.ComboLineItem;
import com.diviso.graeshoppe.client.product.model.Discount;
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

public interface StoreQueryService {


	public Page<Review> findAllReviews(Pageable pageable);

	public Page<UserRating> findAllUserRatings(Pageable pageable);

	public Page<Store> findAllStores(Pageable pageable);
	public Store findStoreById(Long id);

	public Store findStoreByRegNo(String regNo);

	public Page<UserRating> findUserRatingByRegNo(String regNo);


	public UserRating findRatingByStoreIdAndCustomerName(String storeId, String name);

	public Review findReviewByStoreIdAndCustomerName(String storeId, String name);

	public Page<Review> findReviewByStoreId(String storeId);

	public List<Entry> findRatingCount(Pageable pageable);

	public Page<Store> findStoreByDeliveryType(String deliveryType);

	public Page<Store> findStoreByTypeName(String name, Pageable pageable);

	public Page<Store> findStoreBySearchTerm(String searchTerm, Pageable pageable);

	public UserRating findRatingByStoreId(String storeId);

	public UserRating findRatingByName(String name);

	public Page<Type> findAllDeliveryTypesByStoreId(Long storeId, Pageable pageable);

	public DeliveryInfo findDeliveryInfoById(Long id);

	public Page<Store> findStoreByRating();

	public Page<DeliveryInfo> findDeliveryInfoByStoreId(String storeId);

	public Page<Store> headerSearch(String searchTerm, Pageable pageable);

	/*
	 * Page<Store> findByLocationNear(Point point, Distance distance, Pageable
	 * pageable);
	 */
	public Page<Store> findStoreByLocationName(String locationName);

	public Page<Store> findAndSortStoreByMinAount(Pageable pageable);

	public Page<Store> findStoreByType(String name, Pageable pageable);

	public List<Entry> findStoreTypeAndCount(Pageable pageable);

	public Page<StoreType> findStoreTypeByStoreId(String storeId, Pageable pageable);

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
	// public Page<Store> findByLocationNear(Point point, Distance distance,Pageable
	// pageable);

	public StoreSettings getStoreSettings(String IDPCode);

	public StoreAddress getStoreAddress(String iDPCode);

	public Long findReviewCountByStoreId(String storeId);
}
