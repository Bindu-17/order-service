package com.project.orderservice.controller;

import com.project.orderservice.dto.OrderResponseDto;
import com.project.orderservice.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Orders")
public class OrderController {
    private  final OrderService service;
    public OrderController(OrderService service){
        this.service = service;
    }
    @PostMapping
    public OrderResponseDto createOrder(@RequestBody OrderResponseDto responseDto){
        return service.createOrder(responseDto);
    }
}
