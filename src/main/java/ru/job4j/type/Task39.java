package ru.job4j.type;

public class Task39 {
    public static void leftCircleShift(int number) {
        int first = number / 100;
        int middle = number / 10 % 10;
        int last = number % 10;
        int result = middle * 100 + last * 10 + first;
        System.out.println(result);
    }
}
