package ru.job4j.loop;

public class Task109 {
    public static void loop(int[] nums) {
        for (int num : nums) {
            if (num == 123) {
                break;
            }
            System.out.println("Код не принят");
        }
        System.out.println("Код принят");
    }
}
