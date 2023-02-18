package com.adminService.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {


    @Id
    private int custId;

    private String custName;

    private String custEmail;

    private String custPass;

    private String custAddress;

    private int orderId;

    private int productId;

    private int sellerId;

}

