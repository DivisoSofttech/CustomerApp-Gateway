package com.diviso.graeshoppe.web.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.customer.api.ContactResourceApi;
import com.diviso.graeshoppe.client.customer.api.CustomerResourceApi;
import com.diviso.graeshoppe.client.customer.domain.Customer;
import com.diviso.graeshoppe.client.customer.model.ContactDTO;
import com.diviso.graeshoppe.client.customer.model.CustomerDTO;
import com.diviso.graeshoppe.client.product.api.CategoryResourceApi;
import com.diviso.graeshoppe.client.product.api.ProductResourceApi;
import com.diviso.graeshoppe.client.product.api.StockCurrentResourceApi;
import com.diviso.graeshoppe.client.product.api.StockDiaryResourceApi;
import com.diviso.graeshoppe.client.product.api.UomResourceApi;
import com.diviso.graeshoppe.client.product.model.Category;
import com.diviso.graeshoppe.client.product.model.CategoryDTO;
import com.diviso.graeshoppe.client.product.model.Product;
import com.diviso.graeshoppe.client.product.model.ProductDTO;
import com.diviso.graeshoppe.client.product.model.StockCurrent;
import com.diviso.graeshoppe.client.product.model.StockCurrentDTO;
import com.diviso.graeshoppe.client.product.model.StockDiary;
import com.diviso.graeshoppe.client.product.model.StockDiaryDTO;
import com.diviso.graeshoppe.client.product.model.StockLine;
import com.diviso.graeshoppe.client.product.model.UomDTO;
import com.diviso.graeshoppe.client.sale.api.SaleResourceApi;
import com.diviso.graeshoppe.client.sale.api.TicketLineResourceApi;
import com.diviso.graeshoppe.client.sale.domain.Sale;
import com.diviso.graeshoppe.client.sale.domain.TicketLine;
import com.diviso.graeshoppe.client.sale.model.SaleDTO;
import com.diviso.graeshoppe.client.sale.model.TicketLineDTO;
import com.diviso.graeshoppe.client.store.api.ReviewResourceApi;
import com.diviso.graeshoppe.client.store.api.UserRatingResourceApi;
import com.diviso.graeshoppe.client.store.domain.RatingReview;
import com.diviso.graeshoppe.client.store.domain.Review;
import com.diviso.graeshoppe.client.store.domain.Store;
import com.diviso.graeshoppe.client.store.domain.UserRating;
import com.diviso.graeshoppe.service.QueryService;

import io.searchbox.core.search.aggregation.TermsAggregation.Entry;

@RestController
@RequestMapping("/api/query")
public class QueryResource {

	@Autowired
	QueryService queryService;

	@Autowired
	SaleResourceApi saleResourceApi;

	@Autowired
	UomResourceApi uomResourceApi;

	@Autowired
	CategoryResourceApi categoryResourceApi;

	@Autowired
	CustomerResourceApi customerResourceApi;

	@Autowired
	private ProductResourceApi productResourceApi;

	@Autowired
	private TicketLineResourceApi ticketLineResourceApi;

	@Autowired
	private ContactResourceApi contactResourceApi;

	@Autowired
	private StockCurrentResourceApi stockCurrentResourceApi;

	@Autowired
	private StockDiaryResourceApi stockDiaryResourceApi;
	
	@Autowired
	UserRatingResourceApi userRatingResourceApi;
	@Autowired
	ReviewResourceApi reviewResourceApi;
	
	@GetMapping("/findProductByCategoryIdAndUserId/{categoryId}/{userId}")
	public Page<Product> findProductByCategoryIdAndUserId(@PathVariable Long categoryId, @PathVariable String userId,
			Pageable pageable) {
		return queryService.findProductByCategoryId(categoryId, userId, pageable);
	}

	@GetMapping("/findCategoryByUserId/{userId}")
	public Page<Category> findCategoryIdByUserId(@PathVariable String userId, Pageable pageable) {
		return queryService.findCategoryByUserId(userId, pageable);
	}

	@GetMapping("/customers/findByName/{name}")
	public Page<Customer> findCustomerByName(@PathVariable String name, Pageable pageable) {
		return queryService.findCustomerByName(name, pageable);
	}

	@GetMapping("/findStockCurrentByProductId/{productId}")
	public Page<StockCurrent> findStockCurrentByProductId(@PathVariable Long productId, Pageable pageable) {
		return queryService.findStockCurrentByProductId(productId, pageable);
	}

	@GetMapping("/findStockCurrentByProductName/{name}")
	public Page<StockCurrent> findStockCurrentByProductName(@PathVariable String name, Pageable pageable) {
		return queryService.findStockCurrentByProductName(name, pageable);
	}

	@GetMapping("/findStockDiaryByProductId/{productId}")
	public Page<StockDiary> findStockDiaryByProductId(@PathVariable Long productId, Pageable pageable) {
		return queryService.findStockDiaryByProductId(productId, pageable);
	}

