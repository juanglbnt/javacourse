package com.juan.PersonApiRest.service;

import com.juan.PersonApiRest.model.Country;
import com.juan.PersonApiRest.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}
