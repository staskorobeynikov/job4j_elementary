package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task37Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen100And111And124() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task37.loop();
        String expected = "100 111 124" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}