package org.practice.hibernetdemo.DAOs;

import org.hibernate.SessionFactory;
import org.practice.hibernetdemo.DTOs.Customers;
import org.practice.hibernetdemo.DTOs.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomersDAO {
    @Autowired
    SessionFactory sessionFactory;

    public void addCustomers(Customers customers) {
        sessionFactory.getCurrentSession().saveOrUpdate(customers);
    }
}
