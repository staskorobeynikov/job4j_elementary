package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task24Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1And5ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.isPositive(1, 5);
        String expected = "Да" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenMinus1AndMinus5ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.isPositive(-1, -5);
        String expected = "Да" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenMinus1And5ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.isPositive(-1, 5);
        String expected = "Нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when1AndMinus5ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.isPositive(1, -5);
        String expected = "Нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}