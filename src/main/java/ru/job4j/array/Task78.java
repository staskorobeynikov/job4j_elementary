package ru.job4j.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Task78 {
    public static void array(int[] nums) {
        Map<Integer, Integer> temp = new LinkedHashMap<>();
        for (int num : nums) {
            temp.put(num, temp.getOrDefault(num, 0) + 1);
        }
        StringJoiner buffer = new StringJoiner(" ");
        for (var entry : temp.entrySet()) {
            if (entry.getValue() == 1) {
                buffer.add(String.valueOf(entry.getKey()));
            }
        }
        System.out.println(buffer);
    }
}
