package ru.job4j.condition;

public class Task33 {
    public static void numSquare(int number) {
        if (number < 0) {
            System.out.println(number * number);
        } else {
            System.out.println("Ошибка");
        }
    }
}
