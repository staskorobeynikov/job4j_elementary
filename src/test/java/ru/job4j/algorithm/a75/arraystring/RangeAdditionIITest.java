package ru.job4j.algorithm.a75.arraystring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RangeAdditionIITest {

    @Test
    void testNoOperations() {
        RangeAdditionII solution = new RangeAdditionII();
        assertEquals(6 * 4, solution.maxCount(6, 4, new int[][]{}), "Expected 6 * 4 = 24 when no operations are applied");
    }

    @Test
    void testSingleOperation() {
        RangeAdditionII solution = new RangeAdditionII();
        assertEquals(2 * 3, solution.maxCount(5, 4, new int[][]{{2, 3}}), "Expected 2 * 3 = 6 after one operation (2,3)");
    }

    @Test
    void testOperationsCoverFullGrid() {
        RangeAdditionII solution = new RangeAdditionII();
        assertEquals(3 * 3, solution.maxCount(3, 3, new int[][]{{3, 3}, {3, 3}, {3, 3}}), "Expected 3 * 3 = 9 when all operations cover the full grid");
    }

    @Test
    void testSmallestPossibleGrid() {
        RangeAdditionII solution = new RangeAdditionII();
        assertEquals(1, solution.maxCount(1, 1, new int[][]{{1, 1}}), "Expected 1 when the grid is 1x1 and operation is (1,1)");
    }

    @Test
    void testOperationsWithNoEffect() {
        RangeAdditionII solution = new RangeAdditionII();
        assertEquals(4 * 4, solution.maxCount(4, 4, new int[][]{{5, 5}, {6, 6}}), "Expected 4 * 4 = 16 when operations do not shrink the range");
    }

    @Test
    void testLargeGridWithMultipleOperations() {
        RangeAdditionII solution = new RangeAdditionII();
        assertEquals(2 * 3, solution.maxCount(10, 10, new int[][]{{3, 5}, {2, 7}, {4, 3}}), "Expected 2 * 3 = 6 after multiple operations on large grid");
    }
}
