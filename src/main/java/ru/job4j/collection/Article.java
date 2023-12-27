package ru.job4j.collection;

import java.util.*;

public class Article {
    private static final String PATTERN = "[\\p{Punct}]";

    public static boolean generateBy(String origin, String line) {
        Map<String, Integer> buffer = new HashMap<>();
        String[] text = line.replaceAll(PATTERN, "").split(" ");
        for (String string : text) {
            Integer temp = buffer.getOrDefault(string, 0);
            buffer.put(string, temp + 1);
        }
        String[] originalText = origin.replaceAll(PATTERN, "").split(" ");
        for (String string : originalText) {
            buffer.computeIfPresent(string, (key, value) -> value - 1);
            buffer.remove(string, 0);
        }
        return buffer.size() == 0;
    }
}
