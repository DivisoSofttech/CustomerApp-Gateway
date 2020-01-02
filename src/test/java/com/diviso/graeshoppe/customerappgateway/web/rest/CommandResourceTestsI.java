package com.diviso.graeshoppe.customerappgateway.web.rest;

import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.diviso.graeshoppe.customerappgateway.CustomerappgatewayApp;
import com.diviso.graeshoppe.customerappgateway.client.aggregators.CustomerAggregator;
import com.diviso.graeshoppe.customerappgateway.config.TestSecurityConfiguration;
import com.diviso.graeshoppe.customerappgateway.service.impl.CustomerCommandServiceImpl;
import com.diviso.graeshoppe.customerappgateway.utils.CustomerAggregatorMapper;
import com.diviso.graeshoppe.customerappgateway.web.rest.errors.ExceptionTranslator;

@SpringBootTest(classes = { CustomerappgatewayApp.class, TestSecurityConfiguration.class })
public class CommandResourceTestsI {

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

	/*
	 * @Test public void test() throws Exception {
	 * mockMVC.perform(post("/api/command/test")) .andExpect(status().isOk()); //
	 * .andExpect(jsonPath("$.[*].value").value(hasItem("It Worked")));
	 * 
	 * }
	 */

	@ParameterizedTest

	@CsvFileSource(resources = "/dump-data/register-customer.csv")
	public void registerCustomer(@CustomerAggregatorMapper CustomerAggregator customerAggregator)
			throws IOException, Exception {
		mockMVC.perform(post("/api/command/customers/register-customer").contentType(TestUtil.APPLICATION_JSON_UTF8)
				.content(TestUtil.convertObjectToJsonBytes(customerAggregator))).andExpect(status().isCreated());

	}

}
