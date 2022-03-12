package com.juan.PersonApiRest.repository;

import com.juan.PersonApiRest.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
