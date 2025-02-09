package ru.job4j.algorithm.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SumOfDigitsInBaseKTest {

    @Test
    void testBase10() {
        SumOfDigitsInBaseK solution = new SumOfDigitsInBaseK();
        assertEquals(7, solution.sumBase(34, 10), "Expected sum of digits in base 10 for 34 is 7 (3 + 4)");
        assertEquals(6, solution.sumBase(123, 10), "Expected sum of digits in base 10 for 123 is 6 (1 + 2 + 3)");
    }

    @Test
    void testBase2() {
        SumOfDigitsInBaseK solution = new SumOfDigitsInBaseK();
        assertEquals(2, solution.sumBase(5, 2), "Expected sum of digits in base 2 for 5 (101) is 2 (1 + 0 + 1)");
        assertEquals(3, solution.sumBase(7, 2), "Expected sum of digits in base 2 for 7 (111) is 3 (1 + 1 + 1)");
    }

    @Test
    void testBase3() {
        SumOfDigitsInBaseK solution = new SumOfDigitsInBaseK();
        assertEquals(2, solution.sumBase(10, 3), "Expected sum of digits in base 3 for 10 (101) is 2 (1 + 0 + 1)");
        assertEquals(2, solution.sumBase(28, 3), "Expected sum of digits in base 3 for 28 (1001) is 2 (1 + 0 + 0 + 1)");
    }

    @Test
    void testBase5() {
        SumOfDigitsInBaseK solution = new SumOfDigitsInBaseK();
        assertEquals(4, solution.sumBase(20, 5), "Expected sum of digits in base 5 for 20 (40) is 4 (4 + 0)");
        assertEquals(7, solution.sumBase(23, 5), "Expected sum of digits in base 5 for 23 (43) is 7 (4 + 3)");
    }

    @Test
    void testBase8() {
        SumOfDigitsInBaseK solution = new SumOfDigitsInBaseK();
        assertEquals(2, solution.sumBase(65, 8), "Expected sum of digits in base 8 for 65 (101) is 2 (1 + 0 + 1)");
        assertEquals(8, solution.sumBase(78, 8), "Expected sum of digits in base 8 for 78 (116) is 8 (1 + 1 + 6)");
    }

    @Test
    void testBase16() {
        SumOfDigitsInBaseK solution = new SumOfDigitsInBaseK();
        assertEquals(30, solution.sumBase(255, 16), "Expected sum of digits in base 16 for 255 (FF) is 6 (15 + 15 = 30 -> 3 + 0)");
    }

    @Test
    void testBaseWithSingleDigit() {
        SumOfDigitsInBaseK solution = new SumOfDigitsInBaseK();
        assertEquals(5, solution.sumBase(5, 10), "Expected sum of digits in base 10 for 5 is 5");
        assertEquals(2, solution.sumBase(3, 2), "Expected sum of digits in base 2 for 3 (11) is 2 (1+1)");
    }

    @Test
    void testLargeNumber() {
        SumOfDigitsInBaseK solution = new SumOfDigitsInBaseK();
        assertEquals(1, solution.sumBase(1000, 10), "Expected sum of digits in base 10 for 1000 is 1 (1+0+0+0)");
        assertEquals(8, solution.sumBase(255, 2), "Expected sum of digits in base 2 for 255 (11111111) is 8 (1+1+1+1+1+1+1+1)");
    }
}
