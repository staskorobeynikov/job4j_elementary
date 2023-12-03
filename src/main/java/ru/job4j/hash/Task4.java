package ru.job4j.hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task4 {
    public static List<Integer> extractUnique(List<Integer> left, List<Integer> right) {
        HashSet<Integer> result = new HashSet<>(left);
        for (Integer number : right) {
            if (result.contains(number)) {
                result.remove(number);
            } else {
                result.add(number);
            }
        }
        return new ArrayList<>(result);
    }
}
