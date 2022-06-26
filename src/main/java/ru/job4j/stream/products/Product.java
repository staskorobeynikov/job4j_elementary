package ru.job4j.stream.products;

import java.time.LocalDateTime;
import java.util.Objects;

public class Product {
    private String name;

    private float price;

    private LocalDateTime expired;

    public Product(String name, float price, LocalDateTime expired) {
        this.name = name;
        this.price = price;
        this.expired = expired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDateTime getExpired() {
        return expired;
    }

    public void setExpired(LocalDateTime expired) {
        this.expired = expired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Float.compare(product.price, price) == 0
                && Objects.equals(name, product.name)
                && Objects.equals(expired, product.expired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, expired);
    }
}
