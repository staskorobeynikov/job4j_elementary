package ru.job4j.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateParenthesesTest {

    @Test
    void testValidParentheses() {
        ValidateParentheses validator = new ValidateParentheses();
        assertTrue(validator.isValid("()"));
        assertTrue(validator.isValid("()[]{}"));
        assertTrue(validator.isValid("{[()()]}"));
    }

    @Test
    void testInvalidParentheses() {
        ValidateParentheses validator = new ValidateParentheses();
        assertFalse(validator.isValid("(]"));
        assertFalse(validator.isValid("([)]"));
        assertFalse(validator.isValid("{[(])}"));
    }

    @Test
    void testEmptyString() {
        ValidateParentheses validator = new ValidateParentheses();
        assertTrue(validator.isValid(""), "Empty string should be valid");
    }

    @Test
    void testSingleOpeningParenthesis() {
        ValidateParentheses validator = new ValidateParentheses();
        assertFalse(validator.isValid("("), "Single opening parenthesis should be invalid");
    }

    @Test
    void testSingleClosingParenthesis() {
        ValidateParentheses validator = new ValidateParentheses();
        assertFalse(validator.isValid(")"), "Single closing parenthesis should be invalid");
    }

    @Test
    void testValidNestedParentheses() {
        ValidateParentheses validator = new ValidateParentheses();
        assertTrue(validator.isValid("{([])}"));
    }

    @Test
    void testUnbalancedNestedParentheses() {
        ValidateParentheses validator = new ValidateParentheses();
        assertFalse(validator.isValid("{([])"));
    }

    @Test
    void testOnlyOpeningParentheses() {
        ValidateParentheses validator = new ValidateParentheses();
        assertFalse(validator.isValid("{{{"));
    }

    @Test
    void testOnlyClosingParentheses() {
        ValidateParentheses validator = new ValidateParentheses();
        assertFalse(validator.isValid("]]]"));
    }

    @Test
    void testMixedCorrectAndIncorrect() {
        ValidateParentheses validator = new ValidateParentheses();
        assertFalse(validator.isValid("{[(])()"));
        assertTrue(validator.isValid("{{[[(())]]}}"));
    }
}