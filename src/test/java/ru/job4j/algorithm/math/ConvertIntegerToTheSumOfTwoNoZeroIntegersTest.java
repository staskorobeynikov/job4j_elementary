package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConvertIntegerToTheSumOfTwoNoZeroIntegersTest {

    @Test
    void testNEquals2() {
        ConvertIntegerToTheSumOfTwoNoZeroIntegers solver = new ConvertIntegerToTheSumOfTwoNoZeroIntegers();
        int n = 2;
        int[] result = solver.getNoZeroIntegers(n);
        assertEquals(2, result.length);
        assertEquals(n, result[0] + result[1]);
        assertFalse(String.valueOf(result[0]).contains("0"));
        assertFalse(String.valueOf(result[1]).contains("0"));
    }

    @Test
    void testNEquals11() {
        ConvertIntegerToTheSumOfTwoNoZeroIntegers solver = new ConvertIntegerToTheSumOfTwoNoZeroIntegers();
        int n = 11;
        int[] result = solver.getNoZeroIntegers(n);
        assertEquals(2, result.length);
        assertEquals(n, result[0] + result[1]);
        assertFalse(String.valueOf(result[0]).contains("0"));
        assertFalse(String.valueOf(result[1]).contains("0"));
    }

    @Test
    void testNEquals101() {
        ConvertIntegerToTheSumOfTwoNoZeroIntegers solver = new ConvertIntegerToTheSumOfTwoNoZeroIntegers();
        int n = 101;
        int[] result = solver.getNoZeroIntegers(n);
        assertEquals(2, result.length);
        assertEquals(n, result[0] + result[1]);
        assertFalse(String.valueOf(result[0]).contains("0"));
        assertFalse(String.valueOf(result[1]).contains("0"));
    }

    @Test
    void testNEquals1000() {
        ConvertIntegerToTheSumOfTwoNoZeroIntegers solver = new ConvertIntegerToTheSumOfTwoNoZeroIntegers();
        int n = 1000;
        int[] result = solver.getNoZeroIntegers(n);
        assertEquals(2, result.length);
        assertEquals(n, result[0] + result[1]);
        assertFalse(String.valueOf(result[0]).contains("0"));
        assertFalse(String.valueOf(result[1]).contains("0"));
    }

    @Test
    void testRangeFrom2To100() {
        ConvertIntegerToTheSumOfTwoNoZeroIntegers solver = new ConvertIntegerToTheSumOfTwoNoZeroIntegers();
        for (int n = 2; n <= 100; n++) {
            int[] result = solver.getNoZeroIntegers(n);
            assertEquals(2, result.length);
            assertEquals(n, result[0] + result[1]);
            assertFalse(String.valueOf(result[0]).contains("0"), "Failed for n = " + n + ", a = " + result[0]);
            assertFalse(String.valueOf(result[1]).contains("0"), "Failed for n = " + n + ", b = " + result[1]);
        }
    }
}
