package com.diviso.graeshoppe.customerappgateway.web.rest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


public class TestdemoApplicationTests {

	
	
	@ParameterizedTest
	@ValueSource(strings = {"value1","value2","value3"})
	public void contextLoads(String value) {
		
		System.out.println("mockmvc is "+" values are "+value);
	}

}
