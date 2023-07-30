package ru.job4j.loop;

import java.util.Locale;
import java.util.StringJoiner;

public class Task145 {

    public static void loop(int num1, double num2) {
        double current = num1;
        StringJoiner joiner = new StringJoiner(" ");
        int count = 0;
        while (current > num2) {
            current = Math.sqrt(current);
            if (current <= 1 + num2) {
                break;
            }
            joiner.add(String.format(Locale.ENGLISH, "%.1f", current));
            count++;
        }
        System.out.printf("Промежуточные: %s, Количество: %s%n", joiner, count);
    }
}