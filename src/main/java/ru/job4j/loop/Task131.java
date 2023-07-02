package ru.job4j.loop;

import java.util.StringJoiner;

public class Task131 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
            if (count == 3) {
                break;
            }
            joiner.add(String.valueOf(num));
        }
        System.out.println(joiner);
    }
}
