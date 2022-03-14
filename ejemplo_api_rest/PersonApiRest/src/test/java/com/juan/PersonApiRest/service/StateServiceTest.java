package com.juan.PersonApiRest.service;

import com.juan.PersonApiRest.model.Country;
import com.juan.PersonApiRest.model.State;
import com.juan.PersonApiRest.repository.StateRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Sort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StateServiceTest {

    @Mock
    private StateRepository stateRepository;

    @InjectMocks
    private StateService stateService;

    private State state;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        state = new State();
        state.setCountry(new Country());
        state.setName("Mi estado");
        state.setId(new Long(11));
    }

    @Test
    void findAll() {
        Mockito.when(stateRepository.findAll()).thenReturn(Arrays.asList(state));
        assertNotNull(stateService.findAll());
    }

    @Test
    void findAllSort() {
        Mockito.when(stateRepository.findAll(Mockito.any(Sort.class))).thenReturn(Arrays.asList(state));
        assertNotNull(stateService.findAll(Sort.by(Sort.Direction.ASC, "id")));
    }
}