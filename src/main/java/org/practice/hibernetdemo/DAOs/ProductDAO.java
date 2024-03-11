package org.practice.hibernetdemo.DAOs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.practice.hibernetdemo.DTOs.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class ProductDAO {

    @Autowired
    SessionFactory sessionFactory;

    public void addProduct(ProductDTO productDTO) {
        sessionFactory.getCurrentSession().saveOrUpdate(productDTO);
    }

    public List<ProductDTO> findAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<ProductDTO> query = session.createQuery("from ProductDTO", ProductDTO.class);
        return query.getResultList();
    }
}
