package ru.job4j.loop;

public class Task139 {
    public static void loop(int num) {
        int result = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
