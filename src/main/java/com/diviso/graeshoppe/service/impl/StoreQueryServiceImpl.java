package com.diviso.graeshoppe.service.impl;

import static org.elasticsearch.action.search.SearchType.QUERY_THEN_FETCH;
import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;
import static org.elasticsearch.index.query.QueryBuilders.rangeQuery;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.Criteria;
import org.springframework.data.elasticsearch.core.query.CriteriaQuery;
import org.springframework.data.elasticsearch.core.query.FetchSourceFilterBuilder;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.core.query.StringQuery;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

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
import com.diviso.graeshoppe.client.store.domain.HeaderSearch;
import com.diviso.graeshoppe.client.store.domain.Review;
import com.diviso.graeshoppe.client.store.domain.Store;
import com.diviso.graeshoppe.client.store.domain.StoreAddress;
import com.diviso.graeshoppe.client.store.domain.StoreSettings;
import com.diviso.graeshoppe.client.store.domain.StoreType;
import com.diviso.graeshoppe.client.store.domain.Type;
import com.diviso.graeshoppe.client.store.domain.UserRating;

import com.diviso.graeshoppe.service.StoreQueryService;
import com.github.vanroy.springdata.jest.JestElasticsearchTemplate;
import com.github.vanroy.springdata.jest.aggregation.AggregatedPage;
import com.github.vanroy.springdata.jest.mapper.JestResultsExtractor;
import com.google.gson.JsonObject;

import io.searchbox.client.JestClient;
import io.searchbox.core.SearchResult;
import io.searchbox.core.search.aggregation.TermsAggregation;
import io.searchbox.core.search.aggregation.TermsAggregation.Entry;

@Service
public class StoreQueryServiceImpl implements StoreQueryService {


	private final JestClient jestClient;
	private final JestElasticsearchTemplate elasticsearchTemplate;

	private final Logger log = LoggerFactory.getLogger(StoreQueryServiceImpl.class);

	public StoreQueryServiceImpl(JestClient jestClient) {
		this.jestClient = jestClient;
		this.elasticsearchTemplate = new JestElasticsearchTemplate(this.jestClient);
	}

	@Autowired
	ElasticsearchOperations elasticsearchOperations;


