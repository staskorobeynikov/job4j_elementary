package ru.job4j.algorithm.a75.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesIIITest {

    @Test
    void testBasicCase() {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int result = MaxConsecutiveOnesIII.longestOnes(nums, k);
        assertEquals(6, result, "Expected maximum length is 6 with 2 flips");
    }

    @Test
    void testAllOnes() {
        int[] nums = {1, 1, 1, 1, 1};
        int k = 2;
        int result = MaxConsecutiveOnesIII.longestOnes(nums, k);
        assertEquals(5, result, "All ones, expected maximum length is 5");
    }

    @Test
    void testAllZeros() {
        int[] nums = {0, 0, 0, 0, 0};
        int k = 2;
        int result = MaxConsecutiveOnesIII.longestOnes(nums, k);
        assertEquals(2, result, "All zeros, expected maximum length is 2 with 2 flips");
    }

    @Test
    void testSingleElementZero() {
        int[] nums = {0};
        int k = 1;
        int result = MaxConsecutiveOnesIII.longestOnes(nums, k);
        assertEquals(1, result, "Single zero can be flipped to 1");
    }

    @Test
    void testSingleElementOne() {
        int[] nums = {1};
        int k = 1;
        int result = MaxConsecutiveOnesIII.longestOnes(nums, k);
        assertEquals(1, result, "Single one, expected maximum length is 1");
    }

    @Test
    void testNoFlipsAllowed() {
        int[] nums = {1, 0, 1, 1, 0, 1};
        int k = 0;
        int result = MaxConsecutiveOnesIII.longestOnes(nums, k);
        assertEquals(2, result, "Without flips, maximum length is 2");
    }

    @Test
    void testAllFlipsNeeded() {
        int[] nums = {0, 0, 0, 0, 0};
        int k = 5;
        int result = MaxConsecutiveOnesIII.longestOnes(nums, k);
        assertEquals(5, result, "All zeros can be flipped, expected maximum length is 5");
    }

    @Test
    void testMixedCase() {
        int[] nums = {1, 0, 1, 0, 1, 0, 1};
        int k = 3;
        int result = MaxConsecutiveOnesIII.longestOnes(nums, k);
        assertEquals(7, result, "Maximum length is the whole array after 3 flips");
    }

    @Test
    void testMultipleZeros() {
        int[] nums = {1, 0, 0, 1, 1, 0, 1};
        int k = 2;
        int result = MaxConsecutiveOnesIII.longestOnes(nums, k);
        assertEquals(5, result, "Expected maximum length is 5 with 2 flips");
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int k = 2;
        int result = MaxConsecutiveOnesIII.longestOnes(nums, k);
        assertEquals(0, result, "Empty array, expected maximum length is 0");
    }
}
