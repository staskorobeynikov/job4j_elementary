package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

class Task156Test {
    @Test
    public void when4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task156.loop(4);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1+")
                .add("2++")
                .add("3++")
                .add("4+++");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }

    @Test
    public void when3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task156.loop(3);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1+")
                .add("2++")
                .add("3++");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }

    @Test
    public void when1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task156.loop(1);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1+");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }

    @Test
    public void when7() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task156.loop(7);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("1+")
                .add("2++")
                .add("3++")
                .add("4+++")
                .add("5++")
                .add("6++++")
                .add("7++");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }
}