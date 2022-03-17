package com.juan.topic6.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "bank")
public class Bank implements Serializable {

    @Id
    private int id;
    String name;

}
