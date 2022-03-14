package com.juan.PersonApiRest.service;

import com.juan.PersonApiRest.model.Person;
import com.juan.PersonApiRest.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public List<Person> findAll(Sort sort) {
        return personRepository.findAll(sort);
    }

    public void deleteById(Long aLong) {
        personRepository.deleteById(aLong);
    }

    public void delete(Person entity) {
        personRepository.delete(entity);
    }

    public <S extends Person> S save(S entity) {
        return personRepository.save(entity);
    }

    public Optional<Person> findById(Long id) {
        return personRepository.findById(id);
    }

}
