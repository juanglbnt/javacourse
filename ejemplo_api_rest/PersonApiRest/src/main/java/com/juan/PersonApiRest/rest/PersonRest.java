package com.juan.PersonApiRest.rest;

import com.juan.PersonApiRest.model.Person;
import com.juan.PersonApiRest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonRest {

    @Autowired
    private PersonService personService;

    @GetMapping
    private ResponseEntity<List<Person>> getAllPersons() {
        return ResponseEntity.ok(personService.findAll());
    }

    @PostMapping
    private ResponseEntity<Person> savePerson(@RequestBody Person person) {

        try {
            Person personSaved = personService.save(person);
            return ResponseEntity.created(new URI("/person/" + personSaved.getId())).body(personSaved);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
