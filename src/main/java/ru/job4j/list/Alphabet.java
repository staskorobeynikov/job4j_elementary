package ru.job4j.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        String[] split = s.split("");
        List<String> list = new ArrayList<>(Arrays.asList(split));
        list.sort(Comparator.naturalOrder());
        StringBuilder rsl = new StringBuilder();
        for (String str : list) {
            rsl.append(str);
        }
        return rsl.toString();
    }
}
