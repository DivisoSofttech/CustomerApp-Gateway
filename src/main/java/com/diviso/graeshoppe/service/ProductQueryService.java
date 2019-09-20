package com.diviso.graeshoppe.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.client.product.model.AuxilaryLineItem;
import com.diviso.graeshoppe.client.product.model.ComboLineItem;
import com.diviso.graeshoppe.client.product.model.Discount;
import com.diviso.graeshoppe.client.product.model.Product;
import com.diviso.graeshoppe.client.product.model.StockCurrent;

import io.searchbox.core.search.aggregation.TermsAggregation.Entry;

public interface ProductQueryService {

	
	public Page<Product> findProductByCategoryId(Long categoryId, String userId, Pageable pageable);

	public Page<Product> findAllProductBySearchTerm(String searchTerm, Pageable pageable);

	public Page<StockCurrent> findStockCurrentByProductId(Long productId, Pageable pageable);

	public Page<StockCurrent> findStockCurrentByProductName(String name, String storeId, Pageable pageable);

	public Page<Product> findAllProductsByStoreId(String storeId);

	public Page<StockCurrent> findStockCurrentByStoreId(String storeId);

	public List<Entry> findCategoryAndCount(Pageable pageable);
	
	public Page<Product> findAllProductByName(String name);

	public Page<StockCurrent> findAllStockCurrentByProductNameStoreId(String productName, String storeId);
	
	public Page<Product> findProductByStoreIdAndCategoryName(String userId, String categoryName, Pageable pageable);

	public List<StockCurrent> findStockCurrentByStoreIdAndCategoryId(String userId, Long categoryId, Pageable pageable);

	public Page<StockCurrent> findAndSortProductByPrice(Double from, Double to);

	public Product findProductById(Long id);
	
	public Page<Product> findProductsByCategoryName(String name);

	public List<Product> findAllProducts();
	
	public Page<AuxilaryLineItem> findAllAuxilariesByProductId(Long productId);

	public Page<StockCurrent> findStockCurrentByCategoryNameAndStoreId(String categoryName,String storeId);

	public List<Entry> findCategoryAndCountByStoreId(String storeId, Pageable pageable);

	public Page<ComboLineItem> findAllCombosByProductId(Long productId);

	public Discount findDiscountByProductId(Long productId);


}
