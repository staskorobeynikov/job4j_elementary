package ru.job4j.type;

public class Task34 {
    public static void evenAmount(int number) {
        int[] numbers = {
                number / 1000,
                number / 100 % 10,
                number / 10 % 10,
                number % 10
        };
        int counter = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
