package ru.job4j.algorithm.sliding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestHarmoniousSubsequenceTest {
    @Test
    void whenArrayHasHarmoniousSubsequenceThenReturnLength() {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int result = LongestHarmoniousSubsequence.findLHS(nums);
        assertEquals(5, result, "Test with harmonious subsequence failed.");
    }

    @Test
    void whenNoHarmoniousSubsequenceThenReturnZero() {
        int[] nums = {1, 1, 1, 1};
        int result = LongestHarmoniousSubsequence.findLHS(nums);
        assertEquals(0, result, "Test with no harmonious subsequence failed.");
    }

    @Test
    void whenAllNumbersFormHarmoniousSubsequenceThenReturnLength() {
        int[] nums = {1, 2, 2, 1};
        int result = LongestHarmoniousSubsequence.findLHS(nums);
        assertEquals(4, result, "Test with full array as harmonious subsequence failed.");
    }

    @Test
    void whenArrayHasNegativeNumbersThenHandleCorrectly() {
        int[] nums = {-1, -2, -2, -1, -1, 0, 1};
        int result = LongestHarmoniousSubsequence.findLHS(nums);
        assertEquals(5, result, "Test with negative numbers failed.");
    }

    @Test
    void whenEmptyArrayThenReturnZero() {
        int[] nums = {};
        int result = LongestHarmoniousSubsequence.findLHS(nums);
        assertEquals(0, result, "Test with empty array failed.");
    }

    @Test
    void whenArrayHasSingleElementThenReturnZero() {
        int[] nums = {1};
        int result = LongestHarmoniousSubsequence.findLHS(nums);
        assertEquals(0, result, "Test with single element failed.");
    }

    @Test
    void whenArrayHasTwoElementsThenReturnZeroOrLength() {
        int[] nums = {1, 2};
        int result = LongestHarmoniousSubsequence.findLHS(nums);
        assertEquals(2, result, "Test with two harmonious elements failed.");

        int[] nums2 = {1, 3};
        result = LongestHarmoniousSubsequence.findLHS(nums2);
        assertEquals(0, result, "Test with two non-harmonious elements failed.");
    }
}