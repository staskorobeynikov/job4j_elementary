package ru.job4j.condition;

public class Task55 {
    private static final int COUNT_FLAT = 3;

    public static void apartmentPlace(int number) {
        int floor = number / COUNT_FLAT;
        int temp = number % COUNT_FLAT;
        if (temp == 0) {
            System.out.println(floor);
            System.out.println(COUNT_FLAT);
        } else {
            System.out.println(floor + 1);
            System.out.println(temp);
        }
    }
}
