package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task34Test {
    public String ln = System.lineSeparator();

    @Test
    public void when12And10ThenMissing2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.chairsCheck(12, 10);
        String expected = "Не хватает стульев: 2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when10And15ThenSurplus5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.chairsCheck(10, 15);
        String expected = "Лишних стульев: 5" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when10And10ThenOk() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task34.chairsCheck(10, 10);
        String expected = "Соответствует" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}