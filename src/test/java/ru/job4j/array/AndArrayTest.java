package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class AndArrayTest {
    @Test
    public void whenEmptyArray() {
        int[] left = new int[] {1, 2, 3};
        int[] right = new int[] {4, 5};
        int[] expected = new int[] {};
        int[] result = AndArray.and(left, right);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenResultArrayContainsOneElement() {
        int[] left = new int[] {1, 2, 3};
        int[] right = new int[] {1, 4, 5};
        int[] expected = new int[] {1};
        int[] result = AndArray.and(left, right);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenResultArrayContainsTwoElements() {
        int[] left = new int[] {1, 2, 3, 4, 5};
        int[] right = new int[] {4, 5};
        int[] expected = new int[] {4, 5};
        int[] result = AndArray.and(left, right);
        assertArrayEquals(expected, result);
    }
}