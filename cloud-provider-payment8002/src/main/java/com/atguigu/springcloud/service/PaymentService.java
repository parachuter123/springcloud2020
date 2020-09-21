package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @author : ronan
 * create at:  2020-05-17  20:45
 * @description:
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
