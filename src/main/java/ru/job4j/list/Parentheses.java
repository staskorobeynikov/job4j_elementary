package ru.job4j.list;

import java.util.Deque;
import java.util.LinkedList;

public class Parentheses {
    public static boolean valid(char[] data) {
        Deque<Character> stack = new LinkedList<>();
        for (char c : data) {
            if (c == '(') {
                stack.addFirst(c);
            } else {
                if (stack.isEmpty() || stack.poll() == null) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