	@GetMapping("/findProductBySearchTerm/{searchTerm}")
	public Page<Product> findAllProductBySearchTerm(@PathVariable String searchTerm, Pageable pageable) {
		return queryService.findAllProductBySearchTerm(searchTerm, pageable);
	}

	@GetMapping("/findAllCustomer/{searchTerm}")
	public Page<Customer> findAllCustomers(@PathVariable String searchTerm, Pageable pageable) {
		return queryService.findAllCustomers(searchTerm, pageable);
	}

	@GetMapping("/findAllCustomers")
	public Page<Customer> findAllCustomersWithoutSearch(Pageable pageable) {
		return queryService.findAllCustomersWithoutSearch(pageable);
	}

	@GetMapping("/findAllProducts")
	public Page<Product> findAllProducts(Pageable pageable) {
		return queryService.findAllProducts(pageable);
	}

	@GetMapping("/customers/{id}")
	public ResponseEntity<CustomerDTO> findCustomerById(@PathVariable Long id) {
		return this.customerResourceApi.getCustomerUsingGET(id);
	}

	@GetMapping("contacts/{id}")
	public ResponseEntity<ContactDTO> findContactById(@PathVariable Long id) {
		return this.contactResourceApi.getContactUsingGET(id);
	}

	@GetMapping("/findAllUom")
	public ResponseEntity<List<UomDTO>> findAllUom(@RequestParam(required = false) Integer page,
			@RequestParam(required = false) Integer size,
			@RequestParam(value = "sort", required = false) ArrayList<String> sort) {

		return uomResourceApi.getAllUomsUsingGET(page, size, sort);
	}

	@GetMapping("/findAllCateogories")
	public ResponseEntity<List<CategoryDTO>> findAllCategories(@RequestParam(required = false) Integer page,
			@RequestParam(required = false) Integer size,
			@RequestParam(value = "sort", required = false) ArrayList<String> sort) {
		return categoryResourceApi.getAllCategoriesUsingGET(page, size, sort);

	}

	@GetMapping("/findAllCategoriesWithOutImage")
	public ResponseEntity<List<CategoryDTO>> findAllCategoriesWithOutImage(@RequestParam(required = false) Integer page,
			@RequestParam(required = false) Integer size,
			@RequestParam(value = "sort", required = false) ArrayList<String> sort) {
		return ResponseEntity.ok()
				.body(categoryResourceApi.getAllCategoriesUsingGET(page, size, sort).getBody().stream().map(c -> {
					c.setImage(null);
					return c;
				}).collect(Collectors.toList()));
	}

	@GetMapping("/products")
	public ResponseEntity<List<ProductDTO>> findAllProduct(Pageable page) {
		return productResourceApi.listToDtoUsingPOST(queryService.findAllProduct(page).getContent());
	}

	@GetMapping("/ticket-lines")
	public ResponseEntity<List<TicketLineDTO>> findAllTicketlines(Integer page, Integer size, ArrayList<String> sort) {
		return ticketLineResourceApi.getAllTicketLinesUsingGET(page, size, sort);
	}

	@GetMapping("/ticket-lines/{saleId}")
	public ResponseEntity<List<TicketLine>> findAllTicketLinesBySaleId(@PathVariable Long saleId) {
		return ResponseEntity.ok().body(queryService.findTicketLinesBySaleId(saleId));
	}

	@GetMapping("/ticket-lines/{id}")
	public ResponseEntity<TicketLineDTO> findOneTicketLines(@PathVariable Long id) {
		return ticketLineResourceApi.getTicketLineUsingGET(id);
	}

	@GetMapping("/products/{id}")
	public ResponseEntity<ProductDTO> findProduct(@PathVariable Long id) {
		return this.productResourceApi.getProductUsingGET(id);
	}

	@GetMapping("/products/export")
	public ResponseEntity<byte[]> exportProducts() {
		return this.productResourceApi.getPdfAllProdutsWithPriceUsingGET();
	}

	@GetMapping("/customers/export")
	public ResponseEntity<byte[]> exportCustomers() {
		return this.customerResourceApi.getPdfAllCustomersUsingGET();
	}

	@GetMapping("/sales/{id}")
	public ResponseEntity<SaleDTO> findSaleById(@PathVariable Long id) {
		return this.saleResourceApi.getSaleUsingGET(id);
	}

	@GetMapping("/sales")
	public Page<Sale> findSales(Pageable pageable) {
		return queryService.findSales(pageable);
	}

	@GetMapping("/stocklines")
	public ResponseEntity<List<StockLine>> findAllStockLines(Pageable pageable) {
		return ResponseEntity.ok().body(this.queryService.findAllStockLines(pageable).getContent());
	}

	@GetMapping("/stock-currents")
	public ResponseEntity<List<StockCurrent>> getAllStockCurrents(Pageable pageable) {
		return ResponseEntity.ok().body(queryService.findAllStockCurrents(pageable).getContent());
	}

