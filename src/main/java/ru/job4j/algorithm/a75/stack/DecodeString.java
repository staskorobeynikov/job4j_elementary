package ru.job4j.algorithm.a75.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DecodeString {
    public static String decodeString(String s) {
        Deque<Integer> numbers = new ArrayDeque<>();
        Deque<String> symbols = new ArrayDeque<>();
        int number = 0;
        String result = "";
        for (char c : s.toCharArray()) {
            if ('0' <= c && c <= '9') {
                number = number * 10 + c - '0';
            } else if (c == '[') {
                numbers.push(number);
                symbols.push(result);
                number = 0;
                result = "";
            } else if (c == ']') {
                StringBuilder substring = new StringBuilder();
                for (int i = 0, n = numbers.pop(); i < n; ++i) {
                    substring.append(result);
                }
                result = symbols.pop() + substring;
            } else {
                result += String.valueOf(c);
            }
        }
        return result;
    }
}
