package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        Set<Character> characters = new HashSet<>();
        String all = s.toLowerCase().replaceAll(" ", "");
        for (Character c : all.toCharArray()) {
            characters.add(c);
        }
        return characters.size() == 26;
    }
}
