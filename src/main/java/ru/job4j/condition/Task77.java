package ru.job4j.condition;

import java.util.HashSet;
import java.util.Set;

public class Task77 {
    public static void diffNumAmount(int num) {
        Set<Integer> buffer = new HashSet<>();
        while (num > 0) {
            buffer.add(num % 10);
            num /= 10;
        }
        System.out.println(buffer.size() == 1 ? 0 : buffer.size());
    }
}
