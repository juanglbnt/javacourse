package com.juan.topic7.model;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Component
@Data
@Table(name = "records")
public class WeatherRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;
    private int lat;
    private int lon;
    private String city;
    private String state;
    private double temperature;
}
