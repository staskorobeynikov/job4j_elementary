package ru.job4j.type;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task22Test {
    public String ln = System.lineSeparator();

    @Test
    public void when20Then0And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.separate(20);
        String expected = "0 2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when37Then7And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.separate(37);
        String expected = "7 3" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when86Then6And8() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.separate(86);
        String expected = "6 8" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}