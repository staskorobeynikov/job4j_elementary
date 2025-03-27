package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmallestEvenMultipleTest {

    @Test
    void testEvenNumber() {
        SmallestEvenMultiple solver = new SmallestEvenMultiple();
        assertEquals(8, solver.smallestEvenMultiple(8), "Expected 8 for input 8 (already even).");
    }

    @Test
    void testOddNumber() {
        SmallestEvenMultiple solver = new SmallestEvenMultiple();
        assertEquals(6, solver.smallestEvenMultiple(3), "Expected 6 for input 3 (odd, doubled).");
    }

    @Test
    void testOne() {
        SmallestEvenMultiple solver = new SmallestEvenMultiple();
        assertEquals(2, solver.smallestEvenMultiple(1), "Expected 2 for input 1.");
    }

    @Test
    void testTwo() {
        SmallestEvenMultiple solver = new SmallestEvenMultiple();
        assertEquals(2, solver.smallestEvenMultiple(2), "Expected 2 for input 2 (already even).");
    }

    @Test
    void testLargeEvenNumber() {
        SmallestEvenMultiple solver = new SmallestEvenMultiple();
        assertEquals(1000000, solver.smallestEvenMultiple(1000000), "Expected 1000000 for input 1000000.");
    }

    @Test
    void testLargeOddNumber() {
        SmallestEvenMultiple solver = new SmallestEvenMultiple();
        assertEquals(1999998, solver.smallestEvenMultiple(999999), "Expected 1999998 for input 999999 (odd, doubled).");
    }
}
