package ru.job4j.set;

import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String[] strings = s.split(" ");
        String rsl = "Вы сделали правильный выбор!";
        for (String str : strings) {
            if (words.contains(str)) {
                rsl = "Выберите другую статью...";
                break;
            }
        }
        return rsl;
    }
}
