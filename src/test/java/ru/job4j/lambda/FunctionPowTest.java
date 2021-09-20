package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionPowTest {

    @Test
    public void whenCalculate2Then4() {
        assertEquals(4, FunctionPow.calculate(2), 0.01);
    }

    @Test
    public void whenCalculate3Then9() {
        assertEquals(9, FunctionPow.calculate(3), 0.01);
    }
}