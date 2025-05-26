package ru.job4j.algorithm.a75.twopointers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumOfSquareNumbersTest {

    @Test
    void testZero() {
        SumOfSquareNumbers solver = new SumOfSquareNumbers();
        assertTrue(solver.judgeSquareSum(0));
    }

    @Test
    void testPerfectSquareSum() {
        SumOfSquareNumbers solver = new SumOfSquareNumbers();
        assertTrue(solver.judgeSquareSum(5));
    }

    @Test
    void testNotSquareSum() {
        SumOfSquareNumbers solver = new SumOfSquareNumbers();
        assertFalse(solver.judgeSquareSum(3));
    }

    @Test
    void testLargePerfectSum() {
        SumOfSquareNumbers solver = new SumOfSquareNumbers();
        assertTrue(solver.judgeSquareSum(1_000_000));
    }

    @Test
    void testLargeNonPerfectSum() {
        SumOfSquareNumbers solver = new SumOfSquareNumbers();
        assertTrue(solver.judgeSquareSum(1_000_001));
    }

    @Test
    void testMaxIntValue() {
        SumOfSquareNumbers solver = new SumOfSquareNumbers();
        assertFalse(solver.judgeSquareSum(Integer.MAX_VALUE));
    }

    @Test
    void testSmallSquares() {
        SumOfSquareNumbers solver = new SumOfSquareNumbers();
        assertTrue(solver.judgeSquareSum(1));
        assertTrue(solver.judgeSquareSum(2));
        assertFalse(solver.judgeSquareSum(7));
    }

    @Test
    void testExactMidrange() {
        SumOfSquareNumbers solver = new SumOfSquareNumbers();
        assertTrue(solver.judgeSquareSum(2500 + 1600));
        assertTrue(solver.judgeSquareSum(900 + 1600));
        assertTrue(solver.judgeSquareSum(2500 + 2500));
    }
}