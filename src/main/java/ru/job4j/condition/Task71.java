package ru.job4j.condition;

public class Task71 {
    public static void change(int money) {
        StringBuilder result = new StringBuilder();
        int[] coins = {100, 50, 10};
        for (int coin : coins) {
            int count = 0;
            while (money >= coin) {
                money -= coin;
                count++;
            }
            result.append(coin).append(": ").append(count).append(coin != 10 ? ", " : "");
        }
        if (money != 0) {
            result = new StringBuilder("Нельзя");
        }
        System.out.println(result);
    }
}
