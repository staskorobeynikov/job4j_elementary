package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
        return x * x + 1;
    }

    public static int func2(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        double result1 = MathFunc.func2(3);
        double result2 = MathFunc.func2(5);
        double total = result1 + result2;
        System.out.println(total);
    }
}
