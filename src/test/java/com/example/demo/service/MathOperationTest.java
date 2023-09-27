package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class MathOperationTest {

    @InjectMocks
    private MathOperation mathOperation;


    @Test
    void suma() {
        assertEquals(0, mathOperation.suma(0, 0));
    }

    @Test
    void sumaCoverage() {
        assertEquals(3, mathOperation.suma(1, 2));
    }
}