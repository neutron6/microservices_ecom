package com.productService.controller;

import com.productService.entity.Product;
import com.productService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productServiceImpl;

    @PostMapping("/saveproduct")
    public ResponseEntity<Product> saveData(@RequestBody Product product) {
        return ResponseEntity.ok(productServiceImpl.saveData(product));
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Optional<Product>> getDataByProductId(@PathVariable int productId) {
        return ResponseEntity.ok(productServiceImpl.getDataByProductId(productId));
    }
}
