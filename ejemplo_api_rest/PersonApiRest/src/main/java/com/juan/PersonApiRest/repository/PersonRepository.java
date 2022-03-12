package com.juan.PersonApiRest.repository;

import com.juan.PersonApiRest.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
