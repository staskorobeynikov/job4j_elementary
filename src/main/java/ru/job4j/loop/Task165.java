package ru.job4j.loop;

import java.util.StringJoiner;

public class Task165 {
    public static void loop(int num) {
        StringJoiner buffer = new StringJoiner(" ");
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && checkNumber(i)) {
                buffer.add(String.valueOf(i));
            }
        }
        System.out.println(buffer);
    }

    private static boolean checkNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
