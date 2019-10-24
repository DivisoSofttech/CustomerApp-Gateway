package com.diviso.graeshoppe.web.rest;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.graeshoppe.client.customer.api.ContactResourceApi;
import com.diviso.graeshoppe.client.customer.api.CustomerResourceApi;
import com.diviso.graeshoppe.client.customer.model.Customer;
import com.diviso.graeshoppe.client.customer.model.ContactDTO;
import com.diviso.graeshoppe.client.customer.model.CustomerDTO;
import com.diviso.graeshoppe.client.customer.model.FavouriteProduct;
import com.diviso.graeshoppe.client.customer.model.FavouriteStore;
import com.diviso.graeshoppe.client.customer.model.OTPChallenge;
import com.diviso.graeshoppe.client.customer.model.OTPResponse;
import com.diviso.graeshoppe.client.order.api.OrderQueryResourceApi;
import com.diviso.graeshoppe.client.order.model.AuxilaryOrderLine;
import com.diviso.graeshoppe.client.order.model.Notification;
import com.diviso.graeshoppe.client.order.model.OpenTask;
import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.client.order.model.OrderLine;
import com.diviso.graeshoppe.client.product.api.CategoryResourceApi;
import com.diviso.graeshoppe.client.product.api.ProductResourceApi;
import com.diviso.graeshoppe.client.product.api.StockCurrentResourceApi;
import com.diviso.graeshoppe.client.product.model.AuxilaryLineItem;
import com.diviso.graeshoppe.client.product.model.Category;
import com.diviso.graeshoppe.client.product.model.ComboLineItem;
import com.diviso.graeshoppe.client.product.model.Discount;
import com.diviso.graeshoppe.client.product.model.Product;
import com.diviso.graeshoppe.client.product.model.ProductDTO;
import com.diviso.graeshoppe.client.product.model.StockCurrent;
import com.diviso.graeshoppe.client.product.model.StockCurrentDTO;
import com.diviso.graeshoppe.client.report.model.OrderAggregator;
import com.diviso.graeshoppe.client.store.api.BannerResourceApi;
import com.diviso.graeshoppe.client.store.api.ReviewResourceApi;
import com.diviso.graeshoppe.client.store.api.StoreTypeResourceApi;
import com.diviso.graeshoppe.client.store.api.UserRatingResourceApi;
import com.diviso.graeshoppe.client.store.domain.DeliveryInfo;
import com.diviso.graeshoppe.client.store.domain.RatingReview;
import com.diviso.graeshoppe.client.store.domain.Review;
import com.diviso.graeshoppe.client.store.domain.Store;
import com.diviso.graeshoppe.client.store.domain.StoreAddress;
import com.diviso.graeshoppe.client.store.domain.StoreSettings;
import com.diviso.graeshoppe.client.store.domain.StoreType;
import com.diviso.graeshoppe.client.store.domain.Type;
import com.diviso.graeshoppe.client.store.domain.UserRating;
import com.diviso.graeshoppe.client.store.model.BannerDTO;
import com.diviso.graeshoppe.client.store.model.StoreTypeDTO;
import com.diviso.graeshoppe.domain.ElasticDataEntry;
import com.diviso.graeshoppe.service.ProductQueryService;
import com.diviso.graeshoppe.service.QueryService;
import com.diviso.graeshoppe.service.StoreQueryService;

import io.searchbox.core.search.aggregation.TermsAggregation.Entry;

@RestController
@RequestMapping("/api/query")
public class QueryResource {

	private final Logger log = LoggerFactory.getLogger(QueryResource.class);

	
	@Autowired
	com.diviso.graeshoppe.client.report.api.QueryResourceApi queryResource;
	
	@Autowired
	QueryService queryService;

	@Autowired
	ProductQueryService productqueryService;
	
	@Autowired
	StoreQueryService storeQueryService;

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
	private UserRatingResourceApi userRatingResourceApi;

	@Autowired
	private ReviewResourceApi reviewResourceApi;

