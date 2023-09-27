package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@ExtendWith(MockitoExtension.class)
class MyServiceValidatorTest {

    @InjectMocks
    private MyServiceValidator myServiceValidator;


    @Test
    void fiftyReturnsTrue() {
        assertThat(myServiceValidator.isValid(50)).isTrue();
    }

    @Test
    void fiftyReturnsTrueRightLimit() {
        assertThat(myServiceValidator.isValid(100)).isTrue();
    }

    @Test
    void twoHundredReturnsFalse() {
        assertThat(myServiceValidator.isValid(0)).isFalse();
    }
}
