package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task90Test {
    public String ln = System.lineSeparator();

    @Test
    public void whenTestThen36And44And63And3And143() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task90.loop();
        String expected = "Числа: 36 44 63, Количество: 3, Сумма: 143" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}