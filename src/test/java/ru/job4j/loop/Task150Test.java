package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task150Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenMinus100And500AndMinus400And200And100AndMinus1000Then400And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] transfers = {-400, 200, 100, -1000};
        Task150.loop(-100, 500, transfers);
        String expected = "Остаток: 400, операций: 3" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenMinus100And500AndMinus400And200And0And300Then300And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] transfers = {-400, 200, 0, 300};
        Task150.loop(-100, 500, transfers);
        String expected = "Остаток: 300, операций: 2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenMinus100And500AndMinus500AndMinus100And0And300ThenMinus50And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] transfers = {-500, -100, 0, 300};
        Task150.loop(-100, 500, transfers);
        String expected = "Остаток: -100, операций: 2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}