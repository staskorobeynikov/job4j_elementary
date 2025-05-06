package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {

    @Test
    void testSingleDigit() {
        SubtractTheProductAndSumOfDigitsOfAnInteger solver = new SubtractTheProductAndSumOfDigitsOfAnInteger();
        assertEquals(0, solver.subtractProductAndSum(5),
                "Expected 0 for single-digit number: 5*1 - 5 = 0.");
    }

    @Test
    void testTwoDigits() {
        SubtractTheProductAndSumOfDigitsOfAnInteger solver = new SubtractTheProductAndSumOfDigitsOfAnInteger();
        assertEquals(1, solver.subtractProductAndSum(23), "Expected 1 for input 23.");
    }

    @Test
    void testThreeDigits() {
        SubtractTheProductAndSumOfDigitsOfAnInteger solver = new SubtractTheProductAndSumOfDigitsOfAnInteger();
        assertEquals(15, solver.subtractProductAndSum(234), "Expected 15 for input 234.");
    }

    @Test
    void testWithZeroDigit() {
        SubtractTheProductAndSumOfDigitsOfAnInteger solver = new SubtractTheProductAndSumOfDigitsOfAnInteger();
        assertEquals(-6, solver.subtractProductAndSum(105), "Expected -6 for input 105.");
    }

    @Test
    void testLargeNumber() {
        SubtractTheProductAndSumOfDigitsOfAnInteger solver = new SubtractTheProductAndSumOfDigitsOfAnInteger();
        assertEquals(105, solver.subtractProductAndSum(12345), "Expected 105 for input 12345.");
    }

    @Test
    void testAllOnes() {
        SubtractTheProductAndSumOfDigitsOfAnInteger solver = new SubtractTheProductAndSumOfDigitsOfAnInteger();
        assertEquals(-2, solver.subtractProductAndSum(111), "Expected -2 for input 111.");
    }

    @Test
    void testAllNines() {
        SubtractTheProductAndSumOfDigitsOfAnInteger solver = new SubtractTheProductAndSumOfDigitsOfAnInteger();
        assertEquals(63, solver.subtractProductAndSum(99), "Expected 63 for input 99.");
    }

    @Test
    void testZeroInMiddle() {
        SubtractTheProductAndSumOfDigitsOfAnInteger solver = new SubtractTheProductAndSumOfDigitsOfAnInteger();
        assertEquals(-2, solver.subtractProductAndSum(101), "Expected -2 for input 101.");
    }
}
