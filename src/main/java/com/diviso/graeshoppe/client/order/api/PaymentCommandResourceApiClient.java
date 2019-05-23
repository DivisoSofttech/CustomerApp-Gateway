package com.diviso.graeshoppe.client.order.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.client.order.ClientConfiguration;

@FeignClient(name="${order.name:order}", url="${order.url:35.237.237.182:8088/}", configuration = ClientConfiguration.class)
public interface PaymentCommandResourceApiClient extends PaymentCommandResourceApi {
}