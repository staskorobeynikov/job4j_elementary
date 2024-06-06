package ru.job4j.type;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

class Task9Test {
    @Test
    public void when1And1() {
        ByteArrayInputStream in = new ByteArrayInputStream("1 1".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task9.main(null);
        StringJoiner expect = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("2").add("0").add("1").add("1");
        assertThat(out.toString()).isEqualTo(expect.toString());
    }

    @Test
    public void when2And2() {
        ByteArrayInputStream in = new ByteArrayInputStream("2 2".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task9.main(null);
        StringJoiner expect = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("4").add("0").add("4").add("1");
        assertThat(out.toString()).isEqualTo(expect.toString());
    }
}