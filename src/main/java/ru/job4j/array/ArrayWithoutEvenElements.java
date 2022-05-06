package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int size = 0;
        int index = 0;
        for (int i : data) {
            if (i % 2 != 0) {
                size++;
            }
        }
        int[] result = new int[size];
        for (int i : data) {
            if (i % 2 != 0) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }
}