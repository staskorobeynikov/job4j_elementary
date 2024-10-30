package ru.job4j.algorithm.a75.arraystring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CanPlaceFlowersTest {

    @Test
    void testCanPlaceAllFlowers() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        assertTrue(CanPlaceFlowers.canPlaceFlowers(flowerbed, n), "Should be able to place 1 flower");
    }

    @Test
    void testCannotPlaceAllFlowers() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        assertFalse(CanPlaceFlowers.canPlaceFlowers(flowerbed, n), "Should not be able to place 2 flowers");
    }

    @Test
    void testEmptyFlowerbed() {
        int[] flowerbed = {0, 0, 0, 0, 0};
        int n = 3;
        assertTrue(CanPlaceFlowers.canPlaceFlowers(flowerbed, n), "Should be able to place 3 flowers in empty bed");
    }

    @Test
    void testFullFlowerbed() {
        int[] flowerbed = {1, 1, 1, 1, 1};
        int n = 1;
        assertFalse(CanPlaceFlowers.canPlaceFlowers(flowerbed, n), "Should not be able to place any flowers in a full bed");
    }

    @Test
    void testOneSpotAvailable() {
        int[] flowerbed = {0};
        int n = 1;
        assertTrue(CanPlaceFlowers.canPlaceFlowers(flowerbed, n), "Should be able to place 1 flower in single empty spot");
    }

    @Test
    void testOneSpotNotAvailable() {
        int[] flowerbed = {1};
        int n = 1;
        assertFalse(CanPlaceFlowers.canPlaceFlowers(flowerbed, n), "Should not be able to place flower in a spot that is already occupied");
    }

    @Test
    void testEdgeCaseAlternatingPattern() {
        int[] flowerbed = {0, 1, 0, 1, 0, 1, 0};
        int n = 1;
        assertFalse(CanPlaceFlowers.canPlaceFlowers(flowerbed, n), "Should not be able to place a flower due to alternating pattern");
    }

    @Test
    void testLargeEmptyFlowerbed() {
        int[] flowerbed = {0, 0, 0, 0, 0, 0, 0};
        int n = 3;
        assertTrue(CanPlaceFlowers.canPlaceFlowers(flowerbed, n), "Should be able to place 3 flowers in a large empty bed");
    }
}
