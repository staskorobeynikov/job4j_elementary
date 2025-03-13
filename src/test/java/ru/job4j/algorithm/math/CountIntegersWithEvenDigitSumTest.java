package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountIntegersWithEvenDigitSumTest {

    @Test
    void testSmallNumber() {
        CountIntegersWithEvenDigitSum solver = new CountIntegersWithEvenDigitSum();
        assertEquals(2, solver.countEven(4), "Expected 2 numbers with even digit sum for num = 4.");
    }

    @Test
    void testNumberWithNoEvenDigitSum() {
        CountIntegersWithEvenDigitSum solver = new CountIntegersWithEvenDigitSum();
        assertEquals(0, solver.countEven(1), "Expected 0 numbers with even digit sum for num = 1.");
    }

    @Test
    void testMidRangeNumber() {
        CountIntegersWithEvenDigitSum solver = new CountIntegersWithEvenDigitSum();
        assertEquals(4, solver.countEven(10), "Expected 4 numbers with even digit sum for num = 10.");
    }

    @Test
    void testLargeNumber() {
        CountIntegersWithEvenDigitSum solver = new CountIntegersWithEvenDigitSum();
        assertEquals(49, solver.countEven(100), "Expected 49 numbers with even digit sum for num = 100.");
    }

    @Test
    void testEdgeCaseZero() {
        CountIntegersWithEvenDigitSum solver = new CountIntegersWithEvenDigitSum();
        assertEquals(0, solver.countEven(0), "Expected 0 numbers for num = 0.");
    }

    @Test
    void testNumberWithAllEvenDigits() {
        CountIntegersWithEvenDigitSum solver = new CountIntegersWithEvenDigitSum();
        assertEquals(5, solver.countEven(12), "Expected 5 numbers with even digit sum for num = 12.");
    }

    @Test
    void testNumberWithAlternatingOddEvenSums() {
        CountIntegersWithEvenDigitSum solver = new CountIntegersWithEvenDigitSum();
        assertEquals(24, solver.countEven(50), "Expected 24 numbers with even digit sum for num = 50.");
    }
}
