package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Optional;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        max(data).ifPresent(i -> System.out.println("Max: " + i));
    }

    private static Optional<Integer> max(int[] data) {
        return data.length == 0 ? Optional.empty() : Arrays
                                                        .stream(data)
                                                        .boxed()
                                                        .max(Integer::compareTo);
    }
}
