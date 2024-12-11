package ru.job4j.algorithm.a75.hashmap;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EqualRowAndColumnPairsTest {

    @Test
    void testBasicCase() {
        int[][] grid = {
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        };
        int result = EqualRowAndColumnPairs.equalPairs(grid);
        assertEquals(1, result, "Expected 1 pair where a row matches a column");
    }

    @Test
    void testAllRowsEqualColumns() {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int result = EqualRowAndColumnPairs.equalPairs(grid);
        assertEquals(0, result, "No row matches any column");
    }

    @Test
    void testSingleElementGrid() {
        int[][] grid = {{1}};
        int result = EqualRowAndColumnPairs.equalPairs(grid);
        assertEquals(1, result, "Single element grid should always have 1 matching pair");
    }

    @Test
    void testMultipleMatchingPairs() {
        int[][] grid = {
                {1, 2},
                {2, 1}
        };
        int result = EqualRowAndColumnPairs.equalPairs(grid);
        assertEquals(2, result, "Expected 2 pairs where rows match columns");
    }

    @Test
    void testAllSameElements() {
        int[][] grid = {
                {1, 1},
                {1, 1}
        };
        int result = EqualRowAndColumnPairs.equalPairs(grid);
        assertEquals(4, result, "All rows and columns are identical, so there should be 4 pairs");
    }

    @Test
    void testNoMatchingPairs() {
        int[][] grid = {
                {1, 2},
                {3, 4}
        };
        int result = EqualRowAndColumnPairs.equalPairs(grid);
        assertEquals(0, result, "No row matches any column");
    }

    @Test
    void testEmptyGrid() {
        int[][] grid = {};
        int result = EqualRowAndColumnPairs.equalPairs(grid);
        assertEquals(0, result, "Empty grid should have no pairs");
    }
}
