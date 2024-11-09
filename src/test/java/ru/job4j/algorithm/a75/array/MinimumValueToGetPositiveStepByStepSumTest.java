package ru.job4j.algorithm.a75.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumValueToGetPositiveStepByStepSumTest {

    @Test
    void testAllPositiveNumbers() {
        MinimumValueToGetPositiveStepByStepSum solver = new MinimumValueToGetPositiveStepByStepSum();
        int[] nums = {1, 2, 3, 4};
        assertEquals(1, solver.minStartValue(nums));
    }

    @Test
    void testAllNegativeNumbers() {
        MinimumValueToGetPositiveStepByStepSum solver = new MinimumValueToGetPositiveStepByStepSum();
        int[] nums = {-3, -2, -1};
        assertEquals(7, solver.minStartValue(nums));
    }

    @Test
    void testMixedNumbers() {
        MinimumValueToGetPositiveStepByStepSum solver = new MinimumValueToGetPositiveStepByStepSum();
        int[] nums = {-3, 2, -3, 4, 2};
        assertEquals(5, solver.minStartValue(nums));
    }

    @Test
    void testSingleNegativeElement() {
        MinimumValueToGetPositiveStepByStepSum solver = new MinimumValueToGetPositiveStepByStepSum();
        int[] nums = {-5};
        assertEquals(6, solver.minStartValue(nums));
    }

    @Test
    void testSinglePositiveElement() {
        MinimumValueToGetPositiveStepByStepSum solver = new MinimumValueToGetPositiveStepByStepSum();
        int[] nums = {5};
        assertEquals(1, solver.minStartValue(nums));
    }

    @Test
    void testEdgeMinimumValues() {
        MinimumValueToGetPositiveStepByStepSum solver = new MinimumValueToGetPositiveStepByStepSum();
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = -100;
        }
        assertEquals(10001, solver.minStartValue(nums));
    }

    @Test
    void testEdgeMaximumValues() {
        MinimumValueToGetPositiveStepByStepSum solver = new MinimumValueToGetPositiveStepByStepSum();
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = 100;
        }
        assertEquals(1, solver.minStartValue(nums));
    }

    @Test
    void testZigzag() {
        MinimumValueToGetPositiveStepByStepSum solver = new MinimumValueToGetPositiveStepByStepSum();
        int[] nums = {2, -5, 2, -5, 2, -5};
        assertEquals(10, solver.minStartValue(nums));
    }
}