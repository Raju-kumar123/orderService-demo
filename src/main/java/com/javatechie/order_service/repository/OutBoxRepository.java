package com.javatechie.order_service.repository;

import com.javatechie.order_service.entity.OutBox;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutBoxRepository extends JpaRepository<OutBox,Long> {
}
