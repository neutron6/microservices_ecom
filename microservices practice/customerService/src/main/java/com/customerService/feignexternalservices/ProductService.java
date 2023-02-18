package com.customerService.feignexternalservices;

import com.customerService.vo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "productService")
public interface ProductService {

    @GetMapping("/{productId}")
    Product getDataByProductId(@PathVariable int productId);
}