	@GetMapping("/stock-currents/{id}")
	public ResponseEntity<StockCurrentDTO> findOneStockCurrent(@PathVariable Long id) {
		return this.stockCurrentResourceApi.getStockCurrentUsingGET(id);
	}

	@GetMapping("/stock-diaries")
	public ResponseEntity<List<StockDiary>> findAllStockDiaries(Pageable pageable) {
		return ResponseEntity.ok().body(queryService.findAllStockDiaries(pageable).getContent());
	}

	@GetMapping("/stock-diaries/{id}")
	public ResponseEntity<StockDiaryDTO> findOneStockDiary(@PathVariable Long id) {
		return this.stockDiaryResourceApi.getStockDiaryUsingGET(id);
	}

	@GetMapping("/stock-current/{searchTerm}")
	public ResponseEntity<List<StockCurrentDTO>> searchStockCurrents(@PathVariable String searchTerm, Integer page,
			Integer size, ArrayList<String> sort) {
		return this.stockCurrentResourceApi.searchStockCurrentsUsingGET(searchTerm, page, size, sort);
	}

	@GetMapping("/stock-diary/{searchTerm}")
	public ResponseEntity<List<StockDiaryDTO>> searchStockDiaries(@PathVariable String searchTerm, Integer page,
			Integer size, ArrayList<String> sort) {
		return this.stockDiaryResourceApi.searchStockDiariesUsingGET(searchTerm, page, size, sort);
	}

	@GetMapping("/reviews")
	public ResponseEntity<List<Review>> findAllReviews(Pageable pageable) {
		return ResponseEntity.ok().body(queryService.findAllReviews(pageable).getContent());
	}

	@GetMapping("/user-ratings")
	public ResponseEntity<List<UserRating>> findAllUserRatings(Pageable pageable) {
		return ResponseEntity.ok().body(queryService.findAllUserRatings(pageable).getContent());
	}

	@GetMapping("/user-rating/{regNo}")
	public ResponseEntity<List<UserRating>> findUserRatingByRegNo(@PathVariable String regNo) {
		return ResponseEntity.ok().body(queryService.findUserRatingByRegNo(regNo).getContent());
	}

	@GetMapping("/stores")
	public ResponseEntity<List<Store>> findAllStores(Pageable pageable) {
		return ResponseEntity.ok().body(queryService.findAllStores(pageable).getContent());
	}

	/*
	 * @GetMapping("/findallcategories") public void
	 * findAllCategoriesBStoreId(@PathVariable Long storeId){
	 * queryService.findAllCategoriesByStoreId(storeId); }
	 */
	@GetMapping("/findproducts/{storeId}")
	public ResponseEntity<List<Product>> findAllProductByStoreId(@PathVariable String storeId) {
		return ResponseEntity.ok().body(queryService.findAllProductsByStoreId(storeId).getContent());
	}

	@GetMapping("/store/{regNo}")
	public ResponseEntity<Store> findStoreByRegisterNumber(@PathVariable String regNo) {
		return ResponseEntity.ok().body(queryService.findStoreByRegNo(regNo));
	}

	@GetMapping("/review/{userName}")
	public ResponseEntity<List<Review>> findReviewsByStoreId(@PathVariable String userName) {
		return ResponseEntity.ok().body(queryService.findReviewByStoreId(userName).getContent());
	}

	@GetMapping("/stockcurrent/{storeId}")
	public ResponseEntity<List<StockCurrent>> findStockCurrentByStoreId(@PathVariable String storeId) {

		return ResponseEntity.ok().body(queryService.findStockCurrentByStoreId(storeId).getContent());
	}

	@GetMapping("/findCategoryAndCount")
	public List<Entry> findCategoryAndCount(Pageable pageable) {
		return queryService.findCategoryAndCount(pageable);
	}

	@GetMapping("/rating/{storeId}/{name}")
	public UserRating findRatingByStoreIdAndCustomerName(@PathVariable String storeId,
			@PathVariable String name){
		return queryService.findRatingByStoreIdAndCustomerName(storeId, name);
	}
	
	@GetMapping("/review/{storeId}/{name}")
	public Review findReviewByStoreIdAndCustomerName(@PathVariable String storeId,
			@PathVariable String name){
		return queryService.findReviewByStoreIdAndCustomerName(storeId, name);
	}
	
	@GetMapping("/findRatingReview/{storeId}/{name}")
	public ResponseEntity<RatingReview> findRatingReviewByStoreidAndCustomerName(@PathVariable String storeId,
			@PathVariable String name) {

		UserRating rating = queryService.findRatingByStoreIdAndCustomerName(storeId, name);
		Review review = queryService.findReviewByStoreIdAndCustomerName(storeId, name);
		RatingReview ratingReview = new RatingReview();
		
		ratingReview.setRating(userRatingResourceApi.modelToDtoUsingPOST1(rating).getBody());
		ratingReview.setReview(reviewResourceApi.modelToDtoUsingPOST(review).getBody());
		return ResponseEntity.ok().body(ratingReview);

	}
	
}
