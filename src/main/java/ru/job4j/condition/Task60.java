package ru.job4j.condition;

public class Task60 {
    public static void numRelation(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("Все равны");
        } else if (a == c) {
            if (b > a) {
                System.out.println("Первое и третье равны, второе больше");
            } else {
                System.out.println("Первое и третье равны, второе меньше");
            }
        } else if (a != b && b != c) {
            System.out.println("Равных нет");
        } else if (a == b) {
            if (c > a) {
                System.out.println("Первое и второе равны, третье больше");
            } else {
                System.out.println("Первое и второе равны, третье меньше");
            }

        } else if (b > a) {
            System.out.println("Второе и третье равны, первое меньше");
        } else {
            System.out.println("Второе и третье равны, первое больше");
        }
    }
}

