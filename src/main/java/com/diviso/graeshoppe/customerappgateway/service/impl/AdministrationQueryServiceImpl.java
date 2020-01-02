package com.diviso.graeshoppe.customerappgateway.service.impl;

import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.customerappgateway.client.administration.model.Banner;
import com.diviso.graeshoppe.customerappgateway.config.elasticsearch.ServiceUtility;
import com.diviso.graeshoppe.customerappgateway.service.AdministrationQueryService;

@Service
public class AdministrationQueryServiceImpl implements AdministrationQueryService {

	@Autowired
	ServiceUtility serviceUtility;
	
	
	@Override
	public Page<Banner> findPremiumBanners(Pageable pageable) {
		
		SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

		searchSourceBuilder.query(matchAllQuery());

		SearchResponse searchResponse = serviceUtility.searchResponseForPage("premium_banner", searchSourceBuilder, pageable);

		return serviceUtility.getPageResult(searchResponse, pageable, new Banner());
	}

}

	


