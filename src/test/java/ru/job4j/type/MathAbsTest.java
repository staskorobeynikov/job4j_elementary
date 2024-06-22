package ru.job4j.type;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class MathAbsTest {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MathAbs.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo("5.0" + ln);
    }
}