package ru.job4j.algorithm.a75.hashmap;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UniqueNumberOfOccurrencesTest {

    @Test
    void testUniqueOccurrencesTrue() {
        int[] arr = {1, 2, 2, 1, 1, 3};
        boolean result = UniqueNumberOfOccurrences.uniqueOccurrences(arr);
        assertTrue(result, "The occurrences of numbers are unique");
    }

    @Test
    void testUniqueOccurrencesFalse() {
        int[] arr = {1, 2, 2, 3, 3};
        boolean result = UniqueNumberOfOccurrences.uniqueOccurrences(arr);
        assertFalse(result, "The occurrences of numbers are not unique");
    }

    @Test
    void testSingleElement() {
        int[] arr = {1};
        boolean result = UniqueNumberOfOccurrences.uniqueOccurrences(arr);
        assertTrue(result, "Single element always has unique occurrences");
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        boolean result = UniqueNumberOfOccurrences.uniqueOccurrences(arr);
        assertTrue(result, "Empty array has unique occurrences by definition");
    }

    @Test
    void testAllSameElements() {
        int[] arr = {2, 2, 2, 2};
        boolean result = UniqueNumberOfOccurrences.uniqueOccurrences(arr);
        assertTrue(result, "All elements are the same, so there's only one unique occurrence count");
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {-1, -2, -2, -1, -1, -3};
        boolean result = UniqueNumberOfOccurrences.uniqueOccurrences(arr);
        assertTrue(result, "The occurrences of numbers are unique even with negative numbers");
    }

    @Test
    void testMixedPositiveAndNegative() {
        int[] arr = {-1, -1, 2, 2, 2, -3, -3, -3, -3};
        boolean result = UniqueNumberOfOccurrences.uniqueOccurrences(arr);
        assertTrue(result, "Occurrences are unique for mixed positive and negative numbers");
    }

    @Test
    void testZeroIncluded() {
        int[] arr = {0, 1, 1, 2, 2, 2};
        boolean result = UniqueNumberOfOccurrences.uniqueOccurrences(arr);
        assertTrue(result, "The occurrences of numbers including zero are unique");
    }
}
