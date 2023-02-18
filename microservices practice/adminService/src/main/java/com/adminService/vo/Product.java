package com.adminService.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    
    private int productId;

    private String productName;

    private double productPrice;

    private int productRating;
}
