package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GCDTest {
    @Test
    void testGCDWithPositiveNumbers() {
        assertEquals(14, GCD.find(56, 98), "GCD of 56 and 98 should be 14");
        assertEquals(6, GCD.find(54, 24), "GCD of 54 and 24 should be 6");
        assertEquals(1, GCD.find(17, 19), "GCD of 17 and 19 should be 1");
    }

    @Test
    void testGCDWithZero() {
        assertEquals(10, GCD.find(10, 0), "GCD of 10 and 0 should be 10");
        assertEquals(10, GCD.find(0, 10), "GCD of 0 and 10 should be 10");
    }

    @Test
    void testGCDWithBothZeros() {
        assertThrows(
                IllegalArgumentException.class,
                () -> GCD.find(0, 0),
                "GCD for 0 and 0 should throw IllegalArgumentException"
        );
    }

    @Test
    void testGCDWithNegativeNumbers() {
        assertEquals(14, GCD.find(-56, -98), "GCD of -56 and -98 should be 14");
        assertEquals(6, GCD.find(-54, 24), "GCD of -54 and 24 should be 6");
        assertEquals(1, GCD.find(17, -19), "GCD of 17 and -19 should be 1");
    }

    @Test
    void testGCDWithEqualNumbers() {
        assertEquals(10, GCD.find(10, 10), "GCD of 10 and 10 should be 10");
        assertEquals(7, GCD.find(7, 7), "GCD of 7 and 7 should be 7");
    }

    @Test
    void testGCDWithPrimeNumbers() {
        assertEquals(1, GCD.find(13, 29), "GCD of 13 and 29 should be 1");
        assertEquals(1, GCD.find(101, 103), "GCD of 101 and 103 should be 1");
    }
}