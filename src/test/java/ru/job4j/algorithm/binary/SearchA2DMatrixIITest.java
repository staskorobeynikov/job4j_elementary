package ru.job4j.algorithm.binary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SearchA2DMatrixIITest {

    @Test
    void testTargetExistsInMatrix() {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;
        assertTrue(SearchA2DMatrixII.searchMatrix(matrix, target), "Target 5 should be found in the matrix");
    }

    @Test
    void testTargetDoesNotExistInMatrix() {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 20;
        assertFalse(SearchA2DMatrixII.searchMatrix(matrix, target), "Target 20 should not be found in the matrix");
    }

    @Test
    void testTargetAtStartOfMatrix() {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 1;
        assertTrue(SearchA2DMatrixII.searchMatrix(matrix, target), "Target 1 should be found at the start of the matrix");
    }

    @Test
    void testTargetAtEndOfMatrix() {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 30;
        assertTrue(SearchA2DMatrixII.searchMatrix(matrix, target), "Target 30 should be found at the end of the matrix");
    }

    @Test
    void testSingleElementMatrixFound() {
        int[][] matrix = {{42}};
        int target = 42;
        assertTrue(SearchA2DMatrixII.searchMatrix(matrix, target), "Target 42 should be found in the single element matrix");
    }

    @Test
    void testSingleElementMatrixNotFound() {
        int[][] matrix = {{42}};
        int target = 13;
        assertFalse(SearchA2DMatrixII.searchMatrix(matrix, target), "Target 13 should not be found in the single element matrix");
    }

    @Test
    void testMatrixWithSingleRow() {
        int[][] matrix = {{1, 2, 3, 4, 5}};
        int target = 4;
        assertTrue(SearchA2DMatrixII.searchMatrix(matrix, target), "Target 4 should be found in the single row matrix");
    }

    @Test
    void testMatrixWithSingleColumn() {
        int[][] matrix = {{1}, {2}, {3}, {4}, {5}};
        int target = 4;
        assertTrue(SearchA2DMatrixII.searchMatrix(matrix, target), "Target 4 should be found in the single column matrix");
    }

    @Test
    void testMatrixWithSingleColumnTargetNotFound() {
        int[][] matrix = {{1}, {2}, {3}, {4}, {5}};
        int target = 6;
        assertFalse(SearchA2DMatrixII.searchMatrix(matrix, target), "Target 6 should not be found in the single column matrix");
    }
}