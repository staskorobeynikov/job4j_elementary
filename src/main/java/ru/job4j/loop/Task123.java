package ru.job4j.loop;

import java.util.StringJoiner;

public class Task123 {
    public static void loop(int num) {
        StringJoiner buffer = new StringJoiner(" ");
        while (num / 10 > 0) {
            num = getSum(num);
            buffer.add(String.valueOf(num));
        }
        System.out.println(buffer);
    }

    private static int getSum(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}
