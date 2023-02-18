package com.customerService.entity;

import com.customerService.repo.CustomerRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
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
