package ru.job4j.condition;

public class Task18 {
    public static void numDecrease(int number) {
        String value = String.valueOf(number);
        if (number > 0 && value.length() >= 3) {
            System.out.println(number - 1);
        } else {
            System.out.println(number);
        }
    }
}
