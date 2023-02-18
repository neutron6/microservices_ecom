package com.sellerService.service;

import com.sellerService.dao.SellerDao;
import com.sellerService.entity.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SellerService {

    @Autowired
    SellerDao sellerDaoImpl;

    public Seller saveData(Seller seller) {
        return sellerDaoImpl.saveData(seller);
    }

    public Optional<Seller> getDataBySellerId(int sellerId) {
        return sellerDaoImpl.getDataBySellerId(sellerId);
    }
}
