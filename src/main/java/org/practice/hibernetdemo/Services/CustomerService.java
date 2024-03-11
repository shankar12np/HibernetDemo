package org.practice.hibernetdemo.Services;

import org.practice.hibernetdemo.DAOs.CustomersDAO;
import org.practice.hibernetdemo.DTOs.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {
    @Autowired
    CustomersDAO customersDAO;

  @Transactional
    public void addCostumers(String name, String address){
        Customers addedCostumer = new Customers();
        addedCostumer.getName(name);
        addedCostumer.getAddress(address);
        customersDAO.addCustomers(addedCostumer);
    }
}
