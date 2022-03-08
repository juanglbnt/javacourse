package com.juan.topic5.controller;

import com.juan.topic5.entity.Director;
import com.juan.topic5.entity.Film;
import com.juan.topic5.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilmController {

    @Autowired
    FilmService filmService;

    @PostMapping("/addFilm")
    public Film addFilm(@RequestBody Film film) {
        return filmService.saveFilm(film);
    }

    /*@PostMapping("/addDirectors")
    public List<Director> addDirectors(@RequestBody List<Director> directors) {
        return directorService.saveDirectors(directors);
    }

    @GetMapping("/director")
    public List<Director> findAllDirectors() {
        return directorService.getDirectors();
    }

    @GetMapping("/director/{id}")
    public Director findDirectorById(@PathVariable int id) {
        return directorService.getDirectorById(id);
    }

    @GetMapping("/director/{name}")
    public Director findDirectorByName(@PathVariable String name) {
        return directorService.getDirectorByName(name);
    }

    @PutMapping("/update")
    public Director updateDirector(@PathVariable Director director) {
        return directorService.updateDirector(director);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDirector(@PathVariable int id) {
        return directorService.deleteDirector(id);
    }*/
}
