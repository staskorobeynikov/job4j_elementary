package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task76Test {
    public String ln = System.lineSeparator();

    @Test
    public void when123Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task76.sameNumAmount(123);
        String expected = "0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when122Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task76.sameNumAmount(122);
        String expected = "2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when112Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task76.sameNumAmount(112);
        String expected = "2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when333Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task76.sameNumAmount(333);
        String expected = "3" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}