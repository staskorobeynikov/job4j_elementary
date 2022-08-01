package ru.job4j.set;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PangramTest {
    @Test
    public void checkString() {
        String str = "Jackdaws love my big sphinx of quartz";
        boolean result = Pangram.checkString(str);
        assertThat(result).isTrue();
    }
}