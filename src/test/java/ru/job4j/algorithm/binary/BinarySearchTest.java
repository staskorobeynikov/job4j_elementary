package ru.job4j.algorithm.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void testSearchElementExistsAtStart() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 1;
        int result = BinarySearch.search(nums, target);
        assertEquals(0, result, "Element 1 should be at index 0");
    }

    @Test
    void testSearchElementExistsAtEnd() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 5;
        int result = BinarySearch.search(nums, target);
        assertEquals(4, result, "Element 5 should be at index 4");
    }

    @Test
    void testSearchElementExistsInMiddle() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        int result = BinarySearch.search(nums, target);
        assertEquals(2, result, "Element 3 should be at index 2");
    }

    @Test
    void testSearchElementDoesNotExist() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 6;
        int result = BinarySearch.search(nums, target);
        assertEquals(-1, result, "Element 6 does not exist in the array");
    }

    @Test
    void testSearchEmptyArray() {
        int[] nums = {};
        int target = 1;
        int result = BinarySearch.search(nums, target);
        assertEquals(-1, result, "Empty array should return -1");
    }

    @Test
    void testSearchSingleElementExists() {
        int[] nums = {3};
        int target = 3;
        int result = BinarySearch.search(nums, target);
        assertEquals(0, result, "Single element array should return index 0 when element exists");
    }

    @Test
    void testSearchSingleElementDoesNotExist() {
        int[] nums = {3};
        int target = 4;
        int result = BinarySearch.search(nums, target);
        assertEquals(-1, result, "Single element array should return -1 when element does not exist");
    }

    @Test
    void testSearchNegativeNumbers() {
        int[] nums = {-10, -5, 0, 5, 10};
        int target = -5;
        int result = BinarySearch.search(nums, target);
        assertEquals(1, result, "Element -5 should be at index 1");
    }

    @Test
    void testSearchTargetInTheMiddleOfArray() {
        int[] nums = {-10, -5, 0, 5, 10};
        int target = 0;
        int result = BinarySearch.search(nums, target);
        assertEquals(2, result, "Element 0 should be at index 2");
    }

    @Test
    void testSearchLargeArray() {
        int[] nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = i;
        }
        int target = 500;
        int result = BinarySearch.search(nums, target);
        assertEquals(500, result, "Element 500 should be at index 500");
    }
}