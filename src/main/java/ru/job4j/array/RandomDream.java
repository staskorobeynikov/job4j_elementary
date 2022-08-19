package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        num %= prizes.length;
        return num == 0 ? prizes[prizes.length - 1] : prizes[num - 1];
    }
}
