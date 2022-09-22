package ru.job4j.comparator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;

class SortBySetTest {
    @Test
    public void test() {
        List<String> input = Arrays.asList("5", "4", "3", "2", "1");
        Set<String> result = SortBySet.sort(input);
        Set<String> expect = new TreeSet<>(Set.of("1", "2", "3", "4", "5"));
        assertThat(result).containsSequence(expect);
    }
}