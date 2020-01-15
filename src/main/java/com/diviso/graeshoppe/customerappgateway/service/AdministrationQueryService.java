package com.diviso.graeshoppe.customerappgateway.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.customerappgateway.client.administration.model.Banner;
import com.diviso.graeshoppe.customerappgateway.client.administration.model.CancelledOrderLine;

public interface AdministrationQueryService {

	
	Page<Banner> findPremiumBanners(Pageable pageable);

	Page<CancelledOrderLine> findCancelledOrderLinesByCancellationRequestId(Long id, Pageable pageable);
}
