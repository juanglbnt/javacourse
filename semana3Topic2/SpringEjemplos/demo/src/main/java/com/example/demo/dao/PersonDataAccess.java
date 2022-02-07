package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/*nota: esto nos crea un bean, lo que
nos permite intectarlo en otras clases*/
@Repository("fakeDao")
public class PersonDataAccess implements PersonDAO {

    private static List<Person> db = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        db.add(new Person(id, person.getName()));
        return 1;
    }
}
