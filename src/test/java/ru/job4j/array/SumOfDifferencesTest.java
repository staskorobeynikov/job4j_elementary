package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfDifferencesTest {

    @Test
    public void when1() {
        int[] nums = new int[] {10, 2, 1};
        int expected = 9;
        int result = SumOfDifferences.sum(nums);
        assertEquals(expected, result);
    }

    @Test
    public void when2() {
        int[] nums = new int[] {3, 2, 1};
        int expected = 2;
        int result = SumOfDifferences.sum(nums);
        assertEquals(expected, result);
    }

    @Test
    public void when3() {
        int[] nums = new int[] {5, 4, 3, 2, 1};
        int expected = 4;
        int result = SumOfDifferences.sum(nums);
        assertEquals(expected, result);
    }

    @Test
    public void when4() {
        int[] nums = new int[] {5, 3, 1};
        int expected = 4;
        int result = SumOfDifferences.sum(nums);
        assertEquals(expected, result);
    }
}