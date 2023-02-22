package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task39Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen200And201And204And207And209And210() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task39.loop();
        String expected = "200 201 204 207 209 210" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}