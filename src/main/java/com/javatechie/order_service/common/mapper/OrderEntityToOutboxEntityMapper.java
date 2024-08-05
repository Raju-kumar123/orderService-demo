package com.javatechie.order_service.common.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javatechie.order_service.entity.Order;
import com.javatechie.order_service.entity.OutBox;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class OrderEntityToOutboxEntityMapper {

    @SneakyThrows
    public OutBox map(Order order){
        return OutBox.builder()
                .aggregatedId(order.getId().toString())
                .playLoad(new ObjectMapper().writeValueAsString(order))
                .createdAt(new Date())
                .processed(false)
                .build();
    }
}
