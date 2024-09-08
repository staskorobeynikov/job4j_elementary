package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MapIntegerAndListConverterTest {
    @Test
    void testConvert1EmptyInput() {
        Map<Integer, List<Integer>> input = new HashMap<>();
        Map<Integer, Integer> result = MapIntegerAndListConverter.convert1(input);

        assertTrue(result.isEmpty(), "Результат должен быть пустой картой");
    }

    @Test
    void testConvert1SingleEntry() {
        Map<Integer, List<Integer>> input = new HashMap<>();
        input.put(1, List.of(100));

        Map<Integer, Integer> result = MapIntegerAndListConverter.convert1(input);

        assertEquals(1, result.size());
        assertEquals(1, result.get(100));
    }

    @Test
    void testConvert1MultipleEntries() {
        Map<Integer, List<Integer>> input = new HashMap<>();
        input.put(1, Arrays.asList(100, 101));
        input.put(2, Arrays.asList(200, 201));

        Map<Integer, Integer> result = MapIntegerAndListConverter.convert1(input);

        assertEquals(4, result.size());
        assertEquals(1, result.get(100));
        assertEquals(1, result.get(101));
        assertEquals(2, result.get(200));
        assertEquals(2, result.get(201));
    }

    @Test
    void testConvert1DuplicateValues() {
        Map<Integer, List<Integer>> input = new HashMap<>();
        input.put(1, Arrays.asList(100, 101));
        input.put(2, List.of(100));

        assertThrows(IllegalStateException.class, () -> MapIntegerAndListConverter.convert1(input));
    }

    @Test
    void testConvert1EmptyListValues() {
        Map<Integer, List<Integer>> input = new HashMap<>();
        input.put(1, new ArrayList<>());

        Map<Integer, Integer> result = MapIntegerAndListConverter.convert1(input);

        assertTrue(result.isEmpty(), "Результат должен быть пустой картой");
    }

    @Test
    void testConvert1LargeInput() {
        Map<Integer, List<Integer>> input = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            input.put(i, Arrays.asList(i * 10, i * 10 + 1, i * 10 + 2));
        }

        Map<Integer, Integer> result = MapIntegerAndListConverter.convert1(input);

        assertEquals(3000, result.size());
        assertEquals(0, result.get(0));
        assertEquals(999, result.get(9990));
    }

    @Test
    void testConvertEmptyInput() {
        Map<Integer, List<Integer>> input = new HashMap<>();
        Map<Integer, Integer> result = MapIntegerAndListConverter.convert(input);

        assertTrue(result.isEmpty(), "Результат должен быть пустой картой");
    }

    @Test
    void testConvertSingleEntry() {
        Map<Integer, List<Integer>> input = new HashMap<>();
        input.put(1, List.of(100));

        Map<Integer, Integer> result = MapIntegerAndListConverter.convert(input);

        assertEquals(1, result.size());
        assertEquals(1, result.get(100));
    }

    @Test
    void testConvertMultipleEntries() {
        Map<Integer, List<Integer>> input = new HashMap<>();
        input.put(1, Arrays.asList(100, 101));
        input.put(2, Arrays.asList(200, 201));

        Map<Integer, Integer> result = MapIntegerAndListConverter.convert(input);

        assertEquals(4, result.size());
        assertEquals(1, result.get(100));
        assertEquals(1, result.get(101));
        assertEquals(2, result.get(200));
        assertEquals(2, result.get(201));
    }

    @Test
    void testConvertDuplicateValues() {
        Map<Integer, List<Integer>> input = new HashMap<>();
        input.put(1, Arrays.asList(100, 101));
        input.put(2, List.of(100));

        assertThrows(IllegalStateException.class, () -> MapIntegerAndListConverter.convert(input));
    }

    @Test
    void testConvertEmptyListValues() {
        Map<Integer, List<Integer>> input = new HashMap<>();
        input.put(1, new ArrayList<>());

        Map<Integer, Integer> result = MapIntegerAndListConverter.convert(input);

        assertTrue(result.isEmpty(), "Результат должен быть пустой картой");
    }

    @Test
    void testConvertLargeInput() {
        Map<Integer, List<Integer>> input = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            input.put(i, Arrays.asList(i * 10, i * 10 + 1, i * 10 + 2));
        }

        Map<Integer, Integer> result = MapIntegerAndListConverter.convert(input);

        assertEquals(3000, result.size());
        assertEquals(0, result.get(0));
        assertEquals(999, result.get(9990));
    }
}