package ru.job4j.loop;

import java.util.StringJoiner;

public class Task124 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        int index = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = getSum(nums[i]);
            if (sum > max) {
                max = sum;
                index = i;
            }
            joiner.add(String.valueOf(sum));
        }

        System.out.printf("Суммы: %s, индекс: %s%n", joiner, index);
    }

    private static int getSum(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}
