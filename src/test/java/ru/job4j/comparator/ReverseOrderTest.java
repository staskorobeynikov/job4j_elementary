package ru.job4j.comparator;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseOrderTest {
    @Test
    public void test() {
        Comparator<String> expected = Comparator.reverseOrder();
        Comparator<String> result = ReverseOrder.reverseOrder();
        assertThat(result).isEqualTo(expected);
    }
}