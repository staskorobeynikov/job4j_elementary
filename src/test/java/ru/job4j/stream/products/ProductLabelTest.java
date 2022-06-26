package ru.job4j.stream.products;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProductLabelTest {
    @Test
    public void whenGeneratedLabels() {
        Product first = new Product("bread", 20, LocalDateTime.now().plusDays(1));
        Product second = new Product("butter", 80, LocalDateTime.now().plusDays(3));
        Product third = new Product("orange", 125, LocalDateTime.now().plusDays(5));
        Product fourth = new Product("coffee", 75, LocalDateTime.now().plusDays(7));
        Product fifth = new Product("potato", 45, LocalDateTime.now().plusDays(9));
        Product sixth = new Product("cherry", 150, LocalDateTime.now().plusDays(2));
        Product seventh = new Product("watermelon", 70, LocalDateTime.now().plusDays(0));
        Label one = new Label("bread", 10);
        Label two = new Label("cherry", 75);
        Label three = new Label("watermelon", 35);

        List<Product> products = Arrays.asList(first, second, third, fourth, fifth, sixth, seventh);

        ProductLabel generator = new ProductLabel();
        List<String> strings = generator.generateLabels(products);

        List<String> expected = Arrays.asList(one.toString(), two.toString(), three.toString());

        assertThat(strings, is(expected));
    }
}