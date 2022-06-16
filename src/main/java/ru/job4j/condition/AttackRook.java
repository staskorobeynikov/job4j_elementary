package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        boolean first = left.charAt(0) == right.charAt(0);
        boolean second = left.charAt(1) == right.charAt(1);
        return first || second;
    }
}
