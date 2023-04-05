package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task69Test {
    public String ln = System.lineSeparator();

    @Test
    public void when4And8Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task69.loop(4, 8);
        String expected = "3" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when1And2Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task69.loop(1, 2);
        String expected = "1" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when3And9Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task69.loop(3, 9);
        String expected = "2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}