package ru.job4j.algorithm.a75.arraystring;

public class ToLowerCase {
    public String toLowerCase(String s) {
        char[] characters = s.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] >= 'A' && characters[i] <= 'Z') {
                characters[i] |= 32;
            }
        }
        return String.valueOf(characters);
    }
}
