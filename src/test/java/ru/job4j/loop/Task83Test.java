package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task83Test {
    @Test
    public void when4Then7dot61() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task83.loop(4);
        String expected = "7.61";
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when6Then13dot93() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task83.loop(6);
        String expected = "13.93";
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when2Then2dot73() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task83.loop(2);
        String expected = "2.73";
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when7Then17dot54() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task83.loop(7);
        String expected = "17.54";
        assertThat(out.toString()).isEqualTo(expected);
    }
}