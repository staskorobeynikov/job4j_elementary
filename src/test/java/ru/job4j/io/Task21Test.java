package ru.job4j.io;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task21Test {
    @Test
    public void whenHourglassWidthEquals3() {
        ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task21.main(null);
        String expected =
                "*****" + System.lineSeparator()
                        + " * *" + System.lineSeparator()
                        + "  *" + System.lineSeparator()
                        + " * *" + System.lineSeparator()
                        + "*****";
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenHourglassWidthEquals8() {
        ByteArrayInputStream in = new ByteArrayInputStream("8".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task21.main(null);
        String expected =
                "********" + System.lineSeparator()
                        + " *    *" + System.lineSeparator()
                        + "  *  *" + System.lineSeparator()
                        + "   **" + System.lineSeparator()
                        + "   **" + System.lineSeparator()
                        + "  *  *" + System.lineSeparator()
                        + " *    *" + System.lineSeparator()
                        + "********";
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenHourglassWidthEquals9() {
        ByteArrayInputStream in = new ByteArrayInputStream("8".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task21.main(null);
        String expected =
                "********" + System.lineSeparator()
                        + " *    *" + System.lineSeparator()
                        + "  *  *" + System.lineSeparator()
                        + "   **" + System.lineSeparator()
                        + "   **" + System.lineSeparator()
                        + "  *  *" + System.lineSeparator()
                        + " *    *" + System.lineSeparator()
                        + "********";
        assertThat(out.toString()).isEqualTo(expected);
    }
}