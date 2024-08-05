package com.javatechie.order_service.service;

import com.javatechie.order_service.common.dto.OrderRequestDto;
import com.javatechie.order_service.entity.Order;

public interface IOrderService {

    // create order
    Order createOrder(OrderRequestDto orderRequestDto);
    // get one
    Order getSingle(Long id);
}
