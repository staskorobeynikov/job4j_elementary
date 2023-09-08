package ru.job4j.loop;

import java.util.StringJoiner;

public class Task92 {
    public static void loop(int a1, int n1, int a2, int n2) {
        if (n1 + 1 == n2) {
            System.out.println("Нет чисел");
        } else {
            StringJoiner buffer = new StringJoiner(" ");
            int d = (a2 - a1) / (n2 - n1);
            while (n1 + 1 < n2) {
                a1 += d;
                buffer.add(String.valueOf(a1));
                n1++;
            }
            System.out.println(buffer);
        }
    }
}
