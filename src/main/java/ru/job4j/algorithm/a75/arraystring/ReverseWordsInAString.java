package ru.job4j.algorithm.a75.arraystring;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder result = new StringBuilder();
        int i = strings.length - 1;
        int n = 0;
        while (i >= 0) {
            if (!"".equals(strings[i])) {
                if (n > 0) {
                    result.append(" ");
                }
                result.append(strings[i]);
                n++;
            }
            i--;
        }
        return result.toString();
    }
}
