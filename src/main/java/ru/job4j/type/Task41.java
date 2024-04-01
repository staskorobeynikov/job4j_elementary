package ru.job4j.type;

public class Task41 {
    public static void rightCircleShift(int number) {
        int first = number / 100;
        int second = number / 10 % 10;
        int third = number % 10;
        int result = first * 10 + second + third * 100;
        System.out.println(result);
    }
}
