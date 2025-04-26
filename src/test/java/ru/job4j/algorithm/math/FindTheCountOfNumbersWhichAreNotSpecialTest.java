package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindTheCountOfNumbersWhichAreNotSpecialTest {

    @Test
    void testSmallRangeNoSpecial() {
        FindTheCountOfNumbersWhichAreNotSpecial solver = new FindTheCountOfNumbersWhichAreNotSpecial();
        assertEquals(4, solver.nonSpecialCount(1, 5), "Expected 4 non-special numbers from 1 to 5.");
    }

    @Test
    void testSmallRangeWithSpecial() {
        FindTheCountOfNumbersWhichAreNotSpecial solver = new FindTheCountOfNumbersWhichAreNotSpecial();
        assertEquals(8, solver.nonSpecialCount(1, 10), "Expected 8 non-special numbers from 1 to 10.");
    }

    @Test
    void testFullRangeWithMultipleSpecials() {
        FindTheCountOfNumbersWhichAreNotSpecial solver = new FindTheCountOfNumbersWhichAreNotSpecial();
        assertEquals(22, solver.nonSpecialCount(1, 25), "Expected 22 non-special numbers from 1 to 25.");
    }

    @Test
    void testRangeStartingFromPerfectSquare() {
        FindTheCountOfNumbersWhichAreNotSpecial solver = new FindTheCountOfNumbersWhichAreNotSpecial();
        assertEquals(11, solver.nonSpecialCount(9, 20), "Expected 11 non-special numbers from 9 to 20.");
    }

    @Test
    void testRangeEndingAtPerfectSquare() {
        FindTheCountOfNumbersWhichAreNotSpecial solver = new FindTheCountOfNumbersWhichAreNotSpecial();
        assertEquals(11, solver.nonSpecialCount(5, 16), "Expected 11 non-special numbers from 5 to 16.");
    }

    @Test
    void testSingleElementRangeNonSpecial() {
        FindTheCountOfNumbersWhichAreNotSpecial solver = new FindTheCountOfNumbersWhichAreNotSpecial();
        assertEquals(1, solver.nonSpecialCount(8, 8), "Expected 1 non-special number for 8.");
    }

    @Test
    void testSingleElementRangeSpecial() {
        FindTheCountOfNumbersWhichAreNotSpecial solver = new FindTheCountOfNumbersWhichAreNotSpecial();
        assertEquals(0, solver.nonSpecialCount(4, 4), "Expected 0 non-special number for 4 (special case).");
    }

    @Test
    void testLargeRange() {
        FindTheCountOfNumbersWhichAreNotSpecial solver = new FindTheCountOfNumbersWhichAreNotSpecial();
        assertEquals(989, solver.nonSpecialCount(1, 1000), "Expected 989 non-special numbers from 1 to 1000.");
    }

    @Test
    void testRangeWithoutSpecialNumbers() {
        FindTheCountOfNumbersWhichAreNotSpecial solver = new FindTheCountOfNumbersWhichAreNotSpecial();
        assertEquals(10, solver.nonSpecialCount(90, 99), "Expected 10 non-special numbers between 90 and 99.");
    }

    @Test
    void testPerfectSquarePrimeInRange() {
        FindTheCountOfNumbersWhichAreNotSpecial solver = new FindTheCountOfNumbersWhichAreNotSpecial();
        assertEquals(27, solver.nonSpecialCount(1, 30), "Expected 27 non-special numbers from 1 to 30.");
    }
}
