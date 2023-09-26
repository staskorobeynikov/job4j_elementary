package ru.job4j.condition;

public class Task39 {
    public static void isSymmetric(int number) {
        int first = number / 100;
        int last = number % 10;
        System.out.println(first == last ? "Да" : "Нет");
    }
}
