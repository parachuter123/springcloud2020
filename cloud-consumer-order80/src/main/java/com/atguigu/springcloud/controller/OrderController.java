package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author : ronan
 * create at:  2020-09-16  21:01
 * @description:
 */
@RestController
@Slf4j
public class OrderController {
    public static final String PAYMENT_RUL = "http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create( Payment payment){
        return restTemplate.postForObject(PAYMENT_RUL + "/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> gePayment(@PathVariable("id") Long id ){
        return restTemplate.getForObject(PAYMENT_RUL + "/payment/getPaymentById/" + id,CommonResult.class);
    }

}
