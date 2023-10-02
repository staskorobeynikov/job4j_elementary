package ru.job4j.array;

import java.util.Arrays;

public class UpperCase {
    public static char[] onlyLowCase(char[] input) {
        char[] result = new char[input.length];
        int counter = 0;
        for (char symbol : input) {
            if (Character.isLetter(symbol) && Character.isLowerCase(symbol)) {
                result[counter++] = Character.toUpperCase(symbol);
            }
        }
        return Arrays.copyOf(result, counter);
    }
}
