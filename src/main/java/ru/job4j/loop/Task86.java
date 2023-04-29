package ru.job4j.loop;

import java.util.StringJoiner;

public class Task86 {
    public static void loop(int[] num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int number : num) {
            if (getSum(number) == getSum(number * 2)) {
                joiner.add(String.valueOf(number));
            }
        }
        System.out.println(joiner.length() == 0 ? "Стабильных чисел нет" : joiner);
    }

    private static int getSum(int number) {
        return number / 10 + number % 10;
    }
}
