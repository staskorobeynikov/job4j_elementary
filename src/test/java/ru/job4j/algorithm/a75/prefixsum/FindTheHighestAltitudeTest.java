package ru.job4j.algorithm.a75.prefixsum;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FindTheHighestAltitudeTest {

    @Test
    void testBasicCase() {
        int[] gain = {-5, 1, 5, 0, -7};
        int result = FindTheHighestAltitude.largestAltitude(gain);
        assertEquals(1, result, "The highest altitude is 1");
    }

    @Test
    void testAllPositiveGains() {
        int[] gain = {1, 2, 3, 4};
        int result = FindTheHighestAltitude.largestAltitude(gain);
        assertEquals(10, result, "The highest altitude is 10 (cumulative sum of all positive gains)");
    }

    @Test
    void testAllNegativeGains() {
        int[] gain = {-1, -2, -3, -4};
        int result = FindTheHighestAltitude.largestAltitude(gain);
        assertEquals(0, result, "The highest altitude is 0 (starting altitude)");
    }

    @Test
    void testMixedGains() {
        int[] gain = {2, -1, 3, -2, 1};
        int result = FindTheHighestAltitude.largestAltitude(gain);
        assertEquals(4, result, "The highest altitude is 4");
    }

    @Test
    void testSinglePositiveGain() {
        int[] gain = {5};
        int result = FindTheHighestAltitude.largestAltitude(gain);
        assertEquals(5, result, "The highest altitude is 5");
    }

    @Test
    void testSingleNegativeGain() {
        int[] gain = {-3};
        int result = FindTheHighestAltitude.largestAltitude(gain);
        assertEquals(0, result, "The highest altitude is 0 (starting altitude)");
    }

    @Test
    void testZeroGains() {
        int[] gain = {0, 0, 0, 0};
        int result = FindTheHighestAltitude.largestAltitude(gain);
        assertEquals(0, result, "The highest altitude is 0 when all gains are 0");
    }

    @Test
    void testEmptyGains() {
        int[] gain = {};
        int result = FindTheHighestAltitude.largestAltitude(gain);
        assertEquals(0, result, "The highest altitude is 0 when no gains are provided");
    }
}
