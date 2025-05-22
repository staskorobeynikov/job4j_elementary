package ru.job4j.algorithm.a75.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumOddBinaryNumberTest {

    @Test
    void testOnlyOneOne() {
        MaximumOddBinaryNumber solver = new MaximumOddBinaryNumber();
        assertEquals("1", solver.maximumOddBinaryNumber("1"),
                "Один '1' — уже нечего переставлять");
    }

    @Test
    void testAllOnes() {
        MaximumOddBinaryNumber solver = new MaximumOddBinaryNumber();
        assertEquals("1111", solver.maximumOddBinaryNumber("1111"),
                "Все единицы: просто переносим одну в конец");
    }

    @Test
    void testOneOneRestZeros() {
        MaximumOddBinaryNumber solver = new MaximumOddBinaryNumber();
        assertEquals("0001", solver.maximumOddBinaryNumber("1000"),
                "Один '1' и остальные нули → он должен быть в конце");
    }

    @Test
    void testAlternatingBits() {
        MaximumOddBinaryNumber solver = new MaximumOddBinaryNumber();
        assertEquals("1101", solver.maximumOddBinaryNumber("1011"),
                "3 единицы → 2 в начале, 1 в конце, остальные нули посередине");
    }

    @Test
    void testZerosThenOnes() {
        MaximumOddBinaryNumber solver = new MaximumOddBinaryNumber();
        assertEquals("11110001", solver.maximumOddBinaryNumber("00011111"));
    }

    @Test
    void testOnesThenZeros() {
        MaximumOddBinaryNumber solver = new MaximumOddBinaryNumber();
        assertEquals("11110001", solver.maximumOddBinaryNumber("11111000"));
    }

    @Test
    void testLength100() {
        MaximumOddBinaryNumber solver = new MaximumOddBinaryNumber();
        StringBuilder input = new StringBuilder("1");
        for (int i = 0; i < 99; i++) input.append(i % 2 == 0 ? '1' : '0');
        String s = input.toString();
        int ones = (int) s.chars().filter(c -> c == '1').count();
        int zeros = 100 - ones;
        String expected = "1".repeat(ones - 1) + "0".repeat(zeros) + "1";
        assertEquals(expected, solver.maximumOddBinaryNumber(s));
    }
}