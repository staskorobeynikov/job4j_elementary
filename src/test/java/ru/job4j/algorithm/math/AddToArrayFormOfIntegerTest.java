package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddToArrayFormOfIntegerTest {

    @Test
    void testSimpleAddition() {
        AddToArrayFormOfInteger solver = new AddToArrayFormOfInteger();
        int[] num = {1, 2, 3};
        int k = 7;
        assertEquals(List.of(1, 3, 0), solver.addToArrayForm(num, k), "Expected [1, 3, 0] for [1, 2, 3] + 7.");
    }

    @Test
    void testAdditionWithCarry() {
        AddToArrayFormOfInteger solver = new AddToArrayFormOfInteger();
        int[] num = {2, 9, 9};
        int k = 1;
        assertEquals(List.of(3, 0, 0), solver.addToArrayForm(num, k), "Expected [3, 0, 0] for [2, 9, 9] + 1.");
    }

    @Test
    void testAdditionWithExtraDigit() {
        AddToArrayFormOfInteger solver = new AddToArrayFormOfInteger();
        int[] num = {9, 9, 9};
        int k = 1;
        assertEquals(List.of(1, 0, 0, 0), solver.addToArrayForm(num, k), "Expected [1, 0, 0, 0] for [9, 9, 9] + 1.");
    }

    @Test
    void testAddingLargerNumber() {
        AddToArrayFormOfInteger solver = new AddToArrayFormOfInteger();
        int[] num = {1, 2, 0, 0};
        int k = 34;
        assertEquals(List.of(1, 2, 3, 4), solver.addToArrayForm(num, k), "Expected [1, 2, 3, 4] for [1, 2, 0, 0] + 34.");
    }

    @Test
    void testAddingToZeroArray() {
        AddToArrayFormOfInteger solver = new AddToArrayFormOfInteger();
        int[] num = {0};
        int k = 23;
        assertEquals(List.of(2, 3), solver.addToArrayForm(num, k), "Expected [2, 3] for [0] + 23.");
    }

    @Test
    void testZeroAddition() {
        AddToArrayFormOfInteger solver = new AddToArrayFormOfInteger();
        int[] num = {5, 6, 7};
        int k = 0;
        assertEquals(List.of(5, 6, 7), solver.addToArrayForm(num, k), "Expected [5, 6, 7] for [5, 6, 7] + 0.");
    }
}
