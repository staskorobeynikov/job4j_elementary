package ru.job4j.comparator;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

class SortBySetUsingComparatorTest {
    @Test
    public void test() {
        List<String> input = Arrays.asList("1", "2", "3", "4", "5");
        Set<String> result = SortBySetUsingComparator.sort(input);
        Set<String> expect = new TreeSet<>(Comparator.reverseOrder());
        expect.addAll(Set.of("5", "4", "3", "2", "1"));
        assertThat(result).containsSequence(expect);
    }
}