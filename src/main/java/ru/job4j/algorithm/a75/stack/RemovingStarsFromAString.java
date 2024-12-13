package ru.job4j.algorithm.a75.stack;

public class RemovingStarsFromAString {
    public static String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                if (!result.isEmpty()) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
