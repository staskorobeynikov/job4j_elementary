package ru.job4j.algorithm.a75.twopointers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaxNumberOfKSumPairsTest {

    @Test
    void testBasicCase() {
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        int result = MaxNumberOfKSumPairs.maxOperations(nums, k);
        assertEquals(2, result, "Expected 2 pairs (1,4) and (2,3) with sum 5");
    }

    @Test
    void testNoPairs() {
        int[] nums = {1, 2, 3, 4};
        int k = 10;
        int result = MaxNumberOfKSumPairs.maxOperations(nums, k);
        assertEquals(0, result, "Expected no pairs for sum 10");
    }

    @Test
    void testMultiplePairsWithDuplicates() {
        int[] nums = {3, 1, 3, 4, 3};
        int k = 6;
        int result = MaxNumberOfKSumPairs.maxOperations(nums, k);
        assertEquals(1, result, "Expected 1 pair (3,3) with sum 6");
    }

    @Test
    void testAllPairsValid() {
        int[] nums = {2, 2, 2, 2};
        int k = 4;
        int result = MaxNumberOfKSumPairs.maxOperations(nums, k);
        assertEquals(2, result, "Expected 2 pairs (2,2) and (2,2) with sum 4");
    }

    @Test
    void testSingleElementArray() {
        int[] nums = {5};
        int k = 5;
        int result = MaxNumberOfKSumPairs.maxOperations(nums, k);
        assertEquals(0, result, "Single element cannot form a pair");
    }

    @Test
    void testUnsortedArray() {
        int[] nums = {4, 1, 2, 3};
        int k = 5;
        int result = MaxNumberOfKSumPairs.maxOperations(nums, k);
        assertEquals(2, result, "Unsorted array should produce 2 pairs (1,4) and (2,3) with sum 5");
    }
}