	@Autowired
	private BannerResourceApi BannerResourceApi;

	@Autowired
	private StoreTypeResourceApi storeTypeResourceApi;

	@Autowired
	private OrderQueryResourceApi orderQueryResourceApi;
	
	@GetMapping("/taskDetails/{taskName}/{orderId}/{storeId}")
	public ResponseEntity<OpenTask> getTaskDetails(@PathVariable String taskName,@PathVariable String orderId,@PathVariable String storeId) {
		return orderQueryResourceApi.getTaskDetailsUsingGET(taskName,orderId, storeId);
		
	}
	
	@GetMapping("/findProductById/{id}")
	public ResponseEntity<Product> findProductById(@PathVariable Long id) {
		return ResponseEntity.ok().body(productqueryService.findProductById(id));

	}

	@GetMapping("/findCustomerByMobileNumber/{mobileNumber}")
	public ResponseEntity<CustomerDTO> findByMobileNumber(@PathVariable Long mobileNumber) {
		return customerResourceApi.findByMobileNumberUsingGET(mobileNumber);
	}
	
	@GetMapping("/findStoreById/{id}")
	public ResponseEntity<Store> findStoreById(@PathVariable Long id) {
		return ResponseEntity.ok().body(storeQueryService.findStoreById(id));

	}
	@GetMapping("/findProductByCategoryIdAndUserId/{categoryId}/{userId}")
	public Page<Product> findProductByCategoryIdAndUserId(@PathVariable Long categoryId, @PathVariable String userId,
			Pageable pageable) {
		return productqueryService.findProductByCategoryId(categoryId, userId, pageable);
	}

	@GetMapping("/customers/findByReference/{reference}")
	public ResponseEntity<CustomerDTO> findCustomerByReference(@PathVariable String reference) {
	 //customerResourceApi.modelToDtoUsingPOST(queryService.findCustomerByReference(reference));
			
			return customerResourceApi.modelToDtoUsingPOST(queryService.findCustomerByReference(reference));
	}

	@GetMapping("/findStockCurrentByProductId/{productId}")
	public Page<StockCurrent> findStockCurrentByProductId(@PathVariable Long productId, Pageable pageable) {
		return productqueryService.findStockCurrentByProductId(productId, pageable);
	}

	@GetMapping("/findStockCurrentByProductNameStoreId/{name}/{storeId}")
	public Page<StockCurrent> findStockCurrentByProductNameAndStoreId(@PathVariable String name,
			@PathVariable String storeId, Pageable pageable) {
		return productqueryService.findStockCurrentByProductName(name, storeId, pageable);
	}

	@GetMapping("/findProductBySearchTerm/{searchTerm}")
	public Page<Product> findAllProductBySearchTerm(@PathVariable String searchTerm, Pageable pageable) {
		return productqueryService.findAllProductBySearchTerm(searchTerm, pageable);
	}

	@GetMapping("/findAllCustomers")
	public Page<Customer> findAllCustomersWithoutSearch(Pageable pageable) {
		return queryService.findAllCustomersWithoutSearch(pageable);
	}

	@GetMapping("/customers/{id}")
	public ResponseEntity<CustomerDTO> findCustomerById(@PathVariable Long id) {
		return this.customerResourceApi.getCustomerUsingGET(id);
	}

	@GetMapping("contacts/{id}")
	public ResponseEntity<ContactDTO> findContactById(@PathVariable Long id) {
		return this.contactResourceApi.getContactUsingGET(id);
	}

	@GetMapping("/findAllCategories/{iDPcode}")
	public ResponseEntity<Page<Category>> findAllCategories(@PathVariable String iDPcode, Pageable pageable) {
		return ResponseEntity.ok().body(productqueryService.findCategoryByIDPcode(iDPcode, pageable));
	}

	@GetMapping("/products/{id}")
	public ResponseEntity<ProductDTO> findProduct(@PathVariable Long id) {
		return this.productResourceApi.getProductUsingGET(id);
	}

