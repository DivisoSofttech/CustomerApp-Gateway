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
import com.diviso.graeshoppe.client.order.model.Address;
import com.diviso.graeshoppe.client.order.model.Order;
import com.diviso.graeshoppe.client.order.model.OrderLine;
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
	private final Logger log = LoggerFactory.getLogger(StoreQueryServiceImpl.class);

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
		log.info("Customer Id is " + customerId);
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("customerId.keyword", customerId))
				.withIndices("orderaddress").withTypes("orderaddress").withPageable(pageable).build();
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
				.withPageable(pageable).build();

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
	public Long findOrderCountByCustomerIdAndStatusNameUsingGET(String statusName, String customerId, int page,
			int size, ArrayList arrayList) {


		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery())
				.withSearchType(QUERY_THEN_FETCH).withIndices("order").withTypes("order")
				.addAggregation(AggregationBuilders.terms("customer").field("customerId.keyword")
						.order(org.elasticsearch.search.aggregations.bucket.terms.Terms.Order.aggregation("avgPrice",
								true))
						.subAggregation(AggregationBuilders.avg("avgPrice").field("grandTotal"))
						.subAggregation(AggregationBuilders.terms("statusName").field("status.name.keyword")))
				.build();

		AggregatedPage<Order> result = elasticsearchTemplate.queryForPage(searchQuery, Order.class);

		TermsAggregation orderAgg = result.getAggregation("customer", TermsAggregation.class);
		List<Entry> statusBasedEntry = new ArrayList<Entry>();

		orderAgg.getBuckets().forEach(bucket -> {

			List<Entry> listStatus = bucket.getAggregation("statusName", TermsAggregation.class).getBuckets();

			for (int i = 0; i < listStatus.size(); i++) {

				if (bucket.getKey().equals(customerId)) {
					if (listStatus.get(i).getKey().equals(statusName)) {

						statusBasedEntry
								.add(bucket.getAggregation("statusName", TermsAggregation.class).getBuckets().get(i));
					}
				}

			}

		});

		statusBasedEntry.forEach(e -> {
			count = e.getCount();
		});
		return count;
	}

}
