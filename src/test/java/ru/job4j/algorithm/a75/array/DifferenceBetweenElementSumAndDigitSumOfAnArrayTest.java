package ru.job4j.algorithm.a75.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DifferenceBetweenElementSumAndDigitSumOfAnArrayTest {

    @Test
    void testSingleElement() {
        DifferenceBetweenElementSumAndDigitSumOfAnArray solver = new DifferenceBetweenElementSumAndDigitSumOfAnArray();
        assertEquals(0, solver.differenceOfSum(new int[]{5}));
    }

    @Test
    void testSimpleArray() {
        DifferenceBetweenElementSumAndDigitSumOfAnArray solver = new DifferenceBetweenElementSumAndDigitSumOfAnArray();
        assertEquals(9, solver.differenceOfSum(new int[]{1, 15, 6, 3}));
    }

    @Test
    void testAllSingleDigits() {
        DifferenceBetweenElementSumAndDigitSumOfAnArray solver = new DifferenceBetweenElementSumAndDigitSumOfAnArray();
        assertEquals(0, solver.differenceOfSum(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testAllMaxValues() {
        DifferenceBetweenElementSumAndDigitSumOfAnArray solver = new DifferenceBetweenElementSumAndDigitSumOfAnArray();
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = 2000;
        }
        int sum = 20000;
        int digitsSum = 10 * (2);
        assertEquals(sum - digitsSum, solver.differenceOfSum(nums));
    }

    @Test
    void testMaximumLength() {
        DifferenceBetweenElementSumAndDigitSumOfAnArray solver = new DifferenceBetweenElementSumAndDigitSumOfAnArray();
        int[] nums = new int[2000];
        for (int i = 0; i < 2000; i++) {
            nums[i] = 1;
        }
        assertEquals(0, solver.differenceOfSum(nums));
    }

    @Test
    void testMixedDigits() {
        DifferenceBetweenElementSumAndDigitSumOfAnArray solver = new DifferenceBetweenElementSumAndDigitSumOfAnArray();
        assertEquals(297, solver.differenceOfSum(new int[]{100, 101, 102}));
    }
}
