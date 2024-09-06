package ru.job4j.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.*;

public class MapIntegerAndListConverter {
    public static Map<Integer, Integer> convert(Map<Integer, List<Integer>> input) {
        return input.entrySet()
                .stream()
                .flatMap(e -> e.getValue()
                        .stream()
                        .map(x -> new Integer[]{x, e.getKey()}))
                .collect(
                        Collectors.toMap(
                                n -> n[0],
                                n -> n[1]
                        )
                );
    }

    public static Map<Integer, Integer> convert1(Map<Integer, List<Integer>> input) {
        return input.entrySet().stream()
                .flatMap(e -> e
                        .getValue()
                        .stream()
                        .map(i -> entry(
                                    i, e.getKey()
                                )
                        )
                )
                .collect(
                        Collectors.toMap(
                                Entry::getKey,
                                Entry::getValue
                        )
                );
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(1, List.of(1, 2, 3));
        map.put(2, List.of(4, 5));

        Map<Integer, Integer> integerMap = MapIntegerAndListConverter.convert1(map);
        System.out.println(integerMap);
    }
}
