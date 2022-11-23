package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task26Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1And1ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.isEqual(1, 1);
        String expected = "Да" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when1And2ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.isEqual(1, 2);
        String expected = "Нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when0And0ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.isEqual(0, 0);
        String expected = "Да" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenMinus1AndMinus1ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.isEqual(-1, -1);
        String expected = "Да" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenMinus1And1ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task26.isEqual(-1, 1);
        String expected = "Нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}