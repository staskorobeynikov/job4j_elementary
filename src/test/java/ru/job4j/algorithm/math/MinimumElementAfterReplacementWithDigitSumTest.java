package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumElementAfterReplacementWithDigitSumTest {

    @Test
    void testSingleElement() {
        MinimumElementAfterReplacementWithDigitSum solver = new MinimumElementAfterReplacementWithDigitSum();
        int[] nums = {123};
        assertEquals(6, solver.minElement(nums), "Expected 6 for input [123] (1+2+3=6).");
    }

    @Test
    void testMultipleElements() {
        MinimumElementAfterReplacementWithDigitSum solver = new MinimumElementAfterReplacementWithDigitSum();
        int[] nums = {29, 38, 47};
        assertEquals(11, solver.minElement(nums), "Expected 11 for input [29, 38, 47] (2+9=11, 3+8=11, 4+7=11).");
    }

    @Test
    void testAllSameDigitSum() {
        MinimumElementAfterReplacementWithDigitSum solver = new MinimumElementAfterReplacementWithDigitSum();
        int[] nums = {19, 28, 37};
        assertEquals(10, solver.minElement(nums), "Expected 10 for input [19, 28, 37] (1+9=10, 2+8=10, 3+7=10).");
    }

    @Test
    void testContainsZero() {
        MinimumElementAfterReplacementWithDigitSum solver = new MinimumElementAfterReplacementWithDigitSum();
        int[] nums = {0, 23, 56};
        assertEquals(0, solver.minElement(nums), "Expected 0 for input [0, 23, 56] (0 has sum 0).");
    }

    @Test
    void testLargeNumbers() {
        MinimumElementAfterReplacementWithDigitSum solver = new MinimumElementAfterReplacementWithDigitSum();
        int[] nums = {9876, 5432, 1024};
        assertEquals(7, solver.minElement(nums), "Expected 7 for input [9876, 5432, 1024] (9+8+7+6=30, 5+4+3+2=14, 1+0+2+4=7).");
    }

    @Test
    void testSingleDigitNumbers() {
        MinimumElementAfterReplacementWithDigitSum solver = new MinimumElementAfterReplacementWithDigitSum();
        int[] nums = {3, 5, 7, 9};
        assertEquals(3, solver.minElement(nums), "Expected 3 for input [3, 5, 7, 9] (all numbers are single digits).");
    }

    @Test
    void testMixOfSmallAndLargeNumbers() {
        MinimumElementAfterReplacementWithDigitSum solver = new MinimumElementAfterReplacementWithDigitSum();
        int[] nums = {8, 567, 890};
        assertEquals(8, solver.minElement(nums), "Expected 8 for input [8, 567, 890] (5+6+7=18, 8+9+0=17, 8 is minimum).");
    }
}
