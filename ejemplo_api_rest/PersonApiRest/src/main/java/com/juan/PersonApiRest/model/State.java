package com.juan.PersonApiRest.model;

import javax.persistence.*;

@Entity
@Table(name = "state")
public class State {

    @Id
    int id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    Country country;

    String name;

    public State() {}

    public State(Country country, String name) {
        this.country = country;
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
