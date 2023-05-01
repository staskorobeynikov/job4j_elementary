package ru.job4j.loop;

import java.util.StringJoiner;

public class Task87 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i < 70; i++) {
            int sum = getSum(i);
            if (sum * sum * sum == i * i) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    private static int getSum(int number) {
        return number / 10 + number % 10;
    }
}
