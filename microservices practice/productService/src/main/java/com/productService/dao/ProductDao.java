package com.productService.dao;

import com.productService.entity.Product;
import com.productService.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ProductDao {

    @Autowired
    ProductRepo productRepoImpl;


    public Product saveData(Product product) {
        return productRepoImpl.save(product);
    }

    public Optional<Product> getDataByProductId(int productId) {
        return productRepoImpl.findById(productId);
    }
}
