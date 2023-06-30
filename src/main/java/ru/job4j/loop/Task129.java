package ru.job4j.loop;

public class Task129 {
    public static void loop(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
