package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class RectangleAreaTest {
    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = RectangleArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }

    @Test
    void whenP4K1Square1() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double out = RectangleArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void whenP27K4Square29Dot16() {
        double expected = 29.16;
        int p = 27;
        double k = 4;
        double out = RectangleArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }
}