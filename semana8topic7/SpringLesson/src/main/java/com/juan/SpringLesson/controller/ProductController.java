package com.juan.SpringLesson.controller;

import com.juan.SpringLesson.entities.Product;
import com.juan.SpringLesson.repositories.ProductRepository;
import com.juan.SpringLesson.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product) {
        productService.save(product);
    }

    @GetMapping("/findProduct/{name}")
    public Product findProductByName(@PathVariable String name) {
        return productService.findProductByName(name);
    }

    @GetMapping("/findProductId/{id}")
    public Product findProductById(@PathVariable int id) {
        return productService.findProductById(id);
    }
}
