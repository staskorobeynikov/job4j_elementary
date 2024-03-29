package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task133Test {
    public String ln = System.lineSeparator();

    @Test
    public void when5Then5And25And125And625() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task133.loop(5);
        String expected = "5 25 125 625" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when6Then6And36And216() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task133.loop(6);
        String expected = "6 36 216" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when500Then500() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task133.loop(500);
        String expected = "500" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when1001ThenEmptyString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task133.loop(1001);
        String expected = "";
        assertThat(out.toString()).isEqualTo(expected);
    }
}