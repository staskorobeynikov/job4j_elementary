package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindClosestPersonTest {

    @Test
    void testPerson1Closer() {
        FindClosestPerson solver = new FindClosestPerson();
        assertEquals(1, solver.findClosest(5, 20, 6));
    }

    @Test
    void testPerson2Closer() {
        FindClosestPerson solver = new FindClosestPerson();
        assertEquals(2, solver.findClosest(30, 10, 9));
    }

    @Test
    void testEqualDistance() {
        FindClosestPerson solver = new FindClosestPerson();
        assertEquals(0, solver.findClosest(3, 7, 5));
    }

    @Test
    void testAllEqual() {
        FindClosestPerson solver = new FindClosestPerson();
        assertEquals(0, solver.findClosest(50, 50, 50));
    }

    @Test
    void testZEqualsX() {
        FindClosestPerson solver = new FindClosestPerson();
        assertEquals(1, solver.findClosest(25, 40, 25));
    }

    @Test
    void testZEqualsY() {
        FindClosestPerson solver = new FindClosestPerson();
        assertEquals(2, solver.findClosest(12, 77, 77));
    }

    @Test
    void testLowerBounds() {
        FindClosestPerson solver = new FindClosestPerson();
        assertEquals(1, solver.findClosest(1, 100, 50));
    }

    @Test
    void testUpperBounds() {
        FindClosestPerson solver = new FindClosestPerson();
        assertEquals(1, solver.findClosest(99, 1, 100));
    }
}
