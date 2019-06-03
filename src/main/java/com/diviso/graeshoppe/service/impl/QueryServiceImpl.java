package com.diviso.graeshoppe.service.impl;

import static org.elasticsearch.action.search.SearchType.QUERY_THEN_FETCH;
import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.FetchSourceFilterBuilder;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.core.query.StringQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.diviso.graeshoppe.client.customer.domain.Customer;
import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.client.order.model.OrderAddress;
import com.diviso.graeshoppe.client.product.model.Category;
import com.diviso.graeshoppe.client.product.model.Product;
import com.diviso.graeshoppe.client.product.model.StockCurrent;
import com.diviso.graeshoppe.client.product.model.StockDiary;
import com.diviso.graeshoppe.client.product.model.StockLine;
import com.diviso.graeshoppe.client.product.model.Uom;
import com.diviso.graeshoppe.client.sale.domain.Sale;
import com.diviso.graeshoppe.client.sale.domain.TicketLine;
import com.diviso.graeshoppe.client.store.domain.DeliveryInfo;
import com.diviso.graeshoppe.client.store.domain.Review;
import com.diviso.graeshoppe.client.store.domain.Store;
import com.diviso.graeshoppe.client.store.domain.UserRating;
/*import com.diviso.graeshoppe.client.product.domain.Product;
import com.diviso.graeshoppe.domain.Result;*/
import com.diviso.graeshoppe.service.QueryService;
import com.github.vanroy.springdata.jest.JestElasticsearchTemplate;
import com.github.vanroy.springdata.jest.aggregation.AggregatedPage;

import io.searchbox.client.JestClient;
import io.searchbox.core.search.aggregation.TermsAggregation;
import io.searchbox.core.search.aggregation.TermsAggregation.Entry;

@Service
public class QueryServiceImpl implements QueryService {
	private final JestClient jestClient;
	private final JestElasticsearchTemplate elasticsearchTemplate;

	public QueryServiceImpl(JestClient jestClient) {
		this.jestClient = jestClient;
		this.elasticsearchTemplate = new JestElasticsearchTemplate(this.jestClient);
	}

	@Autowired
	ElasticsearchOperations elasticsearchOperations;

	@Override
	public Page<Category> findAllCategories(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForPage(searchQuery, Category.class);
	}

	@Override
	public Page<Product> findAllProduct(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForPage(searchQuery, Product.class);
	}

	@Override
	public Page<Product> findAllProductBySearchTerm(String searchTerm, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(matchQuery("name", searchTerm).prefixLength(3)).build();

		return elasticsearchOperations.queryForPage(searchQuery, Product.class);

	}

