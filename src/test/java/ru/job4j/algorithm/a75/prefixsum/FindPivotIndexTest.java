package ru.job4j.algorithm.a75.prefixsum;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FindPivotIndexTest {

    @Test
    void testBasicCase() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int result = FindPivotIndex.pivotIndex(nums);
        assertEquals(3, result, "The pivot index is 3");
    }

    @Test
    void testNoPivot() {
        int[] nums = {1, 2, 3};
        int result = FindPivotIndex.pivotIndex(nums);
        assertEquals(-1, result, "There is no pivot index, so the result should be -1");
    }

    @Test
    void testSingleElement() {
        int[] nums = {10};
        int result = FindPivotIndex.pivotIndex(nums);
        assertEquals(0, result, "A single-element array always has a pivot index of 0");
    }

    @Test
    void testAllZeros() {
        int[] nums = {0, 0, 0, 0};
        int result = FindPivotIndex.pivotIndex(nums);
        assertEquals(0, result, "All zeros mean any index can be a pivot, the first is returned");
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-1, -1, -1, 0, 1, 1};
        int result = FindPivotIndex.pivotIndex(nums);
        assertEquals(0, result, "The pivot index is 3");
    }

    @Test
    void testPivotAtStart() {
        int[] nums = {0, 1, -1};
        int result = FindPivotIndex.pivotIndex(nums);
        assertEquals(0, result, "The pivot index is 0");
    }

    @Test
    void testPivotAtEnd() {
        int[] nums = {1, -1, 0};
        int result = FindPivotIndex.pivotIndex(nums);
        assertEquals(2, result, "The pivot index is 2");
    }

    @Test
    void testMultiplePivots() {
        int[] nums = {2, 1, -1, 1, 2};
        int result = FindPivotIndex.pivotIndex(nums);
        assertEquals(1, result, "Only the first pivot index is returned, which is 2");
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int result = FindPivotIndex.pivotIndex(nums);
        assertEquals(-1, result, "An empty array has no pivot index, so the result is -1");
    }
}
