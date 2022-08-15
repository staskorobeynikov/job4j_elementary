package ru.job4j.map;

import java.util.Map;
import java.util.TreeMap;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        char rsl = ' ';
        Map<Character, Integer> characters = new TreeMap<>();
        for (Character c : str.replace(" ", "").toLowerCase().toCharArray()) {
            characters.computeIfPresent(c, (key, value) -> value + 1);
            characters.putIfAbsent(c, 1);
        }
        return characters
                .keySet()
                .stream()
                .filter(c -> characters.get(c).equals(characters.values()
                                                                .stream()
                                                                .max(Integer::compareTo)
                                                                .orElse(0))
                )
                .findFirst()
                .orElse(rsl);
    }
}
