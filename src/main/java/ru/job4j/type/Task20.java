package ru.job4j.type;

public class Task20 {
    public static void separate(int number) {
        int num1 = number / 10;
        int num2 = number % 10;
        String result = String.format("%s %s", num1, num2);
        System.out.println(result);
    }
}
