package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task80Test {
    @Test
    public void whenAAndAThenEquals() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        assertThat(Task80.isIdentical('A', 'A')).isTrue();
    }

    @Test
    public void whenAAndBThenNotEquals() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        assertThat(Task80.isIdentical('A', 'B')).isFalse();
    }
}