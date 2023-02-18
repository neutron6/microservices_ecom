package com.customerService.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    
    private int productId;

    private String productName;

    private double productPrice;

    private int productRating;
}
