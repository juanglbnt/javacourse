package com.juan.finalthesis.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@Builder
@Component
@Table(name = "users")
public class User {

    @Id
    private String userName;
    private String name;
    private String lastName;
    private int idDocNumber;
    private String address;
    private int zipCode;
    private String state;
    private String country;

    public User() {

    }

    public User(String userName, String name, String lastName, int idDocNumber, String address,
                int zipCode, String state, String country) {
        this.userName = userName;
        this.name = name;
        this.lastName = lastName;
        this.idDocNumber = idDocNumber;
        this.address = address;
        this.zipCode = zipCode;
        this.state = state;
        this.country = country;
    }
}
