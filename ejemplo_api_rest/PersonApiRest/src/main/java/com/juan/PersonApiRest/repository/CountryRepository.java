package com.juan.PersonApiRest.repository;

import com.juan.PersonApiRest.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
