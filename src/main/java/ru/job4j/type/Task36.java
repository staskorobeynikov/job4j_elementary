package ru.job4j.type;

public class Task36 {
    public static void firstLastChange(int number) {
        int first = number / 1000;
        int middle = number / 10 % 100;
        int last = number % 10;
        int result = last * 1000 + middle * 10 + first;
        System.out.println(result);
    }
}
