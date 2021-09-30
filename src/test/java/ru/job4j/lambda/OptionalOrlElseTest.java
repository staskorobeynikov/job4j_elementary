package ru.job4j.lambda;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class OptionalOrlElseTest {
    @Test
    public void whenOptionalEmptyThenReturnMinus1() {
        assertEquals(Integer.valueOf(-1), OptionalOrlElse.orElse(Optional.empty()));
    }

    @Test
    public void whenOptionalNotEmptyThenReturnValue() {
        assertEquals(Integer.valueOf(1), OptionalOrlElse.orElse(Optional.of(1)));
    }
}