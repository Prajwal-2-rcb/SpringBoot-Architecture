package com.codesnippet.springbootdemoapplication.Config;

import com.codesnippet.springbootdemoapplication.Service.CreditCardService;
import com.codesnippet.springbootdemoapplication.Service.GPayService;
import com.codesnippet.springbootdemoapplication.Service.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {

    @Bean
    public PaymentService creditCardPaymentService() {
        return new CreditCardService();
    }

    @Bean
    public PaymentService getPaymentService() {
        return new GPayService();
    }
}
