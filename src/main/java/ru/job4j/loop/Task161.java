package ru.job4j.loop;

import java.util.StringJoiner;

public class Task161 {
    public static void loop() {
        StringJoiner buffer = new StringJoiner(" ");
        for (int i = 10; i < 30; i++) {
            if (checkNumber(i)) {
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
