package ru.job4j.type;

public class Task33 {
    public static void evenAmount(int number) {
        int counter = 0;
        while (number != 0) {
            if (number % 10 % 2 == 0) {
                counter++;
            }
            number /= 10;
        }
        System.out.println(counter);
    }
}
