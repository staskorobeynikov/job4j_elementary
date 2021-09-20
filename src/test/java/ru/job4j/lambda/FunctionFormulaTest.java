package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionFormulaTest {

    @Test
    public void whenCalculate0Then1() {
        assertEquals(1, FunctionFormula.calculate(0), 0.01);
    }

    @Test
    public void whenCalculate1Then4() {
        assertEquals(4, FunctionFormula.calculate(1), 0.01);
    }

    @Test
    public void whenCalculate2Then9() {
        assertEquals(9, FunctionFormula.calculate(2), 0.01);
    }
}