package ru.job4j.condition;

import java.util.HashSet;
import java.util.Set;

public class Task76 {
    public static void sameNumAmount(int num) {
        Set<Integer> buffer = new HashSet<>();
        while (num > 0) {
            buffer.add(num % 10);
            num /= 10;
        }
        int result = buffer.size();
        if (result == 3) {
            result = 0;
        } else if (result == 1) {
            result = 3;
        }
        System.out.println(result);
    }
}
