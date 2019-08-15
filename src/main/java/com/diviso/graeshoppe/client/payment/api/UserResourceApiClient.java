package com.diviso.graeshoppe.client.payment.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.client.payment.RazorpayClientConfiguration;

@FeignClient(name="${payment.name:payment}", url="${payment.url}", configuration = RazorpayClientConfiguration.class)
public interface UserResourceApiClient extends UserResourceApi {
}
