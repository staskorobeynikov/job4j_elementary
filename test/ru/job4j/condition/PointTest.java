package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1020to3040then28Dot28() {
        double expected = 28.28;
        int x1 = 10;
        int y1 = 20;
        int x2 = 30;
        int y2 = 40;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when03to40then5() {
        double expected = 5;
        int x1 = 0;
        int y1 = 3;
        int x2 = 4;
        int y2 = 0;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123to456then5Dot19() {
        double expected = 5.19;
        int x1 = 1;
        int y1 = 2;
        int z1 = 3;
        int x2 = 4;
        int y2 = 5;
        int z2 = 6;
        double out = new Point(x1, y1, z1).distance3d(new Point(x2, y2, z2));
        Assert.assertEquals(expected, out, 0.01);
    }
}