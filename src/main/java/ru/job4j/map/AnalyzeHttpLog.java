package ru.job4j.map;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
}
