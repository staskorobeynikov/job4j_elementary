package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

class Task106Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenMinus5And2And40And0And19ThenMinus5And2And40() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {-5, 2, 40, 0, 19};
        Task106.loop(num);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("-5").add("2").add("40");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }

    @Test
    public void when0And2And40And0And19ThenEmptyString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {0, 2, 40, 0, 19};
        Task106.loop(num);
        String expected = "";
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenMinus7And5And0And10And39ThenMinus7And5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {-7, 5, 0, 10, 39};
        Task106.loop(num);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("-7").add("5");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }
}