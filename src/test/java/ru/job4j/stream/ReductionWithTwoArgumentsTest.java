package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ReductionWithTwoArgumentsTest {

    @Test
    public void whenListEmptyThenEquals5() {
        assertEquals(Integer.valueOf(5), ReductionWithTwoArguments.collect(List.of()));
    }

    @Test
    public void whenListContains1ThenEquals5() {
        assertEquals(Integer.valueOf(5), ReductionWithTwoArguments.collect(List.of(1)));
    }

    @Test
    public void whenListContains12ThenEquals10() {
        assertEquals(Integer.valueOf(10), ReductionWithTwoArguments.collect(List.of(1, 2)));
    }

    @Test
    public void whenListContains123ThenEquals30() {
        assertEquals(Integer.valueOf(30), ReductionWithTwoArguments.collect(List.of(1, 2, 3)));
    }
}