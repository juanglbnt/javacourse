package com.juan.Exercises;

import com.juan.Exercises.model.Product;
import com.juan.Exercises.repos.CustomerRepo;
import com.juan.Exercises.repos.OrderRepo;
import com.juan.Exercises.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Exercises {
    @Autowired
    ProductRepo productRepo;
    @Autowired
    OrderRepo orderRepo;
    @Autowired
    CustomerRepo customerRepo;

    public Exercises(){

    }

    public List<Product> exercise1(){
        List<Product> result = new ArrayList<>();
        productRepo.findAll().forEach(result::add);
        return result;
    }
}
