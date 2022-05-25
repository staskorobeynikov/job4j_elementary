package ru.job4j.array;

public class WordsToText {

    public static String convert(String[] words) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            result.append(words[i]);
            result.append(" ");
        }
        result.append(words[words.length - 1]);
        return result.toString();
    }
}
