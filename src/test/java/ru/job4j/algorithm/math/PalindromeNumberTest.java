package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    @Test
    void testPositivePalindromeNumber() {
        int input = 121;
        boolean result = PalindromeNumber.isPalindrome(input);
        assertTrue(result, "121 is a palindrome");
    }

    @Test
    void testPositiveNonPalindromeNumber() {
        int input = 123;
        boolean result = PalindromeNumber.isPalindrome(input);
        assertFalse(result, "123 is not a palindrome");
    }

    @Test
    void testNegativeNumber() {
        int input = -121;
        boolean result = PalindromeNumber.isPalindrome(input);
        assertFalse(result, "-121 is not a palindrome (negative numbers cannot be palindromes)");
    }

    @Test
    void testSingleDigitNumber() {
        int input = 7;
        boolean result = PalindromeNumber.isPalindrome(input);
        assertTrue(result, "Single digit numbers like 7 are palindromes");
    }

    @Test
    void testZero() {
        int input = 0;
        boolean result = PalindromeNumber.isPalindrome(input);
        assertTrue(result, "0 is a palindrome");
    }

    @Test
    void testLargePalindromeNumber() {
        int input = 1234321;
        boolean result = PalindromeNumber.isPalindrome(input);
        assertTrue(result, "1234321 is a palindrome");
    }

    @Test
    void testLargeNonPalindromeNumber() {
        int input = 1234567;
        boolean result = PalindromeNumber.isPalindrome(input);
        assertFalse(result, "1234567 is not a palindrome");
    }
}