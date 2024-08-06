package com.javatechie.order_service.controller;

import com.javatechie.order_service.common.constant.AppConstant;
import com.javatechie.order_service.common.dto.OrderRequestDto;
import com.javatechie.order_service.entity.Order;
import com.javatechie.order_service.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(AppConstant.URL)
public class Ordercontroller {

    @Autowired
    private IOrderService iOrderService;
    @PostMapping(AppConstant.SAVE)
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequestDto orderRequestDto){
        Order createdOrder = iOrderService.createOrder(orderRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOrder);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOne(@PathVariable Long id){
        Order single = iOrderService.getSingle(id);
        return ResponseEntity.status(HttpStatus.OK).body(single);

    }
    @GetMapping("/all")
    public ResponseEntity<List<Order>> getAll(){
        List<Order> allOrders = iOrderService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(allOrders);

    }


}