	@GetMapping("/stock-currents/{id}")
	public ResponseEntity<StockCurrentDTO> findOneStockCurrent(@PathVariable Long id) {
		return this.stockCurrentResourceApi.getStockCurrentUsingGET(id);
	}

	@GetMapping("/stock-current/{searchTerm}")
	public ResponseEntity<List<StockCurrentDTO>> searchStockCurrents(@PathVariable String searchTerm, Integer page,
			Integer size, ArrayList<String> sort) {
		return this.stockCurrentResourceApi.searchStockCurrentsUsingGET(searchTerm, page, size, sort);
	}

	@GetMapping("/reviews")
	public ResponseEntity<Page<Review>> findAllReviews(Pageable pageable) {
		return ResponseEntity.ok().body(storeQueryService.findAllReviews(pageable));
	}

	@GetMapping("/user-ratings")
	public ResponseEntity<Page<UserRating>> findAllUserRatings(Pageable pageable) {
		return ResponseEntity.ok().body(storeQueryService.findAllUserRatings(pageable));
	}

	@GetMapping("/user-rating/{regNo}")
	public ResponseEntity<Page<UserRating>> findUserRatingByRegNo(@PathVariable String regNo) {
		return ResponseEntity.ok().body(storeQueryService.findUserRatingByRegNo(regNo));
	}

	@GetMapping("/stores")
	public ResponseEntity<Page<Store>> findAllStores(Pageable pageable) {
		return ResponseEntity.ok().body(storeQueryService.findAllStores(pageable));
	}

	@GetMapping("/findproducts/{storeId}")
	public ResponseEntity<Page<Product>> findAllProductByStoreId(@PathVariable String storeId) {
		return ResponseEntity.ok().body(productqueryService.findAllProductsByStoreId(storeId));
	}

	@GetMapping("/store/{regNo}")
	public ResponseEntity<Store> findStoreByRegisterNumber(@PathVariable String regNo) {
		return ResponseEntity.ok().body(storeQueryService.findStoreByRegNo(regNo));
	}

	@GetMapping("/review/{userName}")
	public ResponseEntity<Page<Review>> findReviewsByStoreId(@PathVariable String userName) {
		return ResponseEntity.ok().body(storeQueryService.findReviewByStoreId(userName));
	}

	@GetMapping("/stockcurrent/{storeId}")
	public ResponseEntity<Page<StockCurrent>> findStockCurrentByStoreId(@PathVariable String storeId) {

		return ResponseEntity.ok().body(productqueryService.findStockCurrentByStoreId(storeId));
	}

	@GetMapping("/findCategoryAndCount")
	public List<Entry> findCategoryAndCount(Pageable pageable) {
		return productqueryService.findCategoryAndCount(pageable);
	}

	@GetMapping("/findCategoryAndCountBystoreId/{storeId}")
	public List<ElasticDataEntry> findCategoryAndCountBystoreId(@PathVariable String storeId, Pageable pageable) {

		return productqueryService.findCategoryAndCountByStoreId(storeId, pageable);
	}

	public Page<Product> findProductsByCategoryName(@PathVariable String name) {
		return productqueryService.findProductsByCategoryName(name);
	}

	@GetMapping("/findStoreTypeAndCount")
	public List<Entry> findStoreAndCount(Pageable pageable) {
		return storeQueryService.findStoreTypeAndCount(pageable);
	}

	@GetMapping("/rating/{storeId}/{name}")
	public UserRating findRatingByStoreIdAndCustomerName(@PathVariable String storeId, @PathVariable String name) {
		return storeQueryService.findRatingByStoreIdAndCustomerName(storeId, name);
	}

	@GetMapping("/review/{storeId}/{name}")
	public Review findReviewByStoreIdAndCustomerName(@PathVariable String storeId, @PathVariable String name) {
		return storeQueryService.findReviewByStoreIdAndCustomerName(storeId, name);
	}

