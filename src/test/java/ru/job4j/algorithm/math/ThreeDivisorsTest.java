package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ThreeDivisorsTest {

    @Test
    void testNumberWithExactlyThreeDivisors() {
        ThreeDivisors solver = new ThreeDivisors();
        assertTrue(solver.isThree(4), "Expected true: 4 has exactly three divisors (1, 2, 4).");
    }

    @Test
    void testPrimeNumber() {
        ThreeDivisors solver = new ThreeDivisors();
        assertFalse(solver.isThree(7), "Expected false: 7 has only two divisors (1, 7).");
    }

    @Test
    void testNumberWithMoreThanThreeDivisors() {
        ThreeDivisors solver = new ThreeDivisors();
        assertFalse(solver.isThree(6), "Expected false: 6 has four divisors (1, 2, 3, 6).");
    }

    @Test
    void testNumberOne() {
        ThreeDivisors solver = new ThreeDivisors();
        assertFalse(solver.isThree(1), "Expected false: 1 has only one divisor.");
    }

    @Test
    void testSquareOfPrime() {
        ThreeDivisors solver = new ThreeDivisors();
        assertTrue(solver.isThree(9), "Expected true: 9 has exactly three divisors (1, 3, 9).");
    }

    @Test
    void testLargerSquareOfPrime() {
        ThreeDivisors solver = new ThreeDivisors();
        assertTrue(solver.isThree(49), "Expected true: 49 has exactly three divisors (1, 7, 49).");
    }

    @Test
    void testLargeNumberWithMoreDivisors() {
        ThreeDivisors solver = new ThreeDivisors();
        assertFalse(solver.isThree(100), "Expected false: 100 has more than three divisors.");
    }
}
