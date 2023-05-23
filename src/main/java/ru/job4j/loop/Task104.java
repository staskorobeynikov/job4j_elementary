package ru.job4j.loop;

public class Task104 {
    public static void loop(int[] num) {
        int max = Integer.MIN_VALUE;
        int result = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                result = i;
            }
        }
        System.out.println(result);
    }
}
