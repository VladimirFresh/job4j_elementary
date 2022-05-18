package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] sumArray = new int[left.length + right.length];
        int count = 0;
        for (int i : left) {
            sumArray[count] = i;
            count++;
        }
        for (int i : right) {
            sumArray[count] = i;
            count++;
        }
        for (int i = 0; i < sumArray.length - 1; i++) {
            if (sumArray[i] == sumArray[i + 1]) {
                sumArray[i] = 0;
                sumArray[i + 1] = 0;
                count -= 2;
            }
        }
        int counter = 0;
        int[] whiteList = new int[count];
        for (int i : sumArray) {
            if (i > 0) {
                whiteList[counter] = i;
                counter++;
            }
        }
        return whiteList;
    }
}
