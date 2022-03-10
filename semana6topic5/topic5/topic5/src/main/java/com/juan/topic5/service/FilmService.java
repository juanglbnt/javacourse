package com.juan.topic5.service;

import com.juan.topic5.entity.Film;
import com.juan.topic5.repository.DirectorRepository;
import com.juan.topic5.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;

    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }

    public List<Film> saveFilms(List<Film> films) {
        return filmRepository.saveAll(films);
    }

    public List<Film> getFilms() {
        return filmRepository.findAll();
    }

    public Film getFilmById(int id) {
        return filmRepository.findById(id).orElse(null);
    }

    public Film getFilmByName(String name) {
        return filmRepository.findByName(name);
    }

    public String deleteFilm(int id) {
        filmRepository.deleteById(id);
        return "film deleted successfully";
    }

    public Film updateFilm(Film film) {
        Film theFilm = filmRepository.findById(film.getId()).orElse(null);
        theFilm.setName(film.getName());
        theFilm.setYear(film.getYear());
        theFilm.setDirector(film.getDirector());

        return filmRepository.save(theFilm);
    }

}
