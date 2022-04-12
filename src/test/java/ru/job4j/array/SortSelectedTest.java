package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {10, 8, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {6, 8, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf6elements() {
        int[] data = new int[] {22, 15, 4, 5, 16, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 5, 8, 15, 16, 22};
        Assert.assertArrayEquals(expected, result);
    }
}