package ru.job4j.algorithm.a75.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaximumAverageSubarrayITest {

    @Test
    void testBasicCase() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        assertEquals(12.75, result, 0.00001, "Expected maximum average is 12.75");
    }

    @Test
    void testAllPositiveNumbers() {
        int[] nums = {5, 1, 9, 7, 6};
        int k = 3;
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        assertEquals(7.33, result, 0.01, "Expected maximum average is approximately 7.33");
    }

    @Test
    void testAllNegativeNumbers() {
        int[] nums = {-10, -5, -2, -8, -1};
        int k = 2;
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        assertEquals(-3.5, result, 0.00001, "Expected maximum average is -3.5");
    }

    @Test
    void testSingleElementSubarray() {
        int[] nums = {4, 2, 3, 1};
        int k = 1;
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        assertEquals(4, result, 0.00001, "Expected maximum average is the maximum element, 4");
    }

    @Test
    void testArrayWithOneElement() {
        int[] nums = {10};
        int k = 1;
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        assertEquals(10, result, 0.00001, "Expected maximum average is the only element, 10");
    }

    @Test
    void testArrayWithAllSameNumbers() {
        int[] nums = {5, 5, 5, 5, 5};
        int k = 3;
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        assertEquals(5.0, result, 0.00001, "Expected maximum average is 5");
    }

    @Test
    void testArrayWithZerosAndNegatives() {
        int[] nums = {0, -1, -2, -3, -4};
        int k = 2;
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        assertEquals(-0.5, result, 0.00001, "Expected maximum average is -0.5");
    }

    @Test
    void testArrayWithZeros() {
        int[] nums = {0, 0, 0, 0, 0};
        int k = 3;
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        assertEquals(0.0, result, 0.00001, "Expected maximum average is 0");
    }

    @Test
    void testArrayWithIncreasingValues() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 4;
        double result = MaximumAverageSubarrayI.findMaxAverage(nums, k);
        assertEquals(4.5, result, 0.00001, "Expected maximum average is 4.5");
    }
}
