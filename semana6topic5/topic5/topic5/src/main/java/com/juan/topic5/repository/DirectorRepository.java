package com.juan.topic5.repository;

import com.juan.topic5.entity.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<Director, Integer> {
    Director findByName(String name);
}
