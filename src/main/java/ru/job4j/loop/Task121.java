package ru.job4j.loop;

import java.util.StringJoiner;

public class Task121 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int number : nums) {
            joiner.add(String.valueOf(getSum(number)));
        }
        System.out.println(joiner);
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
