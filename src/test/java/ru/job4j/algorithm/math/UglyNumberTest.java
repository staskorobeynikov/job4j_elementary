package ru.job4j.algorithm.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UglyNumberTest {

    @Test
    void testUglyNumberSmall() {
        UglyNumber solution = new UglyNumber();
        assertTrue(solution.isUgly(6), "6 is an ugly number (2 * 3)");
        assertTrue(solution.isUgly(8), "8 is an ugly number (2 * 2 * 2)");
        assertTrue(solution.isUgly(10), "10 is an ugly number (2 * 5)");
        assertTrue(solution.isUgly(15), "15 is an ugly number (3 * 5)");
    }

    @Test
    void testNonUglyNumber() {
        UglyNumber solution = new UglyNumber();
        assertFalse(solution.isUgly(7), "7 is not an ugly number (prime)");
        assertFalse(solution.isUgly(14), "14 is not an ugly number (2 * 7)");
        assertFalse(solution.isUgly(21), "21 is not an ugly number (3 * 7)");
        assertFalse(solution.isUgly(22), "22 is not an ugly number (2 * 11)");
    }

    @Test
    void testNegativeAndZero() {
        UglyNumber solution = new UglyNumber();
        assertFalse(solution.isUgly(0), "0 is not an ugly number");
        assertFalse(solution.isUgly(-6), "-6 is not an ugly number");
        assertFalse(solution.isUgly(-10), "-10 is not an ugly number");
    }

    @Test
    void testLargeUglyNumber() {
        UglyNumber solution = new UglyNumber();
        assertTrue(solution.isUgly(125), "125 is an ugly number (5 * 5 * 5)");
        assertTrue(solution.isUgly(900), "900 is an ugly number (2 * 2 * 3 * 3 * 5 * 5)");
    }

    @Test
    void testLargeNonUglyNumber() {
        UglyNumber solution = new UglyNumber();
        assertFalse(solution.isUgly(121), "121 is not an ugly number (11 * 11)");
        assertFalse(solution.isUgly(49), "49 is not an ugly number (7 * 7)");
    }
}
