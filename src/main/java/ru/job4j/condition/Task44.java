package ru.job4j.condition;

public class Task44 {
    public static void containsZero(int number) {
        int divider = number / 10;
        int change = number % 10;
        if (change >= 5) {
            divider = (divider + 1) * 10;
        } else {
            divider *= 10;
        }
        System.out.println(divider);
    }
}
