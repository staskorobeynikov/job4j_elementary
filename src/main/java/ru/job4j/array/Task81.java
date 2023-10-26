package ru.job4j.array;

public class Task81 {
    public static int[] array(int[] nums) {
        int negative = 0;
        int positive = 0;
        int counter = 0;
        for (int num : nums) {
            if (num == 0) {
                counter++;
            } else if (num < 0) {
                negative++;
            } else {
                positive++;
            }
        }
        return new int[]{negative, counter, positive};
    }
}
