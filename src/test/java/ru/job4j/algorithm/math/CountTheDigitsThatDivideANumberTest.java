package ru.job4j.algorithm.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CountTheDigitsThatDivideANumberTest {

    @Test
    void testSingleDigitNumber() {
        CountTheDigitsThatDivideANumber solution = new CountTheDigitsThatDivideANumber();
        assertEquals(1, solution.countDigits(7), "7 is divisible by 7 itself");
        assertEquals(1, solution.countDigits(3), "3 is divisible by 3 itself");
    }

    @Test
    void testMultipleDivisibleDigits() {
        CountTheDigitsThatDivideANumber solution = new CountTheDigitsThatDivideANumber();
        assertEquals(2, solution.countDigits(12), "Digits 1 and 2 divide 12");
        assertEquals(3, solution.countDigits(128), "Digits 1, 2, and 8 divide 128");
    }

    @Test
    void testContainsZero() {
        CountTheDigitsThatDivideANumber solution = new CountTheDigitsThatDivideANumber();
        assertEquals(2, solution.countDigits(101), "Only digits 1 and 1 divide 101");
        assertEquals(1, solution.countDigits(10), "Only digit 1 divides 10 (0 is ignored)");
    }

    @Test
    void testNumberWithNoDivisibleDigits() {
        CountTheDigitsThatDivideANumber solution = new CountTheDigitsThatDivideANumber();
        assertEquals(0, solution.countDigits(23), "Neither 2 nor 3 divides 23");
    }

    @Test
    void testEdgeCases() {
        CountTheDigitsThatDivideANumber solution = new CountTheDigitsThatDivideANumber();
        assertEquals(0, solution.countDigits(0), "0 should return 0");
        assertEquals(1, solution.countDigits(1), "1 is divisible by itself");
    }
}