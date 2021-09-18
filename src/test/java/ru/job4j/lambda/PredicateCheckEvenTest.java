package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class PredicateCheckEvenTest {
    @Test
    public void whenCheck2ThenTrue() {
        assertTrue(PredicateCheckEven.check(2));
    }

    @Test
    public void whenCheck1ThenFalse() {
        assertFalse(PredicateCheckEven.check(1));
    }
}