package com.diviso.graeshoppe.customerappgateway.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.params.aggregator.AggregateWith;


@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@AggregateWith(CustomerArgumentAggregator.class)
public @interface CustomerAggregatorMapper {

}
