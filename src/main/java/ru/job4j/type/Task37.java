package ru.job4j.type;

public class Task37 {
    public static void leftShift(int number) {
        int hundred = number / 10 % 10;
        int ten = number % 10;
        int result = hundred * 100 + ten * 10;
        System.out.println(result);
    }
}
