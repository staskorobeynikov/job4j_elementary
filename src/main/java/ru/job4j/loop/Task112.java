package ru.job4j.loop;

public class Task112 {
    public static void loop(int num, int[] nums) {
        int count = 0;
        for (int number : nums) {
            if (num - number <= 0) {
                break;
            }
            num -= number;
            count++;
        }
        System.out.println(count);
    }
}
