package ru.job4j.type;

public class Task31 {
    public static void difference(int number) {
        int first = number / 100;
        int middle = number / 10 % 10;
        int last = number % 10;
        int result = Math.abs(first - last) * middle;
        System.out.println(result);
    }
}
