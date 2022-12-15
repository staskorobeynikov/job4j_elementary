package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task45Test {
    public String ln = System.lineSeparator();

    @Test
    public void when23Then20() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.changeToRoundNum(23);
        String expected = "Уменьшено до 20" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when339Then330() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.changeToRoundNum(339);
        String expected = "Уменьшено до 330" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when272Then280() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.changeToRoundNum(272);
        String expected = "Увеличено до 280" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when20Then20() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task45.changeToRoundNum(20);
        String expected = "Увеличено до 20" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}