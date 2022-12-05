package ru.job4j.condition;

public class Task35 {
    public static void gradeCheck(int grade) {
        if (grade > 0 && grade <= 5) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
