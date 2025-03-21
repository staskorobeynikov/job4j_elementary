package ru.job4j.algorithm.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UniqueEmailAddressesTest {

    @Test
    void testBasicEmails() {
        UniqueEmailAddresses solver = new UniqueEmailAddresses();
        String[] emails = {
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@leetcode.com"
        };
        assertEquals(1, solver.numUniqueEmails(emails), "Expected 1 unique email after normalization.");
    }

    @Test
    void testDifferentDomains() {
        UniqueEmailAddresses solver = new UniqueEmailAddresses();
        String[] emails = {
                "test.email+alex@leetcode.com",
                "test.email@leetcode.org"
        };
        assertEquals(2, solver.numUniqueEmails(emails), "Expected 2 unique emails with different domains.");
    }

    @Test
    void testNoPlusOrDot() {
        UniqueEmailAddresses solver = new UniqueEmailAddresses();
        String[] emails = {
                "simple@example.com",
                "simple@example.com"
        };
        assertEquals(1, solver.numUniqueEmails(emails), "Expected 1 unique email when no dots or pluses are used.");
    }

    @Test
    void testOnlyDots() {
        UniqueEmailAddresses solver = new UniqueEmailAddresses();
        String[] emails = {
                "a.b.c@domain.com",
                "abc@domain.com"
        };
        assertEquals(1, solver.numUniqueEmails(emails), "Expected 1 unique email when only dots differ.");
    }

    @Test
    void testOnlyPluses() {
        UniqueEmailAddresses solver = new UniqueEmailAddresses();
        String[] emails = {
                "abc+xyz@domain.com",
                "abc+123@domain.com",
                "abc@domain.com"
        };
        assertEquals(1, solver.numUniqueEmails(emails), "Expected 1 unique email when only plus parts differ.");
    }

    @Test
    void testMultiplePlusSigns() {
        UniqueEmailAddresses solver = new UniqueEmailAddresses();
        String[] emails = {
                "a+bc+de@domain.com",
                "a@domain.com"
        };
        assertEquals(1, solver.numUniqueEmails(emails), "Expected 1 unique email by ignoring everything after first '+'.");
    }

    @Test
    void testMixedCases() {
        UniqueEmailAddresses solver = new UniqueEmailAddresses();
        String[] emails = {
                "a.b.c+1@domain.com",
                "ab.c+xyz@domain.com",
                "a.bc@domain.com"
        };
        assertEquals(1, solver.numUniqueEmails(emails), "Expected 1 unique email after removing dots and trimming after '+'.");
    }

    @Test
    void testEmptyArray() {
        UniqueEmailAddresses solver = new UniqueEmailAddresses();
        String[] emails = {};
        assertEquals(0, solver.numUniqueEmails(emails), "Expected 0 for empty input array.");
    }
}