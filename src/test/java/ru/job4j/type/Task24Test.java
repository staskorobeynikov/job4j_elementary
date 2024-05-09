package ru.job4j.type;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task24Test {
    public String ln = System.lineSeparator();

    @Test
    public void when35Then30Plus5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.separate(35);
        String expected = "30+5" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when19Then10Plus9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.separate(19);
        String expected = "10+9" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when63Then60Plus3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task24.separate(63);
        String expected = "60+3" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}