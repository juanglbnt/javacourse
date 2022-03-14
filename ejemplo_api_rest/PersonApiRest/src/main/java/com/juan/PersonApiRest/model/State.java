package com.juan.PersonApiRest.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "state")
public class State implements Serializable {

    @Id
    Long id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    Country country;

    String name;
}
