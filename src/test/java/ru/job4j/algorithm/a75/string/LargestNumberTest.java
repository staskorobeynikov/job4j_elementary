package ru.job4j.algorithm.a75.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {

    @Test
    void testBasicCase() {
        LargestNumber solver = new LargestNumber();
        int[] nums = {10, 2};
        assertEquals("210", solver.largestNumber(nums), "Expected '210' for input [10, 2].");
    }

    @Test
    void testWithSamePrefix() {
        LargestNumber solver = new LargestNumber();
        int[] nums = {3, 30, 34, 5, 9};
        assertEquals("9534330", solver.largestNumber(nums), "Expected '9534330' for input [3, 30, 34, 5, 9].");
    }

    @Test
    void testAllZeros() {
        LargestNumber solver = new LargestNumber();
        int[] nums = {0, 0, 0};
        assertEquals("0", solver.largestNumber(nums), "Expected '0' for input [0, 0, 0].");
    }

    @Test
    void testSingleDigitNumbers() {
        LargestNumber solver = new LargestNumber();
        int[] nums = {1, 9, 8, 7};
        assertEquals("9871", solver.largestNumber(nums), "Expected '9871' for input [1, 9, 8, 7].");
    }

    @Test
    void testTwoDigitCombinations() {
        LargestNumber solver = new LargestNumber();
        int[] nums = {12, 121};
        assertEquals("12121", solver.largestNumber(nums), "Expected '12121' for input [12, 121].");
    }

    @Test
    void testLargeInput() {
        LargestNumber solver = new LargestNumber();
        int[] nums = {824, 938, 1399, 5607, 6973, 5703, 9609, 4398, 8247};
        assertEquals("9609938824824769735703560743981399", solver.largestNumber(nums),
                "Expected correct concatenation for large input.");
    }

    @Test
    void testSingleElement() {
        LargestNumber solver = new LargestNumber();
        int[] nums = {5};
        assertEquals("5", solver.largestNumber(nums), "Expected '5' for single-element array.");
    }

    @Test
    void testTwoElementsWithLeadingZero() {
        LargestNumber solver = new LargestNumber();
        int[] nums = {0, 1};
        assertEquals("10", solver.largestNumber(nums), "Expected '10' for input [0, 1].");
    }
}
