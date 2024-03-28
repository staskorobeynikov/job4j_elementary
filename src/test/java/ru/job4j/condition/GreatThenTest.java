package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreatThenTest {
    @Test
    public void whenFirstLess() {
        assertThat(GreatThen.check(1, 2)).isFalse();
    }

    @Test
    public void whenFirstGreat() {
        assertThat(GreatThen.check(10, 2)).isTrue();
    }
}