package ru.job4j.stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToAnyMap {

    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data
                .collect(
                        Collectors.toMap(
                                key -> key,
                                value -> (int) Math.pow(value, 2),
                                (previous, current) -> previous,
                                LinkedHashMap::new
                        )
                );
    }
}