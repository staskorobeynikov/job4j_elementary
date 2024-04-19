package ru.job4j.type;

public class Task35 {
    public static void firstLastChange(int number) {
        int first = number / 100;
        int middle = number / 10 % 10;
        int last = number % 10;
        int result = last * 100 + first + middle * 10;
        System.out.println(result);
    }
}
