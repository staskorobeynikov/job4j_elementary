package ru.job4j.list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ParenthesesTest {
    @Test
    public void whenValidInner() {
        char[] data = {'(', '(', ')', ')'};
        boolean result = Parentheses.valid(data);
        assertThat(result).isTrue();
    }

    @Test
    public void whenValidSeq() {
        char[] data = {'(', ')', '(', ')'};
        boolean result = Parentheses.valid(data);
        assertThat(result).isTrue();
    }

    @Test
    public void whenInValidInner() {
        char[] data = {')', ')', '(', '('};
        boolean result = Parentheses.valid(data);
        assertThat(result).isFalse();
    }

    @Test
    public void whenInValidSeq() {
        char[] data = {'(', ')', '(', '('};
        boolean result = Parentheses.valid(data);
        assertThat(result).isFalse();
    }

    @Test
    public void whenValidInner1() {
        char[] data = {'(', ')', '(', '(', ')', '(', '(', '(', ')', ')', ')', ')'};
        boolean result = Parentheses.valid(data);
        assertThat(result).isTrue();
    }
}