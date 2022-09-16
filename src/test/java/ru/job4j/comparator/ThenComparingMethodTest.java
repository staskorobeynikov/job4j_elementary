package ru.job4j.comparator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.comparator.ThenComparingMethod.*;

class ThenComparingMethodTest {
    @Test
    public void test() {
        User user1 = new User("C", 10);
        User user2 = new User("B", 20);
        User user3 = new User("A", 15);
        User user4 = new User("B", 11);
        User user5 = new User("A", 12);
        List<User> input = Arrays.asList(user1, user2, user3, user4, user5);
        List<User> expect = Arrays.asList(user3, user5, user2, user4, user1);
        input.sort(thenComparing());
        assertThat(input).containsSequence(expect);
    }
}