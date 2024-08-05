package com.javatechie.order_service.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequestDto {

    private String name;
    private String customerId;
    private String productType;
    private int quantity;
    private BigDecimal price;
    private Date localDate;
}
