package com.juan.topic7.service;

import com.juan.topic7.model.WeatherRecord;
import com.juan.topic7.repository.WeatherRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeatherRecordService {

    @Autowired
    WeatherRecordRepository repository;

    public List<WeatherRecord> getAllRecords() {
        return repository.findAll();
    }

    public WeatherRecord findById(Long id) {
       return repository.getById(id);
    }

    public WeatherRecord save(WeatherRecord weatherRecord) {
        return repository.save(weatherRecord);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
