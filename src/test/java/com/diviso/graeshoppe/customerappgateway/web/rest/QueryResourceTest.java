package com.diviso.graeshoppe.customerappgateway.web.rest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.diviso.graeshoppe.customerappgateway.CustomerappgatewayApp;
import com.diviso.graeshoppe.customerappgateway.config.TestSecurityConfiguration;
import com.diviso.graeshoppe.customerappgateway.web.rest.errors.ExceptionTranslator;


@SpringBootTest(classes = { CustomerappgatewayApp.class, TestSecurityConfiguration.class })
public class QueryResourceTest {

	private MockMvc mockMVC;

	@Autowired
	private MappingJackson2HttpMessageConverter jacksonMessageConverter;

	@Autowired
	private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

	@Autowired
	private ExceptionTranslator exceptionTranslator;

	@BeforeEach
	public void before() {

		this.mockMVC = MockMvcBuilders.standaloneSetup(new CommandResource())
				.setCustomArgumentResolvers(pageableArgumentResolver).setControllerAdvice(exceptionTranslator)
				.setMessageConverters(jacksonMessageConverter).build();
	}
	
	
	

}
