package ru.job4j.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

public class PredicateCheckEvenAndPositiveTest {
    @Test
    public void whenCheckPositiveAndEven2ThenTrue() {
        assertTrue(PredicateCheckEvenAndPositive.check(2));
    }

    @Test
    public void whenCheckPositiveAndEvenMinus2ThenFalse() {
        assertFalse(PredicateCheckEvenAndPositive.check(-2));
    }

    @Test
    public void whenCheckPositiveAndEven1ThenFalse() {
        assertFalse(PredicateCheckEvenAndPositive.check(1));
    }
}