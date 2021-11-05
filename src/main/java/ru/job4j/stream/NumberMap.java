package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class NumberMap {

    public static List<Integer> map(List<Integer> numbers) {
        return numbers
                .stream()
                .map(i -> i * i)
                .collect(Collectors.toList());
    }
}
