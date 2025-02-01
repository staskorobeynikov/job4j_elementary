package ru.job4j.algorithm.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CountSquareSumTriplesTest {

    @Test
    void testSmallValue() {
        CountSquareSumTriples solution = new CountSquareSumTriples();
        assertEquals(2, solution.countTriples(5), "Expected 2 valid triples for n=5");
    }

    @Test
    void testMediumValue() {
        CountSquareSumTriples solution = new CountSquareSumTriples();
        assertEquals(4, solution.countTriples(10), "Expected 4 valid triples for n=10");
    }

    @Test
    void testNoTriples() {
        CountSquareSumTriples solution = new CountSquareSumTriples();
        assertEquals(0, solution.countTriples(1), "Expected 0 valid triples for n=1");
    }

    @Test
    void testLargerValue() {
        CountSquareSumTriples solution = new CountSquareSumTriples();
        assertEquals(8, solution.countTriples(15), "Expected 16 valid triples for n=15");
    }

    @Test
    void testExactSquareLimit() {
        CountSquareSumTriples solution = new CountSquareSumTriples();
        assertEquals(12, solution.countTriples(20), "Expected 34 valid triples for n=20");
    }

    @Test
    void testMaximumValue() {
        CountSquareSumTriples solution = new CountSquareSumTriples();
        assertTrue(solution.countTriples(50) > 0, "There should be valid triples for n=50");
    }
}
