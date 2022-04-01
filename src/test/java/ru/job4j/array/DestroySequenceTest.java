package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class DestroySequenceTest {
    @Test
    public void when1() {
        char[] seq = "1111100000".toCharArray();
        char[] expected = "0000011111".toCharArray();
        char[] result = DestroySequence.destroy(seq);
        assertArrayEquals(expected, result);
    }

    @Test
    public void when2() {
        char[] seq = "11111000000".toCharArray();
        char[] expected = "00000011111".toCharArray();
        char[] result = DestroySequence.destroy(seq);
        assertArrayEquals(expected, result);
    }

    @Test
    public void when3() {
        char[] seq = "1111101000000".toCharArray();
        char[] expected = "0000001011111".toCharArray();
        char[] result = DestroySequence.destroy(seq);
        assertArrayEquals(expected, result);
    }
}