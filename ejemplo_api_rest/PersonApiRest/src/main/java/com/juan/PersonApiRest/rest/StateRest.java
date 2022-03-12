package com.juan.PersonApiRest.rest;

import com.juan.PersonApiRest.model.State;
import com.juan.PersonApiRest.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/state")
public class StateRest {

    @Autowired
    private StateService stateService;

    @GetMapping("{id}")
    private ResponseEntity<List<State>> getAllStatesByCountry(@PathVariable("id") Long idCountry) {
        return ResponseEntity.ok(stateService.findAllByCountry(idCountry));
    }
}
