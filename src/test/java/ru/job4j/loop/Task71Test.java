package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task71Test {
    public String ln = System.lineSeparator();

    @Test
    public void when8Then15() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task71.loop(8);
        String expected = "15" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when1Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task71.loop(1);
        String expected = "1" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when2Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task71.loop(2);
        String expected = "3" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when7Then8() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task71.loop(7);
        String expected = "8" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when10Then18() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task71.loop(10);
        String expected = "18" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}