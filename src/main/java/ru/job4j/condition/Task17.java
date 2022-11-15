package ru.job4j.condition;

public class Task17 {
    public static void signCheck(int number) {
        if (number > 0) {
            System.out.println("Положительное");
        } else if (number < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Ноль");
        }
    }
}
