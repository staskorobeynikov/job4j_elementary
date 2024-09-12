package ru.job4j.algorithm;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueWordsFinder {
    public List<String> findUniqueWords(List<String> words) {
        Set<String> temp = new LinkedHashSet<>();
        for (String word : words) {
            if (temp.contains(word)) {
                temp.remove(word);
            } else {
                temp.add(word);
            }
        }
        return new ArrayList<>(temp);
    }
}
