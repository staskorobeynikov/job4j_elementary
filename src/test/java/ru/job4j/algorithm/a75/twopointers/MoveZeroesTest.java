package ru.job4j.algorithm.a75.twopointers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MoveZeroesTest {

    @Test
    void testNoZeroes() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 2, 3, 4};
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(expected, input, "Array with no zeroes should remain unchanged");
    }

    @Test
    void testAllZeroes() {
        int[] input = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(expected, input, "Array with all zeroes should remain unchanged");
    }

    @Test
    void testZerosAtStart() {
        int[] input = {0, 0, 1, 2};
        int[] expected = {1, 2, 0, 0};
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(expected, input, "Zeroes at the start should be moved to the end");
    }

    @Test
    void testZerosAtEnd() {
        int[] input = {1, 2, 0, 0};
        int[] expected = {1, 2, 0, 0};
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(expected, input, "Array with zeroes at the end should remain unchanged");
    }

    @Test
    void testMixedZerosAndNonZeros() {
        int[] input = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(expected, input, "Mixed array should have all zeroes moved to the end");
    }

    @Test
    void testSingleZero() {
        int[] input = {0};
        int[] expected = {0};
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(expected, input, "Array with single zero should remain unchanged");
    }

    @Test
    void testSingleNonZero() {
        int[] input = {5};
        int[] expected = {5};
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(expected, input, "Array with single non-zero should remain unchanged");
    }

    @Test
    void testZerosScattered() {
        int[] input = {4, 0, 5, 0, 3, 0, 1};
        int[] expected = {4, 5, 3, 1, 0, 0, 0};
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(expected, input, "Scattered zeroes should be moved to the end while maintaining order of other elements");
    }
}
