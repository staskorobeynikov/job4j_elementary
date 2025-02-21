package ru.job4j.algorithm.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConstructTheRectangleTest {

    @Test
    void testPerfectSquareArea() {
        ConstructTheRectangle solution = new ConstructTheRectangle();
        assertArrayEquals(new int[]{4, 4}, solution.constructRectangle(16), "Expected [4, 4] for area = 16");
        assertArrayEquals(new int[]{9, 9}, solution.constructRectangle(81), "Expected [9, 9] for area = 81");
    }

    @Test
    void testPrimeNumberArea() {
        ConstructTheRectangle solution = new ConstructTheRectangle();
        assertArrayEquals(new int[]{13, 1}, solution.constructRectangle(13), "Expected [13, 1] for area = 13");
        assertArrayEquals(new int[]{17, 1}, solution.constructRectangle(17), "Expected [17, 1] for area = 17");
    }

    @Test
    void testEvenNumberArea() {
        ConstructTheRectangle solution = new ConstructTheRectangle();
        assertArrayEquals(new int[]{6, 5}, solution.constructRectangle(30), "Expected [6, 5] for area = 30");
        assertArrayEquals(new int[]{10, 10}, solution.constructRectangle(100), "Expected [10, 10] for area = 100");
    }

    @Test
    void testOddNumberArea() {
        ConstructTheRectangle solution = new ConstructTheRectangle();
        assertArrayEquals(new int[]{5, 3}, solution.constructRectangle(15), "Expected [5, 3] for area = 15");
        assertArrayEquals(new int[]{7, 5}, solution.constructRectangle(35), "Expected [7, 5] for area = 35");
    }

    @Test
    void testMinimumValidArea() {
        ConstructTheRectangle solution = new ConstructTheRectangle();
        assertArrayEquals(new int[]{1, 1}, solution.constructRectangle(1), "Expected [1, 1] for area = 1");
    }

    @Test
    void testLargeArea() {
        ConstructTheRectangle solution = new ConstructTheRectangle();
        assertArrayEquals(new int[]{1000, 1000}, solution.constructRectangle(1000000), "Expected [1000, 1000] for area = 1000000");
    }
}
