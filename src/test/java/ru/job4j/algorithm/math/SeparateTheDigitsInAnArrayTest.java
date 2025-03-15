package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SeparateTheDigitsInAnArrayTest {

    @Test
    void testSingleDigitNumbers() {
        SeparateTheDigitsInAnArray solver = new SeparateTheDigitsInAnArray();
        int[] nums = {1, 2, 3, 4};
        assertArrayEquals(new int[]{1, 2, 3, 4}, solver.separateDigits(nums), "Expected [1, 2, 3, 4] for input [1, 2, 3, 4].");
    }

    @Test
    void testMultiDigitNumbers() {
        SeparateTheDigitsInAnArray solver = new SeparateTheDigitsInAnArray();
        int[] nums = {12, 34, 56};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, solver.separateDigits(nums), "Expected [1, 2, 3, 4, 5, 6] for input [12, 34, 56].");
    }

    @Test
    void testSingleLargeNumber() {
        SeparateTheDigitsInAnArray solver = new SeparateTheDigitsInAnArray();
        int[] nums = {9876};
        assertArrayEquals(new int[]{9, 8, 7, 6}, solver.separateDigits(nums), "Expected [9, 8, 7, 6] for input [9876].");
    }

    @Test
    void testMixOfSingleAndMultiDigitNumbers() {
        SeparateTheDigitsInAnArray solver = new SeparateTheDigitsInAnArray();
        int[] nums = {3, 45, 678};
        assertArrayEquals(new int[]{3, 4, 5, 6, 7, 8}, solver.separateDigits(nums), "Expected [3, 4, 5, 6, 7, 8] for input [3, 45, 678].");
    }

    @Test
    void testLeadingZeroesIgnored() {
        SeparateTheDigitsInAnArray solver = new SeparateTheDigitsInAnArray();
        int[] nums = {100, 205};
        assertArrayEquals(new int[]{1, 0, 0, 2, 0, 5}, solver.separateDigits(nums), "Expected [1, 0, 0, 2, 0, 5] for input [100, 205].");
    }

    @Test
    void testLargeNumberInArray() {
        SeparateTheDigitsInAnArray solver = new SeparateTheDigitsInAnArray();
        int[] nums = {1, 234567, 8};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, solver.separateDigits(nums), "Expected [1, 2, 3, 4, 5, 6, 7, 8] for input [1, 234567, 8].");
    }
}
