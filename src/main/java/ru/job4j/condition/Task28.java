package ru.job4j.condition;

public class Task28 {
    public static void isEnough(int pupils, int desks) {
        if (pupils <= 2 * desks) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
