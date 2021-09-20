package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionSqrtTest {

    @Test
    public void whenCalculate4Then2() {
        assertEquals(2, FunctionSqrt.calculate(4), 0.01);
    }

    @Test
    public void whenCalculate9Then3() {
        assertEquals(3, FunctionSqrt.calculate(9), 0.01);
    }
}