package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmallestNumberWithAllSetBitsTest {

    @Test
    void testPowerOfTwoMinusOne() {
        SmallestNumberWithAllSetBits solver = new SmallestNumberWithAllSetBits();
        assertEquals(7, solver.smallestNumber(5), "Expected 7, which is 2^3 - 1 (covers 5).");
    }

    @Test
    void testExactMatch() {
        SmallestNumberWithAllSetBits solver = new SmallestNumberWithAllSetBits();
        assertEquals(15, solver.smallestNumber(15), "Expected 31, since 15 is already 2^4 - 1.");
    }

    @Test
    void testJustBelowPowerOfTwo() {
        SmallestNumberWithAllSetBits solver = new SmallestNumberWithAllSetBits();
        assertEquals(31, solver.smallestNumber(17), "Expected 31, which is 2^5 - 1.");
    }

    @Test
    void testSingleBit() {
        SmallestNumberWithAllSetBits solver = new SmallestNumberWithAllSetBits();
        assertEquals(1, solver.smallestNumber(1), "Expected 1, which is 2^1 - 1.");
    }

    @Test
    void testLargeNumber() {
        SmallestNumberWithAllSetBits solver = new SmallestNumberWithAllSetBits();
        assertEquals(255, solver.smallestNumber(130), "Expected 255, which is 2^8 - 1.");
    }

    @Test
    void testAnotherTypicalCase() {
        SmallestNumberWithAllSetBits solver = new SmallestNumberWithAllSetBits();
        assertEquals(63, solver.smallestNumber(45), "Expected 63, which is 2^6 - 1.");
    }
}
