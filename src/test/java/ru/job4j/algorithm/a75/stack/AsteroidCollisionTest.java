package ru.job4j.algorithm.a75.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AsteroidCollisionTest {

    @Test
    void testBasicCase() {
        int[] asteroids = {5, 10, -5};
        int[] result = AsteroidCollision.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{5, 10}, result, "Expected result is [5, 10]");
    }

    @Test
    void testAllCollide() {
        int[] asteroids = {8, -8};
        int[] result = AsteroidCollision.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{}, result, "Expected result is an empty array");
    }

    @Test
    void testSingleAsteroid() {
        int[] asteroids = {10};
        int[] result = AsteroidCollision.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{10}, result, "Expected result is [10]");
    }

    @Test
    void testMixedCollisions() {
        int[] asteroids = {10, 2, -5};
        int[] result = AsteroidCollision.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{10}, result, "Expected result is [10]");
    }

    @Test
    void testAllSurvive() {
        int[] asteroids = {1, 2, 3, 4};
        int[] result = AsteroidCollision.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{1, 2, 3, 4}, result, "Expected result is [1, 2, 3, 4]");
    }

    @Test
    void testNegativeAsteroidsSurvive() {
        int[] asteroids = {-1, -2, -3, -4};
        int[] result = AsteroidCollision.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{-1, -2, -3, -4}, result, "Expected result is [-1, -2, -3, -4]");
    }

    @Test
    void testNoCollision() {
        int[] asteroids = {5, -6};
        int[] result = AsteroidCollision.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{-6}, result, "Expected result is [-6]");
    }

    @Test
    void testEmptyArray() {
        int[] asteroids = {};
        int[] result = AsteroidCollision.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{}, result, "Expected result is an empty array");
    }

    @Test
    void testEqualSizeCollision() {
        int[] asteroids = {3, -3};
        int[] result = AsteroidCollision.asteroidCollision(asteroids);
        assertArrayEquals(new int[]{}, result, "Expected result is an empty array because of equal collision");
    }
}
