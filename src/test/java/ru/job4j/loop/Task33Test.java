package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task33Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen110And121And132And143And154() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task33.loop();
        String expected = "110 121 132 143 154" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}