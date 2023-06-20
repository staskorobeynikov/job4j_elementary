package ru.job4j.loop;

import java.util.StringJoiner;

public class Task122 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int num : nums) {
            if (getSum(num) == 5) {
                break;
            }
            joiner.add(String.valueOf(num));
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