	@Override
	public Store findStoreById(Long id) {
		// .........
		StringQuery searchQuery = new StringQuery(termQuery("id", id).toString());
		return elasticsearchOperations.queryForObject(searchQuery, Store.class);

	}
	/*
	 * public List<Result> findAll(String searchTerm, Pageable pageable) {
	 * List<Result> values = new ArrayList<Result>(); ;
	 * 
	 * SearchQuery searchQuery = new NativeSearchQueryBuilder()divisobyta_009
ajith.anand@lxisoft.com
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
	public Page<Review> findAllReviews(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).withPageable(pageable)
				.build();
		return elasticsearchOperations.queryForPage(searchQuery, Review.class);
	}

	@Override
	public Page<UserRating> findAllUserRatings(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).withPageable(pageable)
				.build();
		return elasticsearchOperations.queryForPage(searchQuery, UserRating.class);
	}

	@Override
	public Page<Store> findAllStores(Pageable pageable) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).withPageable(pageable)
				.build();
		Page<Store> storePage = elasticsearchOperations.queryForPage(searchQuery, Store.class);

		storePage.forEach(store -> {
			List<UserRating> userRating = findUserRatingByRegNo(store.getRegNo()).getContent();
			store.setUserRatings(new HashSet<UserRating>(userRating));
		});

		return storePage;
	}

	@Override
	public Store findStoreByRegNo(String regNo) {
		StringQuery stringQuery = new StringQuery(termQuery("regNo", regNo).toString());
		return elasticsearchOperations.queryForObject(stringQuery, Store.class);

	}

	@Override
	public Long findReviewCountByStoreId(String storeId) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("store.regNo", storeId)).build();
		return elasticsearchOperations.count(searchQuery,Review.class);
		
	}
	
	@Override
	public Page<Review> findReviewByStoreId(String storeId) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("store.regNo", storeId)).build();
		
		return elasticsearchOperations.queryForPage(searchQuery, Review.class);
	}

	@Override
	public Page<UserRating> findUserRatingByRegNo(String regNo) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("store.regNo", regNo)).build();
		return elasticsearchOperations.queryForPage(searchQuery, UserRating.class);
	}

	public List<Entry> findStoreTypeAndCount(Pageable pageable) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery())

				.withSearchType(QUERY_THEN_FETCH).withIndices("storetype").withTypes("storetype")

				.addAggregation(AggregationBuilders.terms("totalstoretype").field("name.keyword"))
				.withPageable(pageable).build();

		AggregatedPage<StoreType> result = elasticsearchTemplate.queryForPage(searchQuery, StoreType.class);

		TermsAggregation categoryAggregation = result.getAggregation("totalstoretype", TermsAggregation.class);

		return categoryAggregation.getBuckets();
	}

	@Override
	public UserRating findRatingByStoreIdAndCustomerName(String storeId, String name) {
		StringQuery stringQuery = new StringQuery(
				QueryBuilders.boolQuery().must(QueryBuilders.termQuery("store.regNo", storeId))
						.must(QueryBuilders.termQuery("userName", name)).toString());
		UserRating rating = elasticsearchOperations.queryForObject(stringQuery, UserRating.class);
		return rating;
	}

	@Override
	public UserRating findRatingByStoreId(String storeId) {
		StringQuery stringQuery = new StringQuery(
				QueryBuilders.boolQuery().must(QueryBuilders.termQuery("store.regNo", storeId)).toString());
		UserRating rating = elasticsearchOperations.queryForObject(stringQuery, UserRating.class);
		return rating;
	}

	@Override
	public UserRating findRatingByName(String name) {
		StringQuery stringQuery = new StringQuery(
				QueryBuilders.boolQuery().must(QueryBuilders.termQuery("userName", name)).toString());
		UserRating rating = elasticsearchOperations.queryForObject(stringQuery, UserRating.class);
		return rating;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.diviso.graeshoppe.service.QueryService#
	 * findReviewByStoreIdAndCustomerName (java.lang.String, java.lang.String)
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
		return categoryAggregation.getBuckets();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.diviso.graeshoppe.service.QueryService#findStoreByType(java.lang.
	 * String)
	 */
	@Override
	public Page<Store> findStoreByDeliveryType(String deliveryType) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(termQuery("deliveryInfos.type.name.keyword", deliveryType)).build();
		return elasticsearchOperations.queryForPage(searchQuery, Store.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.diviso.graeshoppe.service.QueryService#findStoreByType(java.lang.
	 * String)
	 */
	@Override
	public Page<Store> findStoreByType(String name, Pageable pageable) {

		Set<Store> storeSet = new HashSet<>();

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("name", name))
				.withPageable(pageable).build();
		List<StoreType> storeTypeList = elasticsearchOperations.queryForList(searchQuery, StoreType.class);
		for (StoreType storeType : storeTypeList) {
			storeSet.add(storeType.getStore());
		}

