package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task77Test {
    public String ln = System.lineSeparator();

    @Test
    public void when6And10Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task77.loop(6, 10);
        String expected = "3" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when4And8Then7() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task77.loop(4, 8);
        String expected = "7" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when14And28Then24() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task77.loop(14, 28);
        String expected = "24" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when12And24Then28() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task77.loop(12, 24);
        String expected = "28" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}