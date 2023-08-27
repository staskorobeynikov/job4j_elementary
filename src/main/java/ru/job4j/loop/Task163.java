package ru.job4j.loop;

import java.util.StringJoiner;

public class Task163 {
    public static void loop() {
        StringJoiner buffer = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            if (getSum(i) % 2 == 0) {
                buffer.add(String.valueOf(i));
            }
        }
        System.out.println(buffer);
    }

    private static int getSum(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        return result;
    }
}
