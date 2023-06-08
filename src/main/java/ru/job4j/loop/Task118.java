package ru.job4j.loop;

public class Task118 {
    public static void loop(int num) {
        int count = 0;
        int sum = 0;
        while (num > 0) {
            int number = num % 10;
            if (number % 2 == 0) {
                count++;
            } else {
                sum += number;
            }
            num /= 10;
        }
        System.out.printf("Количество чет: %s, сумма нечет: %s%n", count, sum);
    }
}
