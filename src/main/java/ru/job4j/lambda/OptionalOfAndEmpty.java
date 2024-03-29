package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {

    public static Optional<String> findValue(List<String> strings, String value) {
        for (String str : strings) {
            if (str.equals(value)) {
                return Optional.of(str);
            }
        }
        return Optional.empty();
    }
}
