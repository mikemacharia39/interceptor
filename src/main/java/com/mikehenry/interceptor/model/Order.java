package com.mikehenry.interceptor.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Order {
    private String itemName;
    private int quantity;
    private double amount;
}
