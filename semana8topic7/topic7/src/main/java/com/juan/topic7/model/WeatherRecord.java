package com.juan.topic7.model;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Component
@Data
@Table(name = "records")
public class WeatherRecord {

    @Id
    private Long id;

    private String date;
    private int lat;
    private int lon;
    private String city;
    private String state;
    private double temperature;
}
