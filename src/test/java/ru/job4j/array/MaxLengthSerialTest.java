package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxLengthSerialTest {
    @Test
    public void when1() {
        int[] array = new int[] {1};
        int expected = 1;
        int result = MaxLengthSerial.find(array);
        assertEquals(expected, result);
    }

    @Test
    public void when2() {
        int[] array = new int[] {2, 1};
        int expected = 1;
        int result = MaxLengthSerial.find(array);
        assertEquals(expected, result);
    }

    @Test
    public void when3() {
        int[] array = new int[] {1, 2};
        int expected = 2;
        int result = MaxLengthSerial.find(array);
        assertEquals(expected, result);
    }

    @Test
    public void when4() {
        int[] array = new int[] {1, 2, 0, 1, 2, 3};
        int expected = 4;
        int result = MaxLengthSerial.find(array);
        assertEquals(expected, result);
    }

    @Test
    public void when5() {
        int[] array = new int[] {1, 2, 1, 1, 2, 3};
        int expected = 4;
        int result = MaxLengthSerial.find(array);
        assertEquals(expected, result);
    }

    @Test
    public void when6() {
        int[] array = new int[] {3, 2, 1};
        int expected = 1;
        int result = MaxLengthSerial.find(array);
        assertEquals(expected, result);
    }

    @Test
    public void when7() {
        int[] array = new int[] {1, 2, 1, 1, 2, 3, 1, 2, 3};
        int expected = 4;
        int result = MaxLengthSerial.find(array);
        assertEquals(expected, result);
    }
}