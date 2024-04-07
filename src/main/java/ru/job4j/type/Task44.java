package ru.job4j.type;

public class Task44 {
    public static void rightNumChange(int number1, int number2) {
        int start1 = number1 / 10;
        int start2 = number2 / 10;
        int result1 = start1 * 10 + number2 % 10;
        System.out.println(result1);
        int result2 = start2 * 10 + number1 % 10;
        System.out.println(result2);
    }
}
