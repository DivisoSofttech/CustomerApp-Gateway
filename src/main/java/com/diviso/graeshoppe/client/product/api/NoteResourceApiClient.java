package com.diviso.graeshoppe.client.product.api;

import org.springframework.cloud.openfeign.FeignClient;

import com.diviso.graeshoppe.client.product.ProductClientConfiguration;

@FeignClient(name="${product.name:product}", url="${product.url:34.73.191.107:8084/}", configuration = ProductClientConfiguration.class)
public interface NoteResourceApiClient extends NoteResourceApi {
}