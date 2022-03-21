package com.juan.SpringLesson.repositories;

import com.juan.SpringLesson.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    public Product findProductByName(String name);

    @Query("select p from Product p where p.id=:id")
    public Product findProductById(int id);
}
