package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

class Task21Test {
    @Test
    public void whenTestThen3000And2500And2000And1500() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task21.loop();
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Старт").add("35 30 25 20 15 10").add("Финиш");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }
}