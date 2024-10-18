package ru.job4j.algorithm.binary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayTest {

    @Test
    void testRotatedArray() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(0, FindMinimumInRotatedSortedArray.findMin(nums));
    }

    @Test
    void testSortedArray() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(1, FindMinimumInRotatedSortedArray.findMin(nums));
    }

    @Test
    void testSingleElementArray() {
        int[] nums = {1};
        assertEquals(1, FindMinimumInRotatedSortedArray.findMin(nums));
    }

    @Test
    void testTwoElementArray() {
        int[] nums = {3, 1};
        assertEquals(1, FindMinimumInRotatedSortedArray.findMin(nums));
    }

    @Test
    void testRotatedArrayMinimumAtEnd() {
        int[] nums = {2, 3, 4, 5, 6, 7, 1};
        assertEquals(1, FindMinimumInRotatedSortedArray.findMin(nums));
    }
}
