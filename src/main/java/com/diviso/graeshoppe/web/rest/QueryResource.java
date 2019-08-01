package com.diviso.graeshoppe.web.rest;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
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
import com.diviso.graeshoppe.client.order.api.DeliveryInfoCommandResourceApi;
import com.diviso.graeshoppe.client.order.model.*;
import com.diviso.graeshoppe.client.product.api.CategoryResourceApi;
import com.diviso.graeshoppe.client.product.api.ProductResourceApi;
import com.diviso.graeshoppe.client.product.api.StockCurrentResourceApi;
import com.diviso.graeshoppe.client.product.api.UomResourceApi;
import com.diviso.graeshoppe.client.product.model.Category;
import com.diviso.graeshoppe.client.product.model.CategoryDTO;
import com.diviso.graeshoppe.client.product.model.Product;
import com.diviso.graeshoppe.client.product.model.ProductDTO;
import com.diviso.graeshoppe.client.product.model.StockCurrent;
import com.diviso.graeshoppe.client.product.model.StockCurrentDTO;
import com.diviso.graeshoppe.client.sale.api.SaleResourceApi;
import com.diviso.graeshoppe.client.sale.api.TicketLineResourceApi;

import com.diviso.graeshoppe.client.store.api.BannerResourceApi;
import com.diviso.graeshoppe.client.store.api.ReviewResourceApi;
import com.diviso.graeshoppe.client.store.api.StoreTypeResourceApi;
import com.diviso.graeshoppe.client.store.api.UserRatingResourceApi;
import com.diviso.graeshoppe.client.sale.domain.Sale;
import com.diviso.graeshoppe.client.sale.domain.TicketLine;
import com.diviso.graeshoppe.client.sale.model.SaleDTO;
import com.diviso.graeshoppe.client.sale.model.TicketLineDTO;
import com.diviso.graeshoppe.client.store.domain.DeliveryInfo;
import com.diviso.graeshoppe.client.store.domain.RatingReview;
import com.diviso.graeshoppe.client.store.domain.Banner;
import com.diviso.graeshoppe.client.store.domain.Review;
import com.diviso.graeshoppe.client.store.domain.Store;
import com.diviso.graeshoppe.client.store.domain.StoreType;
import com.diviso.graeshoppe.client.store.domain.Type;
import com.diviso.graeshoppe.client.store.domain.UserRating;
import com.diviso.graeshoppe.client.store.model.BannerDTO;
import com.diviso.graeshoppe.client.store.model.StoreTypeDTO;
import com.diviso.graeshoppe.service.QueryService;
import com.github.vanroy.springdata.jest.JestElasticsearchTemplate;
import com.github.vanroy.springdata.jest.mapper.JestResultsExtractor;
import com.google.gson.JsonObject;

import io.searchbox.client.JestClient;
import io.searchbox.core.SearchResult;
import io.searchbox.core.search.aggregation.TermsAggregation.Entry;

@RestController
@RequestMapping("/api/query")
public class QueryResource {

	private final Logger log = LoggerFactory.getLogger(QueryResource.class);
	@Autowired
	QueryService queryService;

	/*
	 * @Autowired UomResourceApi uomResourceApi;
	 */
	@Autowired
	CategoryResourceApi categoryResourceApi;

	@Autowired
	CustomerResourceApi customerResourceApi;

	@Autowired
	private ProductResourceApi productResourceApi;

	@Autowired
	private ContactResourceApi contactResourceApi;

	@Autowired
	private StockCurrentResourceApi stockCurrentResourceApi;

	/*
	 * @Autowired private StockDiaryResourceApi stockDiaryResourceApi;
	 */
	@Autowired
	UserRatingResourceApi userRatingResourceApi;
	@Autowired
	ReviewResourceApi reviewResourceApi;

	@Autowired
	BannerResourceApi BannerResourceApi;
	
	
	@Autowired
	private StoreTypeResourceApi storeTypeResourceApi;

