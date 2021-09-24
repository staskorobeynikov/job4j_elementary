package ru.job4j.lambda;

import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.*;

public class MRPredicateTest {

    @Test
    public void whenStringIsEmptyThenTrue() {
        Predicate<String> predicate = MRPredicate.predicate();
        assertTrue(predicate.test(""));
    }

    @Test
    public void whenStringIsEmptyThenFalse() {
        Predicate<String> predicate = MRPredicate.predicate();
        assertFalse(predicate.test("a"));
    }
}