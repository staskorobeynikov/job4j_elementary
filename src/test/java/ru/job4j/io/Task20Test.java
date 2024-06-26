package ru.job4j.io;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

class Task20Test {
    public String ln = System.lineSeparator();

    @Test
    public void when1And1Then11And2And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.print(1, 1);
        StringJoiner expected = new StringJoiner(
                ln, "", ln)
                .add("Переменные: 1 1").add("Сумма: 2").add("Произведение: 1");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }

    @Test
    public void when3And5Then35And8And15() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.print(3, 5);
        StringJoiner expected = new StringJoiner(
                ln, "", ln)
                .add("Переменные: 3 5").add("Сумма: 8").add("Произведение: 15");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }

    @Test
    public void when2And3Then23And5And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task20.print(2, 3);
        StringJoiner expected = new StringJoiner(
                ln, "", ln)
                .add("Переменные: 2 3").add("Сумма: 5").add("Произведение: 6");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }
}