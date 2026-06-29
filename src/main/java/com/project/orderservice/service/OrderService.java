package com.project.orderservice.service;

import com.project.orderservice.dto.OrderRequestDto;
import com.project.orderservice.dto.OrderResponseDto;

public interface OrderService {
   public OrderResponseDto createOrder(OrderRequestDto requestDto);
}
