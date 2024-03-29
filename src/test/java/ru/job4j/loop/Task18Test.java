package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

class Task18Test {
    @Test
    public void whenTestThen10And12SharpAnd14And16SharpAnd18() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task18.loop();
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Начало").add("10 12# 14 16# 18").add("Конец");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }
}