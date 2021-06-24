package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MachineTest {
    @Test
    public void whenMoneyEqualsPrice() {
        int money = 100;
        int price = 100;
        int[] result = Machine.change(money, price);
        int[] rsl = Machine.count(money, price);
        int[] expected = {};
        Assert.assertArrayEquals(expected, result);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenMoney50Price35() {
        int money = 50;
        int price = 35;
        int[] result = Machine.change(money, price);
        int[] rsl = Machine.count(money, price);
        int[] expected = {10, 5};
        Assert.assertArrayEquals(expected, result);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenMoney50Price21() {
        int money = 50;
        int price = 21;
        int[] result = Machine.change(money, price);
        int[] rsl = Machine.count(money, price);
        int[] expected = {10, 10, 5, 2, 2};
        Assert.assertArrayEquals(expected, result);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenMoney50Price32() {
        int money = 50;
        int price = 32;
        int[] result = Machine.change(money, price);
        int[] rsl = Machine.count(money, price);
        int[] expected = {10, 5, 2, 1};
        Assert.assertArrayEquals(expected, result);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenMoney20Price12() {
        int money = 20;
        int price = 12;
        int[] result = Machine.change(money, price);
        int[] rsl = Machine.count(money, price);
        int[] expected = {5, 2, 1};
        Assert.assertArrayEquals(expected, result);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenMoney20Price17() {
        int money = 20;
        int price = 17;
        int[] result = Machine.change(money, price);
        int[] rsl = Machine.count(money, price);
        int[] expected = {2, 1};
        Assert.assertArrayEquals(expected, result);
        Assert.assertArrayEquals(expected, rsl);
    }
}