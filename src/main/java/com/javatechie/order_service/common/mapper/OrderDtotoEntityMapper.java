package com.javatechie.order_service.common.mapper;

import com.javatechie.order_service.common.dto.OrderRequestDto;
import com.javatechie.order_service.entity.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderDtotoEntityMapper {

    public Order map(OrderRequestDto orderRequestDto){
        return Order.builder()
                .name(orderRequestDto.getName())
                .customerId(orderRequestDto.getCustomerId())
                .productType(orderRequestDto.getProductType())
                .quantity(orderRequestDto.getQuantity())
                .price(orderRequestDto.getPrice())
                .localDate(orderRequestDto.getLocalDate())
                .build();
    }
}
