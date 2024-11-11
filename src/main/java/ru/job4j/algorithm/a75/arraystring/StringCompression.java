package ru.job4j.algorithm.a75.arraystring;

public class StringCompression {
    public static int compress(char[] chars) {
        int result = 0;
        int i = 0;
        while (i < chars.length) {
            int j = i + 1;
            while (j < chars.length && chars[i] == chars[j]) {
                j++;
            }
            chars[result++] = chars[i];
            if (j - i > 1) {
                String s = String.valueOf(j - i);
                for (char c : s.toCharArray()) {
                    chars[result++] = c;
                }
            }
            i = j;
        }
        return result;
    }
}