	@GetMapping("/findProductByCategoryIdAndUserId/{categoryId}/{userId}")
	public Page<Product> findProductByCategoryIdAndUserId(@PathVariable Long categoryId, @PathVariable String userId,
			Pageable pageable) {
		return queryService.findProductByCategoryId(categoryId, userId, pageable);
	}

	@GetMapping("/findCategoryByUserId/{userId}")
	public Page<Category> findCategoryIdByUserId(@PathVariable String userId, Pageable pageable) {
		return queryService.findCategoryByUserId(userId, pageable);
	}

	@GetMapping("/customers/findByReference/{reference}")
	public ResponseEntity<CustomerDTO> findCustomerByReference(@PathVariable String reference) {
		return customerResourceApi.modelToDtoUsingPOST(queryService.findCustomerByReference(reference));
	}

	@GetMapping("/findStockCurrentByProductId/{productId}")
	public Page<StockCurrent> findStockCurrentByProductId(@PathVariable Long productId, Pageable pageable) {
		return queryService.findStockCurrentByProductId(productId, pageable);
	}

	@GetMapping("/findStockCurrentByProductName/{name}")
	public Page<StockCurrent> findStockCurrentByProductName(@PathVariable String name, Pageable pageable) {
		return queryService.findStockCurrentByProductName(name, pageable);
	}

