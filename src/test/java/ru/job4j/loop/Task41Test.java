package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task41Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen22And25And28And30And33() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task41.loop();
        String expected = "22 25 28 30 33" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}