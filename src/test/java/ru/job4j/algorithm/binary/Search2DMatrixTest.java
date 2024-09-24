package ru.job4j.algorithm.binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Search2DMatrixTest {
    @Test
    void testElementFoundInMiddle() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        assertTrue(Search2DMatrix.searchMatrix(matrix, 11));
    }

    @Test
    void testElementFoundInLastRow() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        assertTrue(Search2DMatrix.searchMatrix(matrix, 60));
    }

    @Test
    void testElementFoundInFirstRow() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        assertTrue(Search2DMatrix.searchMatrix(matrix, 3));
    }

    @Test
    void testElementNotFound() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        assertFalse(Search2DMatrix.searchMatrix(matrix, 15));
    }

    @Test
    void testTargetSmallerThanAllElements() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        assertFalse(Search2DMatrix.searchMatrix(matrix, -1));
    }

    @Test
    void testTargetLargerThanAllElements() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        assertFalse(Search2DMatrix.searchMatrix(matrix, 100));
    }

    @Test
    void testEmptyMatrix() {
        int[][] matrix = {};
        assertFalse(Search2DMatrix.searchMatrix(matrix, 1));
    }

    @Test
    void testMatrixWithOneElementTrue() {
        int[][] matrix = {{42}};
        assertTrue(Search2DMatrix.searchMatrix(matrix, 42));
    }

    @Test
    void testMatrixWithOneElementFalse() {
        int[][] matrix = {{42}};
        assertFalse(Search2DMatrix.searchMatrix(matrix, 7));
    }

    @Test
    void testSingleRowMatrix() {
        int[][] matrix = {
                {1, 3, 5, 7, 9}
        };
        assertTrue(Search2DMatrix.searchMatrix(matrix, 7));
        assertFalse(Search2DMatrix.searchMatrix(matrix, 8));
    }

    @Test
    void testSingleColumnMatrix() {
        int[][] matrix = {
                {1},
                {3},
                {5},
                {7},
                {9}
        };
        assertTrue(Search2DMatrix.searchMatrix(matrix, 7));
        assertFalse(Search2DMatrix.searchMatrix(matrix, 6));
    }
}