	@Override
	public Page<Product> findProductByCategoryId(Long categoryId, String userId, Pageable pageable) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("categories.id", categoryId))
						.must(QueryBuilders.matchQuery("userId", userId)))
				.build();
		return elasticsearchOperations.queryForPage(searchQuery, Product.class);
	}

	@Override
	public Page<Customer> findCustomerByName(String name, Pageable pageable) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("name", name)).build();
		return elasticsearchOperations.queryForPage(searchQuery, Customer.class);
	}

	@Override
	public Page<StockCurrent> findStockCurrentByProductId(Long productId, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("product.id", productId)).build();
		return elasticsearchOperations.queryForPage(searchQuery, StockCurrent.class);
	}

	@Override
	public Page<StockCurrent> findStockCurrentByProductName(String name, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchQuery("product.name", name)).build();
		return elasticsearchOperations.queryForPage(searchQuery, StockCurrent.class);
	}

	@Override
	public Page<StockDiary> findStockDiaryByProductId(Long productId, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("product.id", productId)).build();
		return elasticsearchOperations.queryForPage(searchQuery, StockDiary.class);
	}

	@Override
	public Page<StockLine> findAllStockLines(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForPage(searchQuery, StockLine.class);
	}

	/*
	 * public List<Result> findAll(String searchTerm, Pageable pageable) {
	 * List<Result> values = new ArrayList<Result>(); ;
	 * 
	 * SearchQuery searchQuery = new NativeSearchQueryBuilder()
	 * .withQuery(matchQuery("name", searchTerm).fuzziness(Fuzziness.TWO)).build();
	 * 
	 * elasticsearchTemplate.query(searchQuery, new
	 * JestResultsExtractor<List<Result>>() {
	 * 
	 * @Override public List<Result> extract(SearchResult response) {
	 * 
	 * for (SearchResult.Hit<JsonObject, Void> searchHit :
	 * response.getHits(JsonObject.class)) { Result result = new Result(); //
	 * sampleEntity.setId(searchHit.source.get(JestResult.ES_METADATA_ID).
	 * getAsString()); result.setName(searchHit.source.get("name").getAsString());
	 * 
	 * values.add(result);
	 * 
	 * } return values; } }); return values;
	 * 
	 * }
	 */
	@Override
	public Page<Customer> findAllCustomers(String searchTerm, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(matchQuery("name", searchTerm).prefixLength(3)).build();

		return elasticsearchOperations.queryForPage(searchQuery, Customer.class);

	}

	@Override
	public List<String> findAllUom(Pageable pageable) {
		List<String> uomList = new ArrayList<String>();
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery())
				.withSearchType(QUERY_THEN_FETCH).withIndices("uom").withTypes("uom")
				.addAggregation(AggregationBuilders.terms("distinct_uom").field("name.keyword")).build();

		AggregatedPage<Uom> result = elasticsearchTemplate.queryForPage(searchQuery, Uom.class);
		TermsAggregation uomAgg = result.getAggregation("distinct_uom", TermsAggregation.class);

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<" + uomAgg.getBuckets().size());

		for (int i = 0; i < uomAgg.getBuckets().size(); i++) {
			uomList.add(uomAgg.getBuckets().get(i).getKey());
		}

		return uomList;
	}

	@Override
	public Page<Customer> findAllCustomersWithoutSearch(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForPage(searchQuery, Customer.class);
	}

	@Override
	public Page<Sale> findSales(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery())
				.withSort(SortBuilders.fieldSort("date").order(SortOrder.DESC)).withPageable(pageable).build();
		return elasticsearchOperations.queryForPage(searchQuery, Sale.class);

	}

	@Override
	public List<TicketLine> findTicketLinesBySaleId(Long saleId) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("sale.id", saleId)).build();
		return elasticsearchOperations.queryForPage(searchQuery, TicketLine.class).getContent();
	}

	@Override
	public Page<StockCurrent> findAllStockCurrents(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForPage(searchQuery, StockCurrent.class);
	}

	@Override
	public Page<StockDiary> findAllStockDiaries(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForPage(searchQuery, StockDiary.class);
	}

	@Override
	public Page<Product> findAllProducts(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForPage(searchQuery, Product.class);
	}

	@Override
	public Page<Review> findAllReviews(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForPage(searchQuery, Review.class);
	}

	@Override
	public Page<UserRating> findAllUserRatings(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForPage(searchQuery, UserRating.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findAllStores(org.springframework.
	 * data.domain.Pageable)
	 */
	@Override
	public Page<Store> findAllStores(Pageable pageable) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		Page<Store> storePage = elasticsearchOperations.queryForPage(searchQuery, Store.class);

		storePage.forEach(store -> {
			List<UserRating> userRating = findUserRatingByRegNo(store.getRegNo()).getContent();
			store.setUserRatings(new HashSet<UserRating>(userRating));
		});

		return storePage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findAllProductsByStoreId(java.lang
	 * .String)
	 */
	@Override
	public Page<Product> findAllProductsByStoreId(String storeId) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("userId", storeId)).build();
		return elasticsearchOperations.queryForPage(searchQuery, Product.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findStoreByRegNo(java.lang.String)
	 */
	@Override
	public Store findStoreByRegNo(String regNo) {
		StringQuery stringQuery = new StringQuery(termQuery("regNo", regNo).toString());
		return elasticsearchOperations.queryForObject(stringQuery, Store.class);
		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * com.diviso.graeshoppe.service.QueryService#findAllCategoriesByStoreId(java.
		 * lang.Long)
		 */
		/*
		 * @Override public Page<Category> findAllCategoriesByStoreId(Long storeId) {
		 * SearchQuery searchQuery = new
		 * NativeSearchQueryBuilder().withQuery(termQuery("sale.id", storeId)) .build();
		 * return elasticsearchOperations.queryForPage(searchQuery,
		 * TicketLine.class).getContent(); }
		 */

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findReviewByStoreId(java.lang.
	 * String)
	 */
	@Override
	public Page<Review> findReviewByStoreId(String userName) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("userName", userName)).build();
		return elasticsearchOperations.queryForPage(searchQuery, Review.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findStockCurrentByStoreId(java.
	 * lang.String)
	 */
	@Override
	public Page<StockCurrent> findStockCurrentByStoreId(String storeId) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("product.userId", storeId))
				.build();
		return elasticsearchOperations.queryForPage(searchQuery, StockCurrent.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findUserRatingByRegNo(java.lang.
	 * String)
	 */
	@Override
	public Page<UserRating> findUserRatingByRegNo(String regNo) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("store.regNo", regNo)).build();
		return elasticsearchOperations.queryForPage(searchQuery, UserRating.class);
	}

	@Override
	public List<Entry> findCategoryAndCount(Pageable pageable) {
		System.out.println("+enter>>>>>>>>><<<<<<<<<<<<<<<<<<>>>>>>>>>+");
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery())
				.withSearchType(QUERY_THEN_FETCH)
				// .withQuery(termQuery("categories.name.keyword","Starters"))
				.withIndices("product").withTypes("product")
				.addAggregation(AggregationBuilders.terms("totalcategories").field("categories.name.keyword")).build();

		AggregatedPage<Product> result = elasticsearchTemplate.queryForPage(searchQuery, Product.class);
		TermsAggregation categoryAggregation = result.getAggregation("totalcategories", TermsAggregation.class);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
				+ categoryAggregation.getBuckets().size());
		return categoryAggregation.getBuckets();
		// returncustom elasticsearchTemplate.queryForList(searchQuery, Product.class);

	}

	@Override
	public Page<Category> findCategoryByUserId(String userId, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("userId", userId))).build();
		return elasticsearchOperations.queryForPage(searchQuery, Category.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findRatingByStoreIdAndCustomerName
	 * ()
	 */
	@Override
	public UserRating findRatingByStoreIdAndCustomerName(String storeId, String name) {

		StringQuery stringQuery = new StringQuery(
				QueryBuilders.boolQuery().must(QueryBuilders.termQuery("store.regNo", storeId))
						.must(QueryBuilders.termQuery("userName", name)).toString());

		return elasticsearchOperations.queryForObject(stringQuery, UserRating.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findReviewByStoreIdAndCustomerName
	 * (java.lang.String, java.lang.String)
	 */
	@Override
	public Review findReviewByStoreIdAndCustomerName(String storeId, String name) {

		StringQuery stringQuery = new StringQuery(
				QueryBuilders.boolQuery().must(QueryBuilders.termQuery("store.regNo", storeId))
						.must(QueryBuilders.termQuery("userName", name)).toString());

		return elasticsearchOperations.queryForObject(stringQuery, Review.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.diviso.graeshoppe.service.QueryService#findAllStoreByName(java.lang.
	 * String)
	 */
	@Override
	public Page<Store> findAllStoreByName(String name) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("name", name)).build();
		return elasticsearchOperations.queryForPage(searchQuery, Store.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findAllProductByName(java.lang.
	 * String)
	 */
	@Override
	public Page<Product> findAllProductByName(String name) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchQuery("name", name)).build();
		return elasticsearchOperations.queryForPage(searchQuery, Product.class);

	}

	@Override
	public Page<StockCurrent> findAllStockCurrentByProductNameStoreId(String productName, String storeId) {
		StringQuery stringQuery = new StringQuery(
				QueryBuilders.boolQuery().must(QueryBuilders.termQuery("product.userId", storeId))
						.must(QueryBuilders.termQuery("product.name", productName)).toString());
		return elasticsearchOperations.queryForPage(stringQuery, StockCurrent.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.diviso.graeshoppe.service.QueryService#findRatingCount(org.
	 * springframework.data.domain.Pageable)
	 */
	@Override
	public List<Entry> findRatingCount(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery())
				.withSearchType(QUERY_THEN_FETCH).withIndices("userrating").withTypes("userrating")
				.addAggregation(AggregationBuilders.terms("ratings").field("rating")).build();

		AggregatedPage<UserRating> result = elasticsearchTemplate.queryForPage(searchQuery, UserRating.class);
		TermsAggregation categoryAggregation = result.getAggregation("ratings", TermsAggregation.class);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
				+ categoryAggregation.getBuckets().size());
		return categoryAggregation.getBuckets();
	}

	@Override
	public Page<OrderAddress> findByCustomerId(String customerId, Pageable pageable) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("customerId.keyword", customerId))
				.withIndices("orderaddress").withTypes("address").build();
		return elasticsearchOperations.queryForPage(searchQuery, OrderAddress.class);
	}

	@Override
	public Order findById(Long id) {

		StringQuery query = new StringQuery(termQuery("id", id).toString());
		return elasticsearchOperations.queryForObject(query, Order.class);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findStoreByType(java.lang.String)
	 */
	@Override
	public Page<Store> findStoreByType(String deliveryType) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(termQuery("deliveryInfos.type.name.keyword", deliveryType)).build();
		return elasticsearchOperations.queryForPage(searchQuery, Store.class);
	}

	/*
	 * to find category by storeId
	 */

	@Override
	public List<Category> findCategoryByStoreId(String userId, Pageable pageable) {
		List<Category> categoryList = new ArrayList<>();
		FetchSourceFilterBuilder sourceFilter = new FetchSourceFilterBuilder();
		sourceFilter.withExcludes("product");

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("userId", userId))
				.withIndices("product").withTypes("product").withSourceFilter(sourceFilter.build()).build();
		List<Product> productList = elasticsearchOperations.queryForList(searchQuery, Product.class);

		for (Product product : productList) {

			categoryList.addAll(product.getCategories());
		}
		return categoryList;
	}

	/*
	 * to find Product by storeId and categoryName
	 */
	@Override
	public Page<Product> findProductByStoreIdAndCategoryName(String userId, Long categoryId, Pageable pageable) {

		List<Category> categoryList = new ArrayList<>();
		FetchSourceFilterBuilder sourceFilter = new FetchSourceFilterBuilder();
		sourceFilter.withExcludes("categories");

		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(QueryBuilders.boolQuery().must(QueryBuilders.termQuery("userId.keyword", userId))
						.must(QueryBuilders.termQuery("categories.id", categoryId)))
				.withIndices("product").withTypes("product").withSourceFilter(sourceFilter.build()).build();

		return elasticsearchOperations.queryForPage(searchQuery, Product.class);

	}
	/*
	 * to find Store by typeName
	 */
	@Override
	public Page<Store> findStoreByTypeName(String name, Pageable pageable) {
		Set<Store> storeSet = new HashSet<>();
		FetchSourceFilterBuilder sourceFilter = new FetchSourceFilterBuilder();
		sourceFilter.withExcludes("deliveryinfo","type");

		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(QueryBuilders.boolQuery().must(QueryBuilders.termQuery("type.name.keyword",name)))
				.withIndices("deliveryinfo").withTypes("deliveryinfo").withSourceFilter(sourceFilter.build()).build();
		
		List<DeliveryInfo> deliveryInfoList=elasticsearchOperations.queryForList(searchQuery, DeliveryInfo.class);
        for(DeliveryInfo delivery: deliveryInfoList) {
        	storeSet.add(delivery.getStore());
        }
		return new PageImpl( new ArrayList<Store>(storeSet));
	}
}