		return new PageImpl(new ArrayList<Store>(storeSet));
	}


	/*
	 * to find Store by typeName
	 */
	@Override
	public Page<Store> findStoreByTypeName(String name, Pageable pageable) {
		Set<Store> storeSet = new HashSet<>();
		FetchSourceFilterBuilder sourceFilter = new FetchSourceFilterBuilder();
		sourceFilter.withExcludes("deliveryinfo", "type");

		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(QueryBuilders.boolQuery().must(QueryBuilders.termQuery("type.name.keyword", name)))
				.withIndices("deliveryinfo").withTypes("deliveryinfo").withSourceFilter(sourceFilter.build())
				.withPageable(pageable).build();

		List<DeliveryInfo> deliveryInfoList = elasticsearchOperations.queryForList(searchQuery, DeliveryInfo.class);
		for (DeliveryInfo delivery : deliveryInfoList) {
			storeSet.add(delivery.getStore());
		}
		return new PageImpl(new ArrayList<Store>(storeSet));
	}



	@Override
	public Page<Store> findStoreBySearchTerm(String searchTerm, Pageable pageable) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(matchQuery("name", searchTerm).prefixLength(3)).withPageable(pageable).build();

		return elasticsearchOperations.queryForPage(searchQuery, Store.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findAllDeliveryInfosByStoreId(
	 * java. lang .String)
	 */
	@Override
	public Page<Type> findAllDeliveryTypesByStoreId(Long storeId, Pageable pageable) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("store.id", storeId))
				.withPageable(pageable).build();

		Page<DeliveryInfo> deliveryinfos = elasticsearchOperations.queryForPage(searchQuery, DeliveryInfo.class);

		List<Type> types = new ArrayList<Type>();

		deliveryinfos.forEach(deliveryInfo -> {
			types.add(deliveryInfo.getType());

		});

		return new PageImpl(types);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findDeliveryInfoById(java.lang
	 * .Long)
	 */
	@Override
	public DeliveryInfo findDeliveryInfoById(Long id) {

		StringQuery searchQuery = new StringQuery(termQuery("id", id).toString());

		return elasticsearchOperations.queryForObject(searchQuery, DeliveryInfo.class);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.diviso.graeshoppe.service.QueryService#findStoreByRating(java.lang.
	 * Double)
	 */
	@Override
	public Page<Store> findStoreByRating() {

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(rangeQuery("totalRating").gte(1).lte(5))
				.withSort(SortBuilders.fieldSort("totalRating").order(SortOrder.DESC)).build();

		return elasticsearchOperations.queryForPage(searchQuery, Store.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findDeliveryInfoByStoreId(java
	 * .lang.String)
	 */
	@Override
	public Page<DeliveryInfo> findDeliveryInfoByStoreId(String storeId) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("store.regNo", storeId)).build();

		return elasticsearchOperations.queryForPage(searchQuery, DeliveryInfo.class);
	}


	public Page<Store> headerSearch(String searchTerm, Pageable pageable) {
		Set<Store> storeSet = new HashSet<Store>();
		Set<HeaderSearch> values = new HashSet<HeaderSearch>();

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchQuery("name", searchTerm))
				.withPageable(pageable).build();

		elasticsearchTemplate.query(searchQuery, new JestResultsExtractor<Set<HeaderSearch>>() {

			@Override
			public Set<HeaderSearch> extract(SearchResult response) {

				for (SearchResult.Hit<JsonObject, Void> searchHit : response.getHits(JsonObject.class)) {
					HeaderSearch result = new HeaderSearch();

					if (searchHit.index.equals("store")) {
						result.setStoreNo(searchHit.source.get("regNo").getAsString());
					} else {
						result.setStoreNo(searchHit.source.get("iDPcode").getAsString());
					}

					values.add(result);

				}
				return values;
			}
		});

		for (HeaderSearch r : values) {
			StringQuery stringQuery = new StringQuery(termQuery("regNo.keyword", r.getStoreNo()).toString());
			storeSet.add(elasticsearchOperations.queryForObject(stringQuery, Store.class));
		}
		List<Store> storeList = new ArrayList<>();
		storeList.addAll(storeSet);

		return new PageImpl(storeList);

	}

	/*
	 * @Override public Page<Store> findByLocationNear(Point point, Distance
	 * distance, Pageable pageable) { // TODO Auto-generated method stub return
	 * storeSearchRepository.findByLocationNear(point,distance,pageable); }
	 */

	private CriteriaQuery getGeoQuery(Point point, Distance distance) {
		return new CriteriaQuery(new Criteria("location").within(point, distance));
	}

	@Override
	public Page<Store> findStoreByLocationName(String locationName) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(matchQuery("locationName", locationName).prefixLength(3)).build();

		return elasticsearchOperations.queryForPage(searchQuery, Store.class);
	}

	@Override
	public Page<Store> findAndSortStoreByMinAount(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery())
				.withSort(SortBuilders.fieldSort("minAmount").order(SortOrder.DESC)).withPageable(pageable).build();
		return elasticsearchOperations.queryForPage(searchQuery, Store.class);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.diviso.graeshoppe.service.QueryService#findStoreTypeByStoreId(java.
	 * lang.String, org.springframework.data.domain.Pageable)
	 */
	@Override
	public Page<StoreType> findStoreTypeByStoreId(String storeId, Pageable pageable) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("store.regNo", storeId))
				.withPageable(pageable).build();

		return elasticsearchOperations.queryForPage(searchQuery, StoreType.class);
	}


	/*
	 * @Override public List<Entry> findAllDeliveryCountByStoreId(String storeId,
	 * Pageable pageable) { List<String> carList = new ArrayList<String>();
	 * SearchQuery searchQuery = new
	 * NativeSearchQueryBuilder().withQuery(matchAllQuery())
	 * .withSearchType(QUERY_THEN_FETCH).withIndices("order").withTypes("order")
	 * .addAggregation(AggregationBuilders.terms("storeId").field(
	 * "storeId.keyword")
	 * .order(org.elasticsearch.search.aggregations.bucket.terms.Terms.Order
	 * .aggregation("deliveryInfo.deliveryType", true))
	 * .subAggregation(AggregationBuilders.avg("avgPrice").field("grandTotal"))
	 * .subAggregation(AggregationBuilders.terms("make").field("make.keyword")))
	 * .build();
	 * 
	 * MetricAggregation result = elasticsearchTemplate.query(searchQuery, new
	 * JestResultsExtractor<MetricAggregation>() {
	 * 
	 * @Override public MetricAggregation extract(SearchResult response) { return
	 * response.getAggregations(); } });
	 * 
	 * TermsAggregation colourtAgg = result.getTermsAggregation("storeId");
	 * 
	 * colourtAgg.getBuckets().forEach(bucket -> {
	 * 
	 * double averagePrice = bucket.getAvgAggregation("avgPrice").getAvg();
	 * System.out.println(String.
	 * format("Key: %s, Doc count: %d, Average Price: %f", bucket.getKey(),
	 * bucket.getCount(), averagePrice)); System.out.println("SSSSSSSSSSSSSSSSSS" +
	 * bucket.getAggregation("make",
	 * TermsAggregation.class).getBuckets().get(1).getKeyAsString());
	 * System.out.println( "SSSSSSSSSSSSSSSSSS" + bucket.getAggregation("make",
	 * TermsAggregation.class).getBuckets().size()); }); return
	 * colourtAgg.getBuckets();
	 * 
	 * }
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.diviso.graeshoppe.service.QueryService#findByLocationNear(org.
	 * springframework.data.geo.Point, org.springframework.data.geo.Distance)
	 */
	/*
	 * @Override public Page<Store> findByLocationNear(Point point, Distance
	 * distance,Pageable pageable) {
	 * 
	 * return storeSearchrepository.findByLocationNear(point,distance,pageable); }
	 */

	public StoreSettings getStoreSettings(String IDPCode) {

		StringQuery searchQuery = new StringQuery(termQuery("regNo", IDPCode).toString());
		Store store = elasticsearchOperations.queryForObject(searchQuery, Store.class);
		return store.getStoreSettings();
	}

	public StoreAddress getStoreAddress(String IDPCode) {

		StringQuery searchQuery = new StringQuery(termQuery("regNo", IDPCode).toString());
		Store store = elasticsearchOperations.queryForObject(searchQuery, Store.class);
		return store.getStoreAddress();
	}


}
