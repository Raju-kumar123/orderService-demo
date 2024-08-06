package com.javatechie.order_service.service;

import com.javatechie.order_service.common.dto.OrderRequestDto;
import com.javatechie.order_service.entity.Order;

import java.util.List;

public interface IOrderService {

    // create order
    Order createOrder(OrderRequestDto orderRequestDto);
    // get one
    Order getSingle(Long id);

    // get all
    List<Order> getAll();
}
