package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task100Test {
    public String ln = System.lineSeparator();

    @Test
    public void when24And35And19Then19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {24, 35, 19};
        Task100.loop(num);
        String expected = "19" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when10And99And28Then99() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {10, 99, 28};
        Task100.loop(num);
        String expected = "99" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when30And20And10Then30() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {30, 20, 10};
        Task100.loop(num);
        String expected = "30" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}