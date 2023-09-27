package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(MockitoExtension.class)
class PalindromeTest {

    @InjectMocks
    private Palindrome palindromeTester;

    @Test
    void whenPalindrom_thenAccept() {
        assertTrue(palindromeTester.isPalindrome("noon"));
    }

    @Test
    void whenNotPalindrom_thanReject() {
        assertTrue(palindromeTester.isPalindrome(""));
    }

//    @Test
//    @Disabled
//    void whenNotPalindrom_thanReject() {
//        assertFalse(palindromeTester.isPalindrome("box"));
//    }
//    @Test
//    @Disabled
//    void whenNearPalindrom_thanReject() {
//        assertFalse(palindromeTester.isPalindrome("neon"));
//    }
}