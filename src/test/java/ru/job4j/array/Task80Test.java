package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Task80Test {
    @Test
    public void when554331Then2And5() {
        int[] arr = {5, 5, 4, 3, 3, 1};
        int[] expected = {2, 5};
        assertThat(Task80.array(arr)).isEqualTo(expected);
    }

    @Test
    public void when54331Then3() {
        int[] arr = {5, 4, 3, 3, 1};
        int[] expected = {0, 1, 4};
        assertThat(Task80.array(arr)).isEqualTo(expected);
    }

    @Test
    public void when153Then0And1And2() {
        int[] arr = {1, 5, 3};
        int[] expected = {0, 1, 2};
        assertThat(Task80.array(arr)).isEqualTo(expected);
    }
}