package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMinimumOperationsToMakeAllElementsDivisibleByThreeTest {

    @Test
    void testAllDivisibleByThree() {
        FindMinimumOperationsToMakeAllElementsDivisibleByThree solver = new FindMinimumOperationsToMakeAllElementsDivisibleByThree();
        int[] nums = {3, 6, 9, 12};
        assertEquals(0, solver.minimumOperations(nums), "Expected 0 operations when all elements divisible by 3.");
    }

    @Test
    void testAllOneModulo() {
        FindMinimumOperationsToMakeAllElementsDivisibleByThree solver = new FindMinimumOperationsToMakeAllElementsDivisibleByThree();
        int[] nums = {1, 4, 7};
        assertEquals(3, solver.minimumOperations(nums), "Expected 3 operations (all -1).");
    }

    @Test
    void testAllTwoModulo() {
        FindMinimumOperationsToMakeAllElementsDivisibleByThree solver = new FindMinimumOperationsToMakeAllElementsDivisibleByThree();
        int[] nums = {2, 5, 8};
        assertEquals(3, solver.minimumOperations(nums), "Expected 3 operations (all +1).");
    }

    @Test
    void testMixedRemainders() {
        FindMinimumOperationsToMakeAllElementsDivisibleByThree solver = new FindMinimumOperationsToMakeAllElementsDivisibleByThree();
        int[] nums = {2, 3, 4, 6, 7};
        assertEquals(3, solver.minimumOperations(nums), "Expected 3 operations for mixed input.");
    }

    @Test
    void testZerosAndDivisible() {
        FindMinimumOperationsToMakeAllElementsDivisibleByThree solver = new FindMinimumOperationsToMakeAllElementsDivisibleByThree();
        int[] nums = {0, 3, 6, 9};
        assertEquals(0, solver.minimumOperations(nums), "Expected 0 operations for zeros and divisible numbers.");
    }

    @Test
    void testEmptyArray() {
        FindMinimumOperationsToMakeAllElementsDivisibleByThree solver = new FindMinimumOperationsToMakeAllElementsDivisibleByThree();
        int[] nums = {};
        assertEquals(0, solver.minimumOperations(nums), "Expected 0 operations for empty array.");
    }

    @Test
    void testLargeValues() {
        FindMinimumOperationsToMakeAllElementsDivisibleByThree solver = new FindMinimumOperationsToMakeAllElementsDivisibleByThree();
        int[] nums = {1000002, 1000005, 1000008};
        assertEquals(0, solver.minimumOperations(nums), "Expected 0 for large numbers divisible by 3.");
    }
}
