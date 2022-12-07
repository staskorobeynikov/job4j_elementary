package ru.job4j.condition;

public class Task40 {
    public static void isDoubleEven(int number) {
        int i = 0;
        int value = number;
        while (value > 0) {
            i += value % 10;
            value /= 10;
        }
        if (number % 2 == 0 && i % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
