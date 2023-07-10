package ru.job4j.loop;

public class Task134 {
    public static void loop(int num) {
        int check = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (check + (int) Math.pow(i, 2) > num) {
                break;
            }
            check += (int) Math.pow(i, 2);
        }
        System.out.println(check);
    }
}
