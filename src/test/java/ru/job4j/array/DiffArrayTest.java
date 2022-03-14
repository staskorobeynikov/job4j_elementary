package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiffArrayTest {
    @Test
    public void when1() {
        int[] left = new int[] {};
        int[] right = new int[] {};
        int[] expected = new int[] {};
        int[] result = DiffArray.diff(left, right);
        assertArrayEquals(expected, result);
    }

    @Test
    public void when2() {
        int[] left = new int[] {1};
        int[] right = new int[] {};
        int[] expected = new int[] {1};
        int[] result = DiffArray.diff(left, right);
        assertArrayEquals(expected, result);
    }

    @Test
    public void when3() {
        int[] left = new int[] {};
        int[] right = new int[] {1};
        int[] expected = new int[] {};
        int[] result = DiffArray.diff(left, right);
        assertArrayEquals(expected, result);
    }

    @Test
    public void when4() {
        int[] left = new int[] {1, 2, 3};
        int[] right = new int[] {2};
        int[] expected = new int[] {1, 3};
        int[] result = DiffArray.diff(left, right);
        assertArrayEquals(expected, result);
    }

    @Test
    public void when5() {
        int[] left = new int[] {1, 3};
        int[] right = new int[] {2};
        int[] expected = new int[] {1, 3};
        int[] result = DiffArray.diff(left, right);
        assertArrayEquals(expected, result);
    }

    @Test
    public void when6() {
        int[] left = new int[] {1, 2, 3, 4, 5};
        int[] right = new int[] {4, 5};
        int[] expected = new int[] {1, 2, 3};
        int[] result = DiffArray.diff(left, right);
        assertArrayEquals(expected, result);
    }

    @Test
    public void when7() {
        int[] left = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int[] right = new int[] {2, 4, 6, 8};
        int[] expected = new int[] {1, 3, 5, 7};
        int[] result = DiffArray.diff(left, right);
        assertArrayEquals(expected, result);
    }
}