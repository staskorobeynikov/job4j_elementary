package ru.job4j.condition;

public class Task52 {
    public static void isEquals(int a1, int a2, int b1, int b2) {
        if (b1 % a1 == 0 && b2 % a2 == 0) {
            System.out.println("Да");
        } else if (a1 == a2 && b1 == b2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
