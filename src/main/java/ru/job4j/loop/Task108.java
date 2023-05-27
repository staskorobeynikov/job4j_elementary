package ru.job4j.loop;

public class Task108 {
    public static void loop(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num == 999) {
                break;
            }
            System.out.println(num);
            result += num;
        }
        System.out.printf("Сумма: %s%n", result);
    }
}