package ru.job4j.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortBySetUsingComparator {
    public static Set<String> sort(List<String> list) {
        TreeSet<String> result = new TreeSet<>(Comparator.reverseOrder());
        result.addAll(list);
        return result;
    }
}
