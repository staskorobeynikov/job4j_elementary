package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String result = DummyBot.answer(in);
        String expected = "Привет, умник.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока.";
        String result = DummyBot.answer(in);
        String expected = "До скорой встречи.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Сколько будет 2 + 2?";
        String result = DummyBot.answer(in);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        assertThat(result).isEqualTo(expected);
    }
}