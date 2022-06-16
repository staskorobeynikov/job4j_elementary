package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        if (l.length() == 0 && r.length() == 0) {
            return true;
        }
        char lFirst = l.charAt(0);
        char lLast = l.charAt(l.length() - 1);
        char rFirst = r.charAt(0);
        char rLast = r.charAt(r.length() - 1);
        return lFirst == rLast && lLast == rFirst;
    }
}
