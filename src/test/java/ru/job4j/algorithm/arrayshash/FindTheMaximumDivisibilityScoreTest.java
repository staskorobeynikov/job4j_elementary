package ru.job4j.algorithm.arrayshash;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindTheMaximumDivisibilityScoreTest {

    @Test
    void testSimpleCase() {
        FindTheMaximumDivisibilityScore solver = new FindTheMaximumDivisibilityScore();
        int[] nums = {4, 8, 12, 16};
        int[] divisors = {2, 4};
        assertEquals(2, solver.maxDivScore(nums, divisors),
                "Expected 2 since all numbers divisible by both 2 and 4, but 4 > 2 so return min.");
    }

    @Test
    void testDistinctCounts() {
        FindTheMaximumDivisibilityScore solver = new FindTheMaximumDivisibilityScore();
        int[] nums = {10, 15, 20, 25};
        int[] divisors = {5, 10};
        assertEquals(5, solver.maxDivScore(nums, divisors),
                "Expected 5 with highest count.");
    }

    @Test
    void testTieBetweenDivisors() {
        FindTheMaximumDivisibilityScore solver = new FindTheMaximumDivisibilityScore();
        int[] nums = {3, 6, 9, 12};
        int[] divisors = {3, 6};
        assertEquals(3, solver.maxDivScore(nums, divisors), "Expected 3 due to more matches.");
    }

    @Test
    void testTieWithSameScoreChooseMin() {
        FindTheMaximumDivisibilityScore solver = new FindTheMaximumDivisibilityScore();
        int[] nums = {3, 6, 9, 12};
        int[] divisors = {3, 9};
        assertEquals(3, solver.maxDivScore(nums, divisors), "Expected 3 with highest count.");
    }

    @Test
    void testAllZeroDivisibility() {
        FindTheMaximumDivisibilityScore solver = new FindTheMaximumDivisibilityScore();
        int[] nums = {1, 2, 3};
        int[] divisors = {4, 5, 6};
        assertEquals(4, solver.maxDivScore(nums, divisors), "Expected smallest divisor as fallback.");
    }

    @Test
    void testSingleElementArrays() {
        FindTheMaximumDivisibilityScore solver = new FindTheMaximumDivisibilityScore();
        int[] nums = {7};
        int[] divisors = {7};
        assertEquals(7, solver.maxDivScore(nums, divisors), "Expected 7 since it's the only valid divisor.");
    }

    @Test
    void testLargeNumbers() {
        FindTheMaximumDivisibilityScore solver = new FindTheMaximumDivisibilityScore();
        int[] nums = {1000000, 2000000, 3000000};
        int[] divisors = {1000, 1000000};
        assertEquals(1000, solver.maxDivScore(nums, divisors), "Expected 1000 due to higher match count.");
    }

    @Test
    void testEqualDivisibilityPickSmallestDivisor() {
        FindTheMaximumDivisibilityScore solver = new FindTheMaximumDivisibilityScore();
        int[] nums = {12, 18, 24};
        int[] divisors = {6, 12};
        assertEquals(6, solver.maxDivScore(nums, divisors), "Expected 6 due to tie-break on value.");
    }
}
