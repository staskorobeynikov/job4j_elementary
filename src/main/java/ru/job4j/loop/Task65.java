package ru.job4j.loop;

public class Task65 {
    public static void loop(int[] nums) {
        int negative = 0;
        int positive = 0;
        for (int num : nums) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }
        System.out.println(negative == positive ? "Да" : "Нет");
    }
}
