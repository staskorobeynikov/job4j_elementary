package ru.job4j.algorithm.a75.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveTrailingZerosFromAStringTest {

    @Test
    void testNoTrailingZeros() {
        RemoveTrailingZerosFromAString solver = new RemoveTrailingZerosFromAString();
        assertEquals("12345", solver.removeTrailingZeros("12345"));
    }

    @Test
    void testSomeTrailingZeros() {
        RemoveTrailingZerosFromAString solver = new RemoveTrailingZerosFromAString();
        assertEquals("123", solver.removeTrailingZeros("123000"));
    }

    @Test
    void testAllZerosExceptOne() {
        RemoveTrailingZerosFromAString solver = new RemoveTrailingZerosFromAString();
        assertEquals("1", solver.removeTrailingZeros("100000"));
    }

    @Test
    void testOnlyOneZero() {
        RemoveTrailingZerosFromAString solver = new RemoveTrailingZerosFromAString();
        assertEquals("0", solver.removeTrailingZeros("0"));
    }

    @Test
    void testZeroWithNonZeroPrefix() {
        RemoveTrailingZerosFromAString solver = new RemoveTrailingZerosFromAString();
        assertEquals("1", solver.removeTrailingZeros("100"));
    }

    @Test
    void testEndsWithNonZero() {
        RemoveTrailingZerosFromAString solver = new RemoveTrailingZerosFromAString();
        assertEquals("1203", solver.removeTrailingZeros("1203"));
    }

    @Test
    void testLongStringWithTrailingZeros() {
        RemoveTrailingZerosFromAString solver = new RemoveTrailingZerosFromAString();
        assertEquals("987654321", solver.removeTrailingZeros("987654321000000"));
    }
}