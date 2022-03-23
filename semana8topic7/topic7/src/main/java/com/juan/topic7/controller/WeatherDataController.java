package com.juan.topic7.controller;

import com.juan.topic7.model.WeatherData;
import com.juan.topic7.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WeatherDataController {

    @Autowired
    WeatherDataService weatherDataService;


    @GetMapping("/")
    public String listAllData(Model model) {
        List<WeatherData> listOfData = weatherDataService.getAllWeatherData();
        model.addAttribute("title", "Weather Events Data");
        model.addAttribute("list", listOfData);
        return "weather";
    }
}
