package com.project.orderservice.entity;

import lombok.Data;

@Data

public class Order {
    private Long orderId;
    private Long customerId;
    private String productName;
    private Integer quantity;
    private Double price;
    private String status;
}
