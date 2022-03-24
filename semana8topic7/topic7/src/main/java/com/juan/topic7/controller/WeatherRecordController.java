package com.juan.topic7.controller;


import com.juan.topic7.model.WeatherRecord;
import com.juan.topic7.service.WeatherRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        WeatherRecord weatherRecord1 = service.findById(id);
        model.addAttribute("title", "edit a client");
        model.addAttribute("event", weatherRecord1);
        return "/views/create";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        service.delete(id);
        System.out.println("deleted successfully");
        return "redirect:/views/";
    }

}
