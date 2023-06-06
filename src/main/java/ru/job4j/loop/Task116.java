package ru.job4j.loop;

public class Task116 {
    public static void loop(int num) {
        int sum = 0;
        int count = 0;
        while (num > 0) {
            int number = num % 10;
            count++;
            sum += number;
            num /= 10;
        }
        System.out.printf("Количество: %s, сумма: %s%n", count, sum);
    }
}
