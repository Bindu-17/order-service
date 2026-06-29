package com.project.orderservice.service;

import com.project.orderservice.dto.OrderRequestDto;
import com.project.orderservice.dto.OrderResponseDto;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImple implements OrderService{
    @Override
    public OrderResponseDto createOrder(OrderRequestDto requestDto){
        return new OrderResponseDto();
    }
}
