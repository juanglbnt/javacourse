package com.juan.SpringLesson.service;

import com.juan.SpringLesson.entities.Product;
import com.juan.SpringLesson.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product findProductByName(String name) {
        return productRepository.findProductByName(name);
    }

    public Product findProductById(int id) {
        return productRepository.findProductById(id);
    }
}
