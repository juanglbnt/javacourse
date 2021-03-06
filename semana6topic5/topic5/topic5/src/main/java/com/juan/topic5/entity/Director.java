package com.juan.topic5.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "director")
public class Director {

    @Id
    private int id;
    private String name;

    @OneToMany(mappedBy = "director")
    private List<Film> films;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
