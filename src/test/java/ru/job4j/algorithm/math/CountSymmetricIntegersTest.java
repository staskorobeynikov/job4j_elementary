package ru.job4j.algorithm.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CountSymmetricIntegersTest {

    @Test
    void testNoSymmetricNumbers() {
        CountSymmetricIntegers solution = new CountSymmetricIntegers();
        assertEquals(0, solution.countSymmetricIntegers(1, 9), "Expected 0 symmetric numbers in range [1,9]");
    }

    @Test
    void testSingleSymmetricNumber() {
        CountSymmetricIntegers solution = new CountSymmetricIntegers();
        assertEquals(1, solution.countSymmetricIntegers(11, 11), "Expected 1 symmetric number in range [11,11]");
    }

    @Test
    void testRangeWithMultipleSymmetricNumbers() {
        CountSymmetricIntegers solution = new CountSymmetricIntegers();
        assertEquals(2, solution.countSymmetricIntegers(10, 30), "Expected 2 symmetric numbers in range [10,30]");
    }

    @Test
    void testLargeRange() {
        CountSymmetricIntegers solution = new CountSymmetricIntegers();
        assertEquals(9, solution.countSymmetricIntegers(10, 100), "Expected 9 symmetric numbers in range [10,100]");
    }

    @Test
    void testOnlyEvenDigitNumbers() {
        CountSymmetricIntegers solution = new CountSymmetricIntegers();
        assertEquals(4, solution.countSymmetricIntegers(10, 50), "Expected 4 symmetric numbers in range [10,50]");
    }

    @Test
    void testNumbersWithOddLength() {
        CountSymmetricIntegers solution = new CountSymmetricIntegers();
        assertEquals(0, solution.countSymmetricIntegers(100, 150), "Expected 0 symmetric numbers in range [100,150]");
    }

    @Test
    void testMaxRange() {
        CountSymmetricIntegers solution = new CountSymmetricIntegers();
        assertTrue(solution.countSymmetricIntegers(1, 9999) > 0, "There should be symmetric numbers in the range [1,9999]");
    }
}
