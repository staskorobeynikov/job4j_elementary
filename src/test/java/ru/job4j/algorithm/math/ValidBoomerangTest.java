package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidBoomerangTest {

    @Test
    void testValidBoomerang() {
        ValidBoomerang validBoomerang = new ValidBoomerang();
        int[][] points = {{1, 1}, {2, 3}, {3, 2}};
        assertTrue(validBoomerang.isBoomerang(points), "Expected a valid boomerang.");
    }

    @Test
    void testCollinearPoints() {
        ValidBoomerang validBoomerang = new ValidBoomerang();
        int[][] points = {{1, 1}, {2, 2}, {3, 3}};
        assertFalse(validBoomerang.isBoomerang(points), "Expected collinear points not to be a boomerang.");
    }

    @Test
    void testDuplicatePoints() {
        ValidBoomerang validBoomerang = new ValidBoomerang();
        int[][] points = {{1, 1}, {1, 1}, {2, 2}};
        assertFalse(validBoomerang.isBoomerang(points), "Expected duplicate points not to be a boomerang.");
    }

    @Test
    void testAnotherValidBoomerang() {
        ValidBoomerang validBoomerang = new ValidBoomerang();
        int[][] points = {{0, 0}, {2, 1}, {1, 2}};
        assertTrue(validBoomerang.isBoomerang(points), "Expected a valid boomerang.");
    }

    @Test
    void testHorizontalLine() {
        ValidBoomerang validBoomerang = new ValidBoomerang();
        int[][] points = {{0, 1}, {1, 1}, {2, 1}};
        assertFalse(validBoomerang.isBoomerang(points), "Expected horizontal line not to be a boomerang.");
    }

    @Test
    void testVerticalLine() {
        ValidBoomerang validBoomerang = new ValidBoomerang();
        int[][] points = {{2, 0}, {2, 1}, {2, 2}};
        assertFalse(validBoomerang.isBoomerang(points), "Expected vertical line not to be a boomerang.");
    }
}