	@GetMapping("/findRatingReview/{storeId}")
	public ResponseEntity<Page<RatingReview>> findRatingReviewByStoreidAndCustomerName(@PathVariable String storeId,
			Pageable pageable) {
		List<RatingReview> listOfRatingreview = new ArrayList<RatingReview>();

		List<Customer> customerList = queryService.findAllCustomersWithoutSearch(pageable).getContent();

		for (Customer c : customerList) {

			UserRating rating = storeQueryService.findRatingByStoreIdAndCustomerName(storeId, c.getReference());

			Review review = storeQueryService.findReviewByStoreIdAndCustomerName(storeId, c.getReference());

			if (rating != null) {

				RatingReview ratingReview = new RatingReview();

				ratingReview.setRating(userRatingResourceApi.modelToDtoUsingPOST1(rating).getBody());

				if (review != null) {

					ratingReview.setReview(reviewResourceApi.modelToDtoUsingPOST(review).getBody());

				}

				listOfRatingreview.add(ratingReview);
			}
		}

		Page<RatingReview> page = new PageImpl(listOfRatingreview);

		return ResponseEntity.ok().body(page);

	}

	@GetMapping("/findStore/{searchTerm}")
	public Page<Store> findStoreBySearchTerm(@PathVariable String searchTerm, Pageable pageable) {
		return storeQueryService.findStoreBySearchTerm(searchTerm, pageable);
	}

	@GetMapping("/review-count")
	public Long findReviewCountByStoreId(String storeId) {
		Long l = storeQueryService.findReviewCountByStoreId(storeId);
		return l;
	}

	@GetMapping("/storesByDeliveryType/{deliveryType}")
	public ResponseEntity<List<Store>> findStoresByDeliveryType(@PathVariable String deliveryType) {

		return ResponseEntity.ok().body(storeQueryService.findStoreByDeliveryType(deliveryType).getContent());
	}

	@GetMapping("/findProductByStoreIdAndCategoryName/{userId}/{categoryName}")
	public ResponseEntity<Page<Product>> findProductByStoreIdAndCategoryName(@PathVariable String userId,
			@PathVariable String categoryName, Pageable pageable) {
		return ResponseEntity.ok()
				.body(productqueryService.findProductByStoreIdAndCategoryName(userId, categoryName, pageable));
	}

	@GetMapping("/findStoreByTypeName/{name}")
	public Page<Store> findStoreByTypeName(@PathVariable String name, Pageable pageable) {
		return storeQueryService.findStoreByTypeName(name, pageable);
	}

	@GetMapping("/findStockCurrentByStoreIdAndCategoryId/{userId}/{categoryId}")
	public List<StockCurrent> findStockCurrentByStoreIdAndCategoryId(@PathVariable("userId") String userId,
			@PathVariable("categoryId") Long categoryId, Pageable pageable) {
		return productqueryService.findStockCurrentByStoreIdAndCategoryId(userId, categoryId, pageable);
	}

	@GetMapping("/ordersByCustomerId/{customerId}")
	public Page<Order> findOrdersByCustomerId(@PathVariable String customerId, Pageable pageable) {

		return queryService.findOrderByCustomerId(customerId, pageable);

	}

	@GetMapping("/deliveryTypes/{storeId}")
	public Page<Type> findAllDeliveryTypesByStoreId(@PathVariable Long storeId, Pageable pageable) {

		return storeQueryService.findAllDeliveryTypesByStoreId(storeId, pageable);

	}

	@GetMapping("/rating/{storeId}")
	public UserRating findRatingByStoreId(@PathVariable String storeId) {
		return storeQueryService.findRatingByStoreId(storeId);
	}

	@GetMapping("/ratingByName/{name}")
	public UserRating findRatingByCustomerName(@PathVariable String name) {
		return storeQueryService.findRatingByStoreId(name);
	}

	@GetMapping("/storeByRating")
	public Page<Store> findStoreByRating() {

		return storeQueryService.findStoreByRating();
	}

