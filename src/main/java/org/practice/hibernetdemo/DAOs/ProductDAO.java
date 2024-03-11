package org.practice.hibernetdemo.DAOs;

import org.hibernate.SessionFactory;
import org.practice.hibernetdemo.DTOs.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class ProductDAO {

    @Autowired
    SessionFactory sessionFactory;

    public void addProduct(ProductDTO productDTO) {
        sessionFactory.getCurrentSession().saveOrUpdate(productDTO);
    }
}
