package com.juan.topic5.repository;

import com.juan.topic5.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {
    Film findByName(String name);
}
