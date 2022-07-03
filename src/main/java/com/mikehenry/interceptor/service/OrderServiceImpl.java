package com.mikehenry.interceptor.service;

import com.mikehenry.interceptor.exception.ApplicationException;
import com.mikehenry.interceptor.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService{
    @Override
    public void createOrder(Order order) {

        // Do something here
        log.info("Order details: " + order.toString());

        // this is just an exception handling test
        if (order.getQuantity() >= 10) {
            throw new ApplicationException("Quantity too large");
        }
    }
}
