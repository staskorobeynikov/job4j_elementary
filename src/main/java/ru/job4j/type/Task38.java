package ru.job4j.type;

public class Task38 {
    public static void leftShift(int number) {
        int thousand = number / 100 % 10;
        int hundred = number / 10 % 10;
        int ten = number % 10;
        int result = thousand * 1000 + hundred * 100 + ten * 10;
        System.out.println(result);
    }
}
