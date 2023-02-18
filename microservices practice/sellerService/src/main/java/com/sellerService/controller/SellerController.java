package com.sellerService.controller;

import com.sellerService.entity.Seller;
import com.sellerService.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    SellerService sellerServiceImpl;

    @PostMapping("/savedata")
    public ResponseEntity<Seller> saveData(@RequestBody Seller seller) {
        return ResponseEntity.ok(sellerServiceImpl.saveData(seller));
    }

    @GetMapping("/{sellerId}")
    public ResponseEntity<Optional<Seller>> getDataBySellerId(@PathVariable int sellerId) {
        return ResponseEntity.ok(sellerServiceImpl.getDataBySellerId(sellerId));
    }

}
