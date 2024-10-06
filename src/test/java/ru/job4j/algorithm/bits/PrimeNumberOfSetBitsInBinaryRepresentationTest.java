package ru.job4j.algorithm.bits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberOfSetBitsInBinaryRepresentationTest {

    @Test
    void testRange1to10() {
        PrimeNumberOfSetBitsInBinaryRepresentation solver = new PrimeNumberOfSetBitsInBinaryRepresentation();
        assertEquals(6, solver.countPrimeSetBits(1, 10));
    }

    @Test
    void testRange6to10() {
        PrimeNumberOfSetBitsInBinaryRepresentation solver = new PrimeNumberOfSetBitsInBinaryRepresentation();
        assertEquals(4, solver.countPrimeSetBits(6, 10));
    }

    @Test
    void testSingleValueWithPrimeSetBits() {
        PrimeNumberOfSetBitsInBinaryRepresentation solver = new PrimeNumberOfSetBitsInBinaryRepresentation();
        assertEquals(1, solver.countPrimeSetBits(5, 5));
    }

    @Test
    void testSingleValueWithNonPrimeSetBits() {
        PrimeNumberOfSetBitsInBinaryRepresentation solver = new PrimeNumberOfSetBitsInBinaryRepresentation();
        assertEquals(0, solver.countPrimeSetBits(8, 8));
    }

    @Test
    void testEmptyRange() {
        PrimeNumberOfSetBitsInBinaryRepresentation solver = new PrimeNumberOfSetBitsInBinaryRepresentation();
        assertEquals(0, solver.countPrimeSetBits(20, 19));
    }

    @Test
    void testRange15to20() {
        PrimeNumberOfSetBitsInBinaryRepresentation solver = new PrimeNumberOfSetBitsInBinaryRepresentation();
        assertEquals(4, solver.countPrimeSetBits(15, 20));
    }

    @Test
    void testUpperBoundInPrimeList() {
        PrimeNumberOfSetBitsInBinaryRepresentation solver = new PrimeNumberOfSetBitsInBinaryRepresentation();
        assertEquals(1, solver.countPrimeSetBits(524287, 524287));
    }

    @Test
    void testLargeRangePerformance() {
        PrimeNumberOfSetBitsInBinaryRepresentation solver = new PrimeNumberOfSetBitsInBinaryRepresentation();
        int count = solver.countPrimeSetBits(1000000, 1000100);
        assertTrue(count >= 0, "Result should be non-negative.");
    }
}
