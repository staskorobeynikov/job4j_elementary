package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task25Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.isPositive(1);
        String expected = "Да" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when0ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.isPositive(0);
        String expected = "Нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenMinus1ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.isPositive(-1);
        String expected = "Нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}