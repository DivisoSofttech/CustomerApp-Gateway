package com.diviso.graeshoppe.customerappgateway.service;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.diviso.graeshoppe.customerappgateway.CustomerappgatewayApp;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.CustomerDTO;
import com.diviso.graeshoppe.customerappgateway.config.TestSecurityConfiguration;

@SpringBootTest(classes = { CustomerappgatewayApp.class, TestSecurityConfiguration.class })
public class CustomerQueryServiceTest {

	@Autowired
	private CustomerQueryService customerQueryService;
	
	@ParameterizedTest
	@ValueSource(strings = {"test"})
	public void findCustomerByIdpCode(String idpCode) {
		CustomerDTO result = customerQueryService.findCustomerByIdpCode(idpCode);
		assertAll("Customer", 
				()->{
					assertNotNull(result);
					assertEquals("Equals", idpCode, result.getIdpCode());
				});
		
	}
	
	
}
