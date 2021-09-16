package ru.job4j.condition;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int bonus = count > n ? count / n : 0;
        return count + bonus;
    }

    public static void main(String[] args) {
        int[] ints = new int[10];
        System.out.println("Размер массива  равен: " + ints.length);
    }
}
