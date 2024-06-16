package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CountMethodTest {
    @Test
    public void test() {
        Stream<Integer> data = List.of(1, 2, 3).stream();
        int expected = 3;
        long result = CountMethod.count(data);
        assertThat(result).isEqualTo(expected);
    }
}