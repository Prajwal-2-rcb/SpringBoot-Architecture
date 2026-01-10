package com.codesnippet.springbootdemoapplication.Service;

public class GPayService implements PaymentService {


    @Override
    public void processPayment(double amount) {
        System.out.println("GPAY");
    }
}
