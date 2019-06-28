package com.diviso.graeshoppe.client.order.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.client.order.OrderClientConfiguration;

@FeignClient(name="${order.name:order}", url="${order.url:35.237.4.7:8088/}", configuration = OrderClientConfiguration.class)
public interface UserResourceApiClient extends UserResourceApi {
}