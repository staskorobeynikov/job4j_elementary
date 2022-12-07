package ru.job4j.condition;

public class Task37 {
    public static void numsCompare(int number) {
        if (number / 10 > number % 10) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
