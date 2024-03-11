package org.practice.hibernetdemo.Controllers;

import org.practice.hibernetdemo.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductColtroller {
    @Autowired
    ProductService productService;

    @PostMapping("/product-add")
    public ResponseEntity<?> addProduct(@RequestParam String productId, @RequestParam String productName) {
        productService.addProduct(productId, productName);
        return new ResponseEntity<>("Product added successfully",HttpStatus.OK);
    }

}
