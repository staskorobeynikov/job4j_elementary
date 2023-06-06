package ru.job4j.loop;

public class Task117 {
    public static void loop(int num) {
        int count = 0;
        int sum = 0;
        while (num > 0) {
            int number = num % 10;
            if (number % 2 == 0) {
                count++;
                sum += number;
            }
            num /= 10;
        }
        System.out.printf("Количество: %s, сумма: %s%n", count, sum);
    }
}
