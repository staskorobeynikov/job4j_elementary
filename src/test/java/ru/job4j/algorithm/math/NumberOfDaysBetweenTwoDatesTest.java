package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfDaysBetweenTwoDatesTest {

    @Test
    void testSameDate() {
        NumberOfDaysBetweenTwoDates solver = new NumberOfDaysBetweenTwoDates();
        assertEquals(0, solver.daysBetweenDates("2020-01-01", "2020-01-01"),
                "Expected 0 days between the same dates.");
    }

    @Test
    void testConsecutiveDates() {
        NumberOfDaysBetweenTwoDates solver = new NumberOfDaysBetweenTwoDates();
        assertEquals(1, solver.daysBetweenDates("2020-01-01", "2020-01-02"),
                "Expected 1 day between consecutive dates.");
    }

    @Test
    void testDifferentYears() {
        NumberOfDaysBetweenTwoDates solver = new NumberOfDaysBetweenTwoDates();
        assertEquals(365, solver.daysBetweenDates("2019-01-01", "2020-01-01"),
                "Expected 365 days between non-leap year to non-leap year.");
    }

    @Test
    void testLeapYear() {
        NumberOfDaysBetweenTwoDates solver = new NumberOfDaysBetweenTwoDates();
        assertEquals(365, solver.daysBetweenDates("2019-01-01", "2020-01-01"),
                "Expected 365 days (2019 not leap), not 366.");
    }

    @Test
    void testLeapDayIncluded() {
        NumberOfDaysBetweenTwoDates solver = new NumberOfDaysBetweenTwoDates();
        assertEquals(1, solver.daysBetweenDates("2020-02-28", "2020-02-29"),
                "Expected 1 day difference when passing through leap day.");
    }

    @Test
    void testAcrossLeapYear() {
        NumberOfDaysBetweenTwoDates solver = new NumberOfDaysBetweenTwoDates();
        assertEquals(366, solver.daysBetweenDates("2019-03-01", "2020-03-01"),
                "Expected 366 days across a leap year.");
    }

    @Test
    void testReverseOrder() {
        NumberOfDaysBetweenTwoDates solver = new NumberOfDaysBetweenTwoDates();
        assertEquals(30, solver.daysBetweenDates("2020-02-01", "2020-01-02"),
                "Expected 30 days regardless of date order.");
    }

    @Test
    void testFarApartDates() {
        NumberOfDaysBetweenTwoDates solver = new NumberOfDaysBetweenTwoDates();
        assertEquals(17897, solver.daysBetweenDates("1971-01-01", "2020-01-01"),
                "Expected 17897 days between 1971-01-01 and 2020-01-01.");
    }

    @Test
    void testFullLeapYear() {
        NumberOfDaysBetweenTwoDates solver = new NumberOfDaysBetweenTwoDates();
        assertEquals(366, solver.daysBetweenDates("2020-01-01", "2021-01-01"),
                "Expected 366 days with leap year 2020.");
    }

    @Test
    void testEndOfMonth() {
        NumberOfDaysBetweenTwoDates solver = new NumberOfDaysBetweenTwoDates();
        assertEquals(1, solver.daysBetweenDates("2020-04-30", "2020-05-01"),
                "Expected 1 day between end of April and start of May.");
    }
}
