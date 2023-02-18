package com.productService.service;

import com.productService.dao.ProductDao;
import com.productService.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductDao productDaoImpl;

    public Product saveData(Product product) {
        return productDaoImpl.saveData(product);
    }

    public Optional<Product> getDataByProductId(int productId) {
        return productDaoImpl.getDataByProductId(productId);
    }
}
