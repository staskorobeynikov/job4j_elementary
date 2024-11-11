package ru.job4j.algorithm.a75.arraystring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringCompressionTest {

    @Test
    void testSingleCharacter() {
        char[] input = {'a'};
        int length = StringCompression.compress(input);
        assertEquals(1, length, "Compressed length for a single character should be 1");
        assertArrayEquals(new char[]{'a'}, copyOf(input, length));
    }

    @Test
    void testMultipleUniqueCharacters() {
        char[] input = {'a', 'b', 'c'};
        int length = StringCompression.compress(input);
        assertEquals(3, length, "Compressed length for unique characters should be 3");
        assertArrayEquals(new char[]{'a', 'b', 'c'}, copyOf(input, length));
    }

    @Test
    void testConsecutiveCharacters() {
        char[] input = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int length = StringCompression.compress(input);
        assertEquals(6, length, "Compressed length for {'a', 'a', 'b', 'b', 'c', 'c', 'c'} should be 6");
        assertArrayEquals(new char[]{'a', '2', 'b', '2', 'c', '3'}, copyOf(input, length));
    }

    @Test
    void testAllSameCharacters() {
        char[] input = {'a', 'a', 'a', 'a'};
        int length = StringCompression.compress(input);
        assertEquals(2, length, "Compressed length for all same characters should be 2");
        assertArrayEquals(new char[]{'a', '4'}, copyOf(input, length));
    }

    @Test
    void testCharactersWithDifferentCounts() {
        char[] input = {'a', 'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c'};
        int length = StringCompression.compress(input);
        assertEquals(6, length, "Compressed length for {'a', 'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c'} should be 6");
        assertArrayEquals(new char[]{'a', '3', 'b', '2', 'c', '4'}, copyOf(input, length));
    }

    @Test
    void testLargeRepetition() {
        char[] input = new char[12];
        for (int i = 0; i < 12; i++) input[i] = 'a';
        int length = StringCompression.compress(input);
        assertEquals(3, length, "Compressed length for 12 'a' characters should be 3");
        assertArrayEquals(new char[]{'a', '1', '2'}, copyOf(input, length));
    }

    @Test
    void testEmptyArray() {
        char[] input = {};
        int length = StringCompression.compress(input);
        assertEquals(0, length, "Compressed length for an empty array should be 0");
        assertArrayEquals(new char[]{}, copyOf(input, length));
    }

    private char[] copyOf(char[] chars, int length) {
        char[] result = new char[length];
        System.arraycopy(chars, 0, result, 0, length);
        return result;
    }
}
