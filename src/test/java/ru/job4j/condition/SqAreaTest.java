package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP7K3Square2dot29() {
        double expected = 2.29;
        int p = 7;
        double k = 3;
        double out = SqArea.square(7, 3);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K4Square4() {
        int expected = 4;
        int p = 10;
        double k = 4;
        double out = SqArea.square(10, 4);
        Assert.assertEquals(expected, out, 0.01);
    }
}