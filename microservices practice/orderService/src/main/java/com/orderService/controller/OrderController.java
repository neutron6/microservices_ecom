package com.orderService.controller;

import com.orderService.entity.Order;
import com.orderService.service.OrderService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderServiceImpl;

    @PostMapping("/savedata")
    public ResponseEntity<Order> saveData(@RequestBody Order order) {
        return ResponseEntity.ok(orderServiceImpl.saveData(order));
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Optional<Order>> getDataById(@PathVariable int orderId) {
        return ResponseEntity.ok(orderServiceImpl.getDataById(orderId));
    }
    //tgi


}
