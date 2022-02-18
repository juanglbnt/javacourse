package com.juan.Exercises;

import com.juan.Exercises.repos.CustomerRepo;
import com.juan.Exercises.repos.OrderRepo;
import com.juan.Exercises.repos.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Slf4j
@Component
public class AppCommandRunner implements CommandLineRunner {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    ProductRepo productRepo;

    @Autowired
    OrderRepo orderRepo;

    @Transactional

    @Override
    public void run(String... args) throws Exception {
        log.info("Customers:");
        customerRepo.findAll()
                .forEach(c -> log.info(c.toString()));

        log.info("Orders:");
        orderRepo.findAll()
                .forEach(o -> log.info(o.toString()));

        log.info("Products:");
        productRepo.findAll()
                .forEach(p -> log.info(p.toString()));
    }
}
