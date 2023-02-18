package com.sellerService.dao;

import com.sellerService.entity.Seller;
import com.sellerService.repo.SellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SellerDao {

    @Autowired
    SellerRepo sellerRepoImpl;

    public Seller saveData(Seller seller) {
        return sellerRepoImpl.save(seller);
    }

    public Optional<Seller> getDataBySellerId(int sellerId) {
        return sellerRepoImpl.findById(sellerId);
    }
}
