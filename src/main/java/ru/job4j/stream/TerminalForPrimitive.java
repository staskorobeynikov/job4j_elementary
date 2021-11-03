package ru.job4j.stream;

import java.util.Arrays;

public class TerminalForPrimitive {

    private int[] data;

    public TerminalForPrimitive(int[] data) {
        this.data = data;
    }

    public long count() {
        return Arrays
                .stream(data)
                .count();
    }

    public long max() {
        return Arrays
                .stream(data)
                .max()
                .orElse(-1);
    }

    public long min() {
        return Arrays
                .stream(data)
                .min()
                .orElse(-1);
    }

    public double avg() {
        return Arrays
                .stream(data)
                .average()
                .orElse(-1D);
    }

    public long sum() {
        return Arrays
                .stream(data)
                .sum();
    }
}
