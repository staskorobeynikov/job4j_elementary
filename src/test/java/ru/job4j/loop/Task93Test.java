package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task93Test {
    public String ln = System.lineSeparator();

    @Test
    public void when30And40And45And50And45And20Then2And165() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] first = {30, 40, 45};
        int[] second = {50, 45, 20};
        Task93.loop(first, second);
        String expected = "В финале: 2, сумма баллов: 165" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when10And20And45And50And45And20Then0And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] first = {10, 20, 45};
        int[] second = {50, 45, 20};
        Task93.loop(first, second);
        String expected = "В финале: 0, сумма баллов: 0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when50And40And45And50And45And40Then3And270() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] first = {50, 40, 45};
        int[] second = {50, 45, 40};
        Task93.loop(first, second);
        String expected = "В финале: 3, сумма баллов: 270" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}