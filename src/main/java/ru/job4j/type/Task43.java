package ru.job4j.type;

public class Task43 {
    public static void rightNumChange(int number1, int number2) {
        int number1First = number1 / 10;
        int number2First = number2 / 10;
        int result1 = number1First * 10 + number2 % 10;
        int result2 = number2First * 10 + number1 % 10;
        System.out.println(result1);
        System.out.println(result2);
    }
}
