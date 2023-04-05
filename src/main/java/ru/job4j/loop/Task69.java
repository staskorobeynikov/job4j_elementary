package ru.job4j.loop;

public class Task69 {
    public static void loop(int num1, int num2) {
        int count = 0;
        int min = Math.min(num1, num2);
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
