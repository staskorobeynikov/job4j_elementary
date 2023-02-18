package ru.job4j.loop;

import java.util.StringJoiner;

public class Task36 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i < 30; i++) {
            if (getMultiply(i) >= 10) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    private static int getMultiply(int number) {
        int result = 1;
        while (number > 0) {
            result *= number % 10;
            number /= 10;
        }
        return result;
    }
}
