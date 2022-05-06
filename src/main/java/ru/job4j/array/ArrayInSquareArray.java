package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int len = (int) Math.ceil(Math.sqrt(array.length));
        int[][] result = new int[len][len];
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (count < array.length) {
                    result[i][j] = array[count];
                    count++;
                } else {
                    result[i][j] = 0;
                    count++;
                }
            }
        }
        return result;
    }
}