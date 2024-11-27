package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountPrimesTest {

    @Test
    void testNIs0() {
        CountPrimes solver = new CountPrimes();
        assertEquals(0, solver.countPrimes(0), "Expected 0 primes less than 0");
    }

    @Test
    void testNIs1() {
        CountPrimes solver = new CountPrimes();
        assertEquals(0, solver.countPrimes(1), "Expected 0 primes less than 1");
    }

    @Test
    void testNIs2() {
        CountPrimes solver = new CountPrimes();
        assertEquals(0, solver.countPrimes(2), "Expected 0 primes less than 2");
    }

    @Test
    void testNIs10() {
        CountPrimes solver = new CountPrimes();
        assertEquals(4, solver.countPrimes(10));
    }

    @Test
    void testNIs20() {
        CountPrimes solver = new CountPrimes();
        assertEquals(8, solver.countPrimes(20));
    }

    @Test
    void testNIs100() {
        CountPrimes solver = new CountPrimes();
        assertEquals(25, solver.countPrimes(100), "Expected 25 primes less than 100");
    }

    @Test
    void testNIs500() {
        CountPrimes solver = new CountPrimes();
        assertEquals(95, solver.countPrimes(500), "Expected 95 primes less than 500");
    }

    @Test
    void testNIs1000() {
        CountPrimes solver = new CountPrimes();
        assertEquals(168, solver.countPrimes(1000), "Expected 168 primes less than 1000");
    }

    @Test
    void testNIs499979() {
        CountPrimes solver = new CountPrimes();
        assertEquals(41537, solver.countPrimes(499979));
    }
}