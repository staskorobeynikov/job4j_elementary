package ru.job4j.loop;

import java.util.StringJoiner;

public class Task166 {
    public static void loop() {
        StringJoiner buffer = new StringJoiner(" ");
        for (int i = 100; i <= 300; i++) {
            if (i % 10 == 0 && checkSumNotEvenDividers(i)) {
                buffer.add(String.valueOf(i));
            }
        }
        System.out.println(buffer);
    }

    private static boolean checkSumNotEvenDividers(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && i % 2 != 0) {
                result += i;
            }
        }
        return result % 10 == 0;
    }
}
