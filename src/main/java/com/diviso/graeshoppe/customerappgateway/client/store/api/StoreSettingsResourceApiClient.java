package com.diviso.graeshoppe.customerappgateway.client.store.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.customerappgateway.client.store.StoreClientConfiguration;

@FeignClient(name="${store.name:store}", url="${store.url}", configuration = StoreClientConfiguration.class)
public interface StoreSettingsResourceApiClient extends StoreSettingsResourceApi {
}