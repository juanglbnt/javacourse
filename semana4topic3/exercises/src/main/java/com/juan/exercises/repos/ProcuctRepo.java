package com.juan.Exercises.repos;

import com.juan.exercises.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProcuctRepo extends CrudRepository<Product, Long> {
    List<Product> findAll();
}
