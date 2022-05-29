package ru.job4j.loop;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] result = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            char add = string[i];
            if (add > 57) {
                add = Character.toUpperCase(add);
            }
            result[i] = add;
        }
        return result;
    }
}
