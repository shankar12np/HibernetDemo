package org.practice.hibernetdemo.Controllers;

import org.practice.hibernetdemo.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/customer-add")
    public ResponseEntity<?> addCustomer(@RequestParam String name, @RequestParam String address) {
        customerService.addCostumers(name,address);
        return new ResponseEntity<>("Customer added successfully", HttpStatus.OK);
    }

}
