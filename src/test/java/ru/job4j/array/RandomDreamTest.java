package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RandomDreamTest {
    @Test
    public void whenNumberLessArrayLengthAndEqual1() {
        String[] prizes = {"car", "ticket", "flat", "house"};
        String result = RandomDream.random(prizes, 1);
        String expected = "car";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberLessArrayLengthAndEqual2() {
        String[] prizes = {"car", "ticket", "flat", "house"};
        String result = RandomDream.random(prizes, 2);
        String expected = "ticket";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberLessArrayLengthAndEqual3() {
        String[] prizes = {"car", "ticket", "flat", "house"};
        String result = RandomDream.random(prizes, 3);
        String expected = "flat";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberEqualsArrayLengthAndEqual4() {
        String[] prizes = {"car", "ticket", "flat", "house"};
        String result = RandomDream.random(prizes, 4);
        String expected = "house";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberGreaterArrayLengthAndEqual5() {
        String[] prizes = {"car", "ticket", "flat", "house"};
        String result = RandomDream.random(prizes, 5);
        String expected = "car";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberGreaterArrayLengthAndEqual6() {
        String[] prizes = {"car", "ticket", "flat", "house"};
        String result = RandomDream.random(prizes, 6);
        String expected = "ticket";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberGreaterArrayLengthAndEqual7() {
        String[] prizes = {"car", "ticket", "flat", "house"};
        String result = RandomDream.random(prizes, 7);
        String expected = "flat";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenNumberGreaterArrayLengthAndEqual8() {
        String[] prizes = {"car", "ticket", "flat", "house"};
        String result = RandomDream.random(prizes, 8);
        String expected = "house";
        assertThat(result).isEqualTo(expected);
    }
}