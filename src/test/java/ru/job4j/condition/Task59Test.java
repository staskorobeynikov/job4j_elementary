package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task59Test {
    public String ln = System.lineSeparator();

    @Test
    public void when2And6ThenMinus3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task59.getLinearEquation(2, 6);
        String expected = "-3" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when4And6ThenMinus1dot5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task59.getLinearEquation(4, 6);
        String expected = "-1.5" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when2AndMinus10Then5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task59.getLinearEquation(2, -10);
        String expected = "5" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when0And5ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task59.getLinearEquation(0, 5);
        String expected = "Нет решения" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when0And0ThenInfinity() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task59.getLinearEquation(0, 0);
        String expected = "Бесконечное множество" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when8And0Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task59.getLinearEquation(8, 0);
        String expected = "0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}