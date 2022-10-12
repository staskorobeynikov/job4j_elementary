package ru.job4j.condition;

public class Task74 {
    public static void innerNum(int num2, int num4) {
        if (String.valueOf(num4).contains(String.valueOf(num2))) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
