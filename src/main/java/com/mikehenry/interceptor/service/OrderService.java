package com.mikehenry.interceptor.service;

import com.mikehenry.interceptor.exception.ApplicationException;
import com.mikehenry.interceptor.model.Order;

public interface OrderService {
    void createOrder(Order order) throws ApplicationException;
}
