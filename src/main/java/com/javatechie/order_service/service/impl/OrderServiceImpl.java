package com.javatechie.order_service.service.impl;

import com.javatechie.order_service.common.dto.OrderRequestDto;
import com.javatechie.order_service.common.mapper.OrderDtotoEntityMapper;
import com.javatechie.order_service.common.mapper.OrderEntityToOutboxEntityMapper;
import com.javatechie.order_service.entity.Order;
import com.javatechie.order_service.entity.OutBox;
import com.javatechie.order_service.repository.IOrderRepo;
import com.javatechie.order_service.repository.OutBoxRepository;
import com.javatechie.order_service.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderDtotoEntityMapper orderDtotoEntityMapper;

    @Autowired
    private IOrderRepo iOrderRepo;

    @Autowired
    private OrderEntityToOutboxEntityMapper toOutboxEntityMapper;

    @Autowired
    private OutBoxRepository outBoxRepository;


    @Transactional
    @Override
    public Order createOrder(OrderRequestDto orderRequestDto) {
         Order order= orderDtotoEntityMapper.map(orderRequestDto);
         iOrderRepo.save(order);
         // after putting forcely exception, transaction is rollBack and data does persist
        // into  database
        //System.out.println(10/0);
        OutBox outBox = toOutboxEntityMapper.map(order);
           outBoxRepository.save(outBox);
        return order;
    }
}
