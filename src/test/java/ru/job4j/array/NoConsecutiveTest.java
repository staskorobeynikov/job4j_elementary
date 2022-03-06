package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoConsecutiveTest {

    @Test
    public void whenConsecutiveThenMinus1() {
        int[] data = new int[] {1, 2, 3};
        int expected = -1;
        int result = NoConsecutive.find(data);
        assertEquals(expected, result);
    }

    @Test
    public void whenEmptyArrayThenMinus1() {
        int[] data = new int[] {};
        int expected = -1;
        int result = NoConsecutive.find(data);
        assertEquals(expected, result);
    }

    @Test
    public void whenNoConsecutiveThen3() {
        int[] data = new int[] {1, 3, 4, 5};
        int expected = 3;
        int result = NoConsecutive.find(data);
        assertEquals(expected, result);
    }

    @Test
    public void whenNoConsecutiveThen6() {
        int[] data = new int[] {2, 3, 4, 6};
        int expected = 6;
        int result = NoConsecutive.find(data);
        assertEquals(expected, result);
    }
}