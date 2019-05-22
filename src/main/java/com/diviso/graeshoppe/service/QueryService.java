package com.diviso.graeshoppe.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.client.customer.domain.Customer;
import com.diviso.graeshoppe.client.product.model.Category;
import com.diviso.graeshoppe.client.product.model.Product;
import com.diviso.graeshoppe.client.product.model.StockCurrent;
import com.diviso.graeshoppe.client.product.model.StockDiary;
import com.diviso.graeshoppe.client.product.model.StockLine;
import com.diviso.graeshoppe.client.sale.domain.Sale;
import com.diviso.graeshoppe.client.sale.domain.TicketLine;
import com.diviso.graeshoppe.client.store.domain.Review;
import com.diviso.graeshoppe.client.store.domain.Store;
import com.diviso.graeshoppe.client.store.domain.UserRating;

import io.searchbox.core.search.aggregation.TermsAggregation.Entry;

public interface QueryService {
public Page<Category> findAllCategories(Pageable pageable);
public Page<Product> findProductByCategoryId(Long categoryId,String userId,Pageable pageable);
public Page<Customer> findAllCustomers(String searchTerm, Pageable pageable);
public List<String> findAllUom(Pageable pageable);
public Page<Customer> findAllCustomersWithoutSearch(Pageable pageable);
/**
 * @param pageable
 * @return
 */
public Page<Product> findAllProduct(Pageable pageable);
public Page<StockLine> findAllStockLines(Pageable pageable);
/**
 * @return
 */
public Page<Sale> findSales(Pageable pageable);
public List<TicketLine> findTicketLinesBySaleId(Long saleId);
public Page<StockCurrent> findAllStockCurrents(Pageable pageable);
public Page<StockDiary> findAllStockDiaries(Pageable pageable);
public Page<Product> findAllProductBySearchTerm(String searchTerm, Pageable pageable);
public Page<StockCurrent> findStockCurrentByProductId(Long productId, Pageable pageable);
public Page<StockDiary> findStockDiaryByProductId(Long productId, Pageable pageable);
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
//public Page<Category> findAllCategoriesByStoreId(Long storeId);
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
public List<Entry>  findCategoryAndCount(Pageable pageable);
public Page<Customer> findCustomerByName(String name, Pageable pageable);
public Page<Category> findCategoryByUserId(String userId, Pageable pageable);

}
