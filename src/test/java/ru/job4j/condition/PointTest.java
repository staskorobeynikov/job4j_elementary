package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = new Point(x1, y1).distance(new Point(x2, y2));
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when1020to3040then28Dot28() {
        double expected = 28.28;
        int x1 = 10;
        int y1 = 20;
        int x2 = 30;
        int y2 = 40;
        double output = new Point(x1, y1).distance(new Point(x2, y2));
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when03to40then5() {
        double expected = 5;
        int x1 = 0;
        int y1 = 3;
        int x2 = 4;
        int y2 = 0;
        double output = new Point(x1, y1).distance(new Point(x2, y2));
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
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
        double output = new Point(x1, y1, z1).distance3d(new Point(x2, y2, z2));
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints00And20Then2() {
        int x1 = 0, y1 = 0, x2 = 2, y2 = 0;
        double expected = 2.0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        int x1 = -1, y1 = -1, x2 = 1, y2 = 1;
        double expected = 2.83;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        int x1 = -2, y1 = -2, x2 = 2, y2 = 2;
        double expected = 5.66;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}