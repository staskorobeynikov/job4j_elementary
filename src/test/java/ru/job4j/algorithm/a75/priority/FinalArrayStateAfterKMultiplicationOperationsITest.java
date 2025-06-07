package ru.job4j.algorithm.a75.priority;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class FinalArrayStateAfterKMultiplicationOperationsITest {

    @Test
    void testSingleElementArray() {
        FinalArrayStateAfterKMultiplicationOperationsI instance = new FinalArrayStateAfterKMultiplicationOperationsI();
        int[] result = instance.getFinalState(new int[]{2}, 3, 2);
        assertArrayEquals(new int[]{16}, result);
    }

    @Test
    void testNoOperations() {
        FinalArrayStateAfterKMultiplicationOperationsI instance = new FinalArrayStateAfterKMultiplicationOperationsI();
        int[] result = instance.getFinalState(new int[]{1, 2, 3}, 0, 5);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    void testMultiplySmallestFirst() {
        FinalArrayStateAfterKMultiplicationOperationsI instance = new FinalArrayStateAfterKMultiplicationOperationsI();
        int[] result = instance.getFinalState(new int[]{3, 1, 4}, 2, 2);
        assertArrayEquals(new int[]{3, 4, 4}, result);
    }

    @Test
    void testTieBreakingByIndex() {
        FinalArrayStateAfterKMultiplicationOperationsI instance = new FinalArrayStateAfterKMultiplicationOperationsI();
        int[] result = instance.getFinalState(new int[]{2, 2, 3}, 2, 2);
        assertArrayEquals(new int[]{4, 4, 3}, result);
    }

    @Test
    void testMultiplierIsOne() {
        FinalArrayStateAfterKMultiplicationOperationsI instance = new FinalArrayStateAfterKMultiplicationOperationsI();
        int[] result = instance.getFinalState(new int[]{5, 1, 9}, 5, 1);
        assertArrayEquals(new int[]{5, 1, 9}, result);
    }

    @Test
    void testMaximumAllowedInput() {
        FinalArrayStateAfterKMultiplicationOperationsI instance = new FinalArrayStateAfterKMultiplicationOperationsI();
        int[] nums = new int[100];
        Arrays.fill(nums, 1);
        int[] result = instance.getFinalState(nums.clone(), 10, 2);
        int countOfOnes = 90;
        int twos = 0;
        for (int val : result) {
            if (val == 2) twos++;
            if (val == 1) countOfOnes--;
        }
        assertEquals(10, twos);
        assertEquals(0, countOfOnes);
    }
}
