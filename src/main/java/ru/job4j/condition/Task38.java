package ru.job4j.condition;

public class Task38 {
    public static void maxDigit(int number) {
        int first = number / 10;
        int second = number % 10;
        if (first > second) {
            System.out.println(first);
        } else if (first < second) {
            System.out.println(second);
        } else {
            System.out.println("Равны");
        }
    }
}
