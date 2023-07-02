package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task131Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1234567Then12345() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        Task131.loop(nums);
        String expected = "1 2 3 4 5" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when222Then22() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {2, 2, 2};
        Task131.loop(nums);
        String expected = "2 2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when13572522Then1357252() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {1, 3, 5, 7, 2, 5, 2, 2};
        Task131.loop(nums);
        String expected = "1 3 5 7 2 5 2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}