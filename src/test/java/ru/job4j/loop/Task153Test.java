package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

class Task153Test {
    @Test
    public void whenTestThen11Rows() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task153.loop();
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Быков: 0, коров: 20")
                .add("Быков: 1, коров: 18")
                .add("Быков: 2, коров: 16")
                .add("Быков: 3, коров: 14")
                .add("Быков: 4, коров: 12")
                .add("Быков: 5, коров: 10")
                .add("Быков: 6, коров: 8")
                .add("Быков: 7, коров: 6")
                .add("Быков: 8, коров: 4")
                .add("Быков: 9, коров: 2")
                .add("Быков: 10, коров: 0");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }
}