package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax2To3Then3() {
        int left = 2;
        int right = 3;
        int result = Max.max(2,3);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To2Then4() {
        int left = 4;
        int right = 2;
        int result = Max.max(4,2);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(4,4);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}