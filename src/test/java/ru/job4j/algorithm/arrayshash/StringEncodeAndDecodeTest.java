package ru.job4j.algorithm.arrayshash;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class StringEncodeAndDecodeTest {

    @Test
    void encodeAndDecodeBasicTest() {
        StringEncodeAndDecode encoder = new StringEncodeAndDecode();
        List<String> input = List.of("apple", "banana", "orange");
        String encoded = encoder.encode(input);
        List<String> decoded = encoder.decode(encoded);

        assertEquals(input, decoded, "Encoded and decoded lists should match");
    }

    @Test
    void encodeAndDecodeWithEmptyStrings() {
        StringEncodeAndDecode encoder = new StringEncodeAndDecode();
        List<String> input = List.of("apple", "", "banana", "", "orange");
        String encoded = encoder.encode(input);
        List<String> decoded = encoder.decode(encoded);

        assertEquals(input, decoded, "Encoded and decoded lists should handle empty strings correctly");
    }

    @Test
    void encodeAndDecodeWithSpecialCharacters() {
        StringEncodeAndDecode encoder = new StringEncodeAndDecode();
        List<String> input = List.of("apple#", "ban#ana", "or#ange#");
        String encoded = encoder.encode(input);
        List<String> decoded = encoder.decode(encoded);

        assertEquals(input, decoded, "Encoded and decoded lists should handle special characters like # correctly");
    }

    @Test
    void encodeAndDecodeWithLongStrings() {
        StringEncodeAndDecode encoder = new StringEncodeAndDecode();
        String longString = "a".repeat(1000);
        List<String> input = List.of(longString, "banana", longString);
        String encoded = encoder.encode(input);
        List<String> decoded = encoder.decode(encoded);

        assertEquals(input, decoded, "Encoded and decoded lists should handle long strings correctly");
    }

    @Test
    void encodeAndDecodeEmptyList() {
        StringEncodeAndDecode encoder = new StringEncodeAndDecode();
        List<String> input = new ArrayList<>();
        String encoded = encoder.encode(input);
        List<String> decoded = encoder.decode(encoded);

        assertEquals(input, decoded, "Encoded and decoded lists should handle an empty list correctly");
    }

    @Test
    void decodeInvalidEncodedString() {
        StringEncodeAndDecode encoder = new StringEncodeAndDecode();
        String invalidEncoded = "5#apple3#ba";
        assertThrows(StringIndexOutOfBoundsException.class, () -> encoder.decode(invalidEncoded),
                "Decoding an invalid string should throw an exception");
    }
}