	@GetMapping("/productByPrice/{from}/{to}")
	public Page<StockCurrent> findAndSortProductByPrice(@PathVariable Double from, @PathVariable Double to) {

		return productqueryService.findAndSortProductByPrice(from, to);
	}

	@GetMapping("/deliveryinfoByStoreId/{storeId}")
	public Page<DeliveryInfo> findDeliveryInfoByStoreId(@PathVariable String storeId) {
		return storeQueryService.findDeliveryInfoByStoreId(storeId);
	}

	@GetMapping("/header/{searchTerm}")
	public Page<Store> header(@PathVariable("searchTerm") String searchTerm, Pageable pageable) {
		return storeQueryService.headerSearch(searchTerm, pageable);
	}

	@GetMapping("/storeByLocationName/{locationName}")
	public Page<Store> findStoreByLocationName(@PathVariable String locationName) {

		return storeQueryService.findStoreByLocationName(locationName);
	}

	@GetMapping("/sortStoreByMinAmount")
	public Page<Store> findAndSortStoreBydeliveryTime(Pageable pageable) {

		return storeQueryService.findAndSortStoreByMinAount(pageable);
	}

	@GetMapping("/storesByStoreType/{storeType}")
	public Page<Store> findStoreByStoreType(@PathVariable String storeType, Pageable pageable) {

		return storeQueryService.findStoreByType(storeType, pageable);
	}

