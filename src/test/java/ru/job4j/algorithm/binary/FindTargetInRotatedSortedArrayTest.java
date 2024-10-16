package ru.job4j.algorithm.binary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FindTargetInRotatedSortedArrayTest {

    @Test
    void testTargetExistsInRotatedArray() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = FindTargetInRotatedSortedArray.search(nums, target);
        assertEquals(4, result, "Target 0 should be found at index 4");
    }

    @Test
    void testTargetExistsAtStart() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 4;
        int result = FindTargetInRotatedSortedArray.search(nums, target);
        assertEquals(0, result, "Target 4 should be found at index 0");
    }

    @Test
    void testTargetExistsAtEnd() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 2;
        int result = FindTargetInRotatedSortedArray.search(nums, target);
        assertEquals(6, result, "Target 2 should be found at index 6");
    }

    @Test
    void testTargetExistsInMiddle() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        int result = FindTargetInRotatedSortedArray.search(nums, target);
        assertEquals(2, result, "Target 6 should be found at index 2");
    }

    @Test
    void testTargetNotExistsInArray() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int result = FindTargetInRotatedSortedArray.search(nums, target);
        assertEquals(-1, result, "Target 3 should not be found in the array");
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int target = 1;
        int result = FindTargetInRotatedSortedArray.search(nums, target);
        assertEquals(-1, result, "Search in an empty array should return -1");
    }

    @Test
    void testSingleElementArrayTargetExists() {
        int[] nums = {1};
        int target = 1;
        int result = FindTargetInRotatedSortedArray.search(nums, target);
        assertEquals(0, result, "Target 1 should be found at index 0 in a single-element array");
    }

    @Test
    void testSingleElementArrayTargetNotExists() {
        int[] nums = {1};
        int target = 2;
        int result = FindTargetInRotatedSortedArray.search(nums, target);
        assertEquals(-1, result, "Target 2 should not be found in a single-element array");
    }

    @Test
    void testArrayNotRotatedTargetExists() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        int result = FindTargetInRotatedSortedArray.search(nums, target);
        assertEquals(4, result, "Target 5 should be found at index 4 in a sorted array without rotation");
    }

    @Test
    void testArrayNotRotatedTargetNotExists() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int target = 8;
        int result = FindTargetInRotatedSortedArray.search(nums, target);
        assertEquals(-1, result, "Target 8 should not be found in a sorted array without rotation");
    }
}
