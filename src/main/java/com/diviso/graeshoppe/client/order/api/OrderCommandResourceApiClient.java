package com.diviso.graeshoppe.client.order.api;

import org.springframework.cloud.openfeign.FeignClient;

import com.diviso.graeshoppe.client.store.ClientConfiguration;

@FeignClient(name="${order.name:order}", url="${order.url}", configuration = ClientConfiguration.class)
public interface OrderCommandResourceApiClient extends OrderCommandResourceApi {
}