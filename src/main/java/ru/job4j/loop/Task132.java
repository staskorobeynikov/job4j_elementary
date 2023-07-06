package ru.job4j.loop;

import java.util.StringJoiner;

public class Task132 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((i + 1) % 2 != 0 && nums[i] % 2 == 0) {
                count++;
            }
            if (count == 3) {
                break;
            }
            joiner.add(String.valueOf(nums[i]));
        }
        System.out.println(joiner);
    }
}
