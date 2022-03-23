package com.juan.topic7.service;

import com.juan.topic7.model.WeatherData;
import com.juan.topic7.repository.WeatherDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherDataService {

    @Autowired
    WeatherDataRepository weatherDataRepository;

    public List<WeatherData> getAllWeatherData() {
        return weatherDataRepository.findAll();
    }
}
