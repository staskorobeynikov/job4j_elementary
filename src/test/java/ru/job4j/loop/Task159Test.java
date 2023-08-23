package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task159Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen9240() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task159.loop();
        String expected = "9240" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}