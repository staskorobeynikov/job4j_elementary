package ru.job4j.io;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task23Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenPetrThenHiPetr() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.nameInsert("Петр");
        String expected = "Привет, Петр!" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenIvanThenHiIvan() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.nameInsert("Иван");
        String expected = "Привет, Иван!" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenElenThenHiElena() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task23.nameInsert("Елена");
        String expected = "Привет, Елена!" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}