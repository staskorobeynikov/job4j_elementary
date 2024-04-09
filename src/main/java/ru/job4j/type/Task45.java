package ru.job4j.type;

public class Task45 {
    public static void leftNumChange(int number1, int number2) {
        int first1 = number1 / 100;
        int first2 = number2 / 100;
        int result1 = number1 % 100 + first2 * 100;
        System.out.println(result1);
        int result2 = number2 % 100 + first1 * 100;
        System.out.println(result2);
    }
}
