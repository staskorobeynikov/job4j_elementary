package ru.job4j.algorithm.a75.twopointers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IsSubsequenceTest {

    @Test
    void testSubsequenceExists() {
        String s = "abc";
        String t = "ahbgdc";
        assertTrue(IsSubsequence.isSubsequence(s, t), "'abc' is a subsequence of 'ahbgdc'");
    }

    @Test
    void testSubsequenceDoesNotExist() {
        String s = "axc";
        String t = "ahbgdc";
        assertFalse(IsSubsequence.isSubsequence(s, t), "'axc' is not a subsequence of 'ahbgdc'");
    }

    @Test
    void testEmptyS() {
        String s = "";
        String t = "ahbgdc";
        assertTrue(IsSubsequence.isSubsequence(s, t), "An empty string is always a subsequence");
    }

    @Test
    void testEmptyT() {
        String s = "abc";
        String t = "";
        assertFalse(IsSubsequence.isSubsequence(s, t), "A non-empty string cannot be a subsequence of an empty string");
    }

    @Test
    void testBothEmpty() {
        String s = "";
        String t = "";
        assertTrue(IsSubsequence.isSubsequence(s, t), "An empty string is always a subsequence of another empty string");
    }

    @Test
    void testIdenticalStrings() {
        String s = "abc";
        String t = "abc";
        assertTrue(IsSubsequence.isSubsequence(s, t), "A string is always a subsequence of itself");
    }

    @Test
    void testRepeatedCharactersInT() {
        String s = "aaa";
        String t = "aaaaa";
        assertTrue(IsSubsequence.isSubsequence(s, t), "'aaa' is a subsequence of 'aaaaa'");
    }

    @Test
    void testSubsequenceAtEnd() {
        String s = "def";
        String t = "abcdef";
        assertTrue(IsSubsequence.isSubsequence(s, t), "'def' is a subsequence at the end of 'abcdef'");
    }

    @Test
    void testSubsequenceAtStart() {
        String s = "abc";
        String t = "abcxyz";
        assertTrue(IsSubsequence.isSubsequence(s, t), "'abc' is a subsequence at the start of 'abcxyz'");
    }

    @Test
    void testNonConsecutiveCharacters() {
        String s = "ace";
        String t = "abcde";
        assertTrue(IsSubsequence.isSubsequence(s, t), "'ace' is a subsequence of 'abcde'");
    }
}
