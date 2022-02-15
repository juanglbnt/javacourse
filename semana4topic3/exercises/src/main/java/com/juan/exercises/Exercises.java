package com.juan.Exercises;

import com.juan.Exercises.model.Product;
import com.juan.Exercises.repos.CustomerRepo;
import com.juan.Exercises.repos.OrderRepo;
import com.juan.Exercises.repos.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
public class Exercises {
    @Autowired
    ProductRepo productRepo;
    @Autowired
    OrderRepo orderRepo;
    @Autowired
    CustomerRepo customerRepo;

    public Exercises(){

    }

    public void exercise1(){
        List<Product> result = productRepo.findAll()
                .stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());
    }
}
