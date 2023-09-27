package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceValidator {

    public boolean isValid(int input) {
        return input > 0 && input <= 100;
    }

}
