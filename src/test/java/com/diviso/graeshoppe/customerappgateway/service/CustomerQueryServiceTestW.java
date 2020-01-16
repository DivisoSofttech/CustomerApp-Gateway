package com.diviso.graeshoppe.customerappgateway.service;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.customerappgateway.CustomerappgatewayApp;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.CustomerDTO;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.FavouriteProduct;
import com.diviso.graeshoppe.customerappgateway.config.TestSecurityConfiguration;

@SpringBootTest(classes = { CustomerappgatewayApp.class, TestSecurityConfiguration.class })
public class CustomerQueryServiceTestW {

	@Autowired
	private CustomerQueryService customerQueryService;

	@ParameterizedTest
	@ValueSource(strings = { "test" })
	public void findCustomerByIdpCode(String idpCode) {
		CustomerDTO result = customerQueryService.findCustomerByIdpCode(idpCode);
		assertAll("Customer", () -> {
			assertNotNull(result);
			assertEquals("Equals", idpCode, result.getIdpCode());
		});

	}

	@ParameterizedTest
	@ValueSource(strings = { "test" })
	public void findFavouriteProductsByCustomerIdpCode(String idpCode) {
		int pageNumber = 0;
		int pageSize = 20;
		int totalPages = 2;
		while (pageNumber <= totalPages) {
			Pageable pageable = PageRequest.of(pageNumber, pageSize);
			Page<FavouriteProduct> products = customerQueryService.findFavouriteProductsByCustomerIdpCode(idpCode,
					pageable);
			assertNotNull(products.getContent());
			assertEquals(products.getSize(), pageSize);
			assertEquals(products.getTotalElements(), totalPages * pageSize - pageNumber * pageSize);
			assertEquals(products.getTotalPages(), totalPages - pageNumber);
			pageNumber++;
		}

	}

}
