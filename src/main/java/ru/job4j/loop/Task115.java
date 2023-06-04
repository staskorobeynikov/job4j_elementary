package ru.job4j.loop;

public class Task115 {
    public static void loop(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                result += nums[i];
                break;
            }
            result += nums[i];
        }
        System.out.println(result);
    }
}
