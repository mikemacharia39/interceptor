package com.mikehenry.interceptor.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private String itemName;
    private int quantity;
    private double amount;
}
