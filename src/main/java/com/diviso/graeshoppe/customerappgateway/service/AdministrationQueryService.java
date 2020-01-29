package com.diviso.graeshoppe.customerappgateway.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.customerappgateway.client.administration.model.About;
import com.diviso.graeshoppe.customerappgateway.client.administration.model.AboutDTO;
import com.diviso.graeshoppe.customerappgateway.client.administration.model.Banner;
import com.diviso.graeshoppe.customerappgateway.client.administration.model.CancelledOrderLine;
import com.diviso.graeshoppe.customerappgateway.client.administration.model.SubTerm;
import com.diviso.graeshoppe.customerappgateway.client.administration.model.SubTermDTO;
import com.diviso.graeshoppe.customerappgateway.client.administration.model.Term;
import com.diviso.graeshoppe.customerappgateway.client.administration.model.TermDTO;

public interface AdministrationQueryService {

	
	Page<Banner> findPremiumBanners(Pageable pageable);

	Page<CancelledOrderLine> findCancelledOrderLinesByCancellationRequestId(Long id, Pageable pageable);

	public About findAboutById(Long id);

	public Term findTermById(Long id);
	
	public SubTerm findSubTermById(Long id);

	public List<SubTerm> getSubTermsByTermId(Long id);

	Page<Term> findallterms(Pageable pageable);

	Page<About> findallabout(Pageable pageable);
	
}
