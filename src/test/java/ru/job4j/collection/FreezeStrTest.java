package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FreezeStrTest {
    @Test
    void whenEq() {
        String left = "Hello";
        String right = "Hlloe";
        boolean result = FreezeStr.equal(left, right);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotEqualWithDifferentLength() {
        String left = "Hello";
        String right = "Hlloeе";
        boolean result = FreezeStr.equal(left, right);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEq() {
        String left = "Hello";
        String right = "Halle";
        boolean result = FreezeStr.equal(left, right);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotMultiEq() {
        String left = "heloo";
        String right = "hello";
        boolean result = FreezeStr.equal(left, right);
        assertThat(result).isFalse();
    }

    @Test
    void whenEq1() {
        String left = "Hello";
        String right = "Hlloe";
        boolean result = FreezeStr.equalWithSetValues(left, right);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotEqualWithDifferentLength1() {
        String left = "Hello";
        String right = "Hlloeе";
        boolean result = FreezeStr.equalWithSetValues(left, right);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEq1() {
        String left = "Hello";
        String right = "Halle";
        boolean result = FreezeStr.equalWithSetValues(left, right);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotMultiEq1() {
        String left = "heloo";
        String right = "hello";
        boolean result = FreezeStr.equalWithSetValues(left, right);
        assertThat(result).isFalse();
    }
}