package ru.job4j.stream.products;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.stream.Collectors;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        int current = LocalDateTime.now().get(ChronoField.DAY_OF_YEAR);
        return products.stream()
                .filter(p -> p.getExpired().get(ChronoField.DAY_OF_YEAR) >= current)
                .filter(p -> p.getExpired().get(ChronoField.DAY_OF_YEAR) <= current + 2)
                .map(p -> new Label(p.getName(), p.getPrice() * 0.5f))
                .map(Label::toString)
                .collect(Collectors.toList());
    }
}
