package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

class Task109Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenMinus5And2And40And123And19ThenNoNoNoYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {-5, 2, 40, 123, 19};
        Task109.loop(num);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Код не принят").add("Код не принят").add("Код не принят").add("Код принят");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }

    @Test
    public void when123And2And40And0And19ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {123, 2, 40, 0, 19};
        Task109.loop(num);
        String expected = "Код принят" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenMinus7And5And123And10And39ThenMinus7And5AndMinus2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {-7, 5, 123, 10, 39};
        Task109.loop(num);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("Код не принят").add("Код не принят").add("Код принят");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }
}