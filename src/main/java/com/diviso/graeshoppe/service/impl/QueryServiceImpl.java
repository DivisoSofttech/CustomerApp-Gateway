package com.diviso.graeshoppe.service.impl;

import static org.elasticsearch.action.search.SearchType.QUERY_THEN_FETCH;
import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;
import static org.elasticsearch.index.query.QueryBuilders.rangeQuery;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;
import io.searchbox.core.search.aggregation.TermsAggregation.Entry;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.elasticsearch.core.query.StringQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.customer.model.Customer;
import com.diviso.graeshoppe.client.customer.model.FavouriteProduct;
import com.diviso.graeshoppe.client.customer.model.FavouriteStore;
import com.diviso.graeshoppe.client.order.model.Address;
import com.diviso.graeshoppe.client.order.model.AuxilaryOrderLine;
import com.diviso.graeshoppe.client.order.model.Notification;
import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.client.order.model.OrderLine;
import com.diviso.graeshoppe.client.product.model.Product;
import com.diviso.graeshoppe.client.store.model.Store;
import com.diviso.graeshoppe.service.QueryService;
import com.diviso.graeshoppe.service.StoreQueryService;
import com.github.vanroy.springdata.jest.JestElasticsearchTemplate;
import com.github.vanroy.springdata.jest.aggregation.AggregatedPage;

import io.searchbox.client.JestClient;
import io.searchbox.core.search.aggregation.TermsAggregation;

@Service
public class QueryServiceImpl implements QueryService{
	
	private final JestClient jestClient;
	private final JestElasticsearchTemplate elasticsearchTemplate;

	int i = 0;
	Long count = 0L;
	private final Logger log = LoggerFactory.getLogger(QueryServiceImpl.class);

	public QueryServiceImpl(JestClient jestClient) {
		this.jestClient = jestClient;
		this.elasticsearchTemplate = new JestElasticsearchTemplate(this.jestClient);
	}

	@Autowired
	ElasticsearchOperations elasticsearchOperations;

	
	@Override
	public Page<Customer> findAllCustomersWithoutSearch(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).withPageable(pageable)
				.build();
		return elasticsearchOperations.queryForPage(searchQuery, Customer.class);
	}

	

	@Override
	public Customer findCustomerByReference(String reference) {

		StringQuery searchQuery = new StringQuery(termQuery("reference", reference).toString());
		return elasticsearchOperations.queryForObject(searchQuery, Customer.class);
	}
	
	@Override
	public Page<Address> findByCustomerId(String customerId, Pageable pageable) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("customerId.keyword", customerId))
				.withIndices("orderaddress").withPageable(pageable).build();
		return elasticsearchOperations.queryForPage(searchQuery, Address.class);
	}

	@Override
	public Order findById(Long id) {

		StringQuery query = new StringQuery(termQuery("id", id).toString());
		return elasticsearchOperations.queryForObject(query, Order.class);

	}
	
	@Override
	public Page<Order> findOrderByCustomerId(String customerId, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("customerId", customerId))
				.withSort(SortBuilders.fieldSort("id").order(SortOrder.DESC)).withPageable(pageable).build();

		Page<Order> orderPage = elasticsearchOperations.queryForPage(searchQuery, Order.class);
		orderPage.forEach(order -> {

			order.setOrderLines(new HashSet<OrderLine>(findOrderLinesByOrderId(order.getId())));
		});
		return orderPage;

	}

	@Override
	public List<OrderLine> findOrderLinesByOrderId(Long orderId) {
		StringQuery searchQuery = new StringQuery(termQuery("order.id", orderId).toString());
		return elasticsearchOperations.queryForList(searchQuery, OrderLine.class);
	}
	
	@Override
	public Page<OrderLine> findAllOrderLinesByOrderId(Long orderId, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("order.id", orderId))
				.withPageable(pageable).build();
		return elasticsearchOperations.queryForPage(searchQuery, OrderLine.class);
	}
	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.diviso.graeshoppe.service.QueryService#findOrderByOrderId(java.lang.
	 * String)
	 */
	@Override
	public Order findOrderByOrderId(String orderId) {
		StringQuery stringQuery = new StringQuery(termQuery("orderId.keyword", orderId).toString());
		return elasticsearchOperations.queryForObject(stringQuery, Order.class);
	}

	@Override
	public Long findOrderCountByCustomerId(String customerId) {
		Long count = 0l;
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery())
				.withSearchType(QUERY_THEN_FETCH)

				.withIndices("order").withTypes("order")
				.addAggregation(AggregationBuilders.terms("customerorder").field("customerId.keyword")).build();

		AggregatedPage<Order> result = elasticsearchTemplate.queryForPage(searchQuery, Order.class);
		TermsAggregation categoryAggregation = result.getAggregation("customerorder", TermsAggregation.class);
		count = categoryAggregation.getBuckets().stream().filter(entry -> entry.getKey().equals(customerId)).findFirst()
				.get().getCount();

		return count;

	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findOrderByStatusName(java.lang.
	 * String)
	 */
	@Override
	public Page<Order> findOrderByStatusName(String statusName) {

		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(matchQuery("status.name.keyword", statusName)).build();

		return elasticsearchOperations.queryForPage(searchQuery, Order.class);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.diviso.graeshoppe.service.QueryService#findDeliveryinfobydatebetween(java
	 * .time.Instant, java.time.Instant)
	 */
	@Override
	public Page<Order> findOrderByDatebetweenAndStoreId(Instant from, Instant to, String storeId) {
		// .........
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(QueryBuilders.boolQuery()
				.must(termQuery("storeId", storeId)).must(rangeQuery("date").gte(from).lte(to))).build();

		return elasticsearchOperations.queryForPage(searchQuery, Order.class);
	}
	
	@Override
	public Page<FavouriteProduct> findFavouriteProductsByCustomerReference(String reference, Pageable pageable) {
		// .........
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(matchQuery("customer.reference", reference)).withPageable(pageable).build();

		return elasticsearchOperations.queryForPage(searchQuery, FavouriteProduct.class);
	}



	@Override
	public Page<FavouriteStore> findFavouriteStoresByCustomerReference(String reference, Pageable pageable) {
		// .........
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(matchQuery("customer.reference", reference)).withPageable(pageable).build();

		return elasticsearchOperations.queryForPage(searchQuery, FavouriteStore.class);
	}
	
	@Override
	public Page<Notification> findNotificationByReceiverId(String receiverId, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(termQuery("receiverId", receiverId))
				.withSort(SortBuilders.fieldSort("id").order(SortOrder.DESC))
				.withPageable(pageable).build();

		return elasticsearchOperations.queryForPage(searchQuery, Notification.class);
	}



	@Override
	public Long findNotificationCountByReceiverIdAndStatusName(String receiverId, String status) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("receiverId", receiverId))
						.must(QueryBuilders.matchQuery("status", status)))
				.build();
		return elasticsearchOperations.count(searchQuery, Notification.class);
	}

	@Override
	public Page<AuxilaryOrderLine> findAuxilaryOrderLineByOrderLineId(Long orderLineId, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(termQuery("orderLine.id", orderLineId))
				.withPageable(pageable).build();
		return elasticsearchOperations.queryForPage(searchQuery, AuxilaryOrderLine.class);
	}

}
