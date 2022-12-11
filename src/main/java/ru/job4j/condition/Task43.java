package ru.job4j.condition;

public class Task43 {
    public static void containsZero(int number) {
        int result = 0;
        while (number > 0) {
            int last = number % 10;
            if (last == 0) {
                result++;
                break;
            }
            number /= 10;
        }
        if (result > 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
