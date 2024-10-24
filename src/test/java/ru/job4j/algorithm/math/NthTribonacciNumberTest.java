package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NthTribonacciNumberTest {

    @Test
    void testNEquals0() {
        NthTribonacciNumber solver = new NthTribonacciNumber();
        assertEquals(0, solver.tribonacci(0), "T(0) = 0");
    }

    @Test
    void testNEquals1() {
        NthTribonacciNumber solver = new NthTribonacciNumber();
        assertEquals(1, solver.tribonacci(1), "T(1) = 1");
    }

    @Test
    void testNEquals2() {
        NthTribonacciNumber solver = new NthTribonacciNumber();
        assertEquals(1, solver.tribonacci(2), "T(2) = 1");
    }

    @Test
    void testNEquals3() {
        NthTribonacciNumber solver = new NthTribonacciNumber();
        assertEquals(2, solver.tribonacci(3), "T(3) = 0+1+1 = 2");
    }

    @Test
    void testNEquals4() {
        NthTribonacciNumber solver = new NthTribonacciNumber();
        assertEquals(4, solver.tribonacci(4), "T(4) = 1+1+2 = 4");
    }

    @Test
    void testNEquals5() {
        NthTribonacciNumber solver = new NthTribonacciNumber();
        assertEquals(7, solver.tribonacci(5), "T(5) = 1+2+4 = 7");
    }

    @Test
    void testNEquals10() {
        NthTribonacciNumber solver = new NthTribonacciNumber();
        assertEquals(149, solver.tribonacci(10), "T(10) = 149");
    }

    @Test
    void testNEquals25() {
        NthTribonacciNumber solver = new NthTribonacciNumber();
        assertEquals(1389537, solver.tribonacci(25), "T(25) = 1389537");
    }
}