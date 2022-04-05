package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SummingPreviousTest {
    @Test
    public void when1() {
        int a = 1;
        int b = 2;
        int n = 3;
        int[] expected = new int[] {1, 2, 3};
        int[] result = SummingPrevious.calculate(a, b, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void when2() {
        int a = 1;
        int b = 2;
        int n = 4;
        int[] expected = new int[] {1, 2, 3, 6};
        int[] result = SummingPrevious.calculate(a, b, n);
        assertArrayEquals(expected, result);
    }

    @Test
    public void when3() {
        int a = 1;
        int b = 2;
        int n = 5;
        int[] expected = new int[] {1, 2, 3, 6, 12};
        int[] result = SummingPrevious.calculate(a, b, n);
        assertArrayEquals(expected, result);
    }
}