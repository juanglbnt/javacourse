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

    //aqui hay error, con el tema de la llave foranea
    @PostMapping("/addFilm")
    public Film addFilm(@RequestBody Film film) {
        return filmService.saveFilm(film);
    }

    @GetMapping("/film")
    public List<Film> findAllFilms() {
        return filmService.getFilms();
    }

    @GetMapping("/filmById/{id}")
    public Film findFilmById(@PathVariable int id) {
        return filmService.getFilmById(id);
    }

    @GetMapping("/filmByName/{name}")
    public Film findFilmByName(@PathVariable String name) {
        return filmService.getFilmByName(name);
    }

    /*

    @PutMapping("/update")
    public Director updateDirector(@PathVariable Director director) {
        return directorService.updateDirector(director);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDirector(@PathVariable int id) {
        return directorService.deleteDirector(id);
    }*/
}
