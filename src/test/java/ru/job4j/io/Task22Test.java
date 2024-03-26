package ru.job4j.io;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

class Task22Test {
    @Test
    public void shouldOutputFullNameAndPhoneInFrame() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task22.main(null);
        String expected = "************************" + System.lineSeparator()
                          + "* Фамилия Имя Отчество *" + System.lineSeparator()
                          + "* +7(938) 123-45-67    *" + System.lineSeparator()
                          + "************************";
        assertThat(out.toString()).isEqualTo(expected);
    }
}