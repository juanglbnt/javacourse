package com.juan.topic5.service;

import com.juan.topic5.entity.Director;
import com.juan.topic5.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {

    @Autowired
    private DirectorRepository repository;

    public Director saveDirector(Director director) {
        return repository.save(director);
    }

    public List<Director> saveDirectors(List<Director> directors) {
        return repository.saveAll(directors);
    }

    public List<Director> getDirectors() {
        return repository.findAll();
    }

    public Director getDirectorById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Director getDirectorByName(String name) {
        return repository.findByName(name);
    }

    public String deleteDirector(int id) {
        repository.deleteById(id);
        return "director removed successfully";
    }

    public Director updateDirector(Director director) {
        Director theDirector = repository.findById(director.getId()).orElse(null);
        theDirector.setName(director.getName());

        return repository.save(theDirector);
    }
}
