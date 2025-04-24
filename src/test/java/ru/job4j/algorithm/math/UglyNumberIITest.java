package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UglyNumberIITest {

    @Test
    void testFirstUglyNumber() {
        UglyNumberII solver = new UglyNumberII();
        assertEquals(1, solver.nthUglyNumber(1), "Expected 1st ugly number to be 1.");
    }

    @Test
    void testSecondUglyNumber() {
        UglyNumberII solver = new UglyNumberII();
        assertEquals(2, solver.nthUglyNumber(2), "Expected 2nd ugly number to be 2.");
    }

    @Test
    void testFifthUglyNumber() {
        UglyNumberII solver = new UglyNumberII();
        assertEquals(5, solver.nthUglyNumber(5), "Expected 5th ugly number to be 5.");
    }

    @Test
    void testTenthUglyNumber() {
        UglyNumberII solver = new UglyNumberII();
        assertEquals(12, solver.nthUglyNumber(10), "Expected 10th ugly number to be 12.");
    }

    @Test
    void testFiftiethUglyNumber() {
        UglyNumberII solver = new UglyNumberII();
        assertEquals(243, solver.nthUglyNumber(50), "Expected 50th ugly number to be 243.");
    }

    @Test
    void testHundredthUglyNumber() {
        UglyNumberII solver = new UglyNumberII();
        assertEquals(1536, solver.nthUglyNumber(100), "Expected 100th ugly number to be 1536.");
    }
}
