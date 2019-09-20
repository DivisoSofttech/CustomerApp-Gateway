package com.diviso.graeshoppe.config;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;

import com.diviso.graeshoppe.order.avro.Notificaton;


public interface MessageBinderConfiguration {

	String NOTIFICATION="notificaton";

	@Input(NOTIFICATION)
	KStream<String, Notificaton> order();
	
}
