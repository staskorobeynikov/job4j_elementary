package ru.job4j.algorithm.a75.array;

import java.util.ArrayList;
import java.util.List;

public class FindTheKthCharacterInStringGameI {
    public char kthCharacter(int k) {
        List<Integer> digits = new ArrayList<>();
        digits.add(0);
        while (digits.size() < k) {
            int size = digits.size();
            for (int i = 0; i < size; i++) {
                digits.add((digits.get(i) + 1) % 26);
            }
        }
        return (char) ('a' + digits.get(k - 1));
    }
}