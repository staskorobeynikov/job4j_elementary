package ru.job4j.list;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        for (int i = 1; i < data.size() - 1; i++) {
            int current = data.get(i);
            int previous = data.get(i - 1);
            int next = data.get(i + 1);
            if (2 * current != previous + next) {
                return 0;
            }
        }
        return data
                .stream()
                .reduce(Integer::sum)
                .orElse(0);
    }
}
