package ru.job4j.algorithm.bits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumBitFlipsToConvertNumberTest {

    @Test
    void testNoFlipsNeeded() {
        MinimumBitFlipsToConvertNumber solver = new MinimumBitFlipsToConvertNumber();
        assertEquals(0, solver.minBitFlips(5, 5), "Expected 0 flips when start and goal are the same.");
    }

    @Test
    void testAllBitsDifferent() {
        MinimumBitFlipsToConvertNumber solver = new MinimumBitFlipsToConvertNumber();
        assertEquals(3, solver.minBitFlips(0, 7), "Expected 3 flips to convert 000 to 111.");
    }

    @Test
    void testOneBitDifference() {
        MinimumBitFlipsToConvertNumber solver = new MinimumBitFlipsToConvertNumber();
        assertEquals(1, solver.minBitFlips(8, 0), "Expected 1 flip to convert 1000 to 0000.");
    }

    @Test
    void testMultipleBitFlips() {
        MinimumBitFlipsToConvertNumber solver = new MinimumBitFlipsToConvertNumber();
        assertEquals(2, solver.minBitFlips(10, 12), "Expected 2 flips to convert 1010 to 1100.");
    }

    @Test
    void testWithZeroStart() {
        MinimumBitFlipsToConvertNumber solver = new MinimumBitFlipsToConvertNumber();
        assertEquals(2, solver.minBitFlips(0, 3), "Expected 2 flips to convert 0000 to 0011.");
    }

    @Test
    void testWithZeroGoal() {
        MinimumBitFlipsToConvertNumber solver = new MinimumBitFlipsToConvertNumber();
        assertEquals(4, solver.minBitFlips(15, 0), "Expected 4 flips to convert 1111 to 0000.");
    }
}
