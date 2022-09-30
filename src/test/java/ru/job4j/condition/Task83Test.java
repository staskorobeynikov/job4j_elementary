package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task83Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenSameNamesAndSurnamesThenNamesake() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task83.isEquals("John", "Smith", "John", "Smith");
        String expected = "Тезки и однофамильцы" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenSameNamesThenNamesake() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task83.isEquals("John", "Brown", "John", "Smith");
        String expected = "Тезки" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenSameSurnamesThenNamesake() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task83.isEquals("Jim", "Smith", "John", "Smith");
        String expected = "Однофамильцы" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenNotSameThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task83.isEquals("Jim", "Smith", "John", "Brown");
        String expected = "Совпадений нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}