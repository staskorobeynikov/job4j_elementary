package ru.job4j.loop;

public class Task110 {
    public static void loop(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            if (sum + num >= 150) {
                break;
            }
            sum += num;
            count++;
        }
        System.out.printf("Сумма: %s, количество: %s%n", sum, count);
    }
}
