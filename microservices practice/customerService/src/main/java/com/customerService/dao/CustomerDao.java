package com.customerService.dao;

import com.customerService.entity.Customer;
import com.customerService.feignexternalservices.OrderService;
import com.customerService.feignexternalservices.ProductService;
import com.customerService.repo.CustomerRepo;
import com.customerService.vo.Order;
import com.customerService.vo.Product;
import com.customerService.vo.RestTemplateVO;
import com.customerService.vo.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Component
public class CustomerDao {

    @Autowired
    CustomerRepo customerRepoImpl;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderService orderService;


    public Customer saveData(Customer customer) {
        return customerRepoImpl.save(customer);
    }


    public RestTemplateVO getDataByCustId(int custId) {

        RestTemplateVO restTemplateVO = new RestTemplateVO();

        Customer customer = customerRepoImpl.findByCustId(custId);

        Product product = restTemplate.getForObject("http://productService/product/" + customer.getProductId(), Product.class);

        Order order = restTemplate.getForObject("http://OrderServices/order/" + customer.getOrderId(), Order.class);

        Seller seller = restTemplate.getForObject("http://SellerServices/seller/" + customer.getSellerId(), Seller.class);

        restTemplateVO.setCustomer(customer);
        restTemplateVO.setOrder(order);
        restTemplateVO.setProduct(product);
        restTemplateVO.setSeller(seller);

        //Product product = productService.getDataByProductId(customer.getProductId());

        //Order order = orderService.getDataById(customer.getProductId());
        return restTemplateVO;
    }

    public RestTemplateVO updateData(Customer customer) {

        RestTemplateVO restTemplateVO = new RestTemplateVO();
        Customer customer1 = customerRepoImpl.save(customer);

        Product product = restTemplate.getForObject("http://productService/product/" + customer.getProductId(), Product.class);

        Order order = restTemplate.getForObject("http://OrderServices/order/" + customer.getOrderId(), Order.class);

        Seller seller = restTemplate.getForObject("http://SellerServices/seller/" + customer.getSellerId(), Seller.class);

        restTemplateVO.setCustomer(customer);
        restTemplateVO.setOrder(order);
        restTemplateVO.setProduct(product);
        restTemplateVO.setSeller(seller);


        return restTemplateVO;
    }
}
