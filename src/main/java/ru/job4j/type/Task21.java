package ru.job4j.type;

public class Task21 {
    public static void separate(int number) {
        int num1 = number / 100;
        int num2 = number / 10 % 10;
        int num3 = number % 10;
        String result = String.format("%s %s %s", num1, num2, num3);
        System.out.println(result);
    }
}
