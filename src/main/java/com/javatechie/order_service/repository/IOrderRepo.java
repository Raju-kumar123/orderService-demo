package com.javatechie.order_service.repository;

import com.javatechie.order_service.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order,Long> {
}
