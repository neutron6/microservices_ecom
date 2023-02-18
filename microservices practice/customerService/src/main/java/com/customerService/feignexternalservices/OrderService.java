package com.customerService.feignexternalservices;

import com.customerService.vo.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "OrderServices")
public interface OrderService {

    @GetMapping("/{custId}")
    Order getDataById(@PathVariable int custId);
}
