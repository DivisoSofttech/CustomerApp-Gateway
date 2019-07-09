package com.diviso.graeshoppe.client.store.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.client.store.ClientConfiguration;

@FeignClient(name="${store.name:store}", url="${store.url}", configuration = ClientConfiguration.class)
public interface ReviewResourceApiClient extends ReviewResourceApi {
}