package com.juan.Exercises.repos;

import com.juan.Exercises.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends CrudRepository<Order, Long> {
    List<Order> findAll();
}
