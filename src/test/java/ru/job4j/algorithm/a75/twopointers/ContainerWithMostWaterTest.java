package ru.job4j.algorithm.a75.twopointers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {

    @Test
    void testBasicCase() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(49, result, "The maximum area for the given heights should be 49");
    }

    @Test
    void testAllEqualHeights() {
        int[] height = {4, 4, 4, 4, 4};
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(16, result, "The maximum area for equal heights should be 16");
    }

    @Test
    void testDecreasingHeights() {
        int[] height = {6, 5, 4, 3, 2, 1};
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(9, result, "The maximum area for decreasing heights should be 9");
    }

    @Test
    void testSingleElementArray() {
        int[] height = {5};
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(0, result, "The maximum area for a single element should be 0");
    }

    @Test
    void testTwoElementsArray() {
        int[] height = {1, 2};
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(1, result, "The maximum area for two elements should be 1");
    }

    @Test
    void testLargeHeights() {
        int[] height = {1000, 1000};
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(1000, result, "The maximum area for large heights should be 1000");
    }

    @Test
    void testZeroHeight() {
        int[] height = {0, 2, 3, 4};
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(4, result, "The maximum area for an array with a zero height should ignore the zero");
    }

    @Test
    void testMultiplePeaks() {
        int[] height = {1, 2, 1, 2, 1};
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(4, result, "The maximum area should be calculated considering the highest possible container");
    }

    @Test
    void testEmptyArray() {
        int[] height = {};
        int result = ContainerWithMostWater.maxArea(height);
        assertEquals(0, result, "The maximum area for an empty array should be 0");
    }
}
