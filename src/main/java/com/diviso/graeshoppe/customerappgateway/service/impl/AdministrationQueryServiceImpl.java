package com.diviso.graeshoppe.customerappgateway.service.impl;

import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.index.Terms;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.customerappgateway.client.administration.model.About;
import com.diviso.graeshoppe.customerappgateway.client.administration.model.Banner;
import com.diviso.graeshoppe.customerappgateway.client.administration.model.CancelledOrderLine;
import com.diviso.graeshoppe.customerappgateway.client.administration.model.SubTerm;
import com.diviso.graeshoppe.customerappgateway.client.administration.model.Term;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.OrderLine;
import com.diviso.graeshoppe.customerappgateway.config.elasticsearch.ServiceUtility;
import com.diviso.graeshoppe.customerappgateway.service.AdministrationQueryService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AdministrationQueryServiceImpl implements AdministrationQueryService {

	private final Logger log = LoggerFactory.getLogger(AdministrationQueryServiceImpl.class);

	
	@Autowired
	ServiceUtility serviceUtility;
	
	@Autowired
	private RestHighLevelClient restHighLevelClient;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Override
	public Page<Banner> findPremiumBanners(Pageable pageable) {
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(matchAllQuery());

		SearchResponse searchResponse = serviceUtility.searchResponseForPage("premiumbanner", searchSourceBuilder, pageable);

		return serviceUtility.getPageResult(searchResponse, pageable, new Banner());
	}
	@Override
	public Page<CancelledOrderLine> findCancelledOrderLinesByCancellationRequestId(Long id,Pageable pageable){
	
		QueryBuilder dslQuery = QueryBuilders.boolQuery().filter(termQuery("cancellationRequest.id",id));
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(dslQuery);

		SearchResponse searchResponse = serviceUtility.searchResponseForPage("cancelledorderline", searchSourceBuilder, pageable);

		return serviceUtility.getPageResult(searchResponse, pageable, new CancelledOrderLine());
		
		
	}
	
	@Override
	public About findAboutById(Long id){
		
		QueryBuilder dslQuery = QueryBuilders.termQuery("id", id);

		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(dslQuery);
		SearchResponse response = serviceUtility.searchResponseForObject("about",dslQuery);
		
		
		return serviceUtility.getObjectResult(response, new About());
		
	}
	
	@Override
	public Term findTermById(Long id){
		
		QueryBuilder dslQuery = QueryBuilders.termQuery("id", id);

		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(dslQuery);
		SearchResponse response = serviceUtility.searchResponseForObject("term",dslQuery);
		
		
		return serviceUtility.getObjectResult(response, new Term());
		
	}
	
	@Override
	public SubTerm findSubTermById(Long id){
		
		QueryBuilder dslQuery = QueryBuilders.termQuery("id", id);

		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(dslQuery);
		SearchResponse response = serviceUtility.searchResponseForObject("subterm",dslQuery);
		
		
		return serviceUtility.getObjectResult(response, new SubTerm());
		
	}
	@Override
	public List<SubTerm> getSubTermsByTermId(Long id) {

		log.debug("<<<<<<<<<getSubTermsByTermId >>>>>>>{}", id);
		QueryBuilder dslQuery = QueryBuilders.termQuery("id", id);
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
		
		searchSourceBuilder.query(dslQuery);
		searchSourceBuilder.sort("subtermId", SortOrder.ASC);
		SearchRequest searchRequest = new SearchRequest("subterm");
		searchRequest.source(searchSourceBuilder);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
		} catch (IOException e) { // TODO Auto-generated
			e.printStackTrace();
		}

		SearchHit[] searchHit = searchResponse.getHits().getHits();

		List<SubTerm>  subTermList = new ArrayList<>();

		for (SearchHit hit : searchHit) {
			subTermList.add(objectMapper.convertValue(hit.getSourceAsMap(),SubTerm.class));
		}

		log.debug("<<<<<<<<<<<<output{}",subTermList);

		return subTermList;

	}
	
	@Override
	public Page<Term> findallterms(Pageable pageable) {

			log.debug("Term",pageable);
			QueryBuilder dslbuilder = QueryBuilders.matchAllQuery();
			SearchSourceBuilder builder = new SearchSourceBuilder();
			builder.query(dslbuilder);

			SearchResponse response = serviceUtility.searchResponseForPage("term", builder, pageable);
			return serviceUtility.getPageResult(response, pageable, new Term());
		
	}
	

	@Override
	public Page<About> findallabout(Pageable pageable) {

			log.debug("about",pageable);
			QueryBuilder dslbuilder = QueryBuilders.matchAllQuery();
			SearchSourceBuilder builder = new SearchSourceBuilder();
			builder.query(dslbuilder);

			SearchResponse response = serviceUtility.searchResponseForPage("about", builder, pageable);
			return serviceUtility.getPageResult(response, pageable, new About());
		
	}
	@Override
	public ResponseEntity<List<Term>> getTermByTermId(Long id) {
		log.debug("<<<<<<getTermByTermId >>>>>>>{}",id);
		System.out.println("<<<<<<sys<<<<<getTermByTermId >>>>>>>{}");
		QueryBuilder dslQuery =QueryBuilders.termQuery("id", id);
		SearchSourceBuilder builder = new SearchSourceBuilder();
		builder.query(dslQuery);
		builder.sort("termId", SortOrder.DESC);
		SearchRequest request = new SearchRequest("term");
		request.source(builder);
		SearchResponse response = null;
		SearchHit searchHit[]=response.getHits().getHits();

		ArrayList<Term> terms = new ArrayList<>();
		
		try {
			response=restHighLevelClient.search(request, RequestOptions.DEFAULT);
		}catch (IOException e){
			e.printStackTrace();
		}
		for(SearchHit hit : searchHit) {
			terms.add(objectMapper.convertValue(hit.getSourceAsMap(), Term.class));
		}
		
		return ResponseEntity.ok().body(terms);
	}
}
	

