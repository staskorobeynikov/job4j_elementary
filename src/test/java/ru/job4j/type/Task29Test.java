package ru.job4j.type;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task29Test {
    public String ln = System.lineSeparator();

    @Test
    public void when325Then10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.numSum(325);
        String expected = "10" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when100Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.numSum(100);
        String expected = "1" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when909Then18() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task29.numSum(909);
        String expected = "18" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}