package ru.job4j.algorithm.math;

public class FindTheChildWhoHasTheBallAfterKSeconds {
    public int numberOfChild(int n, int k) {
        int modulo = k % (n - 1);
        k /= (n - 1);
        return k % 2 == 1 ? n - modulo - 1 : modulo;
    }
}
