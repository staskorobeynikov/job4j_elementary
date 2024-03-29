package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class PredicateCheckPositiveTest {
    @Test
    public void whenCheckPositiveThenTrue() {
        assertTrue(PredicateCheckPositive.check(1));
    }

    @Test
    public void whenCheckNotPositiveThenFalse() {
        assertFalse(PredicateCheckPositive.check(-1));
    }

    @Test
    public void whenCheck0ThenFalse() {
        assertFalse(PredicateCheckPositive.check(0));
    }
}