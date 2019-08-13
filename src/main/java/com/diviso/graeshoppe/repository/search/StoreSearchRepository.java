package com.diviso.graeshoppe.repository.search;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.repository.query.Param;

import com.diviso.graeshoppe.client.store.domain.Store;

public interface StoreSearchRepository extends ElasticsearchRepository<Store, Long> {

	
	Page<Store> findByLocationNear(@Param("location") Point point, @Param("distance") Distance distance, Pageable pageable);
	
}
