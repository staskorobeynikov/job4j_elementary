package ru.job4j.type;

public class Task32 {
    public static void evenAmount(int number) {
        int num1 = number / 10;
        int num2 = number % 10;
        int counter = 0;
        if (num1 % 2 == 0) {
            counter++;
        }
        if (num2 % 2 == 0) {
            counter++;
        }
        System.out.println(counter);
    }
}
