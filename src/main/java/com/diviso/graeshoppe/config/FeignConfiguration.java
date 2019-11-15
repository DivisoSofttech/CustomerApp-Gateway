package com.diviso.graeshoppe.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.diviso.graeshoppe")
public class FeignConfiguration {

//	@Bean
//	public UndertowServletWebServerFactory embeddedServletContainerFactory() {
//	    UndertowServletWebServerFactory factory = new UndertowServletWebServerFactory();
//	    factory.addBuilderCustomizers(new UndertowBuilderCustomizer() {
//	        @Override
//	        public void customize(Undertow.Builder builder) {
//	            builder.addHttpListener(8071, "0.0.0.0");
//	        }
//	    });
//	    return factory;
//	}
	
    /**
     * Set the Feign specific log level to log client REST requests
     */
    @Bean
    feign.Logger.Level feignLoggerLevel() {
        return feign.Logger.Level.FULL;
    }
}
