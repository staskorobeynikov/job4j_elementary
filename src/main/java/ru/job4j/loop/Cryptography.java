package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.length() == 0) {
            return "empty";
        }
        if (s.length() > 4) {
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < s.length() - 4; i++) {
                sb.setCharAt(i, '#');
            }
            return sb.toString();
        }
        return s;
    }
}
