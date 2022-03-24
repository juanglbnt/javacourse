package com.juan.topic7.repository;

import com.juan.topic7.model.WeatherRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRecordRepository extends JpaRepository<WeatherRecord ,Long> {
}
