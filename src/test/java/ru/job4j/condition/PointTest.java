package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when10to30Then2() {
        double expected = 2;
        int x1 = 1;
        int y1 = 0;
        int x2 = 3;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30to70Then4() {
        double expected = 4;
        int x1 = 3;
        int y1 = 0;
        int x2 = 7;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when04to08Then4() {
        double expected = 4;
        int x1 = 0;
        int y1 = 4;
        int x2 = 0;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}