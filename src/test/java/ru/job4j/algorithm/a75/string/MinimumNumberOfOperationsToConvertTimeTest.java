package ru.job4j.algorithm.a75.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfOperationsToConvertTimeTest {

    @Test
    void testSameTime() {
        MinimumNumberOfOperationsToConvertTime solver = new MinimumNumberOfOperationsToConvertTime();
        assertEquals(0, solver.convertTime("09:00", "09:00"),
                "Expected 0 operations for same time.");
    }

    @Test
    void testOneMinuteDifference() {
        MinimumNumberOfOperationsToConvertTime solver = new MinimumNumberOfOperationsToConvertTime();
        assertEquals(1, solver.convertTime("09:00", "09:01"),
                "Expected 1 operation for 1 minute difference.");
    }

    @Test
    void testExactHourDifference() {
        MinimumNumberOfOperationsToConvertTime solver = new MinimumNumberOfOperationsToConvertTime();
        assertEquals(1, solver.convertTime("08:00", "09:00"),
                "Expected 1 operation (60 minutes).");
    }

    @Test
    void testMultipleIntervals() {
        MinimumNumberOfOperationsToConvertTime solver = new MinimumNumberOfOperationsToConvertTime();
        assertEquals(2, solver.convertTime("09:00", "09:20"),
                "Expected 2 operations (15 + 5).");
    }

    @Test
    void testAllIntervalTypesUsed() {
        MinimumNumberOfOperationsToConvertTime solver = new MinimumNumberOfOperationsToConvertTime();
        assertEquals(4, solver.convertTime("10:00", "11:21"),
                "Expected 4 operations (60 + 15 + 5 + 1).");
    }

    @Test
    void testSingleOperationForEach() {
        MinimumNumberOfOperationsToConvertTime solver = new MinimumNumberOfOperationsToConvertTime();
        assertEquals(4, solver.convertTime("09:00", "09:81"),
                "Expected 4 operations: 60 + 15 + 5 + 1.");
    }

    @Test
    void testMinuteWrapAround() {
        MinimumNumberOfOperationsToConvertTime solver = new MinimumNumberOfOperationsToConvertTime();
        assertEquals(1, solver.convertTime("08:59", "09:00"),
                "Expected 1 operation (1 minute).");
    }

    @Test
    void testBigGap() {
        MinimumNumberOfOperationsToConvertTime solver = new MinimumNumberOfOperationsToConvertTime();
        assertEquals(5, solver.convertTime("00:00", "01:26"),
                "Expected 7 operations (60 + 15 + 5 + 5 + 1).");
    }

    @Test
    void testLateMorningToAfternoon() {
        MinimumNumberOfOperationsToConvertTime solver = new MinimumNumberOfOperationsToConvertTime();
        assertEquals(3, solver.convertTime("11:00", "12:20"),
                "Expected 3 operations (60 + 15 + 5).");
    }

    @Test
    void testConvertBeforeToAfter() {
        MinimumNumberOfOperationsToConvertTime solver = new MinimumNumberOfOperationsToConvertTime();
        assertEquals(5, solver.convertTime("03:12", "04:38"),
                "Expected 5 operations (60 + 15 + 5 + 5 + 1).");
    }
}
