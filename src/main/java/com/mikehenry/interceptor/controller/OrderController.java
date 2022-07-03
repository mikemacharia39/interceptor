package com.mikehenry.interceptor.controller;

import com.mikehenry.interceptor.model.Order;
import com.mikehenry.interceptor.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "order", consumes = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("create")
    public Order createOrder(@RequestBody Order order) {
        orderService.createOrder(order);
        return order;
    }
}
