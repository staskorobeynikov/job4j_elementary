package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String s : strings) {
            rsl.putIfAbsent(s.substring(0, 1), new ArrayList<>());
            rsl.computeIfPresent(s.substring(0, 1), (key, value) -> {
                value.add(s);
                return value;
            });
        }
        return rsl;
    }
}
