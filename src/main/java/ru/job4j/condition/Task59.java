package ru.job4j.condition;

public class Task59 {
    public static void getLinearEquation(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Бесконечное множество");
        } else if (a == 0) {
            System.out.println("Нет решения");
        } else {
            int result = -b / a;
            int i = -b % a;
            if (i != 0) {
                double d = i / (double) a;
                d += result;
                System.out.println(d);
            } else {
                System.out.println(result);
            }
        }
    }
}
