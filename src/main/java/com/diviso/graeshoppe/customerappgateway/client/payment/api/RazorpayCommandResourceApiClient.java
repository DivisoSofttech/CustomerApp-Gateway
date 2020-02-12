package com.diviso.graeshoppe.customerappgateway.client.payment.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.diviso.graeshoppe.customerappgateway.client.payment.ClientConfiguration;

@FeignClient(name="${payment.name:payment}", url="${payment.url:dev.ci2.divisosofttech.com:9090/}", configuration = ClientConfiguration.class)
public interface RazorpayCommandResourceApiClient extends RazorpayCommandResourceApi {
}