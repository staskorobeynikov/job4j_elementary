package ru.job4j.comparator;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

class NaturalOrderTest {
    @Test
    public void test() {
        Comparator<String> expected = Comparator.naturalOrder();
        Comparator<String> result = NaturalOrder.naturalOrder();
        assertThat(result).isEqualTo(expected);
    }
}