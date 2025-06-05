package ru.job4j.algorithm.a75.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestOddNumberInStringTest {

    @Test
    void testEndsWithOdd() {
        LargestOddNumberInString finder = new LargestOddNumberInString();
        assertEquals("3547", finder.largestOddNumber("3547"));
    }

    @Test
    void testEndsWithEven() {
        LargestOddNumberInString finder = new LargestOddNumberInString();
        assertEquals("3547", finder.largestOddNumber("35472"));
    }

    @Test
    void testNoOddDigits() {
        LargestOddNumberInString finder = new LargestOddNumberInString();
        assertEquals("", finder.largestOddNumber("420680"));
    }

    @Test
    void testAllOddDigits() {
        LargestOddNumberInString finder = new LargestOddNumberInString();
        assertEquals("13579", finder.largestOddNumber("13579"));
    }

    @Test
    void testOnlyOneDigitOdd() {
        LargestOddNumberInString finder = new LargestOddNumberInString();
        assertEquals("7", finder.largestOddNumber("7"));
    }

    @Test
    void testOnlyOneDigitEven() {
        LargestOddNumberInString finder = new LargestOddNumberInString();
        assertEquals("", finder.largestOddNumber("8"));
    }

    @Test
    void testVeryLargeNumberEndingInOdd() {
        LargestOddNumberInString finder = new LargestOddNumberInString();
        String input = "1".repeat(99999) + "3";
        assertEquals(input, finder.largestOddNumber(input));
    }

    @Test
    void testVeryLargeNumberEndingInEven() {
        LargestOddNumberInString finder = new LargestOddNumberInString();
        String input = "1".repeat(99999) + "2";
        String expected = "1".repeat(99999);
        assertEquals(expected, finder.largestOddNumber(input));
    }
}