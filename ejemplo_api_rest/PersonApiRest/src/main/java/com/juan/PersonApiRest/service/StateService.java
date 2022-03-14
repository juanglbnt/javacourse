package com.juan.PersonApiRest.service;

import com.juan.PersonApiRest.model.State;
import com.juan.PersonApiRest.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public List<State> findAll() {
        return stateRepository.findAll();
    }

    public List<State> findAll(Sort sort) {
        return stateRepository.findAll(sort);
    }

    public List<State> findAllByCountry(Long idCountry) {
        List<State> statesInCountry = new ArrayList<>();
        List<State> allStates = stateRepository.findAll();

        for(int i = 0; i < allStates.size(); i++) {
            if(allStates.get(i).getCountry().getId() == idCountry) {
                statesInCountry.add(allStates.get(i));
            }
        }

        return statesInCountry;
    }

    public <S extends State> long count(Example<S> example) {
        return stateRepository.count(example);
    }
    public <S extends State> boolean exists(Example<S> example) {
        return stateRepository.exists(example);
    }

}
