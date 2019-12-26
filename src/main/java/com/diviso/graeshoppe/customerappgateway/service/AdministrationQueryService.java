package com.diviso.graeshoppe.customerappgateway.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.customerappgateway.client.administration.model.Banner;

public interface AdministrationQueryService {

	
	Page<Banner> findPremiumBanners(Pageable pageable);
}
