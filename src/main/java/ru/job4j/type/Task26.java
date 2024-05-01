package ru.job4j.type;

public class Task26 {
    public static void transform(int number) {
        int num1 = number / 10;
        int num2 = number % 10;
        int result = num2 * 10 + num1;
        System.out.println(result + 8);
    }
}
