package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfCommonFactorsTest {

    @Test
    void testCommonFactorsOfEqualNumbers() {
        NumberOfCommonFactors solver = new NumberOfCommonFactors();
        assertEquals(6, solver.commonFactors(12, 12),
                "Expected 6 common factors for (12, 12): 1, 2, 3, 4, 6, 12.");
    }

    @Test
    void testCommonFactorsOfCoprimeNumbers() {
        NumberOfCommonFactors solver = new NumberOfCommonFactors();
        assertEquals(1, solver.commonFactors(8, 15),
                "Expected 1 common factor (1) for coprime numbers (8, 15).");
    }

    @Test
    void testCommonFactorsWithOneAsMinimum() {
        NumberOfCommonFactors solver = new NumberOfCommonFactors();
        assertEquals(1, solver.commonFactors(1, 100),
                "Expected 1 common factor for (1, 100).");
    }

    @Test
    void testCommonFactorsOfMultiples() {
        NumberOfCommonFactors solver = new NumberOfCommonFactors();
        assertEquals(4, solver.commonFactors(6, 18),
                "Expected 4 common factors for (6, 18): 1, 2, 3, 6.");
    }

    @Test
    void testCommonFactorsOfLargeNumbers() {
        NumberOfCommonFactors solver = new NumberOfCommonFactors();
        assertEquals(6, solver.commonFactors(100, 80),
                "Expected 6 common factors for (100, 80): 1, 2, 4, 5, 10, 20.");
    }

    @Test
    void testSamePrimeNumber() {
        NumberOfCommonFactors solver = new NumberOfCommonFactors();
        assertEquals(2, solver.commonFactors(7, 7),
                "Expected 2 common factors for (7, 7): 1, 7.");
    }

    @Test
    void testOneNumberIsMultipleOfAnother() {
        NumberOfCommonFactors solver = new NumberOfCommonFactors();
        assertEquals(2, solver.commonFactors(5, 10),
                "Expected 2 common factors for (5, 10): 1, 5.");
    }
}