	@GetMapping("/store-type/{storeId}")
	public Page<StoreType> findStoreTypeByStoreId(@PathVariable String storeId, Pageable pageable) {
		return storeQueryService.findStoreTypeByStoreId(storeId, pageable);
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

	@GetMapping("/tasks")
	public ResponseEntity<List<OpenTask>> getTasks(@RequestParam(required = false) String assignee,
			@RequestParam(required = false) String assigneeLike, @RequestParam(required = false) String candidateGroup,
			@RequestParam(required = false) String candidateGroups,
			@RequestParam(required = false) String candidateUser, @RequestParam(required = false) String createdAfter,
			@RequestParam(required = false) String createdBefore, @RequestParam(required = false) String createdOn,
			@RequestParam(required = false) String name, @RequestParam(required = false) String nameLike) {
		return orderQueryResourceApi.getTasksUsingGET(assignee, assigneeLike, candidateGroup, candidateGroups,
				candidateUser, createdAfter, createdBefore, createdOn, name, nameLike);

	}

	@GetMapping("/orderByOrderId/{orderId}")
	public ResponseEntity<Order> findOrderByOrderId(@PathVariable String orderId) {
		return ResponseEntity.ok(queryService.findOrderByOrderId(orderId));
	}

	/*
	 * @GetMapping("/deliveryCount/{storeId}") public List<Entry>
	 * getDeliveryCountBystoreId(@PathVariable String storeId, Pageable pageable){
	 * 
	 * return queryService.findAllDeliveryCountByStoreId(storeId, pageable); }
	 */

	/*
	 * @GetMapping("/findByNearestLocation/{latLon}/{kiloMeter}") public Page<Store>
	 * searchByNearestLocation(@PathVariable String latLon, @PathVariable Double
	 * kiloMeter,Pageable pageable) {
	 * 
	 * String[] latLons = latLon.split(",");
	 * 
	 * double lat = Double.parseDouble(latLons[0]);
	 * 
	 * double lon = Double.parseDouble(latLons[1]);
	 * 
	 * log.info("........lat........................  "
	 * +lat+"................lon.........   "+lon);
	 * 
	 * return queryService.findByLocationNear(new Point(lat, lon), new
	 * Distance(kiloMeter, Metrics.KILOMETERS),pageable); }
	 */

	@GetMapping("/auxilaries-productId/{productId}")
	public Page<AuxilaryLineItem> findAuxilariesByProductId(@PathVariable Long productId) {
		return productqueryService.findAllAuxilariesByProductId(productId);
	}

	@GetMapping("/stock-current-by-categoryname/{categoryName}/{storeId}")
	public Page<StockCurrent> findStockCurrentByCategoryNameAndStoreId(@PathVariable String categoryName,
			@PathVariable String storeId) {
		return productqueryService.findStockCurrentByCategoryNameAndStoreId(categoryName, storeId);

	}

	@GetMapping("/storeSettings/{IDPCode}")
	public StoreSettings getStoreSettings(@PathVariable String IDPCode) {

		return storeQueryService.getStoreSettings(IDPCode);

	}

	@GetMapping("/storeAddress/{IDPCode}")
	public StoreAddress getStoreAddress(@PathVariable String IDPCode) {

		return storeQueryService.getStoreAddress(IDPCode);

	}

	@GetMapping("/orderStatus/{statusName}")
	public Page<Order> findOrderByStatusName(@PathVariable String statusName, Pageable pageable) {
		return queryService.findOrderByStatusName(statusName);
	}

	@GetMapping("/order/{from}/{to}/{storeId}")
	public Page<Order> findOrderByDatebetweenAndStoreId(@PathVariable Instant from, @PathVariable Instant to,
			@PathVariable String storeId) {
		return queryService.findOrderByDatebetweenAndStoreId(from, to, storeId);
	}

	@GetMapping("/combos-productId/{productId}")
	public Page<ComboLineItem> findComboByProductId(@PathVariable Long productId) {
		return productqueryService.findAllCombosByProductId(productId);
	}

	@GetMapping("/discount-productId/{productId}")
	public Discount findDiscountByProductId(@PathVariable Long productId) {
		return productqueryService.findDiscountByProductId(productId);
	}
	
	@GetMapping("/favouriteproductsbycustomerreference/{reference}")
	Page<FavouriteProduct> findFavouriteProductsByCustomerReference(@PathVariable String reference, Pageable pageable){
		
		return queryService.findFavouriteProductsByCustomerReference(reference, pageable);
	}
	
	@GetMapping("/favouritestoresbycustomerreference/{reference}")
	Page<FavouriteStore> findFavouriteStoresByCustomerReference(@PathVariable String reference, Pageable pageable){
		return queryService.findFavouriteStoresByCustomerReference(reference, pageable);
	}
	
	@GetMapping("/findnotificationbyreceiverid/{receiverId}")
	Page<Notification> findNotificationByReceiverId(@PathVariable String receiverId, Pageable pageable){
		return queryService.findNotificationByReceiverId(receiverId, pageable);
	}

	@GetMapping("/findOrderLinesByOrderId/{orderId}")
	public List<OrderLine> findOrderLinesByOrderId(@PathVariable Long orderId) {
		return queryService.findOrderLinesByOrderId(orderId);
	}
	
	@GetMapping("/findAllOrderLinesByOrderId/{orderId}")
	public Page<OrderLine> findAllOrderLinesByOrderId(@PathVariable Long orderId, Pageable pageable) {
		return queryService.findAllOrderLinesByOrderId(orderId, pageable);
	}
	
	@GetMapping("/findnotificationcount/{receiverId}/{status}")
	Long findNotificationCountByReceiverIdAndStatusName(@PathVariable String receiverId, @PathVariable String status){
		return queryService.findNotificationCountByReceiverIdAndStatusName(receiverId, status);
	}
	
	@GetMapping("/findAuxilaryOrderLineByOrderLineId/{orderLineId}")
	public Page<AuxilaryOrderLine> findAuxilaryOrderLineByOrderLineId(@PathVariable Long orderLineId, Pageable pageable) {
		return queryService.findAuxilaryOrderLineByOrderLineId(orderLineId, pageable);
	}
	
	@GetMapping("/orderaggregator/{orderNumber}")
	public ResponseEntity<OrderAggregator> getOrderAggregator(@PathVariable String orderNumber) {
		return queryResource.getOrderAggregatorUsingGET(orderNumber);
	}
	
}
