package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumPrimeDifferenceTest {

    @Test
    void testPrimesAtEnds() {
        MaximumPrimeDifference solver = new MaximumPrimeDifference();
        int[] nums = {2, 4, 6, 8, 3};
        assertEquals(4, solver.maximumPrimeDifference(nums), "Expected difference 4 between first prime 2 and last prime 3.");
    }

    @Test
    void testMultiplePrimes() {
        MaximumPrimeDifference solver = new MaximumPrimeDifference();
        int[] nums = {10, 11, 4, 5, 6, 7, 9};
        assertEquals(4, solver.maximumPrimeDifference(nums), "Expected difference 4 between first prime 11 and last prime 7.");
    }

    @Test
    void testSinglePrime() {
        MaximumPrimeDifference solver = new MaximumPrimeDifference();
        int[] nums = {4, 6, 8, 5, 9};
        assertEquals(0, solver.maximumPrimeDifference(nums), "Expected 0 when there is only one prime.");
    }

    @Test
    void testPrimesTogether() {
        MaximumPrimeDifference solver = new MaximumPrimeDifference();
        int[] nums = {4, 6, 7, 11, 8, 10};
        assertEquals(1, solver.maximumPrimeDifference(nums), "Expected 1 between primes 7 and 11.");
    }

    @Test
    void testPrimesAtSamePosition() {
        MaximumPrimeDifference solver = new MaximumPrimeDifference();
        int[] nums = {5};
        assertEquals(0, solver.maximumPrimeDifference(nums), "Expected 0 for array with one prime element.");
    }

    @Test
    void testLongArrayWithPrimesAtBorders() {
        MaximumPrimeDifference solver = new MaximumPrimeDifference();
        int[] nums = {3, 6, 8, 10, 4, 9, 2};
        assertEquals(6, solver.maximumPrimeDifference(nums), "Expected 6 between prime 3 at index 0 and 2 at index 6.");
    }
}