	@GetMapping("/findProductBySearchTerm/{searchTerm}")
	public Page<Product> findAllProductBySearchTerm(@PathVariable String searchTerm, Pageable pageable) {
		return queryService.findAllProductBySearchTerm(searchTerm, pageable);
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

	@GetMapping("/products/{id}")
	public ResponseEntity<ProductDTO> findProduct(@PathVariable Long id) {
		return this.productResourceApi.getProductUsingGET(id);
	}

	/*
	 * @GetMapping("/stocklines") public ResponseEntity<List<StockLine>>
	 * findAllStockLines(Pageable pageable) { return
	 * ResponseEntity.ok().body(this.queryService.findAllStockLines(pageable).
	 * getContent()); }
	 */

	@GetMapping("/stock-currents")
	public ResponseEntity<Page<StockCurrent>> getAllStockCurrents(Pageable pageable) {
		return ResponseEntity.ok().body(queryService.findAllStockCurrents(pageable));
	}

	@GetMapping("/stock-currents/{id}")
	public ResponseEntity<StockCurrentDTO> findOneStockCurrent(@PathVariable Long id) {
		return this.stockCurrentResourceApi.getStockCurrentUsingGET(id);
	}

	/*
	 * @GetMapping("/stock-diaries/{id}") public ResponseEntity<StockDiaryDTO>
	 * findOneStockDiary(@PathVariable Long id) { return
	 * this.stockDiaryResourceApi.getStockDiaryUsingGET(id); }
	 */

	@GetMapping("/stock-current/{searchTerm}")
	public ResponseEntity<List<StockCurrentDTO>> searchStockCurrents(@PathVariable String searchTerm, Integer page,
			Integer size, ArrayList<String> sort) {
		return this.stockCurrentResourceApi.searchStockCurrentsUsingGET(searchTerm, page, size, sort);
	}

	/*
	 * @GetMapping("/stock-diary/{searchTerm}") public
	 * ResponseEntity<List<StockDiaryDTO>> searchStockDiaries(@PathVariable String
	 * searchTerm, Integer page, Integer size, ArrayList<String> sort) { return
	 * this.stockDiaryResourceApi.searchStockDiariesUsingGET(searchTerm, page, size,
	 * sort); }
	 */
	@GetMapping("/reviews")
	public ResponseEntity<Page<Review>> findAllReviews(Pageable pageable) {
		return ResponseEntity.ok().body(queryService.findAllReviews(pageable));
	}

	@GetMapping("/user-ratings")
	public ResponseEntity<Page<UserRating>> findAllUserRatings(Pageable pageable) {
		return ResponseEntity.ok().body(queryService.findAllUserRatings(pageable));
	}

	@GetMapping("/user-rating/{regNo}")
	public ResponseEntity<Page<UserRating>> findUserRatingByRegNo(@PathVariable String regNo) {
		return ResponseEntity.ok().body(queryService.findUserRatingByRegNo(regNo));
	}

	@GetMapping("/stores")
	public ResponseEntity<Page<Store>> findAllStores(Pageable pageable) {
		return ResponseEntity.ok().body(queryService.findAllStores(pageable));
	}

	/*
	 * @GetMapping("/findallcategories") public void
	 * findAllCategoriesBStoreId(@PathVariable Long storeId){
	 * queryService.findAllCategoriesByStoreId(storeId); }
	 */
	@GetMapping("/findproducts/{storeId}")
	public ResponseEntity<Page<Product>> findAllProductByStoreId(@PathVariable String storeId) {
		return ResponseEntity.ok().body(queryService.findAllProductsByStoreId(storeId));
	}

	@GetMapping("/store/{regNo}")
	public ResponseEntity<Store> findStoreByRegisterNumber(@PathVariable String regNo) {
		return ResponseEntity.ok().body(queryService.findStoreByRegNo(regNo));
	}

	@GetMapping("/review/{userName}")
	public ResponseEntity<Page<Review>> findReviewsByStoreId(@PathVariable String userName) {
		return ResponseEntity.ok().body(queryService.findReviewByStoreId(userName));
	}

	@GetMapping("/stockcurrent/{storeId}")
	public ResponseEntity<Page<StockCurrent>> findStockCurrentByStoreId(@PathVariable String storeId) {

		return ResponseEntity.ok().body(queryService.findStockCurrentByStoreId(storeId));
	}

	@GetMapping("/findCategoryAndCount")
	public List<Entry> findCategoryAndCount(Pageable pageable) {
		return queryService.findCategoryAndCount(pageable);
	}

	@GetMapping("/findStoreTypeAndCount")
	public List<Entry> findStoreAndCount(Pageable pageable) {
		return queryService.findStoreTypeAndCount(pageable);
	}

	
	@GetMapping("/rating/{storeId}/{name}")
	public UserRating findRatingByStoreIdAndCustomerName(@PathVariable String storeId, @PathVariable String name) {
		return queryService.findRatingByStoreIdAndCustomerName(storeId, name);
	}

	@GetMapping("/review/{storeId}/{name}")
	public Review findReviewByStoreIdAndCustomerName(@PathVariable String storeId, @PathVariable String name) {
		return queryService.findReviewByStoreIdAndCustomerName(storeId, name);
	}

	@GetMapping("/findRatingReview/{storeId}")
	public ResponseEntity<Page<RatingReview>> findRatingReviewByStoreidAndCustomerName(@PathVariable String storeId,
			/* @PathVariable String name */Pageable pageable) {
		List<RatingReview> listOfRatingreview = new ArrayList<RatingReview>();

		List<Customer> customerList = queryService.findAllCustomersWithoutSearch(pageable).getContent();

		for (Customer c : customerList) {

			log.info(">>>>>>>>>>>>>>>>>>> customer:   " + c + "   >>>>>>>>>>>>>>>>");

			UserRating rating = queryService.findRatingByStoreIdAndCustomerName(storeId, c.getReference());

			log.info(">>>>>>>>>>>>>>>>>>> rating:  " + rating + "   >>>>>>>>>>>>>>>>");

			Review review = queryService.findReviewByStoreIdAndCustomerName(storeId, c.getReference());

			log.info(">>>>>>>>>>>>>>>>>>> review:  " + review + "   >>>>>>>>>>>>>>>>");

			if (rating != null) {

				RatingReview ratingReview = new RatingReview();

				ratingReview.setRating(userRatingResourceApi.modelToDtoUsingPOST1(rating).getBody());

				if (review != null) {

					ratingReview.setReview(reviewResourceApi.modelToDtoUsingPOST(review).getBody());

				}

				log.info(">>>>>>>>>>>>>>>>>>> ratingReview:  " + ratingReview + "   >>>>>>>>>>>>>>>>");

				listOfRatingreview.add(ratingReview);

				log.info(">>>>>>>>>>>>>>>>>>> listOfRatingreview:  " + listOfRatingreview + "   >>>>>>>>>>>>>>>>");
			}
		}

		Page<RatingReview> page = new PageImpl(listOfRatingreview);

		return ResponseEntity.ok().body(page);

	}

	@GetMapping("/findStore/{searchTerm}")
	public Page<Store> findStoreBySearchTerm(@PathVariable String searchTerm, Pageable pageable) {
		return queryService.findStoreBySearchTerm(searchTerm, pageable);
	}

	@GetMapping("/findStocks/{name}/{storeId}")
	public ResponseEntity<List<StockCurrent>> findAllStockCurrentByProductNameStoreId(@PathVariable String name,
			@PathVariable String storeId) {
		return ResponseEntity.ok()
				.body(queryService.findAllStockCurrentByProductNameStoreId(name, storeId).getContent());
	}

	@GetMapping("/rating-count")
	public List<Entry> findRatingCount(Pageable pageable) {
		queryService.findRatingCount(pageable);
		return null;
	}

	@GetMapping("/storesByDeliveryType/{deliveryType}")
	public ResponseEntity<List<Store>> findStoresByDeliveryType(@PathVariable String deliveryType) {
		log.info("..............." + deliveryType);
		return ResponseEntity.ok().body(queryService.findStoreByDeliveryType(deliveryType).getContent());
	}

	// ............................................................................................................................
	/**
	 * GET /findCategoryByStoreId/:userId .
	 *
	 * @param userId
	 * @return the ResponseEntity with status 200 (OK) and with body the Category or
	 *         with status 404 (Not Found)
	 */

	@GetMapping("/findCategoryByStoreId/{userId}")
	public ResponseEntity<Page<Category>> findCategoryByStoreId(@PathVariable("userId") String userId,
			Pageable pageable) {
		log.debug("REST request to findCategoryByStoreId : {}", userId);

		List<Category> categoryList = new ArrayList<>();
		categoryList.addAll(queryService.findCategoryByStoreId(userId, pageable));
		return ResponseEntity.ok().body(new PageImpl(categoryList));
	}

	/**
	 * GET /findProductByStoreIdAndCategoryName/:userId,categoryName.
	 *
	 * @param userId , categoryName.
	 * @return the ResponseEntity with status 200 (OK) and with body the Product or
	 *         with status 404 (Not Found)
	 */

	@GetMapping("/findProductByStoreIdAndCategoryName/{userId}/{categoryId}")
	public ResponseEntity<Page<Product>> findProductByStoreIdAndCategoryName(@PathVariable("userId") String userId,
			@PathVariable("categoryId") Long categoryId, Pageable pageable) {
		log.debug("REST request to findProductByStoreIdAndCategoryName : {}", userId, categoryId);
		return ResponseEntity.ok().body(queryService.findProductByStoreIdAndCategoryName(userId, categoryId, pageable));
	}

	/**
	 * GET /findStoreByTypeName/:typeName.
	 *
	 * @param typeName
	 * @return the ResponseEntity with status 200 (OK) and with body the Product or
	 *         with status 404 (Not Found)
	 */

	@GetMapping("/findStoreByTypeName/{name}")
	public Page<Store> findStoreByTypeName(@PathVariable String name, Pageable pageable) {
		return queryService.findStoreByTypeName(name, pageable);
	}

	@GetMapping("/findStockCurrentByStoreIdAndCategoryId/{userId}/{categoryId}")
	public List<StockCurrent> findProductByStoreIdAndCategoryId(@PathVariable("userId") String userId,
			@PathVariable("categoryId") Long categoryId, Pageable pageable) {
		log.debug("REST request to findStockCurrentByStoreIdAndCategoryId : {}", userId, categoryId);
		return queryService.findStockCurrentByStoreIdAndCategoryId(userId, categoryId, pageable);
	}

	@GetMapping("/ordersByCustomerId/{customerId}")
	public Page<Order> findOrdersByCustomerId(@PathVariable String customerId, Pageable pageable) {

		return queryService.findOrderByCustomerId(customerId, pageable);

	}

	@GetMapping("/deliveryTypes/{storeId}")
	public Page<Type> findAllDeliveryTypesByStoreId(@PathVariable Long storeId, Pageable pageable) {

		return queryService.findAllDeliveryTypesByStoreId(storeId, pageable);

	}

	@GetMapping("/rating/{storeId}")
	public UserRating findRatingByStoreId(@PathVariable String storeId) {
		return queryService.findRatingByStoreId(storeId);
	}

	// ..................test......................................
	/*
	 * @GetMapping("/orderidtest/{orderId}") public Page<Order>
	 * findOrderByOrderLine(@PathVariable String orderId){ return
	 * queryService.findOrderByOrderId(orderId); }
	 */

	@GetMapping("/ratingByName/{name}")
	public UserRating findRatingByCustomerName(@PathVariable String name) {
		return queryService.findRatingByStoreId(name);
	}

	@GetMapping("/orderMaster/{orderId}")
	public OrderMaster findOrderMasterByOrderId(@PathVariable String orderId) {

		return queryService.findOrderMasterByOrderId(orderId);

	}

	@GetMapping("/storeByRating")
	public Page<Store> findStoreByRating() {

		return queryService.findStoreByRating();
	}

	@GetMapping("/productByPrice/{from}/{to}")
	public Page<StockCurrent> findAndSortProductByPrice(@PathVariable Double from, @PathVariable Double to) {

		return queryService.findAndSortProductByPrice(from, to);
	}

	@GetMapping("/deliveryinfoByStoreId/{storeId}")
	public Page<DeliveryInfo> findDeliveryInfoByStoreId(@PathVariable String storeId) {
		return queryService.findDeliveryInfoByStoreId(storeId);
	}

	@GetMapping("/header/{searchTerm}")
	public Page<Store> header(@PathVariable("searchTerm") String searchTerm, Pageable pageable) {
		return queryService.headerSearch(searchTerm, pageable);
	}


	
	@GetMapping("/location/findByNearestLocation/{latLon}/{kiloMeter}")
	public List<Store> searchByNearestLocation(@PathVariable String latLon, @PathVariable Double kiloMeter) {

		String[] latLons = latLon.split(",");

		double lat = Double.parseDouble(latLons[0]);

		double lon = Double.parseDouble(latLons[1]);

		return queryService.findByNearestLocation(new Point(lat, lon), new Distance(kiloMeter, Metrics.KILOMETERS));
	}

	@GetMapping("/storeByLocationName/{locationName}")
	public Page<Store> findStoreByLocationName(@PathVariable String locationName) {

		return queryService.findStoreByLocationName(locationName);
	}

	@GetMapping("/sortstoreByMinAmount")
	public Page<Store> findAndSortStoreBydeliveryTime( Pageable pageable) {

		return queryService.findAndSortStoreByMinAount(pageable);
	}

	//......sortstorebydeliverycharge................
	
	@GetMapping("/storesByStoreType/storeType}")
	public Page<Store> findStoreByStoreType(@PathVariable String name, Pageable pageable) {

		return queryService.findStoreByType(name, pageable);
	}

	@GetMapping("/stores/banners")
	public ResponseEntity<List<BannerDTO>> findStoreBanners(@RequestParam(required = false) Integer page,
			@RequestParam(required = false) Integer size,
			@RequestParam(value = "sort", required = false) ArrayList<String> sort) {
		return BannerResourceApi.getAllBannersUsingGET(page, size, sort);

	}
	
	@GetMapping("/stores/storeTypes")
	public ResponseEntity<List<StoreTypeDTO>> getAllStoreTypes(@RequestParam(required = false) Integer page,
			@RequestParam(required = false) Integer size,
			@RequestParam(value = "sort", required = false) ArrayList<String> sort) {

		return storeTypeResourceApi.getAllStoreTypesUsingGET(page, size, sort);
	}
	



}
