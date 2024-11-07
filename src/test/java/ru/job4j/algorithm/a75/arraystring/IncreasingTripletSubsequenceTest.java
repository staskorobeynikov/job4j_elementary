package ru.job4j.algorithm.a75.arraystring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IncreasingTripletSubsequenceTest {

    @Test
    void testIncreasingTripletExists() {
        int[] input = {1, 2, 3, 4, 5};
        assertTrue(IncreasingTripletSubsequence.increasingTriplet(input), "The sequence {1, 2, 3, 4, 5} contains an increasing triplet");
    }

    @Test
    void testNoIncreasingTriplet() {
        int[] input = {5, 4, 3, 2, 1};
        assertFalse(IncreasingTripletSubsequence.increasingTriplet(input), "The sequence {5, 4, 3, 2, 1} does not contain an increasing triplet");
    }

    @Test
    void testTripletAtEnd() {
        int[] input = {9, 1, 5, 2, 6};
        assertTrue(IncreasingTripletSubsequence.increasingTriplet(input), "The sequence {9, 1, 5, 2, 6} contains an increasing triplet (1, 5, 6)");
    }

    @Test
    void testTripletAtBeginning() {
        int[] input = {1, 2, 3, 1, 0};
        assertTrue(IncreasingTripletSubsequence.increasingTriplet(input), "The sequence {1, 2, 3, 1, 0} contains an increasing triplet at the beginning (1, 2, 3)");
    }

    @Test
    void testSingleElementRepeated() {
        int[] input = {1, 1, 1, 1};
        assertFalse(IncreasingTripletSubsequence.increasingTriplet(input), "The sequence {1, 1, 1, 1} does not contain an increasing triplet");
    }

    @Test
    void testAlternatingValues() {
        int[] input = {2, 1, 2, 1, 2, 1, 3};
        assertTrue(IncreasingTripletSubsequence.increasingTriplet(input), "The sequence {2, 1, 2, 1, 2, 1, 3} contains an increasing triplet (1, 2, 3)");
    }

    @Test
    void testMinimumLengthArray() {
        int[] input = {1, 2};
        assertFalse(IncreasingTripletSubsequence.increasingTriplet(input), "A sequence of length 2 cannot contain an increasing triplet");
    }

    @Test
    void testExactTriplet() {
        int[] input = {3, 1, 5, 2, 6};
        assertTrue(IncreasingTripletSubsequence.increasingTriplet(input), "The sequence {3, 1, 5, 2, 6} contains an increasing triplet (1, 5, 6)");
    }

    @Test
    void testNegativeNumbers() {
        int[] input = {-10, -8, -5, -1};
        assertTrue(IncreasingTripletSubsequence.increasingTriplet(input), "The sequence {-10, -8, -5, -1} contains an increasing triplet (-10, -8, -5)");
    }
}
