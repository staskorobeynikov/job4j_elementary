package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountDaysSpentTogetherTest {

    @Test
    void testSameArrivalAndLeave() {
        CountDaysSpentTogether solver = new CountDaysSpentTogether();
        assertEquals(1, solver.countDaysTogether("08-15", "08-15", "08-15", "08-15"),
                "Expected 1 day when both arrive and leave on the same day.");
    }

    @Test
    void testCompletelyNonOverlapping() {
        CountDaysSpentTogether solver = new CountDaysSpentTogether();
        assertEquals(0, solver.countDaysTogether("03-01", "03-10", "04-01", "04-10"),
                "Expected 0 days when periods do not overlap.");
    }

    @Test
    void testPartialOverlap() {
        CountDaysSpentTogether solver = new CountDaysSpentTogether();
        assertEquals(5, solver.countDaysTogether("06-01", "06-10", "06-06", "06-15"),
                "Expected 5 days of overlap from 06-06 to 06-10.");
    }

    @Test
    void testFullOverlap() {
        CountDaysSpentTogether solver = new CountDaysSpentTogether();
        assertEquals(10, solver.countDaysTogether("07-01", "07-10", "07-01", "07-10"),
                "Expected full 10 days of overlap.");
    }

    @Test
    void testAliceInsideBobRange() {
        CountDaysSpentTogether solver = new CountDaysSpentTogether();
        assertEquals(6, solver.countDaysTogether("09-10", "09-15", "09-01", "09-30"),
                "Expected 6 days of overlap when Alice's range is fully within Bob's.");
    }

    @Test
    void testBobInsideAliceRange() {
        CountDaysSpentTogether solver = new CountDaysSpentTogether();
        assertEquals(5, solver.countDaysTogether("10-01", "10-31", "10-05", "10-09"),
                "Expected 5 days of overlap when Bob's range is within Alice's.");
    }

    @Test
    void testAdjacentPeriodsNoOverlap() {
        CountDaysSpentTogether solver = new CountDaysSpentTogether();
        assertEquals(0, solver.countDaysTogether("05-01", "05-10", "05-11", "05-20"),
                "Expected 0 days when periods are adjacent but not overlapping.");
    }

    @Test
    void testEdgeOfYear() {
        CountDaysSpentTogether solver = new CountDaysSpentTogether();
        assertEquals(1, solver.countDaysTogether("12-31", "12-31", "12-31", "12-31"),
                "Expected 1 day of overlap on the last day of the year.");
    }

    @Test
    void testLongOverlapAcrossMonths() {
        CountDaysSpentTogether solver = new CountDaysSpentTogether();
        assertEquals(17, solver.countDaysTogether("08-01", "08-31", "08-15", "09-15"),
                "Expected 17 days in August and 14 in September = 31 total days of overlap.");
    }

    @Test
    void testAliceAndBobSamePeriod() {
        CountDaysSpentTogether solver = new CountDaysSpentTogether();
        assertEquals(2, solver.countDaysTogether("02-27", "03-01", "02-28", "03-01"),
                "Expected 2 days of overlap from 02-28 to 03-01.");
    }
}
