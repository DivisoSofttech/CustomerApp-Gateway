package com.diviso.graeshoppe.customerappgateway.client.payment.api;
import com.diviso.graeshoppe.customerappgateway.client.payment.PaymentClientConfiguration;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="${payment.name:payment}", url="${payment.url:dev.ci2.divisosofttech.com:9090/}", configuration = PaymentClientConfiguration.class)
public interface PaymentNotificationResourceApiClient extends PaymentNotificationResourceApi {
}