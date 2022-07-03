package com.mikehenry.interceptor.controller;

import com.mikehenry.interceptor.model.Order;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "order", consumes = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class OrderController {

    @PostMapping("create")
    public Order createOrder(@RequestBody Order order) {

        return order;
    }
}
