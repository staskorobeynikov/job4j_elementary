package ru.job4j.algorithm.a75.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DayOfTheYearTest {

    @Test
    void testStartOfYear() {
        DayOfTheYear solver = new DayOfTheYear();
        assertEquals(1, solver.dayOfYear("2023-01-01"), "Expected 1 for the first day of the year.");
    }

    @Test
    void testEndOfYear() {
        DayOfTheYear solver = new DayOfTheYear();
        assertEquals(365, solver.dayOfYear("2023-12-31"), "Expected 365 for the last day of a common year.");
    }

    @Test
    void testEndOfLeapYear() {
        DayOfTheYear solver = new DayOfTheYear();
        assertEquals(366, solver.dayOfYear("2024-12-31"), "Expected 366 for the last day of a leap year.");
    }

    @Test
    void testLeapYearFebruary() {
        DayOfTheYear solver = new DayOfTheYear();
        assertEquals(60, solver.dayOfYear("2024-02-29"), "Expected 60 for February 29 in a leap year.");
    }

    @Test
    void testNonLeapYearFebruary() {
        DayOfTheYear solver = new DayOfTheYear();
        assertEquals(59, solver.dayOfYear("2023-02-28"), "Expected 59 for February 28 in a common year.");
    }

    @Test
    void testMiddleOfYear() {
        DayOfTheYear solver = new DayOfTheYear();
        assertEquals(200, solver.dayOfYear("2023-07-19"), "Expected 200 for July 19.");
    }

    @Test
    void testLeapYearMarch() {
        DayOfTheYear solver = new DayOfTheYear();
        assertEquals(61, solver.dayOfYear("2024-03-01"), "Expected 61 for March 1 in a leap year.");
    }

    @Test
    void testNonLeapYearMarch() {
        DayOfTheYear solver = new DayOfTheYear();
        assertEquals(60, solver.dayOfYear("2023-03-01"), "Expected 60 for March 1 in a common year.");
    }

    @Test
    void testCenturyNonLeapYear() {
        DayOfTheYear solver = new DayOfTheYear();
        assertEquals(59, solver.dayOfYear("1900-02-28"), "Expected 59 for February 28 in 1900 (not a leap year).");
    }

    @Test
    void testCenturyLeapYear() {
        DayOfTheYear solver = new DayOfTheYear();
        assertEquals(60, solver.dayOfYear("2000-02-29"), "Expected 60 for February 29 in 2000 (leap year).");
    }
}
