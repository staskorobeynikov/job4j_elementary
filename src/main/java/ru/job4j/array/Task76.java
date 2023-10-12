package ru.job4j.array;

import java.util.HashMap;
import java.util.Map;

public class Task76 {
    public static void array(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : arr) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        System.out.printf(
                "5: %s, 4: %s, 3: %s, 2: %s, 1: %s%n",
                map.getOrDefault(5, 0),
                map.getOrDefault(4, 0),
                map.getOrDefault(3, 0),
                map.getOrDefault(2, 0),
                map.getOrDefault(1, 0)
        );
    }
}
