package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task104Test {
    public String ln = System.lineSeparator();

    @Test
    public void when101And303And909And505And707Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {101, 303, 909, 505, 707};
        Task104.loop(num);
        String expected = "2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when900And700And500And100And200Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {900, 700, 500, 100, 200};
        Task104.loop(num);
        String expected = "0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when555And222And111And777And444Then3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {555, 222, 111, 777, 444};
        Task104.loop(num);
        String expected = "3" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}