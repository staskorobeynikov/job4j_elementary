package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TotalDistanceTraveledTest {

    @Test
    void testExactMultipleOfFive() {
        TotalDistanceTraveled solver = new TotalDistanceTraveled();
        assertEquals(60, solver.distanceTraveled(5, 1), "Expected 60 for 5 mainTank and 1 additionalTank.");
    }

    @Test
    void testNoAdditionalTank() {
        TotalDistanceTraveled solver = new TotalDistanceTraveled();
        assertEquals(50, solver.distanceTraveled(5, 0), "Expected 50 when only mainTank is used.");
    }

    @Test
    void testMoreAdditionalFuel() {
        TotalDistanceTraveled solver = new TotalDistanceTraveled();
        assertEquals(120, solver.distanceTraveled(10, 3), "Expected 120 for 10 mainTank and 3 additionalTank.");
    }

    @Test
    void testMoreAdditionalFuelThanNeeded() {
        TotalDistanceTraveled solver = new TotalDistanceTraveled();
        assertEquals(90, solver.distanceTraveled(8, 5), "Expected 90 for 8 mainTank and 5 additionalTank.");
    }

    @Test
    void testSmallMainTank() {
        TotalDistanceTraveled solver = new TotalDistanceTraveled();
        assertEquals(10, solver.distanceTraveled(1, 5), "Expected 10 for 1 mainTank, no refueling possible.");
    }

    @Test
    void testZeroFuel() {
        TotalDistanceTraveled solver = new TotalDistanceTraveled();
        assertEquals(0, solver.distanceTraveled(0, 5), "Expected 0 for 0 mainTank, no distance can be traveled.");
    }

    @Test
    void testLargeFuelNumbers() {
        TotalDistanceTraveled solver = new TotalDistanceTraveled();
        assertEquals(180, solver.distanceTraveled(15, 6), "Expected 180 for 15 mainTank and 6 additionalTank.");
    }

    @Test
    void testJustEnoughFuelToRefuelOnce() {
        TotalDistanceTraveled solver = new TotalDistanceTraveled();
        assertEquals(70, solver.distanceTraveled(6, 1), "Expected 70 for 6 mainTank and 1 additionalTank.");
    }
}