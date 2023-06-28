package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task127Test {
    public String ln = System.lineSeparator();

    @Test
    public void when2670Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task127.loop(2670);
        String expected = "2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when360Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task127.loop(360);
        String expected = "3" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when9692Then9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task127.loop(9692);
        String expected = "9" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when14Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task127.loop(14);
        String expected = "1" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when5Then5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task127.loop(5);
        String expected = "5" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}