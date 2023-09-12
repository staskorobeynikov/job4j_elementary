package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task82Test {
    @Test
    public void whenJohnAndJohnThenEquals() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        assertThat(Task82.isEquals("John", "John")).isTrue();
    }

    @Test
    public void whenJohnAndJimThenNotEquals() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        assertThat(Task82.isEquals("John", "Jim")).isFalse();
    }
}