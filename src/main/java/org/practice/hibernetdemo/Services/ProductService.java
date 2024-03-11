package org.practice.hibernetdemo.Services;

import org.practice.hibernetdemo.DAOs.ProductDAO;

import org.practice.hibernetdemo.DTOs.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    @Transactional
    public void addProduct(String productId, String productName) {
        ProductDTO addedProductDTO = new ProductDTO();
        addedProductDTO.setProductId(productId);
        addedProductDTO.setProductName(productName);
        productDAO.addProduct(addedProductDTO);
    }

   @Transactional
    public List<ProductDTO> getAllProducts() {
        return productDAO.findAll();
    }
}
