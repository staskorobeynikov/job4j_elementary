package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task149Test {
    public String ln = System.lineSeparator();

    @Test
    public void when2535634Then3dot75() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] grades = {2, 5, 3, 5, 6, 3, 4};
        Task149.loop(grades);
        String expected = "3.75" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when5735634Then5dot00() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] grades = {5, 7, 3, 5, 6, 3, 4};
        Task149.loop(grades);
        String expected = "5.00" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when2215284Then2dot40() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] grades = {2, 2, 1, 5, 2, 8, 4};
        Task149.loop(grades);
        String expected = "2.40" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when554302Then4dot25() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] grades = {5, 5, 4, 3, 0, 2};
        Task149.loop(grades);
        String expected = "4.25" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}