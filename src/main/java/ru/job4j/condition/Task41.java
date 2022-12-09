package ru.job4j.condition;

public class Task41 {
    public static void evenDigitsAmount(int number) {
        int result = 0;
        while (number > 0) {
            int last = number % 10;
            if (last % 2 == 0) {
                result++;
            }
            number /= 10;
        }
        System.out.println(result);
    }
}
