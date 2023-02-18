package com.APIgateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FallBackController {

    @GetMapping("/customerfallback")
    public ResponseEntity<String> customerFallBack() {
        return new ResponseEntity<>("CUSTOMER SERVICE TEMPORARY DISABLED", HttpStatus.SERVICE_UNAVAILABLE);
    }

    @GetMapping("/productfallback")
    public ResponseEntity<String> productFallBack() {
        return new ResponseEntity<>("PRODUCT SERVICE TEMPORARY DISABLED", HttpStatus.SERVICE_UNAVAILABLE);
    }

    @GetMapping("/orderfallback")
    public ResponseEntity<String> orderFallBack() {
        return new ResponseEntity<>("ORDER SERVICE TEMPORARY DISABLED", HttpStatus.SERVICE_UNAVAILABLE);

    }

    @GetMapping("/sellerfallback")
    public ResponseEntity<String> sellerFallBack() {
        return new ResponseEntity<>("SELLER SERVICE TEMPORARY DISABLED", HttpStatus.SERVICE_UNAVAILABLE);

    }
}
