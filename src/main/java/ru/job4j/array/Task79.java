package ru.job4j.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Task79 {
    public static void array(int[] nums) {
        Map<Integer, Integer> temp = new LinkedHashMap<>();
        StringJoiner buffer = new StringJoiner(" ");
        for (int num : nums) {
            temp.put(num, temp.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : temp.entrySet()) {
            if (entry.getValue() > 1) {
                buffer.add(String.valueOf(entry.getKey()));
            }
        }
        if (buffer.length() > 0) {
            System.out.println(buffer);
        } else {
            System.out.print("");
        }
    }
}
