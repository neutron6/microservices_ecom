package com.adminService.entity;

import com.adminService.vo.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin extends Customer {

    @Id
    private int adminId;

    private String adminName;

    private String adminPass;
}
