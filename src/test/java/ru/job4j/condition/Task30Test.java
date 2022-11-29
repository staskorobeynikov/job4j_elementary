package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task30Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenMinus6Then6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.numModify(-6);
        String expected = "6" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when6Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.numModify(6);
        String expected = "0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when0Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.numModify(0);
        String expected = "0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}