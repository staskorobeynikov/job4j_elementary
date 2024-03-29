package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task81Test {
    public String ln = System.lineSeparator();

    @Test
    public void when25Then14() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task81.loop(25);
        String expected = "14" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when34Then7() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task81.loop(34);
        String expected = "7" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when14Then10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task81.loop(14);
        String expected = "10" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}