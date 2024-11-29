package ru.job4j.algorithm.a75.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LongestSubarrayOfAfterDeletingOneElementTest {

    @Test
    void testBasicCase() {
        int[] nums = {1, 1, 0, 1};
        int result = LongestSubarrayOfAfterDeletingOneElement.longestSubarray(nums);
        assertEquals(3, result, "Expected longest subarray length is 3 after deleting one element");
    }

    @Test
    void testAllOnes() {
        int[] nums = {1, 1, 1, 1};
        int result = LongestSubarrayOfAfterDeletingOneElement.longestSubarray(nums);
        assertEquals(3, result, "Expected longest subarray length is 3 (delete one element)");
    }

    @Test
    void testAllZeros() {
        int[] nums = {0, 0, 0, 0};
        int result = LongestSubarrayOfAfterDeletingOneElement.longestSubarray(nums);
        assertEquals(0, result, "Expected longest subarray length is 0 as no 1s exist");
    }

    @Test
    void testMixedCase() {
        int[] nums = {1, 0, 1, 0, 1};
        int result = LongestSubarrayOfAfterDeletingOneElement.longestSubarray(nums);
        assertEquals(2, result, "Expected longest subarray length is 2 after deleting one element");
    }

    @Test
    void testSingleZero() {
        int[] nums = {0};
        int result = LongestSubarrayOfAfterDeletingOneElement.longestSubarray(nums);
        assertEquals(0, result, "Single 0 results in a longest subarray length of 0");
    }

    @Test
    void testSingleOne() {
        int[] nums = {1};
        int result = LongestSubarrayOfAfterDeletingOneElement.longestSubarray(nums);
        assertEquals(0, result, "Single 1 results in a longest subarray length of 0 after deletion");
    }

    @Test
    void testMultipleZerosWithOnes() {
        int[] nums = {1, 1, 0, 1, 1, 0, 1, 1, 1};
        int result = LongestSubarrayOfAfterDeletingOneElement.longestSubarray(nums);
        assertEquals(5, result, "Expected longest subarray length is 5 after deleting one element");
    }

    @Test
    void testZerosAtStartAndEnd() {
        int[] nums = {0, 1, 1, 1, 0};
        int result = LongestSubarrayOfAfterDeletingOneElement.longestSubarray(nums);
        assertEquals(3, result, "Expected longest subarray length is 3");
    }

    @Test
    void testLongSubarrayWithOneZero() {
        int[] nums = {1, 1, 1, 0, 1, 1, 1, 1};
        int result = LongestSubarrayOfAfterDeletingOneElement.longestSubarray(nums);
        assertEquals(7, result, "Expected longest subarray length is 7 after deleting one zero");
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int result = LongestSubarrayOfAfterDeletingOneElement.longestSubarray(nums);
        assertEquals(0, result, "Empty array results in a longest subarray length of 0");
    }
}
