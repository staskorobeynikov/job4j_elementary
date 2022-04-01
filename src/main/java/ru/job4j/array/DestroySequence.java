package ru.job4j.array;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        int i = 0;
        while (i < 5) {
            seq[i] = '0';
            i++;
        }
        for (int j = seq.length - 5; j < seq.length; j++) {
            seq[j] = '1';
        }
        return seq;
    }
}
