package ru.job4j.loop;

public class Task81 {
    public static void loop(int num) {
        int first = num / 10;
        int second = num % 10;
        int start = Math.min(first, second);
        int finish = Math.max(first, second);
        int result = 0;
        for (int i = start; i <= finish; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
