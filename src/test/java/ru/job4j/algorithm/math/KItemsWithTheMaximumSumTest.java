package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KItemsWithTheMaximumSumTest {

    @Test
    void testAllOnes() {
        KItemsWithTheMaximumSum solver = new KItemsWithTheMaximumSum();
        assertEquals(3, solver.kItemsWithMaximumSum(5, 0, 0, 3), "Expected sum 3 by taking 3 ones.");
    }

    @Test
    void testOnesAndZeros() {
        KItemsWithTheMaximumSum solver = new KItemsWithTheMaximumSum();
        assertEquals(5, solver.kItemsWithMaximumSum(5, 3, 2, 6), "Expected sum 5 (5 ones, 1 zero).");
    }

    @Test
    void testOnlyZerosAndNegOnes() {
        KItemsWithTheMaximumSum solver = new KItemsWithTheMaximumSum();
        assertEquals(-1, solver.kItemsWithMaximumSum(0, 2, 5, 3), "Expected sum -1 (2 zeros, 1 negOne).");
    }

    @Test
    void testOnlyNegOnes() {
        KItemsWithTheMaximumSum solver = new KItemsWithTheMaximumSum();
        assertEquals(-3, solver.kItemsWithMaximumSum(0, 0, 5, 3), "Expected sum -3 (3 negOnes).");
    }

    @Test
    void testNotEnoughItems() {
        KItemsWithTheMaximumSum solver = new KItemsWithTheMaximumSum();
        assertEquals(0, solver.kItemsWithMaximumSum(1, 1, 1, 5), "Expected sum 0 — only 3 items available.");
    }

    @Test
    void testTakeAllKinds() {
        KItemsWithTheMaximumSum solver = new KItemsWithTheMaximumSum();
        assertEquals(0, solver.kItemsWithMaximumSum(1, 1, 1, 3), "Expected sum 0 (1 + 0 - 1).");
    }

    @Test
    void testTakeNone() {
        KItemsWithTheMaximumSum solver = new KItemsWithTheMaximumSum();
        assertEquals(0, solver.kItemsWithMaximumSum(5, 5, 5, 0), "Expected sum 0 when taking 0 items.");
    }

    @Test
    void testTakeExactlyAllOnes() {
        KItemsWithTheMaximumSum solver = new KItemsWithTheMaximumSum();
        assertEquals(4, solver.kItemsWithMaximumSum(4, 10, 10, 4), "Expected sum 4 taking only 1s.");
    }

    @Test
    void testTakeMoreThanAvailable() {
        KItemsWithTheMaximumSum solver = new KItemsWithTheMaximumSum();
        assertEquals(0, solver.kItemsWithMaximumSum(1, 1, 1, 10), "Expected 0 — only 3 items available.");
    }
}
