package com.orderService.dao;

import com.orderService.entity.Order;
import com.orderService.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OrderDao {

    @Autowired
    OrderRepo orderRepoImpl;

    public Order saveData(Order order) {
        return orderRepoImpl.save(order);
    }

    public Optional<Order> getDataById(int orderId) {
        return orderRepoImpl.findById(orderId);
    }
}
