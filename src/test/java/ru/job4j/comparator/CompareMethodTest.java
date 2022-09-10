package ru.job4j.comparator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CompareMethodTest {
    @Test
    public void testAscending1() {
        int first = 1;
        int second = 1;
        final int result = CompareMethod.ascendingCompare(first, second);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testAscending2() {
        int first = 1;
        int second = 2;
        final int result = CompareMethod.ascendingCompare(first, second);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void testAscending3() {
        int first = 2;
        int second = 1;
        final int result = CompareMethod.ascendingCompare(first, second);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testDescending1() {
        int first = 1;
        int second = 1;
        final int result = CompareMethod.descendingCompare(first, second);
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void testDescending2() {
        int first = 1;
        int second = 2;
        final int result = CompareMethod.descendingCompare(first, second);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void testDescending3() {
        int first = 2;
        int second = 1;
        final int result = CompareMethod.descendingCompare(first, second);
        assertThat(result).isEqualTo(-1);
    }
}
