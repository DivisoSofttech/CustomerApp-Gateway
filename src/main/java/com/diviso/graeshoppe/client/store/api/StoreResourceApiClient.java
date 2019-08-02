package com.diviso.graeshoppe.client.store.api;

import org.springframework.cloud.openfeign.FeignClient;

import com.diviso.graeshoppe.client.store.StoreClientConfiguration;


@FeignClient(name="${store.name:store}", url="${store.url:34.74.142.114:8071/}", configuration = StoreClientConfiguration.class)
public interface StoreResourceApiClient extends StoreResourceApi {
}