package com.juan.topic7.controller;


import com.juan.topic7.model.WeatherRecord;
import com.juan.topic7.service.WeatherRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/views")
public class WeatherRecordController {

    @Autowired
    WeatherRecordService service;
    @Autowired
    WeatherRecord weatherRecord;

    @GetMapping("/")
    public String recordList(Model model) {
        List<WeatherRecord> recordList = service.getAllRecords();
        model.addAttribute("title", "Record of Meteorologic Events");
        model.addAttribute("list", recordList);
        return "/views/records";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("title", "New Event");
        model.addAttribute("event", weatherRecord);
        return "/views/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute WeatherRecord weatherRecord) {
        service.save(weatherRecord);
        return "redirect:/views/";
    }
}
