package com.juan.MVCDemo.service;

import org.springframework.stereotype.Service;

@Service
public class AddService {

    public int add(int number1, int number2) {
        return number1 + number2;
    }
}
