package com.customerService.controller;

import com.customerService.entity.Customer;
import com.customerService.service.CustomerService;
import com.customerService.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerServiceImpl;

    @PostMapping("/savedata")
    public ResponseEntity<Customer> saveData(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerServiceImpl.saveData(customer));
    }

    @GetMapping("/{custId}")
    public ResponseEntity<RestTemplateVO> getDataByCustId(@PathVariable int custId) {
        return ResponseEntity.ok(customerServiceImpl.getDataByCustId(custId));
    }

    @PutMapping("/update")
    public ResponseEntity<RestTemplateVO> updateData(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerServiceImpl.updateData(customer));
    }

}
