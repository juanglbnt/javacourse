package com.juan.PersonApiRest.service;

import com.juan.PersonApiRest.model.Person;
import com.juan.PersonApiRest.repository.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    private Person person;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        person = new Person();
        person.setId(new Long(1));
        person.setName("test 1");
        person.setSurname("tested person");
    }

    @Test
    void save() {
        Mockito.when(personRepository.save(Mockito.any(Person.class))).thenReturn(person);
        assertNotNull(personService.save(new Person()));
    }
}