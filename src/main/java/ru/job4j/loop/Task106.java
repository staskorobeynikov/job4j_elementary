package ru.job4j.loop;

public class Task106 {
    public static void loop(int[] nums) {
        for (int num : nums) {
            if (num == 0) {
                break;
            }
            System.out.println(num);
        }
    }
}
