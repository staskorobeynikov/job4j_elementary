package ru.job4j.condition;

public class Task83 {
    public static void isEquals(String name1, String surname1, String name2, String surname2) {
        if (name1.equals(name2) && surname1.equals(surname2)) {
            System.out.println("Тезки и однофамильцы");
        } else if (name1.equals(name2)) {
            System.out.println("Тезки");
        } else if (surname1.equals(surname2)) {
            System.out.println("Однофамильцы");
        } else {
            System.out.println("Совпадений нет");
        }
    }
}
