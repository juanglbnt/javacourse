package com.juan.topic5.entity;

import javax.persistence.*;

@Entity
@Table(name = "film")
public class Film {

    @Id
    private int id;
    private String name;
    private int year;
    private int director_id;

    @ManyToOne
    @JoinColumn(name = "director_id", nullable = false)
    private Director director;

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

    public int getDirector_id() {
        return director_id;
    }

    public void setDirector_id(int director_id) {
        this.director_id = director_id;
    }
}
