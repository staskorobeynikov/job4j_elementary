package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task162Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen101And103And107And109And113And127And131And137And139And149() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task162.loop();
        String expected = "101 103 107 109 113 127 131 137 139 149" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}