package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountOperationsToObtainZeroTest {

    @Test
    void testBothZero() {
        CountOperationsToObtainZero solver = new CountOperationsToObtainZero();
        assertEquals(0, solver.countOperations(0, 0), "Обе переменные равны 0 → 0 операций");
    }

    @Test
    void testOneZero() {
        CountOperationsToObtainZero solver = new CountOperationsToObtainZero();
        assertEquals(0, solver.countOperations(0, 10), "Одно из чисел равно 0 → 0 операций");
        assertEquals(0, solver.countOperations(15, 0), "Одно из чисел равно 0 → 0 операций");
    }

    @Test
    void testEqualValues() {
        CountOperationsToObtainZero solver = new CountOperationsToObtainZero();
        assertEquals(1, solver.countOperations(7, 7), "Одинаковые числа → одна операция");
    }

    @Test
    void testSimpleCase() {
        CountOperationsToObtainZero solver = new CountOperationsToObtainZero();
        assertEquals(2, solver.countOperations(10, 5));
    }

    @Test
    void testMinimalNonZero() {
        CountOperationsToObtainZero solver = new CountOperationsToObtainZero();
        assertEquals(1, solver.countOperations(1, 1));
    }

    @Test
    void testLargerSequence() {
        CountOperationsToObtainZero solver = new CountOperationsToObtainZero();
        assertEquals(6, solver.countOperations(13, 5));
    }

    @Test
    void testLargeNumbers() {
        CountOperationsToObtainZero solver = new CountOperationsToObtainZero();
        assertEquals(1, solver.countOperations(100000, 100000));
        assertTrue(solver.countOperations(100000, 1) > 0);
        assertTrue(solver.countOperations(1, 100000) > 0);
    }
}