package ru.job4j.string;

public class Task1 {
    public static String maxMatch(String[] strings) {
        if (strings.length == 0) {
            return "";
        }
        String first = strings[0];
        String result = "";
        for (int i = 0; i < first.length(); i++) {
            char symbol = first.charAt(i);
            for (int j = 1; j < strings.length; j++) {
                if (i == strings[j].length() || strings[j].charAt(i) != symbol) {
                    return result;
                }
            }
            result = result + symbol;
        }
        return result;
    }
}
