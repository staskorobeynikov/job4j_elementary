package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task120Test {
    public String ln = System.lineSeparator();

    @Test
    public void when52435Then5243And524And52And5And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task120.loop(52435);
        String expected = "5243 524 52 5 0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when543Then54And5And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task120.loop(543);
        String expected = "54 5 0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when12345Then1234And123And12And1And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task120.loop(12345);
        String expected = "1234 123 12 1 0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when1Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task120.loop(1);
        String expected = "0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}