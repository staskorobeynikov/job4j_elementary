package ru.job4j.algorithm.a75.arraystring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    void testAllKidsHaveEqualCandies() {
        int[] candies = {2, 2, 2, 2};
        int extraCandies = 1;
        List<Boolean> result = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        List<Boolean> expected = Arrays.asList(true, true, true, true);
        assertEquals(expected, result, "All kids should have the greatest number of candies if extra candies are added");
    }

    @Test
    void testSingleKidWithCandies() {
        int[] candies = {5};
        int extraCandies = 3;
        List<Boolean> result = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        List<Boolean> expected = Arrays.asList(true);
        assertEquals(expected, result, "With only one kid, they should have the greatest number of candies regardless of extra candies");
    }

    @Test
    void testExtraCandiesEnoughForAllKidsToHaveGreatest() {
        int[] candies = {1, 2, 3};
        int extraCandies = 3;
        List<Boolean> result = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        List<Boolean> expected = Arrays.asList(true, true, true);
        assertEquals(expected, result, "With enough extra candies, all kids should reach the greatest number of candies");
    }

    @Test
    void testExtraCandiesNotEnoughForSomeKids() {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> result = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        List<Boolean> expected = Arrays.asList(true, false, false, false, false);
        assertEquals(expected, result, "Only kids with candies close to the maximum should have enough with extra candies");
    }

    @Test
    void testExtraCandiesZero() {
        int[] candies = {3, 5, 2, 8, 7};
        int extraCandies = 0;
        List<Boolean> result = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        List<Boolean> expected = Arrays.asList(false, false, false, true, false);
        assertEquals(expected, result, "Only the kid with the maximum amount of candies should have the greatest without extra candies");
    }
}
