package ru.job4j.condition;

public class Task56 {
    public static void isTriangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
