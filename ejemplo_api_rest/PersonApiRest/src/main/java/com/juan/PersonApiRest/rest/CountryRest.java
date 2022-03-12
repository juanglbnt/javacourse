package com.juan.PersonApiRest.rest;

import com.juan.PersonApiRest.model.Country;
import com.juan.PersonApiRest.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryRest {

    @Autowired
    private CountryService countryService;

    @GetMapping
    private ResponseEntity<List<Country>> getAllCountries() {
        return ResponseEntity.ok(countryService.findAll());
    }
}
