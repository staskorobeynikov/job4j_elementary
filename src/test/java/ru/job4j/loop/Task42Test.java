package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task42Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen20And21And23And24And26And27And29() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task42.loop();
        String expected = "20 21 23 24 26 27 29" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}