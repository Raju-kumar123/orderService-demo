package com.javatechie.order_service.controller;

import com.javatechie.order_service.common.dto.OrderRequestDto;
import com.javatechie.order_service.entity.Order;
import com.javatechie.order_service.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class Ordercontroller {

    @Autowired
    private IOrderService iOrderService;
    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequestDto orderRequestDto){
        Order createdOrder = iOrderService.createOrder(orderRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOrder);
    }
}
