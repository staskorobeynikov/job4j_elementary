package ru.job4j.hash;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Task3Test {
    @Test
    public void whenNoDuplicate() {
        var right = List.of(1, 2, 3);
        var left = List.of(4, 5, 6);
        var expected = List.of();
        var result = Task3.extractDuplicates(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNoDuplicateButDuplicateValuesInRight() {
        var right = List.of(1, 2, 3, 1, 2, 3);
        var left = List.of(4, 5, 6);
        var expected = List.of();
        var result = Task3.extractDuplicates(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFullDuplicate() {
        var right = List.of(1, 2, 3);
        var left = List.of(1, 2, 3);
        var expected = List.of(1, 2, 3);
        var result = Task3.extractDuplicates(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLeftDuplicate() {
        var right = List.of(1, 2, 3);
        var left = List.of(1, 2, 3, 4, 5, 6);
        var expected = List.of(1, 2, 3);
        var result = Task3.extractDuplicates(left, right);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenRightDuplicate() {
        var right = List.of(1, 2, 3, 4, 5, 6);
        var left = List.of(1, 2, 3);
        var expected = List.of(1, 2, 3);
        var result = Task3.extractDuplicates(left, right);
        assertThat(result).isEqualTo(expected);
    }
}