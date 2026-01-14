package com.codesnippet.springbootdemoapplication.Service;

public class CreditCardService implements PaymentService {



    @Override
    public void processPayment(double amount) {
        System.out.println("Payment credit card completed");
    }
}
