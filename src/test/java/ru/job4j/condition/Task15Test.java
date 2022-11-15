package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task15Test {
    public String ln = System.lineSeparator();

    @Test
    public void when4Then8() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task15.multiplyByTwo(4);
        String expected = "8" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenMinus4ThenMinus4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task15.multiplyByTwo(-4);
        String expected = "-4" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenZeroThenZero() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task15.multiplyByTwo(0);
        String expected = "0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when111Then222() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task15.multiplyByTwo(111);
        String expected = "222" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}