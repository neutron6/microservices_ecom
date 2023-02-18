package com.adminService.dao;

import com.adminService.entity.Admin;
import com.adminService.repo.AdminRepo;
import com.adminService.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Component
public class AdminDao {

    @Autowired
    AdminRepo adminRepoImpl;

    @Autowired
    RestTemplate restTemplate;

    public Admin saveData(Admin admin) {
        return adminRepoImpl.save(admin);
    }


    public Admin validate(int adminId, String adminPass) {
        Optional<Admin> admin = adminRepoImpl.findById(adminId);

        if (admin.isPresent() && admin.get().getAdminPass().equals(adminPass)) {
            return admin.get();
        }
        return null;
    }


    public RestTemplateVO getDataByAdminId(int adminId) {

        RestTemplateVO restTemplateVO = new RestTemplateVO();

        Admin admin = adminRepoImpl.findByAdminId(adminId);

        Customer customer = restTemplate.getForObject("http://CustomerServices/customer/" + admin.getCustId(), Customer.class);

        Product product = restTemplate.getForObject("http://productService/product/" + admin.getProductId(), Product.class);

        Order order = restTemplate.getForObject("http://OrderServices/order/" + admin.getOrderId(), Order.class);

        Seller seller = restTemplate.getForObject("http://SellerServices/seller/" + admin.getSellerId(), Seller.class);

        restTemplateVO.setCustomer(customer);
        restTemplateVO.setOrder(order);
        restTemplateVO.setProduct(product);
        restTemplateVO.setSeller(seller);
        restTemplateVO.setCustomer(customer);

        return restTemplateVO;
    }
}
