package ru.job4j.hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static List<Integer> extractDuplicates(List<Integer> left, List<Integer> right) {
        Set<Integer> temp = new HashSet<>(left);
        List<Integer> result = new ArrayList<>();
        for (Integer number : right) {
            if (temp.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
