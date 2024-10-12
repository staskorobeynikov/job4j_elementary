package ru.job4j.algorithm.stack;

import java.util.Map;
import java.util.Stack;

public class ValidateParentheses {
    private static final Map<Character, Character> BRACKETS = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
    );

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (!BRACKETS.containsKey(symbol)) {
                stack.push(symbol);
            } else {
                if (stack.isEmpty() || !stack.pop().equals(BRACKETS.get(symbol))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
