package ru.job4j.type;

public class Task42 {
    public static void rightCircleShift(int number) {
        int first = number / 1000;
        int second = number / 100 % 10;
        int third = number / 10 % 10;
        int fourth = number % 10;
        int result = fourth * 1000 + first * 100 + second * 10 + third;
        System.out.println(result);
    }
}
