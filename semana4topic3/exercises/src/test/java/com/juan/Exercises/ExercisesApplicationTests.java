package com.juan.Exercises;

import com.juan.Exercises.model.Product;
import com.juan.Exercises.repos.CustomerRepo;
import com.juan.Exercises.repos.OrderRepo;
import com.juan.Exercises.repos.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
@Slf4j
@DataJpaTest
class ExercisesApplicationTests {

	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private ProductRepo productRepo;
	@Autowired
	private OrderRepo orderRepo;

	@Test
	public void exercise1(){
		List<Product> result = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.filter(p -> p.getPrice() > 100)
				.collect(Collectors.toList());
	}

}
