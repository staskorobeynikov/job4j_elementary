package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task50Test {
    public String ln = System.lineSeparator();

    @Test
    public void when3Then1And4And7And10And13() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task50.loop(3);
        String expected = "1 4 7 10 13" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when6Then1And7And13And19And25() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task50.loop(6);
        String expected = "1 7 13 19 25" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when1Then1And2And3And4And5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task50.loop(1);
        String expected = "1 2 3 4 5" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}