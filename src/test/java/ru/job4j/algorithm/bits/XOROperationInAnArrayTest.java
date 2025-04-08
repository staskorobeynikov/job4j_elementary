package ru.job4j.algorithm.bits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class XOROperationInAnArrayTest {

    @Test
    void testBasicCase() {
        XOROperationInAnArray solver = new XOROperationInAnArray();
        assertEquals(8, solver.xorOperation(5, 0), "Expected 8 for n = 5, start = 0.");
    }

    @Test
    void testWithStartZero() {
        XOROperationInAnArray solver = new XOROperationInAnArray();
        assertEquals(0, solver.xorOperation(4, 0), "Expected 0 for n = 4, start = 0.");
    }

    @Test
    void testWithStartPositive() {
        XOROperationInAnArray solver = new XOROperationInAnArray();
        assertEquals(8, solver.xorOperation(4, 3), "Expected 8 for n = 4, start = 3.");
    }

    @Test
    void testSingleElement() {
        XOROperationInAnArray solver = new XOROperationInAnArray();
        assertEquals(7, solver.xorOperation(1, 7), "Expected 7 for n = 1, start = 7.");
    }

    @Test
    void testTwoElements() {
        XOROperationInAnArray solver = new XOROperationInAnArray();
        assertEquals(3 ^ 5, solver.xorOperation(2, 3), "Expected XOR of 3 and 5.");
    }

    @Test
    void testLargerInput() {
        XOROperationInAnArray solver = new XOROperationInAnArray();
        assertEquals(2, solver.xorOperation(10, 5), "Expected result for n = 10, start = 5.");
    }

    @Test
    void testEvenStartEvenN() {
        XOROperationInAnArray solver = new XOROperationInAnArray();
        assertEquals(2, solver.xorOperation(2, 0), "Expected 2 for n = 2, start = 0.");
    }

    @Test
    void testOddStartOddN() {
        XOROperationInAnArray solver = new XOROperationInAnArray();
        assertEquals(7, solver.xorOperation(3, 1), "Expected 7 for n = 3, start = 1.");
    }
}
