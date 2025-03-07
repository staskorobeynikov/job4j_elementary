package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Maximum69NumberTest {

    @Test
    void testSingleSix() {
        Maximum69Number solver = new Maximum69Number();
        assertEquals(9, solver.maximum69Number(6), "Expected 9 for input 6.");
    }

    @Test
    void testSingleNine() {
        Maximum69Number solver = new Maximum69Number();
        assertEquals(9, solver.maximum69Number(9), "Expected 9 for input 9 (unchanged).");
    }

    @Test
    void testMultipleSixes() {
        Maximum69Number solver = new Maximum69Number();
        assertEquals(9969, solver.maximum69Number(9669), "Expected 9969 for input 9669.");
    }

    @Test
    void testOnlySixes() {
        Maximum69Number solver = new Maximum69Number();
        assertEquals(969, solver.maximum69Number(669), "Expected 969 for input 669.");
    }

    @Test
    void testOnlyNines() {
        Maximum69Number solver = new Maximum69Number();
        assertEquals(9999, solver.maximum69Number(9999), "Expected 9999 for input 9999 (unchanged).");
    }

    @Test
    void testLeadingSix() {
        Maximum69Number solver = new Maximum69Number();
        assertEquals(9696, solver.maximum69Number(6696), "Expected 9696 for input 6696.");
    }

    @Test
    void testTrailingSix() {
        Maximum69Number solver = new Maximum69Number();
        assertEquals(9996, solver.maximum69Number(9966), "Expected 9966 for input 9966 (only first 6 changes).");
    }
}
