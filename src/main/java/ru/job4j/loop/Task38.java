package ru.job4j.loop;

import java.util.StringJoiner;

public class Task38 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 200; i <= 223; i++) {
            if (isAllEven(i)) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static boolean isAllEven(int number) {
        while (number > 0) {
            if (number % 10 % 2 != 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
