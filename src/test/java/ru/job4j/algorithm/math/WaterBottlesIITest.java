package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WaterBottlesIITest {

    @Test
    void testExactExchange() {
        WaterBottlesII solver = new WaterBottlesII();
        assertEquals(13, solver.maxBottlesDrunk(10, 3), "Expected 13 bottles drunk for 10 bottles and exchange rate of 3.");
    }

    @Test
    void testNoExchangePossible() {
        WaterBottlesII solver = new WaterBottlesII();
        assertEquals(5, solver.maxBottlesDrunk(5, 10), "Expected 5 bottles drunk since no exchange is possible.");
    }

    @Test
    void testExchangeHappensOnce() {
        WaterBottlesII solver = new WaterBottlesII();
        assertEquals(8, solver.maxBottlesDrunk(6, 3), "Expected 8 bottles drunk with one exchange.");
    }

    @Test
    void testLargeNumberOfBottles() {
        WaterBottlesII solver = new WaterBottlesII();
        assertEquals(18, solver.maxBottlesDrunk(15, 4), "Expected 18 bottles drunk for 15 bottles and exchange rate of 4.");
    }

    @Test
    void testMinimumInput() {
        WaterBottlesII solver = new WaterBottlesII();
        assertEquals(1, solver.maxBottlesDrunk(1, 2), "Expected 1 bottle drunk with no possible exchange.");
    }

    @Test
    void testExchangeRateIncreasesFast() {
        WaterBottlesII solver = new WaterBottlesII();
        assertEquals(11, solver.maxBottlesDrunk(8, 2), "Expected 11 bottles drunk when exchange rate increases quickly.");
    }

    @Test
    void testMultipleExchanges() {
        WaterBottlesII solver = new WaterBottlesII();
        assertEquals(20, solver.maxBottlesDrunk(17, 5), "Expected 20 bottles drunk for 17 bottles with exchange rate of 5.");
    }
}
