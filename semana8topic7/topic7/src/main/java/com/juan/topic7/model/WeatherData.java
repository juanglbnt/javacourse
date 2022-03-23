package com.juan.topic7.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "data")
public class WeatherData {

    @Id
    private int id;

    private LocalDate date;
    private int lat;
    private int lon;
    private String city;
    private String state;
    private double temperature;
}
