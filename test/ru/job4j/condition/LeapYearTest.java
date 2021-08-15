package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LeapYearTest {
    @Test
    public void checkYear2019False() {
        boolean b = LeapYear.checkYear(2019);
        assertThat(b, is(false));
    }

    @Test
    public void checkYear1800False() {
        boolean b = LeapYear.checkYear(1800);
        assertThat(b, is(false));
    }

    @Test
    public void checkYear2020True() {
        boolean b = LeapYear.checkYear(2020);
        assertThat(b, is(true));
    }

    @Test
    public void checkYear2000True() {
        boolean b = LeapYear.checkYear(2000);
        assertThat(b, is(true));
    }
}