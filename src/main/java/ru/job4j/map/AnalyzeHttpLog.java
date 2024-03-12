package ru.job4j.map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class AnalyzeHttpLog {

    public record Line(String level, String thread, String text) {
    }

    public static Map<String, Long> groupByLevel(List<Line> logs) {
        return logs.stream()
                .collect(Collectors.groupingBy(
                        Line::level,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));
    }

    public static String maxByThread(List<Line> logs) {
        return logs.stream()
                .collect(
                        Collectors.groupingBy(
                                Line::thread,
                                Collectors.summingInt(line -> line.text.getBytes().length)
                        )
                ).entrySet()
                .stream()
                .max(Comparator.comparingInt(Entry::getValue))
                .map(Entry::getKey)
                .orElse(null);
    }

    public static Map<String, Long> detailByThread(List<Line> logs, String thread,
                                                   List<String> orders) {
        return Map.of();
    }
}
