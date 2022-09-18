package ru.job4j.comparator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArraysSortTest {
    @Test
    public void test() {
        long[] data = {3, 2, 1};
        long[] result = ArraysSort.sort(data);
        long[] expect = {1, 2, 3};
        assertThat(expect).containsSequence(result);
    }
}