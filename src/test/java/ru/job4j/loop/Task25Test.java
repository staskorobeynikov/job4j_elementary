package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task25Test {
    public String ln = System.lineSeparator();

    @Test
    public void when5Then7And11And15And19And23() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.loop(5);
        String expected = "7 11 15 19 23" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when3Then7And11And15() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.loop(3);
        String expected = "7 11 15" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when1Then7() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.loop(1);
        String expected = "7" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}