package ru.job4j.algorithm;

import java.util.ArrayList;
import java.util.List;

public class StringEncodeAndDecode {
    public String encode(List<String> strings) {
        StringBuilder builder = new StringBuilder();
        for (String str : strings) {
            builder.append(str.length())
                    .append("#")
                    .append(str);
        }
        return builder.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));
            result.add(s.substring(j + 1, j + 1 + length));
            i = j + 1 + length;
        }
        return result;
    }
}
