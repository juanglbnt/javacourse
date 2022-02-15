package com.juan.Exercises;

import com.juan.Exercises.model.Customer;
import com.juan.Exercises.model.Order;
import com.juan.Exercises.model.Product;
import com.juan.Exercises.repos.CustomerRepo;
import com.juan.Exercises.repos.OrderRepo;
import com.juan.Exercises.repos.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.ast.Or;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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
	@DisplayName("exercise 1,  products that belongs to \"books\" and with price > 100")
	public void exercise1(){
		List<Product> result = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.filter(p -> p.getPrice() > 100)
				.collect(Collectors.toList());

		result.forEach(System.out::println);
	}

	@Test
	@DisplayName("exercise 2, orders with baby products")
	public void exercise2(){
		List<Order> result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getProducts().stream()
						.anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby")))
				.collect(Collectors.toList());

		result.forEach(System.out::println);
	}

	@Test
	@DisplayName("exercise 3, list of products of toy with 10% rebate")
	public void exercise3(){
		List<Product> result = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
				.map(p -> p.withPrice(p.getPrice() * 0.9))
				.collect(Collectors.toList());

		result.forEach(System.out::println);
	}

	@Test
	@DisplayName("exercise 4, list products ordered by customer of tier between 01-02-2021 & 01-04-2021")
	public void exercise4(){
		List<Product> result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getCustomer().getTier() == 2)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021,2,1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021,4,1)) <= 0)
				.flatMap(o -> o.getProducts().stream())
				.distinct()
				.collect(Collectors.toList());

		result.forEach(System.out::println);
	}

	@Test
	@DisplayName("exercise 5, the cheapest books")
	public void exercise5(){
		Optional<Product> result = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
						.min(Comparator.comparing(Product::getPrice));

		System.out.println(result);
	}

	@Test
	@DisplayName(("exercise 6, the 3 most recently placed order"))
	public void exercise6(){
		List<Order> result = orderRepo.findAll()
				.stream()
				.sorted(Comparator.comparing(Order::getOrderDate).reversed())
				.limit(3)
				.collect(Collectors.toList());

		result.forEach(System.out::println);
	}

	@Test
	@DisplayName("exercise 7 list of orders which were ordered on 15-03-21")
	public void exercise7(){
		List<Product> result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
				.peek(o -> System.out.println(o.toString()))
				.flatMap(o -> o.getProducts().stream())
				.distinct()
				.collect(Collectors.toList());
	}

	@Test
	@DisplayName("exercise 8, calculate total lump sum of all orders placed in feb 2021")
	public void exercise8(){
		Double result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
				.flatMap(o -> o.getProducts().stream())
				.mapToDouble(p -> p.getPrice())
				.sum();

		System.out.println("RESULT: " + result);
	}

	@Test
	@DisplayName("exercise 9, calculate order average payment placed on 14-mar-2021")
	public void exercise9(){
		Double result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 5)))
				.flatMap(o -> o.getProducts().stream())
				.mapToDouble(p -> p.getPrice())
				.average().getAsDouble();

		System.out.printf("RESULT: %.2f%n", result);
	}

	@Test
	@DisplayName("exercise 10, statistics of books")
	public void exercise10(){
		DoubleSummaryStatistics statistics = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.mapToDouble(p -> p.getPrice())
				.summaryStatistics();

		System.out.println(String.format("count = %1$d, average = %2$f, max = %3$f, min = %4$f, sum = %5$f,",
		statistics.getCount(), statistics.getAverage(), statistics.getMax(), statistics.getMin(), statistics.getSum()));
	}

	@Test
	@DisplayName("exercise 11, a map with order id and order's product count")
	public void exercise11(){
		Map<Long, Integer> result = orderRepo.findAll()
				.stream()
				.collect(Collectors.toMap(
						order -> order.getId(),
						order -> order.getProducts().size()
						)
				);

		System.out.println(result);
	}

	@Test
	@DisplayName("exercise 12, a map with order records grouped by customer")
	public void exercise12(){
		Map<Customer, List<Order>> result = orderRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(Order::getCustomer)
				);

		System.out.println(result);
	}

	@Test
	@DisplayName("exercise 13, data map with order record and product totalsum")
	public void exercise13(){
		Map<Order, Double> result = orderRepo.findAll()
				.stream()
				.collect(
						Collectors.toMap(
								Function.identity(),
								order -> order.getProducts().stream()
										.mapToDouble(p -> p.getPrice()).sum()
						)
				);

		for (Order key: result.keySet()){
			System.out.println(key + " = " + result.get(key));
		}
	}

	@Test
	@DisplayName("exercise 14, a data map with list of product name by category")
	public void exercise14(){
		Map<String, List<String>> result = productRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(
								Product::getCategory,
								Collectors.mapping(product -> product.getName(), Collectors.toList())
						)
				);

		System.out.println(result);
	}

	@Test
	public void Exercise15(){
		Map<String, Optional<Product>> result = productRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(
								Product::getCategory,
								Collectors.maxBy(Comparator.comparing(Product::getPrice))
						)
				);

		System.out.println(result);
	}

}
