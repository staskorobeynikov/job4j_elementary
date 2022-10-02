package ru.job4j.condition;

public class Task79 {
    public static void getCentury(int num) {
        int age = num / 100;
        if (num > 2000 || num < 1501) {
            System.out.println("Не попадает в диапазон");
        } else if ((age + 1) * 100 > num && age * 100 + 1 <= num) {
            System.out.println(age + 1);
        } else {
            System.out.println(age);
        }
    }
}
