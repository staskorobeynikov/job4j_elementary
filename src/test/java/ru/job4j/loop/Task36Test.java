package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task36Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen25And26And27And28And29() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task36.loop();
        String expected = "25 26 27 28 29" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}