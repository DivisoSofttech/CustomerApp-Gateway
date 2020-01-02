package com.diviso.graeshoppe.customerappgateway.utils;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;

import com.diviso.graeshoppe.customerappgateway.client.aggregators.CustomerAggregator;

public class CustomerArgumentAggregator implements ArgumentsAggregator {

	@Override
	public Object aggregateArguments(ArgumentsAccessor accessor, ParameterContext context)
			throws ArgumentsAggregationException {
		CustomerAggregator customerAggregator = new CustomerAggregator();
		customerAggregator.setName(accessor.getString(0));
		customerAggregator.setMobileNumber(accessor.getLong(1));
		customerAggregator.setIdpCode(accessor.getString(2));
		customerAggregator.setEmail(accessor.getString(3));
		customerAggregator.setImageLink(accessor.getString(4));
		customerAggregator.setPhoneCode(accessor.getLong(5));
		customerAggregator.setIdpSub(accessor.getString(6));
		return customerAggregator;

	}

}
