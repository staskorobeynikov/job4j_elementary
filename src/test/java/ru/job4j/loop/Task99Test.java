package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task99Test {
    public String ln = System.lineSeparator();

    @Test
    public void when7And1And8And9And6ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {7, 1, 8, 9, 6};
        Task99.loop(num);
        String expected = "Нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when10And8And5And4And2ThenMore() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {10, 8, 5, 4, 2};
        Task99.loop(num);
        String expected = "Больше" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when1And2And3And4And5ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {1, 2, 3, 4, 5};
        Task99.loop(num);
        String expected = "Нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}