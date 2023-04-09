package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task73Test {
    public String ln = System.lineSeparator();

    @Test
    public void when28ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task73.loop(28);
        String expected = "Да" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when6ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task73.loop(6);
        String expected = "Да" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when5ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task73.loop(5);
        String expected = "Нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when10ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task73.loop(10);
        String expected = "Нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}