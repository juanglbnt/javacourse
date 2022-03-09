package com.juan.topic5.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "film")
public class Film {

    @Id
    private int id;
    private String name;
    private int year;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "director_id", referencedColumnName = "id")
    private Director director;

    public Film() {

    }

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
