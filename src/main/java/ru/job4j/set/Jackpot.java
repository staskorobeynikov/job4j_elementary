package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> rsl = new HashSet<>();
        for (String s : combination) {
            rsl.add(s);
        }
        return rsl.size() == 1;
    }
}
