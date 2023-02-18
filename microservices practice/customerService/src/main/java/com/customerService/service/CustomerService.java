package com.customerService.service;

import com.customerService.dao.CustomerDao;
import com.customerService.entity.Customer;
import com.customerService.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerDao customerDaoImpl;


    public Customer saveData(Customer customer) {
        return customerDaoImpl.saveData(customer);
    }


    public RestTemplateVO getDataByCustId(int custId) {
        return customerDaoImpl.getDataByCustId(custId);
    }

    public RestTemplateVO updateData(Customer customer) {
        return customerDaoImpl.updateData(customer);
    }
}
