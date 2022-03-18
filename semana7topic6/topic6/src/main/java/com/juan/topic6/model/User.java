package com.juan.topic6.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Builder
@Table(name = "users")
public class User implements Serializable {

    @Id
    private Long id;

    private String name;
    private String lastName;
    private int docNumber;

    public User(){

    }

    public User(Long id, String name, String lastName, int docNumber) {
        this.id = id;
        this.name = name;
        this.lastName = name;
        this.docNumber = docNumber;
    }

}
