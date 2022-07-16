package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> rsl = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int add = i > 0 ? (int) (first * Math.pow(denominator, i)) : first;
            rsl.add(i, add);
        }
        return rsl
                .stream()
                .reduce(Integer::sum)
                .orElse(0);
    }
}
