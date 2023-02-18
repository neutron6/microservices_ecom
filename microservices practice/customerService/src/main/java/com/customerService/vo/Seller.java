package com.customerService.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seller {

    @Id
    private int sellerId;

    private String sellerName;

    private Long sellerContact;

    private String sellerPlace;

}