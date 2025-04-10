package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindTheSumOfEncryptedIntegersTest {

    @Test
    void testSingleDigitNumbers() {
        FindTheSumOfEncryptedIntegers solver = new FindTheSumOfEncryptedIntegers();
        int[] nums = {1, 2, 3};
        assertEquals(6, solver.sumOfEncryptedInt(nums), "Expected 6 for single-digit numbers.");
    }

    @Test
    void testMultipleDigitNumbers() {
        FindTheSumOfEncryptedIntegers solver = new FindTheSumOfEncryptedIntegers();
        int[] nums = {23, 45};
        assertEquals(88, solver.sumOfEncryptedInt(nums), "Expected 88 for input [23, 45].");
    }

    @Test
    void testMixedDigits() {
        FindTheSumOfEncryptedIntegers solver = new FindTheSumOfEncryptedIntegers();
        int[] nums = {5, 34, 789};
        assertEquals(1048, solver.sumOfEncryptedInt(nums), "Expected 1048 for input [5, 34, 789].");
    }

    @Test
    void testSameMaxDigits() {
        FindTheSumOfEncryptedIntegers solver = new FindTheSumOfEncryptedIntegers();
        int[] nums = {99, 909, 9};
        assertEquals(1107, solver.sumOfEncryptedInt(nums), "Expected 1107 for input [99, 909, 9].");
    }

    @Test
    void testAllZerosIgnored() {
        FindTheSumOfEncryptedIntegers solver = new FindTheSumOfEncryptedIntegers();
        int[] nums = {10, 200, 30};
        assertEquals(266, solver.sumOfEncryptedInt(nums), "Expected 266 for input with zero-containing numbers.");
    }

    @Test
    void testLargeNumber() {
        FindTheSumOfEncryptedIntegers solver = new FindTheSumOfEncryptedIntegers();
        int[] nums = {98765};
        assertEquals(99999, solver.sumOfEncryptedInt(nums), "Expected 99999 for input [98765].");
    }

    @Test
    void testZeroNotAllowedInput() {
        FindTheSumOfEncryptedIntegers solver = new FindTheSumOfEncryptedIntegers();
        int[] nums = {0};
        assertEquals(0, solver.sumOfEncryptedInt(nums), "Expected 0 for input [0].");
    }

    @Test
    void testEmptyArray() {
        FindTheSumOfEncryptedIntegers solver = new FindTheSumOfEncryptedIntegers();
        int[] nums = {};
        assertEquals(0, solver.sumOfEncryptedInt(nums), "Expected 0 for empty input array.");
    }
}
