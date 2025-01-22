package ru.job4j.algorithm.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class SelfDividingNumbersTest {

    @Test
    void testRangeWithSelfDividingNumbers() {
        SelfDividingNumbers solution = new SelfDividingNumbers();
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9),
                solution.selfDividingNumbers(1, 9),
                "Expected all numbers from 1 to 9 to be self-dividing");
    }

    @Test
    void testRangeWithSomeSelfDividingNumbers() {
        SelfDividingNumbers solution = new SelfDividingNumbers();
        assertEquals(List.of(11, 12, 15, 22),
                solution.selfDividingNumbers(10, 22),
                "Expected self-dividing numbers in range [10, 22] to be [11, 12, 15, 22]");
    }

    @Test
    void testRangeWithoutSelfDividingNumbers() {
        SelfDividingNumbers solution = new SelfDividingNumbers();
        assertEquals(List.of(),
                solution.selfDividingNumbers(90, 95),
                "Expected empty list since no self-dividing numbers exist in range [90, 95]");
    }

    @Test
    void testSingleNumberSelfDividing() {
        SelfDividingNumbers solution = new SelfDividingNumbers();
        assertEquals(List.of(128),
                solution.selfDividingNumbers(128, 128),
                "Expected [128] since it's a self-dividing number");
    }

    @Test
    void testSingleNumberNotSelfDividing() {
        SelfDividingNumbers solution = new SelfDividingNumbers();
        assertEquals(List.of(),
                solution.selfDividingNumbers(26, 26),
                "Expected empty list since 26 is not a self-dividing number");
    }

    @Test
    void testEdgeCaseLargeNumbers() {
        SelfDividingNumbers solution = new SelfDividingNumbers();
        assertEquals(List.of(111, 112, 115, 122, 124, 126, 128),
                solution.selfDividingNumbers(110, 130),
                "Expected list of self-dividing numbers in range [110, 130]");
    }
}