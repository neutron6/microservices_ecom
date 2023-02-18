package com.orderService.service;

import com.orderService.dao.OrderDao;
import com.orderService.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderDao orderDaoImpl;

    public Order saveData(Order order) {
        return orderDaoImpl.saveData(order);
    }

    public Optional<Order> getDataById(int orderId) {
        return orderDaoImpl.getDataById(orderId);
    }
}
