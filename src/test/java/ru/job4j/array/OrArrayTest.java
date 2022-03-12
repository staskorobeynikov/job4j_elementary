package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrArrayTest {
    @Test
    public void whenTwoEmptyArrays() {
        int[] left = new int[] {};
        int[] right = new int[] {};
        int[] expected = new int[] {};
        int[] result = OrArray.or(left, right);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenSecondArrayIsEmpty() {
        int[] left = new int[] {1};
        int[] right = new int[] {};
        int[] expected = new int[] {1};
        int[] result = OrArray.or(left, right);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenFirstArrayIsEmpty() {
        int[] left = new int[] {};
        int[] right = new int[] {1};
        int[] expected = new int[] {1};
        int[] result = OrArray.or(left, right);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenTwoArraysIsEqual() {
        int[] left = new int[] {1, 2};
        int[] right = new int[] {1, 2};
        int[] expected = new int[] {1, 2};
        int[] result = OrArray.or(left, right);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenTwoArraysWithDuplicate() {
        int[] left = new int[] {1, 2};
        int[] right = new int[] {1, 2, 3};
        int[] expected = new int[] {1, 2, 3};
        int[] result = OrArray.or(left, right);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenTwoArraysWithoutDuplicate() {
        int[] left = new int[] {1};
        int[] right = new int[] {2, 3};
        int[] expected = new int[] {1, 2, 3};
        int[] result = OrArray.or(left, right);
        assertArrayEquals(expected, result);
    }
}