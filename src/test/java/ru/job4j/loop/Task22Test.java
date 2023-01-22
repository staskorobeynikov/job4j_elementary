package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task22Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen125And205And285() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.loop();
        String expected = "125 205 285" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}