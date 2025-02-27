package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestPerimeterTriangleTest {

    @Test
    void testValidTriangle() {
        LargestPerimeterTriangle solver = new LargestPerimeterTriangle();
        int[] nums = {2, 1, 2};
        assertEquals(5, solver.largestPerimeter(nums), "Expected perimeter of valid triangle.");
    }

    @Test
    void testAnotherValidTriangle() {
        LargestPerimeterTriangle solver = new LargestPerimeterTriangle();
        int[] nums = {3, 6, 2, 3};
        assertEquals(8, solver.largestPerimeter(nums), "Expected largest perimeter of valid triangle.");
    }

    @Test
    void testNoValidTriangle() {
        LargestPerimeterTriangle solver = new LargestPerimeterTriangle();
        int[] nums = {1, 1, 2};
        assertEquals(0, solver.largestPerimeter(nums), "Expected 0 for no valid triangle.");
    }

    @Test
    void testLargeNumbers() {
        LargestPerimeterTriangle solver = new LargestPerimeterTriangle();
        int[] nums = {10, 20, 15, 5, 8};
        assertEquals(45, solver.largestPerimeter(nums), "Expected largest perimeter with larger numbers.");
    }

    @Test
    void testAllEqualSides() {
        LargestPerimeterTriangle solver = new LargestPerimeterTriangle();
        int[] nums = {5, 5, 5};
        assertEquals(15, solver.largestPerimeter(nums), "Expected perimeter for equilateral triangle.");
    }

    @Test
    void testOnlyTwoElements() {
        LargestPerimeterTriangle solver = new LargestPerimeterTriangle();
        int[] nums = {3, 4};
        assertEquals(0, solver.largestPerimeter(nums), "Expected 0 for input with less than 3 elements.");
    }

    @Test
    void testNegativeNumbers() {
        LargestPerimeterTriangle solver = new LargestPerimeterTriangle();
        int[] nums = {-3, -4, -5, 6};
        assertEquals(0, solver.largestPerimeter(nums), "Expected 0 when negative numbers are included.");
    }
}
