package ru.job4j.type;

public class Task40 {
    public static void leftCircleShift(int number) {
        int first = number / 1000;
        int second = number / 100 % 10;
        int third = number / 10 % 10;
        int forth = number % 10;
        int result = second * 1000 + third * 100 + forth * 10 + first;
        System.out.println(result);
    }
}
